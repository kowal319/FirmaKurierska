package delivery.Repository;

import delivery.Entity.Courier;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourierRepository extends CrudRepository<Courier, Long> {
}
