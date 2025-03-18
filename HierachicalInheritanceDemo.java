class Parent{
    int a=10;
    void display()
    {
        System.out.println("Parent class");
    }
}
class ChildOne extends Parent{

    int b=20;
    void show()
    {
        System.out.println("Chid 1 Class");
    }
}
class ChildTwo extends Parent
{
    int c=30;
    void dis()
    {
        System.out.println("Child 2 class");
    }

}

class HierachicalInheritanceDemo {
    
    public static void main(String args[])
    {
        ChildTwo c2=new ChildTwo();
        System.out.println("Vriable of ChildTwo class="+c2.c);
        c2.dis();
        System.out.println("Veriable of Parent class="+c2.a);
        c2.display();

        ChildOne c3=new ChildOne();
        System.out.println("Vriable of ChildOne class="+c3.b);
        c3.show();
        System.out.println("Veriable of Parent class="+c3.a);
        c3.display();



    }
}
