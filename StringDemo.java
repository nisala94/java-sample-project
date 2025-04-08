 class StringDemo {
    public static void main(String args[])
    {
        // String str="Hello";
        // System.out.println(str);

        // System.out.println(str.length());

        // System.out.println(str.indexOf("H"));

        // System.out.println("Character at "+str.charAt(4));

        // System.out.println(str.toLowerCase());

        // System.out.println(str.toUpperCase());

        // System.out.println(str.compareTo("hello"));

        // System.out.println(str.trim());

        // str=str.concat(" Welcome");
        // System.out.println(str);

        // str="nisala@gmail.com";
        // String f[]=str.split("@");
        // System.out.println(f[0]);
        // System.out.println(f[1]);

        //Reverse a String

        String ss="Nisala";

        String reverse="";
        for (int i=ss.length()-1;i>=0;i--)
        {
            
         reverse=reverse+ss.charAt(i);

        }
     
            System.out.println(reverse);

    }
    
}
