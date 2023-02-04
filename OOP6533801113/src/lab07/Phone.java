package lab07;

public class Phone {

	protected String Model;
	protected int price;
	
	public Phone() {
		setModel("undefined model");
		setPrice(0);
	}
	public Phone(String Model, int price) {
		setModel(Model);
		setPrice(price);
	}
	
	public String getModel() {
		return Model;
	}
	public void setModel(String Model) {
		if(Model.isEmpty()) {
			this.Model="undefined model";
		}
		else this.Model = Model;
	
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		if(price<0) {
			System.out.println("Invalid price.");
		}
		else this.price = price;
	}
	@Override
	public String toString() {
		return "Phone [Model=" + Model + ", price=" + price + "]";
	}

}
