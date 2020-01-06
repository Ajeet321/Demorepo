package Practice;

import java.util.TreeSet;

public class TreeDemo {
public static void main(String[] args) {
	MyComparator nn = new MyComparator();
	TreeSet<Integer> t=new TreeSet<>(nn);
	t.add(10);
	t.add(0);
	t.add(15);
	t.add(20);
	t.add(20);
	System.out.println(t);
	
	
}
}
