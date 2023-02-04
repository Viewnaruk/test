package lab08;

public class Rentcar extends vehicle {

	private String name;
	private int rPrice;
	public int id;
	
	
	
	public Rentcar(String type, int price, String name, int rPrice ) {
		super(type, price, rPrice);
		id=getCount();
		setName(name);
		setrPrice(rPrice);
	}
 
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		if (name.isEmpty()) {
			this.name = "undefined name";
		}
		else this.name = name;
	}
	
	public int getrPrice() {
		return rPrice;
	}
	
	public void setrPrice(int rPrice) {
		if (rPrice<=0) {
			this.rPrice = 500;
		}
		else this.rPrice = rPrice;
	}
	

	public int getId() {
		return id;
	}

	

	public int calcost() {
		return getrPrice()*7;
		
	}
	public int calcost (int day) {
		return getrPrice()*day;
		
	}
		
	public float calDeteriorate (float year) {
		double x=0;
		x=(this.rPrice*5)/100;
		
		double a=0;
		a=(this.rPrice-x)/year;
		return (float)a;
		
		
		
	}

	@Override
	public String toString() {
		return "Rentcar [name=" + name + ", rPrice=" + rPrice + ", id=" + id + ", type=" + type + ", price=" + price+ ",count="+getCount()+"]";
	}

}
