class Outer {
    private int x = 12;

    public Inner createInner() {
        Inner i = new Inner();
        i.print();
        return i;      
    }
    class Inner {
        public void print() {
            System.out.println(x);
        }
    }
}