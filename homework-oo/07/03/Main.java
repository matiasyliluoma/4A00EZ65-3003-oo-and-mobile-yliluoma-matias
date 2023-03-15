
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
    public Person fromStringToPerson(String line) {
        String[] check = line.split("::");
        int id = Integer.parseInt(check[0]);
        String firstname = check[1];
        String lastname = check[2];
        return new Person(id, firstname, lastname);
    }
}

// POJO, if you like to live on the edge, use record: (Java 14)
//     record Person(int id, String firstname, String lastname) {}


public class Main {
    public static void main(String [] args) {
        Database db = new Database();
        PersonMapper mapper = new PersonMapper();
        Optional<Person> person = db.findPerson(1).map(mapper::fromStringToPerson);
        person.ifPresent(System.out::println);
    }
}