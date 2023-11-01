package regexpression;

public class ClonningOfObj implements Cloneable{
	public static void main(String[] args) throws Exception {
		ClonningOfObj coo=new ClonningOfObj();
		System.out.println(coo.hashCode());
//		for(int i=0;i<10;i++)
//			System.out.println("obj "+i+" "+coo.clone());
	}

}
