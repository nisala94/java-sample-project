interface AB {

    void Adisplay();
    void Ashow();
    
}
interface BC {

    void Bdisplay();
    void Bshow();
     
}
class EF implements AB,BC
{
   public void Adisplay()
   {
        System.out.println("A display");
   }

   public void Ashow()
   {
        System.out.println("A show");
   } 
   public void Bdisplay()
   {
        System.out.println("B display");
   }

   public void Bshow()
   {
        System.out.println("B show");
   } 

} 
class interfaceDemo
{
    public static void main(String args[])
    {
        EF obj =new EF();
        obj.Adisplay();
        obj.Ashow();
        obj.Bdisplay();
        obj.Bshow();

    }
}