class Demo
{    
    

    public static void main(String [] args)
    { 
        //first constructor
        //without parameter 
        System.out.println("1");
        String s1=new String();
        s1="akash";
        System.out.println(s1);
        System.out.println();

        //parameterized constructor 
        //with constructor
        System.out.println("2");
        String s2=new String("akash");
        System.out.println("s2 "+s2);
        String s3=new String(s2);
        System.out.println("s3 "+s3);
        System.out.println();
         
        //stringBuffer class 
        System.out.println("3");
        StringBuffer Sb1=new StringBuffer("Akash");
        String s4=new String(Sb1);
        System.out.println("s4 "+s4);
        System.out.println();

        //stringBuilder class
        System.out.println("4");
        StringBuilder sb2=new StringBuilder("akash");
        String s5=new String(sb2);
        System.out.println("s5 "+s5);
        
        //character class for character array
        System.out.println("5");
        char[] crr={'a','k','a','s','h'};
        String s6=new String(crr);
        System.out.println("s6 "+s6);

        //character class for slice string using string offset 
        char[] crr2={'a','h','m','d','n','a','g','a','r'};
        String s7=new String(crr2,4,4);
        System.out.println(s7);
        
        //byte array construtor
        byte[] brr={65,66,67};
        String s8=new String(brr);
        System.out.println(s8);
        
        //byte array with offset constructor
        byte[] brr2={97,98,99,100,101,102,103,104};
        String s9=new String(brr2, 3, 5);
        System.out.println(s9);

      

        String st1="akash";
        String st2=new String("akash");
        System.out.println(st1.hashCode());
        System.out.println(st2.hashCode());
        System.out.println(st1==st2);
        System.out.println(st1.equals(st2));

        System.out.println("length");
        System.out.println(s1.length());

        //concate method 
        s1.concat(s2);
        System.out.println(s1);
        s1=s1.concat(s2);
        System.out.println(s1);
        //charAt method
        System.out.println(s1+"giri");
       System.out.println( s1.charAt(3));
       //index of method 
       System.out.println("s1.indexOf('a')");
       System.out.println(s1.indexOf('a'));
       System.out.println(s1.indexOf("kas"));
    //    System.out.println(s1.indexOf('a',1);
       System.out.println(s1.indexOf('k',1));

       //lastIndex of method 
       System.out.println(s1.lastIndexOf('k'));
       System.out.println(s1.lastIndexOf("kas"));
       System.out.println(s1.lastIndexOf("kas",2));
       System.out.println(s1.lastIndexOf('k',2));
        //equals method 
       System.out.println(s1.equals(s2));
       System.out.println(st1.equals(st2));
        //equal ignore case method 
       System.out.println(s1.equalsIgnoreCase(s2));
       System.out.println(st1.equalsIgnoreCase(st2));

        //toupper method 
       System.out.println(st1.toUpperCase());
       System.out.println(st1.toLowerCase());
        //comapareTo method
       System.out.println(st1.compareTo(st2));
       System.out.println(s1.compareTo(s2));
       //compareToIgnoreCase method 
       System.out.println(s1.compareToIgnoreCase(s2));
       System.out.println(st1.compareToIgnoreCase(st2));


       System.out.println(st1.isEmpty());

       System.out.println(st1.startsWith("a"));
       System.out.println(st1.startsWith("ak"));

       System.out.println(st1.endsWith("sh"));

       String sn="     maha  rashra    ";
       System.out.println(sn);
       System.out.println(sn.trim());


       System.out.println(st1.substring(2));
       System.out.println(st1.substring(2,4));

       System.out.println(st1.replace('a','r'));
       System.out.println(st1.replace("ak","sh"));






    }

}