package in.nit.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import ni.nit.model.Product;

public interface ProductRepository extends MongoRepository<Product, String>{

}
