class StringBufferDemo {

    public static void main(String args[])
    {
        StringBuffer str =new StringBuffer("Welcome");
        System.out.println(str);

        System.out.println(str.append(" to Java"));

        System.out.println(str.insert(4, "hi"));

        System.out.println(str.delete(4, 6));

        System.out.println(str.replace(11, 14, "home"));

        System.out.println(str.length());

        System.out.println(str.indexOf("come"));

        System.out.println(str.charAt(4));

        System.out.println(str.substring(6));

        System.out.println(str.subSequence(7,16));

        System.out.println(str.reverse());

        System.out.println(str);


    }
    
}
