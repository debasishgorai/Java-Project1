package ObjectPack.equalspack;

public class Engine {
	String engno;
	int hp;
	int yom;
	public Engine(String engno,int hp,int ymo) {
		super();
		this.engno=engno;
		this.hp=hp;
		this.yom=yom;
		
	}
	@Override
	public String toString() {
		return "Engine[engno="+engno+",hp="+hp+",yom="+yom+"]";
		
	}
	public boolean equals(Object obj) {
		if(!(obj instanceof Engine))
			return false;
		
		return this.engno==engno&& this.hp==hp&& this.yom==yom;
		
	}

}
