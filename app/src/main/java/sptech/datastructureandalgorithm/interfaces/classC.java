package sptech.datastructureandalgorithm.interfaces;

public class classC implements InterfaceA,InterfaceB{
    @Override
    public void show() {

    }

    public static void main(String...args){
        classC c = new classC();
        c.show();
        System.out.println("Value "+classC.a);
    }


}
