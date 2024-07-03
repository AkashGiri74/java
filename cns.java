class demo3
{

    public static void main(String args[]) throws Exception
     {
        java.io.Console cns=System.console();
        System.out.println("enter roll no");
        int roll;
        roll=Integer.parseInt(cns.readLine());
        System.out.println(roll);
        
    }
    
}
