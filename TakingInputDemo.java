import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class TakingInputDemo {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        //number
        System.out.println("Please enter a number:");
        int num=sc.nextInt();
        System.out.println(num);

        //String
        System.out.println("Please enter your name:");
        String name=sc.next();
        System.out.println(name);

        //unknow value
        System.out.println("Please enter any value:");
        Object un=sc.next();
        System.out.println(un);

        //input array and read
        int a[]=new int[5];
        for(int i=0;i<a.length;i++){

            System.out.println("Please enter value for position "+i+":");
            a[i]=sc.nextInt();
        }

        System.out.println("Printing array elements......");
        System.out.println(Arrays.toString(a));





    }
    
}
