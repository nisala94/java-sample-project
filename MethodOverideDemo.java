class Parent{

    void display()
    {
        System.out.println("Parent Method");
    }
}
class Child extends Parent
{

    void display()
    {
        System.out.println("Child Method");
    }
}

class MethodOverideDemo {

    public static void main(String args[])
    {
        Child obj=new Child();
        obj.display();
    }
    
}
