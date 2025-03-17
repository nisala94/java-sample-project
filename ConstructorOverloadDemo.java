class Coverload {

    Coverload()
    {
        System.out.println("Constructor without arguments");
    }

    Coverload(int a)
    {
        System.out.println("Constructor with arguments");
    }
    
}
class ConstructorOverloadDemo
{
    public static void main(String arg[])
    {
        Coverload obj=new Coverload();
        Coverload obj1=new Coverload(10);


    }
}
