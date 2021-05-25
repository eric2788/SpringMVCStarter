package start.springmvc.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import start.springmvc.model.Item;

@Repository
public interface ItemRepository extends CrudRepository<Item, Integer> {
}
