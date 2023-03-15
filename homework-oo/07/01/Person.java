// public class Person {
//     final int id;
//     final String firstName;
//     final String lastName;

//     public Person(final int id, final String firstName, final String lastName) {
//         this.id = id;
//         this.firstName = firstName;
//         this.lastName = lastName;
//     }
    
//     public String firstName() {
//         return this.firstName;
//     }

//     public int id() {
//         return this.id;
//     }

//     public String lastName() {
//         return this.lastName;
//     }

//     @Override
//     public boolean equals(Object o) {
//         if(this == o) {
//             return true; 
//         } 

//         if(o == null || getClass() != o.getClass()) {
//             return false;
//         }
        
//         Person jack1 = (Person) o;
//         return id == jack1.id &&
//                 firstName == jack1.firstName &&
//                     lastName == jack1.lastName;

//     }

//     @Override
//     public String toString() {
//         return "Person[id= " + this.id + ", firstName= " + this.firstName + ", lastName=" + lastName +"]";
//     }
// }
import java.util.Objects;
public record Person(int id, String firstName, String lastName) {}