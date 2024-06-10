package tnsif.region.personalinfo;

import tnsif.region.countrystatepack.City;
import tnsif.region.countrystatepack.Country;

public class DemoPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		City c = new City();
		c.setCname("Ahmedabad");
		
		Country cn = new Country();
		cn.setCname("India");
		
		Person p = new Person();
		p.setPname("Yash");
		
		String CityName = c.getCname();
		String CountryName = cn.getCname();
		String PersonName = p.getPname();
		
		System.out.println("City:"  + CityName);
		System.out.println("Country:"  + CountryName);
		System.out.println("Person:"  + PersonName);
	}

}
