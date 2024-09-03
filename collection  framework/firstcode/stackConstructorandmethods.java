import java.util.Stack;
class Demo
{
    public static void main(String[] args)
     {
         //default constructor 
        Stack st=new Stack<>();

        //methods
        st.push(23);
        st.push(25);
        st.push(27);
        st.push(30);

        System.out.println(st.pop());//delete top most element and returnn

        System.out.println(st.peek());//view top element 

        System.out.println(st.search(23));//return index if not found return -1
        System.out.println(st);
    }
}
