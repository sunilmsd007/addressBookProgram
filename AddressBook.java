package addressBookProgram;
import java.util.*;

	class Person{
	   ArrayList<String> list;
         public void add() {
         //method to add person details
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
       		list = new ArrayList<>();
		list.add(firstname);
		list.add(lastname);
		list.add(address);
		list.add(city);
		list.add(state);
		list.add(zip);
		list.add(phoneNumber);
		list.add(email);
       }
       
        public void delete() {
         //method to delete person details
    	   System.out.println("enter existing data");
    	   Scanner sc = new Scanner(System.in);
    	   String data=sc.next();
    	   for(String element : list) {
    		   if(element.contains(data)) {
    			   System.out.println(list);
    			   list.clear();
    			   System.out.println("removed the data");
    			   displayDetails();
    		   }
    	   }
       }
        public void edit() {
        //method to edit person's details
    	   System.out.println("enter existing data");
    	   Scanner sc = new Scanner(System.in);
    	   String data=sc.next();
    	   for(String element : list) {
    		   if(element.contains(data)) {
    			   System.out.println(list);
    			   System.out.println("choose what to edit"); //providing user the choice to select what detail to be edited
    			   System.out.println("1.firstName\n 2.LastName\n 3.Address\n 4.city\n 5.state\n 6.zip\n 7.phoneNumber\n 8.email");
    			   int ch=sc.nextInt();
    		       switch(ch) {
    		       case 1:{
    		    	   System.out.println("enter the data to be edited as firstname");
    		    	   String firstname= sc.next();
    		    	   list.set(0,firstname);
    		    	   System.out.println("changed data");
        			   System.out.println(list);
        			   break;
    		       }
    		       case 2:{
    		    	   System.out.println("enter the data to be edited as lastname");
    		    	   String lastname= sc.next();
    		    	   list.set(1,lastname);
    		    	   System.out.println("changed data");
        			   System.out.println(list);
        			   break;
    		       }
    		       case 3:{
    		    	   System.out.println("enter the data to be edited as address");
    		    	   String address = sc.next();
    		    	   list.set(2,address);
    		    	   System.out.println("changed data");
        			   System.out.println(list);
        			   break;
    		       }
    		       case 4:{
    		    	   System.out.println("enter the data to be edited as city");
    		    	   String city= sc.next();
    		    	   list.set(3,city);
    		    	   System.out.println("changed data");
        			   System.out.println(list);
        			   break;
    		       }
    		       case 5:{
    		    	   System.out.println("enter the data to be edited as state");
    		    	   String state = sc.next();
    		    	   list.set(4,state);
    		    	   System.out.println("changed data");
        			   System.out.println(list);
        			   break;
    		       }
    		       case 6:{
    		    	   System.out.println("enter the data to be edited as zip");
    		    	   String zip= sc.next();
    		    	   list.set(5,zip);
    		    	   System.out.println("changed data");
        			   System.out.println(list);
        			   break;
    		       }
    		       case 7:{
    		    	   System.out.println("enter the data to be edited as mobilNumber");
    		    	   String mobile = sc.next();
    		    	   list.set(6,mobile);
    		    	   System.out.println("changed data");
        			   System.out.println(list);
        			   break;
    		       }
    		       case 8:{
    		    	   System.out.println("enter the data to be edited as email");
    		    	   String email = sc.next();
    		    	   list.set(7,email);
    		    	   System.out.println("changed data");
        			   System.out.println(list);
        			   break;
    		       }
    		       }
    		   }
    	   }
       }

	public void displayDetails() {  //method to display details of person
	    	if(list.size()==0)
	    		System.out.println("Now List Is Empty");
	    	else
	    	System.out.println("FirstName: "+list.get(0)+ "," +" LastName: " +list.get(1)+ "," +" Address: " +list.get(2)+"," +" City: " +list.get(3)+"," +" State: " +list.get(4)+"," +" zip: " +list.get(5)+"," +" PhoneNumber: " +list.get(6)+"," +" email: " +list.get(7));
	    }}

	public class AddressBook {
	public static void main(String[] args) throws Exception 
	    {
         int l;
		Person p = new Person();
        Scanner sc =new Scanner(System.in);	
        do {
		System.out.println("enter 1 for adding contacts");
		System.out.println("enter 2 for edit ");
		System.out.println("enter 3 for display ");
		System.out.println("enter 4 for delete ");
		int choice = sc.nextInt();
		switch(choice) {
		case 1:{
			p.add();
			break;
		}
	        case 2:{
			p.edit();
			break;
		}
	        case 3:{
	    	p.displayDetails();
			break;
		}
	        case 4:{
	    	p.delete();
			break;
		}
		}System.out.println("enter 0 to go back to main menu");
		 l=sc.nextInt();
		 } while(l==0);
		System.out.println("EXITED");
		
	    }
	}

