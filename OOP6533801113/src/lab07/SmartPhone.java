package lab07;

public class SmartPhone extends Phone {

protected String cpu;
	
	

	public String getCpu1() {
		return cpu;
	}
	public void setCpu1(String cpu) {
		if (cpu.isEmpty()) {
			this.cpu="undefined cpu";
		}
		else this.cpu = cpu;
	}
	public SmartPhone() {
		setCpu1("undefined cpu");
	}
	
	public SmartPhone(String Model, int price, String cpu) {
		super(Model,price);
		setModel(Model);
		setPrice(price);
		setCpu1(cpu);
	}

	public Float getPaymentPermonth (int month) {
		double x=0;
		x=this.price/month;
		return (float) x;
		
	}
	@Override
	public String toString() {
		return "SmartPhone [Model=" + Model + ", price=" + price + ", Cpu=" + getCpu1() + "]";
	}
	

}
