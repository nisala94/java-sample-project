
class ExampleTwo
{
     void display()
    {
        Thread g =Thread.currentThread();
        synchronized(this)
        {
        for(int i=0;i<=5;i++)
        {   
            try{
                Thread.sleep(1000);
                System.out.println(g.getName() + "=" + i);
            }catch(Exception e)
            {

            }
        } 
        }
    }
}
class Te extends Thread
{
    ExampleTwo e;
    Te(ExampleTwo e)
    {
        this.e=e;
    }
    public void run()
    {
        e.display();
    }
}

class ThreadSynBlock {

    public static void main(String args[])
    {
        ExampleTwo ex=new ExampleTwo();
        Te t1=new Te(ex);
        Te t2=new Te(ex);
        Te t3=new Te(ex);
        t1.start();
        t2.start();
        t3.start();

    }

    
}
