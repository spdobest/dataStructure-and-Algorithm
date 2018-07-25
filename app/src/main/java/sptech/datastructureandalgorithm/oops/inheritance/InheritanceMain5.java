package sptech.datastructureandalgorithm.oops.inheritance;

/**
 * Created by root on 7/25/18.
 */
class Base5 {
    public void foo() { System.out.println("Base"); }
}

class Derived5 extends Base5 {
    /*private*/public void foo() { System.out.println("Derived"); }
}

public class InheritanceMain5 {
    public static void main(String args[]) {
        Base5 b = new Derived5();
        b.foo();
    }
}
