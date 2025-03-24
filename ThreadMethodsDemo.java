class Th extends Thread
{
    public void run()
    {
        Thread t=currentThread();
        System.out.println("Thread status "+t.isAlive());
        for(int i=0;i<=5;i++)
        {
            try{

                t.sleep(1000);
                
            }catch(Exception e){

            }
            System.out.println(i);
            
        }
    }
}

class ThreadMethodsDemo {

    public static void main(String args[])
    {
        Th t1=new Th();
        Th t2=new Th ();
        System.out.println("ID="+t1.getId());
        System.out.println("Name of thread is "+t1.getName());
        t1.setName("Demo Thread");
        System.out.println("Name of thread is after changing the name "+t1.getName());
        System.out.println("Priority of the thread is "+t1.getPriority());
        t1.setPriority(2);
        System.out.println("Priority of the thread after changing is "+t1.getPriority());
        t1.start();
        try{
            t1.join();
        }catch(Exception e)
        {

        }
        System.out.println("Thread one status "+t1.isAlive());
        t2.start();
        System.out.println("ID="+t2.getId());
    }
    
}
