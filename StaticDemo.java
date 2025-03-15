class StaticDemo {
    static int a=10;
    static int b=15;  
    static void display()
    {
        System.out.println("Static Method");
    }
    static
    {
        System.out.println("Static Block");
    }
    public static void main(String args[])
    {
        System.out.println(a);
        display();


        demo obj = new demo();/*        // Creating an instance of demo class to call show() method */
        obj.show();
    }

    
}
class demo{
    public void show()
    {
        System.out.println(StaticDemo.b);
        StaticDemo.display();
}

}

