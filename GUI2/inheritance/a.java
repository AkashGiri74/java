class parent {
    parent()
    {
        System.out.println("parent default ");
    }
    parent(int a)
    {
        System.out.println("parent paremeterize constructor "); 
    }
}
class child extends parent
{

    child()
    {
        System.out.println("child default ");
    }
    child(int a)
    {
        System.out.println("child paremeterize constructor "); 
    }

}
class demo
{
    public static void main(String args[])
     {
        child cref=new child();
    }
}
