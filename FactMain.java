import pack.*;
import java.util.*;

class FactMain {

    public static void main(String augs[])
    {
        Scanner sc=new Scanner(System.in);
        Factorial obj =new Factorial();
        System.out.println("Please Enter value to find the factorial:-");
        int n=sc.nextInt();
        obj.fact(n);
    }
    
}
