class ThisKeywordDemo {

    int a=10;
    void display()
    {
        int a=200;
        System.out.println("Local veriable="+a);
        System.out.println("Instance Veriable="+this.a);
    }
    public static void main(String args[])
    {
        ThisKeywordDemo tk=new ThisKeywordDemo();
        tk.display();
    }
}
