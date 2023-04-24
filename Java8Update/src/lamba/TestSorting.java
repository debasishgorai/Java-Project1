package lamba;

import java.util.*;
import java.util.Comparator;
import java.util.List;

public class TestSorting {

	public static void main(String[] args) {
		List<customer>list=new ArrayList<>();
		list.add(new customer(1,"Legain","Apple","Fruit"));
		list.add(new customer(2,"Maruti","Suzuli","Car"));
		list.add(new customer(3,"Honda","Hero","Bike"));
		list.add(new customer(4,"Legain","Apple","Fruit"));
        Comparator<customer> com=new Comparator<>() {
        	@Override
        	public int compare(customer o1,customer o2) {
        		return o1.getProduct().compareTo(o2.getProduct());
        	}};
        		Collections.sort(list, com);
        		Collections.sort(list, (e1,e2)->{
        			return e1.getName().compareTo(e2.getName());
        		});
        		for(customer e:list) {
        			System.out.println(e);
        		}
        
	}

}
