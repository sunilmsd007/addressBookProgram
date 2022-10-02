package addressBookProgram;
import java.util.*;

	class Person{
	String firstname, lastname, address, city, state, zip, phoneNumber, email;

	Person(String firstname, String lastname, String address, String city, String state, String zip, String phoneNumber,
			String email) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}
        void display() {
		System.out.println("First Name: " + firstname + " Last Name: " + lastname + " Address: " + address + " City: "
				+ city + "  State: " + state + " Zip: " + zip + " Phone No: " + phoneNumber + " Email: " + email
				+ "\n");
	}
}
        class Book {
	ArrayList<Person> book;

	Book() {
		book = new ArrayList<>();
	}
         public void addDetails() {
         //method to add person details
                checkDuplicate();
		Scanner sc =new Scanner(System.in);
		System.out.println("enter first name");
		String firstname=sc.next();
		System.out.println("enter last name");
		String lastname=sc.next();
		System.out.println("enter address");
		String address=sc.next();
		System.out.println("enter city");
		String city=sc.next();
		System.out.println("enter state");
		String state=sc.next();
		System.out.println("enter zip");
		String zip=sc.next();
		System.out.println("enter phoneNumber");
		String phoneNumber=sc.next();
		System.out.println("enter email");
		String email=sc.next();
       		Person s = new Person(firstname, lastname, address, city, state, zip, phoneNumber, email);
		book.add(s);

       }
	public void checkDuplicate() {
            //method to check if duplicate first name exists using java stream
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the first name");
		String firstname = sc.next();
		System.out.println("Checking if same name already exists..");
		Predicate<Person> isFirstName = name -> name.equals(firstname);
		if(book.stream().anyMatch(isFirstName)) {
		    System.out.println("Name already exist! Try entering other Name");
		    addDetails();
		}
		else{
	            System.out.println("No similar Name found, continue adding");
                    }
       }
	public void displayDetails() {
         //method to display details of person
		System.out.println("enter existing first name");
		Scanner sc = new Scanner(System.in);
		String data = sc.next();
		for (int i = 0; i <= book.size(); i++) {
			Person p = book.get(i);
			if (data.equals(p.firstname)) {
				p.display();
			}
			else{
			       System.out.println("data not found");
                            }
		}
	}
	public void delete() {
         //method to delete person's details
		System.out.println("enter existing first name");
		Scanner sc = new Scanner(System.in);
		String data = sc.next();
		for (int i = 0; i <= book.size(); i++) {
			Person p = book.get(i);
			if (data.equals(p.firstname)) {
				book.clear();
				System.out.println("data deleted");
			}
		}
	}
	public void searchByCity() {
         //method to search person from city
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the city name");
		String city = sc.next();
		Predicate<Person> isCitySame = cityname -> cityname.equals(city);
		List<String> peopleFromSameCity = new ArrayList<>();
		Person p = new Person();
		if(book.stream().anyMatch(isCitySame)) {
			peopleFromSameCity.add(p.firstname);
		}
		System.out.println(peopleFromSameCity);
	}
        public void edit() {
         //method to edit person's details
		System.out.println("enter existing first name");
		Scanner sc = new Scanner(System.in);
		String data = sc.next();
		for (int i = 0; i <= book.size(); i++) {
			Person p = book.get(i);
			if (data.equals(p.firstname)) {
				while (true) {
					System.out.println("choose what to edit");
					System.out.println(
							"1.firstName\n 2.LastName\n 3.Address\n 4.city\n 5.state\n 6.zip\n 7.phoneNumber\n 8.email\n 9.Exit");
					int ch = sc.nextInt();
					switch (ch) {
					case 1: {
						System.out.println("enter the data to be edited as firstname");
						String firstname = sc.next();
						p.firstname = firstname;
						System.out.println("changed data");
						displayDetails();
						break;
					}
					case 2: {
						System.out.println("enter the data to be edited as lastname");
						String lastname = sc.next();
						p.lastname = lastname;
						System.out.println("changed data");
						displayDetails();
						break;
					}
					case 3: {
						System.out.println("enter the data to be edited as address");
						String address = sc.next();
						p.address = address;
						System.out.println("changed data");
						displayDetails();
						break;
					}
					case 4: {
						System.out.println("enter the data to be edited as city");
						String city = sc.next();
						p.city = city;
						System.out.println("changed data");
						displayDetails();
						break;
					}
					case 5: {
						System.out.println("enter the data to be edited as state");
						String state = sc.next();
						p.state = state;
						System.out.println("changed data");
						displayDetails();
						break;
					}
					case 6: {
						System.out.println("enter the data to be edited as zip");
						String zip = sc.next();
						p.zip = zip;
						System.out.println("changed data");
						displayDetails();
						break;
					}
					case 7: {
						System.out.println("enter the data to be edited as mobilNumber");
						String mobile = sc.next();
						p.phoneNumber = mobile;
						System.out.println("changed data");
						displayDetails();
						break;
					}
					case 8: {
						System.out.println("enter the data to be edited as email");
						String email = sc.next();
						p.email = email;
						System.out.println("changed data");
						displayDetails();
						break;
					}
					case 9: {
						System.exit(0);
					}

					}
				}
			}
		}
	}

}

   public class AddressBook {
	public static void main(String[] args)
	{
		int l;
		Book b = new Book();
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("enter 1 for adding contacts");
			System.out.println("enter 2 for edit ");
			System.out.println("enter 3 for display ");
			System.out.println("enter 4 for delete ");
                        System.out.println("enter 5 for search person from city");
			int choice = sc.nextInt();
			switch (choice) {
			case 1: {
				b.addDetails();
				break;
			}
			case 2: {
				b.edit();
				break;
			}
			case 3: {
				b.displayDetails();
				break;
			}
			case 4: {
				b.delete();
				break;
			}
                        case 5: {
				b.searchByCity();
				break;
			}
			}
			System.out.println("enter 0 to go back to main menu");
			l = sc.nextInt();
		} while (l == 0);
		System.out.println("EXITED");

	}
}

