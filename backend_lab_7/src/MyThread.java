import static java.lang.Thread.sleep;
public class MyThread extends Thread{
    private String name;
    MyThread(String name)
    {
        this.name = name;
    }
    @Override
    public void run()
    {
        try{
            sleep(1000);
        }
        catch(InterruptedException e){}
        ATM.getMoney(name, 100);
    }
}
