public class Main {
    public static void main(String[] args) {

        char [] data = {'m', 'o', 'i'};
        MyString mj = new MyString(data);

        System.out.println(mj.length());         // 3
        System.out.println(mj.charAt(0));        // m
        System.out.println(mj.equals(mj));       // true
        System.out.println(mj.reverse());        // iom
        System.out.println(mj.startsWith("mo")); // true
    }
}
