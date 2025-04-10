public class EncapDemoTwo {

    public static void main(String[] args) {
        
        EncapsulationDemo ec=new EncapsulationDemo();
       ec.setAccno(100);
       System.out.println(ec.getAccno());

       ec.setAmount(10.5);
       System.out.println(ec.getAmount());

       ec.setName("Nisala");
       System.out.println(ec.getName());
        }
    
}
