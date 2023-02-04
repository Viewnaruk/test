package lab08;

public class vehicle {

	protected String type;
	protected int price;
	static int count;
	
	
	public vehicle() {
		setType( "undefined type");
		setPrice(0);
		setCount(0);
	}

	public vehicle(String type, int price,int count) {
		setType(type);
		setPrice(price);
		setCount(count);
		
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		if (type.isEmpty()) {
			this.type = "undefined type";
		}
		else this.type = type;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		if (price<=0) {
			this.price=50000;
		}
		else this.price = price;
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		vehicle.count++;
	}
	

	

	public float calDeteriorate (float year) {
		double x=0;
		x=(this.price*10)/100;
		
		double a=0;
		a=(this.price-x)/year;
		return (float)a;
	}

	@Override
	public String toString() {
		return "vehicle [type=" + type + ", price=" + price + ",count="+getCount()+",]";
	}

	
	
}
