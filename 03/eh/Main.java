package eh;

import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

public class Main {
	
	public static void main(String[] args) {
		System.out.println("Teszt");
		List<Szemely> list = new ArrayList<Szemely>();
		Set <Szemely>  set = new HashSet  <Szemely>();
		for(int i=0; i<4; ++i) {
			list.add(new Szemely(""+i    ));
			list.add(new Szemely(""+(i+1)));
			 set.add(new Szemely(""+i    ));
			 set.add(new Szemely(""+(i+1)));
		}
		for(Szemely i: list) {
			System.out.println(i);
		}
		System.out.println("-----------------------");
		for(Szemely i: set) {
			System.out.println(i);
		}
	}	
}