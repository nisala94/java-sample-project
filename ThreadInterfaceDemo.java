import java.util.*;
class Single implements Runnable
{
    public void run()
    {
        for(int i =0;i<=5;i++)
        {
            System.out.println(i);
        }
    }
}

class ThreadInterfaceDemo {

    public static void main(String args[])
    {
        Single t=new Single();
        Thread s=new Thread(t);
        s.start();
    }
    
}
