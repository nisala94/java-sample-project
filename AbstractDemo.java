abstract class A{
    abstract void dispaly();
}
abstract class B extends A
{
 void dispaly()
 {
    System.out.println("Abstract Method in A");
 }
   abstract void show();
    
}
class C extends B
{
    void show()
    {
        System.out.println("Show Method in C");
    }
}
class AbstractDemo {

    public static void main(String args[])
    {
        C obj=new C();
        obj.dispaly();
        obj.show();

    }
    
}
