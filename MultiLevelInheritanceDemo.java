class A
{
    int a=10;
    void display()
    {
        System.out.println("Class A");
    }
}
class B extends A
{
    int b=20;
    void show()
    {
        System.out.println("Class B");
    }
}
class C extends B
{
    int c=30;
    void dis()
    {
        System.out.println("Class C");
    }

}
class MultiLevelInheritanceDemo
{
    public static void main(String args[])
    {
        C obj=new C();
        System.out.println("Veriable of class C="+obj.c);
        obj.dis();

        System.out.println("Veriable of class B="+obj.b);
        obj.show();

        System.out.println("Veriable of class A="+obj.a);
        obj.display();

    }

}
