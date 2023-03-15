public class Person {
    private String name;

    public Person(String name) {
        setName(name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public boolean equals(Person person) {
        return person.name.equals(this.name);
    }
}
