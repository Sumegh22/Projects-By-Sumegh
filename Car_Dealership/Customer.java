package Car_Dealership;

public class Customer {

	private String name;
	private String address ;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getInhandcash() {
		return inhandcash;
	}
	public void setInhandcash(int inhandcash) {
		this.inhandcash = inhandcash;
	}
	private int inhandcash;
	
	
	public void purchase_vehicle(Customer customer,Vehicle vehicle, Employees emp , boolean finance ) {
		 
		int money= customer.getInhandcash();
		int cost = vehicle.price;
		
		
		 
		
	if (cost> money)
	{
		finance = true;
		
		System.out.println("Dear "+customer.getName()+",\nWe at MG, feel proud to announce you as part of our family,"+
				"\nFor your purchase of: "+vehicle.Veh_name+" "+vehicle.type );
		
		
		System.out.println("Mode of Payment: Finance");
		System.out.println("Your: "+vehicle.Veh_name+" Shall be delivered to: "+customer.getName()
		+", at your residence: "+customer.getAddress()
		+"\nDelivery shall be assited by: "+emp.emp_designation+", "+emp.emp_name);
		}
	
	else if (cost <=money)
	{
	finance = false;
	
	System.out.println("Dear "+customer.getName()+",\nWe at MG, feel proud to announce you as part of our family,"+
			"\nFor your purchase of: "+vehicle.Veh_name+" "+vehicle.type );
	
	
	System.out.println("Mode of Payment: Full Cash");
	System.out.println("Your: "+vehicle.Veh_name+" Shall be delivered to: "+customer.getName()
	+", at your residence: "+customer.getAddress()
	+"\nDelivery shall be assited by: "+emp.emp_designation+", "+emp.emp_name);
			  }
		
	
	
	}
}
