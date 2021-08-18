package br.com.rodrigokaconde.shoppingcart.repository;

import br.com.rodrigokaconde.shoppingcart.model.Cart;
import org.springframework.data.repository.CrudRepository;

public interface CartRepository extends CrudRepository<Cart, Integer> {
}
