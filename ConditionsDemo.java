public class ConditionsDemo {

    public static void main(String[] args) {
        
        //1)if condition
        int age=19;
        if(age>=18){
            System.out.println("Eligibal for vote");
        }

         //1)if else condition
         int bage=17;
         if(bage>=18){
             System.out.println("Eligibal for vote");
         }else{
            System.out.println("Not eligibal for vote ");
         }

         //check number even or odd ex 02
         int x=11;
         if(x%2==0)
         {
            System.out.println("This is a even number");
         }else
         {
            System.out.println("This is a odd number");
         }

         //check number is positive,negative or 0

         int no=0;
         if(no>0){
            System.out.println("Positive number");
         }else if(no < 0)
         {
            System.out.println("Negative number");

         }else
         {
            System.out.println("Number is 0");
         }


         //3.Nested if else
        boolean condition1 = true;
        boolean condition2 = false;

         if(condition1)
         {
            if(condition2){
                System.out.println("ABC");
            }
            else{
                System.out.println("EFG");
            }
         }else
         {
            System.out.println("123");
         }


         //4.Switch case
         //printing the days of the weeks according to given number

         int week_day=8;

         switch (week_day) {
            case 1:System.out.println("Sunday");
            break;
            case 2:System.out.println("Monday");
            break;
            case 3:System.out.println("Tuesday");
            break;
            case 4:System.out.println("Wednesday");
            break;
            case 5:System.out.println("Thursday");
            break;
            case 6:System.out.println("Friday");
            break;
            case 7:System.out.println("Saturday");
            break;
            default:System.out.println("Invalid number");
         }




    }

    
}
