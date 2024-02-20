package Program;

import java.util.ArrayList;
import java.util.List;

public class aulaLista {

	public static void main(String[] args) {
	
		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("João");
		list.add("Fernando");
		
		for (String x : list) {
			System.out.println(x);
		}

	}

}
