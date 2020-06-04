package ni.nit.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.nit.repo.ProductRepository;
import ni.nit.model.Product;

@Component
public class ProductRunner  implements CommandLineRunner
{
	@Autowired
	private ProductRepository repo;

	@Override
	public void run(String... args) throws Exception {
	
		System.out.println("ffffffff");
		repo.save(new Product("core" , 5.5) );
		repo.save(new Product("core" , 5.5) );
		repo.save(new Product("core" , 5.5) );

	}
	
}
