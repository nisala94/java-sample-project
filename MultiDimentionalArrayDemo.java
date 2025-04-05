public class MultiDimentionalArrayDemo {

    public static void main(String[] args) {
        
        //declaring array
        //approch 01
        int a[][]=new int[3][2];

        a[0][0]=100;
        a[0][1]=200;

        a[1][0]=300;
        a[1][1]=400;

        a[2][0]=500;
        a[2][1]=600;

        //appraoch 2

        int b[][]={{111,222},{333,444},{555,666}};

        //find the sinze of an array
        System.out.println("Legth of rows "+a.length);
        System.out.println("Length of columns "+ a[0].length);

        //read a single value from an array

        System.out.println(a[2][1]);

        //read all value of an array

        for (int i=0;i<a.length;i++)
        {
            for(int e=0;e<a[i].length;e++){

                System.out.println(a[i][e]);

            }
        }

        //using enahced for loop(for each)

        for(int arr[]:b)
        {
            for(int x:arr){
                System.out.println(x);
            }
        }

    }
    
}
