
import java.nio.charset.Charset;
import java.util.*;
import java.io.*;
import java.nio.*;
import java.util.stream.*;
import java.nio.file.*;

class Database {
    Optional<String> findPerson(int id) {
        try(Stream<String> lines = Files.lines(Paths.get("database.txt"))) {
            
            return lines.filter(line -> line.startsWith(id + "::")).findFirst();
            
        } catch(IOException e) {
            return Optional.empty();
        }
    }
}
class PersonMapper {
    public Optional<Person> fromStringToPerson(String line) {
        String[] checkLine = line.split("::");

        if(checkLine.length != 3) {
            return Optional.empty();
        }

        int id;
        try {
            id = Integer.parseInt(checkLine[0]);
        } catch (NumberFormatException e) {
            return Optional.empty();
        }

        String firstname = checkLine[1];
        String lastname = checkLine[2];

        return Optional.of(new Person(id, firstname, lastname));
    }
}

// POJO, if you like to live on the edge, use record: (Java 14)
//     record Person(int id, String firstname, String lastname) {}


public class Main {
    public static void main(String [] args) {
        Database db = new Database();
        PersonMapper mapper = new PersonMapper();
        Optional<Person> person = db.findPerson(Integer.parseInt(args[0])).flatMap(mapper::fromStringToPerson);
        
        if(person.isPresent()) {
            person.ifPresent(System.out::println);
        } else {
            System.out.println("404 cant be found or corrupted line");
        }
            
    }
}