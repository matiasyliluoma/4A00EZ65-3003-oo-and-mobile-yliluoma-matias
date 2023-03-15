public class Test {
    public static void main(String [] args) {
        Outer o = new Outer();
        o.createInner();

        Outer.Inner i2 = new Outer().new Inner();

        i2.print();
    }
}
