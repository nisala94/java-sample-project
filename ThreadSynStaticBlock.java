
class ExampleThree
{
    synchronized static void display()
    {
        Thread g =Thread.currentThread();
       
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

class Ter extends Thread
{
    
    public void run()
    {
        ExampleThree.display();
    }
}


class ThreadSynStaticBlock {
    public static void main(String args[])
    {
       
        Ter t1=new Ter();
        Ter t2=new Ter();
        Ter t3=new Ter();
        t1.start();
        t2.start();
        t3.start();

    }


    
}
