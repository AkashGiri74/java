import java.util.*;

class MyComparator implements Comparator<Object>
{
    public int compare(Object obj1,Object obj2)
    {
        StringBuffer sb1=(StringBuffer)obj1;
        StringBuffer sb2=(StringBuffer)obj2;

        if (sb1.length() == sb2.length()) {
            return 0;
        } else if (sb1.length() > sb2.length()) {
            return 1;
        } else {
            return -1;
        }

        
    }
}
class Demo{
    public static void main(String[] args) {
        StringBuffer sb1=new StringBuffer("bbb");
        StringBuffer sb2=new StringBuffer("cccc");
        StringBuffer sb3=new StringBuffer("aaaaa");
        StringBuffer sb4=new StringBuffer("ee");
        StringBuffer sb5=new StringBuffer("d");

        TreeSet ts=new TreeSet<>(new MyComparator());
        ts.add(sb1);
        ts.add(sb2);
        ts.add(sb3);
        ts.add(sb4);
        ts.add(sb5);

        System.out.println(ts);
    }
}
//op : [d, ee, bbb, cccc, aaaaa] its sort according to length()
