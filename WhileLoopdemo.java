public class WhileLoopdemo {

    public static void main(String[] args) {
        
        //1.while loop
        //ex 01-print 1-10 numbers

        int i=1;
        while (i<=10) {

            System.out.println(i);
            i++;
            
        }

        //ex-02-print hello message 10 times

        int a=1;
        while (a<=10) {
            System.out.println("Hello");
            a++;
        }

        //ex-03:Print even numbers between 1-10;
        int b=2;
        while (b<=10) 
        {
            System.out.println(b);
            b+=2;
        }

        int c=1;
        while (c<=10) 
        {   
            if(c%2==0){
                System.out.println(c);
            }
            c++;
        }
 
        //ex-04
        int d=1;
        while (d<=10) 
        {
            if (d%2==0) 
            {
                System.out.println(d+" Even Number");
            }else
            {
                System.out.println(d+" Odd Number");
            }

            d++;
            
        }

        //ex-05-10 to 1 desending order
        int e=10;
        while (e>=1) {
            System.out.println(e);
            e--;
        }
        

    }
    
}
