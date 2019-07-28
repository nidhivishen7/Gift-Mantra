package exam.hello;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface Iorders extends JpaRepository<orders, Integer> {
	@Query(value="select * from orders where userID=?1", nativeQuery =true )
	List<orders> findByX(int i);

}