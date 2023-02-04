package lab07;

public class TestSmartPhone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartPhone obj2 = new SmartPhone();
		obj2.setModel("samsung");
		obj2.setPrice(10000);
		obj2.setCpu1("cpu");
		System.out.println(obj2);
		System.out.println("Paymentpermonth= "+obj2.getPaymentPermonth(12));

	}

}
