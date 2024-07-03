class outer
{
    class inner
    {
        void func()
        {
            System.out.println("inner func");
        }
    }


        public static void main(String[] args) {
        
        outer oref=new outer();
        outer.inner inref=oref.new inner();
        inref.func();
        // second way
        outer.inner inref2 =new outer().new inner();
         //onlly access one membre
        new outer().new inner().func();

    }
}
// class demo
// {
//     public static void main(String[] args) {
        
//         outer oref=new outer();
//         outer.inner inref=oref.new inner();
//         inref.func();
//         // second way
//         outer.inner inref2 =new outer().new inner();
//          //onlly access one membre
//         new outer().new inner().func();

//     }
// }