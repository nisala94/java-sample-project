import java.util.Arrays;

public class ArrayExamples {

    public static void main(String[] args) {
        //ex-01
         //prrnt even and odd numbers from an array

         int f[]={1,2,3,11,5,6,7,8,9,10,2,2};
        
         int even_no=0;
         int odd_no=0;
         for(int i=0;i<f.length;i++){
 
             if(f[i]%2==0){
 
                 System.out.println("This is a even number from the array "+f[i]);
                 even_no++;
             }else{
 
                 System.out.println("This is a odd number from the array "+f[i]);
                 odd_no++;
             }

             System.out.println("Number of even numbers "+even_no);
             System.out.println("Number of Odd numbers "+odd_no);
             
         }

    //      //print sum of the elements
    //         //ex-02

    //      int sum=0;
    //      for(int a=0;a<f.length;a++)
    //      {
    //          sum +=f[a];

    //      }
    //     System.out.println(sum);

    //     // ex-03
    //     //  serach an element from an array(linear search)

    //     int searched_value=100;
    //     boolean status=false;
    //     for (int t=0;t<f.length;t++)
    //     {
    //         if(f[t]==searched_value){

    //             System.out.println("Searched value "+searched_value+ " Found in the array");
    //             status =true;
    //             break;
    //         }

           
    //     }

    //     if(status==false){

    //         System.out.println("Searched value "+searched_value+ " Not found in the array");
    //    }


    //    //find repeted elements in array

    //    int searched_value1=2;
    //     boolean status1=false;
    //     int repeated_time=0;
    //     for (int p=0;p<f.length;p++)
    //     {
    //         if(f[p]==searched_value1){

    //             repeated_time++;
              
    //         }

           
    //     }

    //     System.out.println("THis is repeated "+repeated_time+ " times in the array");


        //Sorting 

        // for(int h:f)
        // {
        //     System.out.println(h);
        // }

        // //can use without using loop a pre define method only for printing

        // System.out.println(Arrays.toString(f));  

        // Arrays.sort(f);
        // System.out.println("After sorting...............");
        // System.out.println(Arrays.toString(f));

        // //Sorting stirngs Array

        // String y[]={"DEF","CAF","ABC","EMN"};

        // System.out.println("Before sorting---"+Arrays.toString(y));
        // Arrays.sort(y);
        // System.out.println("AFter sorting---"+Arrays.toString(y));


        // //reverse an array

        // int r[]={1,2,3,11,5,6,7,8,9,10,2,2};

        // for(int k=r.length-1;k>=0;k--)
        // {
        //     System.out.println(r[k]);
        // }


        


    }
    



}
