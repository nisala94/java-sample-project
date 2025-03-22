class Ex{

    void display()
    {
        try
        {
            int a=5/0;
        }
        catch (ArithmeticException e)
        {
            System.out.println(e);
        }
        System.out.println("This was run after ArithmeticException handled");
    }
    void adisplay()
    {
        try
        {
            int a[] =new int[5];
            a[6]=5;
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
        System.out.println("This was run after ArrayIndexOutOfBoundsException handled");
    }

    void bdisplay()
    {
        try
        {
            String str="Hello";
            int num=Integer.parseInt(str);
        }
        catch (NumberFormatException e)
        {
            System.out.println(e);
        }
        System.out.println("This was run after NumberFormatException handled");
    }

    void cdisplay()
    {
        try
        {
            String str=null;
            System.out.println(str.length());
        }
        catch (NullPointerException e)
        {
            System.out.println(e);
        }
        System.out.println("This was run after NullPointerException handled");
    }

    void ddisplay()
    {
        try
        {
            int a[] =new int[5];
            a[6]=5;
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        System.out.println("This was run after Exception handled");
    }

}

class ExceptionHandlingDemo {
    public static void main(String args[])
    {
        Ex obj =new Ex();
        obj.display();
        obj.adisplay();
        obj.bdisplay();
        obj.cdisplay();
        obj.ddisplay();
    }
    
}
