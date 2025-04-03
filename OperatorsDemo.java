public class OperatorsDemo {

    public static void main(String[] args) {
        

        //1)Arithmetic Operators (+ - * / %)
        int a=50;
        int b=25;

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);

        //2)Relational/Comparison Operators(< <= > >= != ==)
        //Return boolean value
        System.out.println(a<b);
        System.out.println(a<=b);
        System.out.println(a>b);
        System.out.println(a>=b);
        System.out.println(a!=b);
        System.out.println(a==b);


        //3)Logical Operators(&& || !)
        //return boolean value
        //Works between two boolean value

        boolean x=true;
        boolean y=false;

        System.out.println(x&&y);
        System.out.println(x||y);
        System.out.println(!x);

        //4)Increment and Decrement Operator(++ - -)

        //case 1
        int c=10;
        c++;
        System.out.println(c);

        //case 2 post incremantation
        int g=20;
        int inc=g++;
        System.out.println(inc);//This will print 20 because it asign the value before incremantation
        System.out.println(g);

        //case  pre incremantation

        int v=10;
        int res=++v;
        System.out.println(res);

    
        //Decremant is same

        //Assignment Operators(= += -= *= /= %=)

        int f=10;
        f +=5;        //same as f=f+5;
        System.out.println(f);

        f -=5;
        System.out.println(f);

        f *=5;
        System.out.println(f);

        f /=2;
        System.out.println(f);

        f %=5;
        System.out.println(f);

        //6)conditional/Ternary Operator(?:)

        //var =expression ? result1 : result2;

        int q=200; 
        int e=100;

        int d=(q>e)? q:e;

        System.out.println(d);







    }
    
}
