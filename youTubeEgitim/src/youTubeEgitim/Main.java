package youTubeEgitim;

public class Main {

	public static void main(String[] args) {

		Customer customer = new Customer();
		customer.setId(1);
		customer.setFirstName("engin");
		customer.setLastName("Demiroğ");
		customer.setNationalIdentitiy("123124");
		customer.setCity("Ankara");

		CustomerManager customerManager = new CustomerManager();
		customerManager.save();

		CreditManager creditManager = new CreditManager();
		creditManager.calculate();

	}

}
