package Car_Dealership;

public class dealership {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*  Employees who work in the shop
	 * Vehicles that are being sold
	 * customers who purchase vehicles*/
		
		

	Vehicle c1 = new Vehicle("MG-Hector","Luxury Car",15000);
	Employees e1= new Employees("Sumegh","Ppl Manager");
		
	Customer cust1 = new Customer();
	cust1.setName("Gayu Bakri");
	cust1.setAddress("Tabela @anywhere in the world");
	cust1.setInhandcash(10000);
	
	cust1.purchase_vehicle(cust1, c1, e1, false);
	
	
	
	
	
	}

}
