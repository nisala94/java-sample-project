 class Constructors
{
    String name;
    int rno;
    Constructors()
    {
        name="ABC";
        rno=123;
    }
    Constructors(String str,int n)
    {
        name=str;
        rno=n;
    }
    public static void main(String args[])
    {
        Constructors c1=new Constructors();/*Default constructor */
        System.out.println(c1.name);
        System.out.println(c1.rno);

        Constructors c2 = new Constructors("DEF",456);/*Paramitorized Constructor */
        System.out.println(c2.name);
        System.out.println(c2.rno);
    }
}
