package pe.com.peruInka.core.dao;

import java.util.List;

import pe.com.peruInka.core.domain.Hotel;
import pe.com.peruInka.core.domain.Person;
import pe.com.peruInka.core.domain.StatusHotel;

public interface HotelDAO {
	
	List<Hotel> findAllHotel();
	
	void saveHotel(Hotel hotel);
	
	void deleteHotel(Hotel hotel);
	
	void updateHotel(Hotel hotel);
	
	List<StatusHotel> findStatusHotel();
	
	Hotel findHotelById(Long id);

}
