import java.util.Iterator;
import static java.lang.Thread.sleep;


public class Main
{

    public static void main(String[] args)
    {
        MyThread tom1 = new MyThread("tom1");
        MyThread tom2 = new MyThread("tom2");
        MyThread tom3 = new MyThread("tom3");

        tom1.start();
        tom2.start();
        tom3.start();
    }
}