import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Main {
    public static void main(String [] args) {
        Optional<Person> p = findPersonById(Integer.parseInt(args[0]));
        if(p.isPresent()) {
            print(p.get().name());
        } else {
            System.out.println("id not found");
        }
        
    }
    public static void print(Object o) {
        System.out.println(o);   
    }


    public static Optional<Person> findPersonById(int id) {
        var people = List.of(new Person(1, "jack"), 
                            new Person(2, "tina"));

        Optional<Person> m = Optional.empty();

        for(Person person : people) {
            if(person.id() == id) {
                return Optional.of(person);
            } 
        }

        return m;

    }

}