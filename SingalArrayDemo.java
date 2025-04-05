public class SingalArrayDemo {

    public static void main(String[] args) {
        
        //decalaring Array
        //approch 1
        int a[]= new int[5];
        a[0]=100;
        a[1]=200;
        a[2]=300;
        a[3]=400;
        a[4]=500;

        //approch 2
        int b[]={111,222,333,444,555};

        //find the length of an array

        System.out.println(a.length);

        //read a single value from array

        System.out.println(b[4]);

        //read all value of an arrray

        for (int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }

        //using enhanced for loop(for each)

        for(int c:b)
        {
            System.out.println(c);

        }

    }
    
}
