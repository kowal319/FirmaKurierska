package delivery.Repository;


import delivery.Entity.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository  extends CrudRepository<Order, Long> {
}
