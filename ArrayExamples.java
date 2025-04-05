public class ArrayExamples {

    public static void main(String[] args) {
        
         //prrnt even and odd numbers from an array

         int f[]={1,2,3,4,5,6,7,8,9,10};
        
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

         //print sum of the elements

         int sum=0;
         for(int a=0;a<f.length;a++)
         {
             sum +=f[a];

         }
        System.out.println(sum);
    }
    
}
