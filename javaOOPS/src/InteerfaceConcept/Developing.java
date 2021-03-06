package InteerfaceConcept;

public class Developing implements bankingClient, DomainClient{

	public static void main(String[] args) {
		Developing d=new Developing();
		d.paycreditCard();
		d.checkingBalance();
		d.loginSite(); // 
		d.transferBalance();
		d.investment();
		
		bankingClient dr=new Developing(); // run time polymorphism 
		dr.checkingBalance();
		dr.paycreditCard();
		dr.transferBalance();
		
		DomainClient ds=new Developing();
		
		ds.investment();

	}

	@Override
	public void paycreditCard() {
		// TODO Auto-generated method stub
		System.out.println("paycreditCard....!");
	}

	@Override
	public void transferBalance() {
		// TODO Auto-generated method stub
		System.out.println("transferBalance....!");
	}

	@Override
	public void checkingBalance() {
		// TODO Auto-generated method stub
		System.out.println("checkingBalance....!");
	}
	
	public void loginSite() {
		System.out.println("Login into Site ....!");
	}

	@Override
	public void investment() {
		// TODO Auto-generated method stub
		System.out.println("investment ....!");
	}

}
