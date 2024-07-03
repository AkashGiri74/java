class Demo {
    public String toString() {
        return "sangamner";
    }

    public static void main(String[] args) {
        int a = 10;//primitive data
        Integer iref = new Integer(a); //using constructor method
        Integer iref2 = Integer.valueOf(a);//using static valueOf() method 
        System.out.println("iref: " + iref);//converted into wrapper class
        System.out.println("iref2: " + iref2);//converted into wrapper class

        // Wrapper class to primitive 
        int b = iref.intValue(); //iref is a wrapper class 
        System.out.println(b);//is converted into integer 


        //string to pdt 
        // parsexxx method 
        int i=Integer.parseInt("10");  //using parsexx
        System.out.println(i); 
        //string "10" is converted into integer 
        //parseChar is not valid it uses charAt method
        String s="sangamaner";
        System.out.println(s.charAt(0));
        //string is converted into char 


        // Primitive data type to string object
        String s1 = Integer.toString(10);//using static to string method
        String s2 = Integer.toString(20);
        System.out.println("Concatenated strings: " + s1 + s2);
        //pdt is converted into string

        // String to wrapper object
        /*//it can be only done for cetain value which is capable 
        of conversion
          */
        Integer iref3 = new Integer("10");//using constructor
        System.out.println("iref3: " + iref3);
        //string 10 is coverted into wrapper class object 10
        Integer iref4 = Integer.valueOf("10");//using static valueof() mehod
        System.out.println("iref4: " + iref4);
        //string 10 is coverted into wrapper class object 10

        // // Wrapper class to string
          int d=10;//pdt
        Integer iref5 = new Integer(d); //convered to wco iref5
        String s4= iref5.toString();//wco is converted into sting s1
        System.out.println("iref5 as string: " + s4);
    }
}
