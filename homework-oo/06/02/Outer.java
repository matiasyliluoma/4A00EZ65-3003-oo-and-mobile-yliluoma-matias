class Outer {
    public void doSomething() {
        
        int a = 12;
        final int b = 99;
        int c = 23;
       // c = 99; only finals or effectively finals will work here
        
        class Inner {
            public void print() {
                System.out.println(a);
                System.out.println(b);
                System.out.println(c); 
            }
        }
        Inner i = new Inner();
        

        i.print();
    }

    // public Inner createInner() {
    //     Inner i = new Inner();
    //     i.print();
    //     return i;      
    // }
    
}