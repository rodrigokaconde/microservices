package br.com.rodrigokaconde.productcatalog.repository;

import br.com.rodrigokaconde.productcatalog.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Integer> {
}
