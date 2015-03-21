package minicurso.service;

import org.springframework.data.repository.CrudRepository;
import minicurso.domain.Hotel;
import java.lang.Long;

public interface HotelRepository extends CrudRepository<Hotel, Long> {

}
