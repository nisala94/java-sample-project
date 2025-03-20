class Parent{

    Parent()
    {
        System.out.println("PARENT CONSTRUCTOR");
    }
    int a=10;
    void display()
    {
        System.out.println("PARENT CLASS");
    }
}
class Child extends Parent
{
    Child()
    {
        System.out.println("CHILD CONSTRUCTOR");
    }
    int a=20;
    void display()
    {
        System.out.println("CHILD CLASS");
        System.out.println(a);
        System.out.println(super.a);
        super.display();
    } 
}

class SuperDemo {
    public static void main(String args[])
    {
        Child obj=new Child();
        obj.display();
    }
    
}
