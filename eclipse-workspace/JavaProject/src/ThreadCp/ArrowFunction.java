package ThreadCp;

interface Adding{
	public int add(int a, int b);
}
public class ArrowFunction {

	public static void main(String[] args) {
		Adding sum	= (a, b)->{
			return a+b;
		};
		System.out.println(sum.add(12, 15));

	}

}
