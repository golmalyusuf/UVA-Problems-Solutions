package p1;

public class testMeth {
	/*static int i = 1;
	public static void main(String[] args) {
		System.out.println(i+" , ");
		m(i);
		System.out.println(i);
	}
	public void m(int i){
		i += 2;
	}*/
	
	/*public static void main(String asdf[]){
		int i = 0;
		i = i++ + i;
		System.out.println("I = "+i);
	}*/
	
	Short story = 200;
	testMeth go(testMeth cb){
		cb = null;
		return cb;
	}
	
	public static void main(String asdf[]){
		testMeth c1 = new testMeth();
		testMeth c2 = new testMeth();
		testMeth c3 = c1.go(c2);
		
		c1 = null;
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
	}
	
}
