import java.util.ArrayList;


public class MobilePhone {
	private String myNumber;
	private ArrayList<Contact> myContacts;
	
	
	public MobilePhone(String myNumber) {
		this.myNumber = myNumber;
		this.myContacts = new ArrayList<Contact>();
	}
	
	public boolean addNewContact(Contact contact){
		if(findContact(contact.getName()) >=0){
			System.out.println("Contact is already on file");
			return false;
		}
		myContacts.add(contact);
		return true;
	}
//	public boolean removeContact(Contact contact){
//		if(findContact(contact.getName())>=0){
//			myContacts.remove(contact);
//			return true;
//		}else{
//			return false;
//		}
//	}
//	
	public boolean updateContact(Contact oldContact, Contact newContact){
		int foundPosition = findContact(oldContact);
		if(foundPosition < 0){
			System.out.println(oldContact.getName() + " , was not found.");
			return false;
		}
		this.myContacts.set(foundPosition, newContact);
		System.out.println(oldContact.getName() + " , was replaced with " + newContact.getName());
		return true;
	}
	
	public boolean removeContact(Contact contact){
		int foundPosition = findContact(contact);
		if(foundPosition <0){
			System.out.println(contact.getName() + ", was not found.");
			return false;
		}
		this.myContacts.remove(foundPosition);
		System.out.println(contact.getName() + ", was deleted.");
		return true;
		
	}
	
	private int findContact(Contact searchItem){
		return this.myContacts.indexOf(searchItem);
	}
	private int findContact(String searchItem){
		for(int i=0; i<this.myContacts.size(); i++){
			Contact contact = this.myContacts.get(i);
			if(contact.getName().equals(searchItem)){
				return i;
			}
		}
		return -1;
		
	}
	public String queryContact(Contact contact){
		if(findContact(contact) >=0){
			return contact.getName();
		}
		return null;
	}
	public Contact queryContact(String name){
		int position = findContact(name);
		if(position >= 0){
			return this.myContacts.get(position);
		}
		return null;
	}
	public void printContacts(){
		for(int i=0;i<this.myContacts.size(); i++){
			System.out.println((i+1) + "." + this.myContacts.get(i).getName() + " -> "
					+ this.myContacts.get(i).getPhoneNumber());
		}
	}
	
	
}
