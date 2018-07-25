package sptech.datastructureandalgorithm.oops.inheritance;

/**
 * Created by root on 7/25/18.
 */

class Base4 {
    public void Print() {
        System.out.println("Base");
    }
}

class Derived4 extends Base4 {
    public void Print() {
        System.out.println("Derived");
    }
}

class InheritanceMain4{
    public static void DoPrint( Base4 o ) {
        o.Print();
    }
    public static void main(String[] args) {
        Base4 x = new Base4();
        Base4 y = new Derived4();
        Derived4 z = new Derived4();
        DoPrint(x);
        DoPrint(y);
        DoPrint(z);
    }
}