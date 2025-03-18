class Parent{
    int a =10;
    void display()
    {
        System.out.println("PARENT");
    }
}
class Child extends Parent
{
    int b=20;
    void show()
    {
        System.out.println("CHILD");
    }
}
class SingleInheritanceDemo
{

    public static void main(String args[])
    {
        Child c=new Child();
        System.out.println("Child class veriable="+c.b);
        c.show();

        System.out.println("Parent class veriable="+c.a);
        c.display();

    }
    
}