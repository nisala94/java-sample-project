package pack;

public class Factorial {

    public void fact(int n)
    {
        int f=1;
        for(int i=1;i<=n;i++)
        {
            f*=i;
        }
        System.out.println("Factorial of " +n+ " is " +f);
    }
    
}
