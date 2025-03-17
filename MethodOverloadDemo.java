class Moverload{

    void display()
    {

        int a=10, b=20;
        int c=a+b;
        System.out.println("C is equal to="+c);        
    }
    void display(int a,int b)

    {
        int c=a+b;
        System.out.println("C is equal to="+c);

    }
}

class MethodOverloadDemo {

    public static void main(String args[])
    {

        Moverload ob=new Moverload();
        ob.display();
        ob.display(20,40);
    }
    

}
