package exam.hello;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface Iorderdetails extends JpaRepository<orderdetails, Integer> {
	@Query(value="select * from orders where userID=?1", nativeQuery =true )
	List<orderdetails> findByX(int i);

}