import java.util.Arrays;

public class Team {
    private String name;
    private Person [] members = new Person[20];
    //private int size = 0;

    public Team(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public String getName() {
        return this.name;
    }

    
    // public int size() {
    //     return size;
    // }
    

    public void addPlayers(Person person) {

        if(members[members.length-1] != null) {
            Person[] tempMembers = new Person[members.length + 20];
            for(int i = 0; i < members.length; i++) {
                tempMembers[i] = members[i];                    
            }
            members = tempMembers;
        }

        for(int i = 0; i < members.length; i++) {
            if(this.members[i] == null) {
                this.members[i] = person;
                break;
            }
        } 
      
    }
    
    public String get(int index) {

        return this.members[index].getName();
    }

    @Override
    public String toString() {
        String membut = getName();
        for(int i = 0; i < members.length; i++) {
            if(members[i] == null) {
                break;
            } else {
                membut += "\n" + members[i].getName();
            }
        }
        return membut;
    }
}
