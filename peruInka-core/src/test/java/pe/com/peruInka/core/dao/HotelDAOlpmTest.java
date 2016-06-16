package pe.com.peruInka.core.dao;

import org.springframework.beans.factory.annotation.Autowired;

import pe.com.peruInka.core.domain.Hotel;
import pe.com.peruInka.core.domain.StatusHotel;

public class HotelDAOlpmTest extends AbstractUnitTest{

	@Autowired
	protected HotelDAO hotelDAO;
	
	public void test() {
		System.out.println(hotelDAO);
	}
	public void testFindAllHotel(){
		System.out.println(" === "+hotelDAO.findAllHotel());
	}
	public void testSaveHotel(){
		testFindAllHotel();
		Hotel hotel = new Hotel();
		hotel.setBusinessName("Hotel Puno");
		hotel.setAddress("jr. Arequipa");
		hotel.setRuc("10121314151");
		hotel.setPhone("987654321");
		
		StatusHotel statusHotel = new StatusHotel();
		statusHotel.setTypeCode(StatusHotel.Status.HOTEL_ACT.toString());
		hotel.setStatusHotel(statusHotel);
		
		
		hotelDAO.saveHotel(hotel);
		testFindAllHotel();
		setComplete();
	}
	public void testFindPersonById(){
		
		System.out.println("::: "+hotelDAO.findHotelById(1L));
		Hotel hotel = hotelDAO.findHotelById(1L);
		
		System.out.println("Name: "+hotel.getBusinessName());
		System.out.println("Address: "+hotel.getAddress());
		
	}
	

}
