package core_java_day11;

import java.util.HashSet;
import java.util.Set;

public class ContactSyncApp {

	public static void main(String[] args) {
		String[] simCont = {"Srinivas","Sravan","Jeevan","Jaya","Akash"};
		String[] googleCont = {"Nisha","Nivetha","Lavanya","Ramya","Kiruthika","Akash"};
		String[] phoneCont = {"Chitti","Mohan","Madan","Pawan","Chityala","Jaya"};
		
		Set<String> unique = new HashSet<>();
		
		for(String contact : simCont) {
			unique.add(contact);
		}
		for(String contact : googleCont) {
			unique.add(contact);
		}
		for(String contact : phoneCont) {
			unique.add(contact);
		}
//		System.out.println(unique);
//		System.out.println(unique.size());
		
		System.out.println("All contact list : ");
		for(String uniquelist : unique) {
			System.out.println("-"+uniquelist);
		}
	}

}
