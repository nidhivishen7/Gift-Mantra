package exam.hello;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface Iusers extends JpaRepository<users, Integer> {
	@Query("from users where user_Email=?1 and user_Pass=?2")
	Optional<users> findByLogin(String email , String pass );

	/*@Query(value="select * from users  where user_Email=?1 and user_Pass=?2", nativeQuery =true )
	Optional<users> findByLogin(String email , String pass );*/
	@Query(value="select user_Pass from users where user_Email=?1", nativeQuery =true )
	String findPassword(String i);
	

}