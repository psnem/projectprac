package Revision;

public class Addtn {
	public Addtn(int x,int y)
	{
		System.out.println(x+y);
		return;
	}
	public int sub(int x,int y){
		
		return x-y;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addtn add=new Addtn(2,3);
		System.out.println(add.sub(41,1));
		
	}

}
