package association;

public class BoyFriend {
	String bname;
	GirlFriend gname;
	
	BoyFriend(String bname,GirlFriend gname){
		this.bname=bname;
		this.gname=gname;
	}
	
	public static void main(String[] args) {
		GirlFriend gf=new GirlFriend("Kiara");
		BoyFriend bf=new BoyFriend("Siddarth", gf);
		System.out.println(bf.bname);
		System.out.println(gf.gname);
	}
}
