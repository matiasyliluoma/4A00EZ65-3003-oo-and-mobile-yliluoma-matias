public class App {
    public static void main(String [] args) {

        
        // method1(new Dog("musti")); works
        // method1(new Human("pena")); works
        // method1(new Bird("raven")); works
        // method1(new Mammal("asd")); abstract, wont work
        // method1(new Animal("asd")); abstract, wont work

        // method2(new Dog("musti2")); works
        // method2(new Human("pena2")); works
        // method2(new Bird("raven2")); bird extends animal, wont work

        // method3(new Human("pena3")); works
        // method3(new Dog("musti3")); these wont work because dog and bird are not related or inherits or are parent/child classes of human
        // method3(new Bird("raven3")); these wont work because dog and bird are not related or inherits or are parent/child classes of human

        // method4(new Dog("musti4")); works
        // method4(new Human("pena4")); works
        // method4(new Bird("raven4")); works
        // these work because they all inherit Object in general

        method2(new Dog("musti")); 
        method2(new Human("pena"));

    }

    public static void method1(Animal a) {

    }

    public static void method2(Mammal a) {
        a.getName();
        a.giveBirthToLiving();
        a.makeSound();
        // a.sniffBut(); these have to be called by checking if a is instance of dog or human
        // a.createArt();
    }

    public static void method3(Human a) {

    }

    public static void method4(Object a) {

    }
}