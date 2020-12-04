package local.kaiblt.ordersapp.repositories;

import local.kaiblt.ordersapp.models.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomersRepository extends CrudRepository<Customer, Long> {
}
