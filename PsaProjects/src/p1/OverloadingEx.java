package p1;

public class OverloadingEx {
	
	public void over()
	{
		System.out.println("6 balls");
		
	}
	public void over(int x)
	{
		System.out.println(6*x+" balls");
	}
	
	public static void main(String[] args) {
		OverloadingEx ol=new OverloadingEx();
		ol.over();
		ol.over(3);
	}
}
