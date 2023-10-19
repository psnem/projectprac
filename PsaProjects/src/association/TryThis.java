package association;

public class TryThis {
	A[] a= new A[3];
	public static void main(String[] args) {
		A a1 =new A("Piyush");
		A a2 =new A("Durgesh");
		A a3=new A("Chandu");
		TryThis tt=new TryThis();
		tt.a[0]=a1;
		tt.a[1]=a2;
		tt.a[2]=a3;
		System.out.println(tt.a.length);
		for(int i=0;i<tt.a.length;i++)
			System.out.println(tt.a[i].name);
	}

}
class A{
	String name;
	A(String name){
		this.name=name;
	}
}