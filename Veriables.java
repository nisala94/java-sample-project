class Veriables
{
    static int a=10;/*Static veriable */
    int b=20;/*Instance Veriable */
    public static void main(String args[])
    {
        int c=30;/*Local Veriable */
        System.out.println("This is a Static Veriable="+a);
        Veriables vr=new Veriables();
        System.out.println("This is a Instance Veriable="+vr.b);
        System.out.println("This is a Local Veriable="+c);
        System.out.println("This is a Static Veriable="+Veriables.a);
        
    }

}