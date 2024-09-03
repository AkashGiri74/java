import java.util.TreeSet;

class MyComparator implements java.util.Comparator<StringBuffer> {
        
    public int compare(StringBuffer sb1, StringBuffer sb2) {
        if (sb1.length() == sb2.length()) {
            return 0;
        } else if (sb1.length() > sb2.length()) {
            return 1;
        } else {
            return -1;
        }
    }
}

class Demo {
    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer("ccc");
        StringBuffer sb2 = new StringBuffer("aaaa");

        TreeSet<StringBuffer> ts = new TreeSet<>(new MyComparator());

        ts.add(sb1);
        ts.add(sb2);
        System.out.println(ts);
    }
}

