class outer2 {
    void func()
    {    int b=20;
        class inner2
        {
            void gun()
            {
             System.out.println(" inner gun " );
            // System.out.println(b);//error
            }
        }
        b++;
        System.out.println(b) ;

    
        inner2 iref=new inner2();
        iref.gun();
        
    }
    public static void main(String[] args)
     {
        outer2 oref=new outer2();
        oref.func();
    }
    
}
