class OperatorOverloadDemo {

    void add()
    {
        int a=10,b=20;
        System.out.println("A and b concatenation is equal to="+a+b);
        System.out.println("A and b sum is equal to="+(a+b));
    }

    public static void main(String args[])
    {
        OperatorOverloadDemo ol=new OperatorOverloadDemo();
        ol.add();
    }
    
}
