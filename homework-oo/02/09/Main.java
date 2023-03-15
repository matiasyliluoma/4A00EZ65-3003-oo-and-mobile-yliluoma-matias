public class Main {
    public static void main(String[] args) {
        /*
         * autoboxing is something when you convert primitive
         * datatypes to object wrapper classes, in this case
         * from int to Integer and also included from Integer to
         * int as unboxing.
         */
        int a1=6;
        
        Integer a2 = new Integer(a1); //autoboxing is happening
        Integer a3 = 8; //and also here, java actually generates the new Integer automatically

        System.out.println(a2 + " " + a3);

        //unboxing Integer to primitive datatype int
        int a = a2;

        System.out.println(a);

    }
}
