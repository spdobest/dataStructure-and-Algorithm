package sptech.datastructureandalgorithm.oops.interface_abstract;

/**
 * Created by root on 7/25/18.
 */

abstract class Calculate
{
    abstract int add(int a, int b);
}

public class MainClass1
{
    public static void main(String[] args)
    {
        int result = new Calculate()
        {
            @Override
            int add(int a, int b)
            {
                return a+b;
            }
        }.add(11010, 022011);
    }
}