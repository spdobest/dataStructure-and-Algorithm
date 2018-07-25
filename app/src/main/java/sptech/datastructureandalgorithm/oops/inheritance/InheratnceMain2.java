package sptech.datastructureandalgorithm.oops.inheritance;

/**
 * Created by root on 7/25/18.
 */

/**
 * FINAL methods cant be overrided
 *
 * final classes cant be super class
 *
 * final Variable cant be change
 *
 */

    class Base1 {
         final public void show() {
            System.out.println("Base::show() called");
        }
    }

    class Derived1 extends Base1 {
        public void show1() {
            System.out.println("Derived::show() called");
        }
    }

    class InheratnceMain2 {
        public static void main(String[] args) {
            Base1 b = new Derived1();
            b.show();
        }
    }
