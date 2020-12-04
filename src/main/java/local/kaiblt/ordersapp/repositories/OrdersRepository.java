package local.kaiblt.ordersapp.repositories;

import local.kaiblt.ordersapp.models.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrdersRepository extends CrudRepository<Order, Long> {
}
