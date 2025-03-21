interface Fetures
{
    void dialing();
    void messaging();
}
interface Addons{

    void vcalling();
    void mms();

}
class FeaturedPhone implements Fetures
{
    public void dialing()
    {
        System.out.println("Featured Phone is Dialing...");
    }
    public void messaging()
    {
        System.out.println("Featured Phone is Sending a message...");
    }
}
class SmartPhone implements Fetures,Addons
{
    public void dialing()
    {
        System.out.println("Smart Phone is Dialing...");
    }
    public void messaging()
    {
        System.out.println("Smart Phone is Sending a message...");
    }

    public void vcalling()
    {
        System.out.println("Smart Phone is Video calling...");
    }
    public void mms()
    {
        System.out.println("Featured Phone is Sending a MMS...");
    }
}

class iterfacedemoTwo {
    public static void main (String args[])
    {
        FeaturedPhone obj =new FeaturedPhone();
        obj.dialing();
        obj.messaging();

        SmartPhone obj2=new SmartPhone();
        obj2.dialing();
        obj2.messaging();
        obj2.vcalling();
        obj2.mms();

    }
    
}
