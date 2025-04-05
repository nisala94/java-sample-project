public class ObjectArrayDemo {

    public static void main(String[] args) {
        
        //Object can hold any value so this can be used to add hetrogenious data to array

        Object a[]={100,10.5,'A',"Welcome",true};

        for(Object x:a){

            System.out.println(x);
        }

       

    }
    
}
