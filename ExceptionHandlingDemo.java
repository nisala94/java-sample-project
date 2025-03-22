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
    }



}

class ExceptionHandlingDemo {
    public static void main(String args[])
    {
        Ex obj =new Ex();
        obj.display();
    }
    
}
