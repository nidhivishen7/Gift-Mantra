package exam.hello;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface Iproducts extends JpaRepository<products, Integer>  {
	@Query(value="select * from products where categoryID=?1", nativeQuery =true )
	List<products> findByX(int i);
	@Query(value="select * from products where orderID=?1", nativeQuery =true )
	List<products> findByY(int i);
	
}
