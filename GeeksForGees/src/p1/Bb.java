package p1;

class AA{
	public String type = "A";
	public AA(){
		System.out.print("A");
	}
}
public class Bb extends AA {

	public Bb(){
		System.out.print("B");
	}
	
	public static void main(String[] args) {
		new Bb().go();
	}
	
	void go(){
		type="c";
		System.out.print(this.type+ super.type);
	}

}
