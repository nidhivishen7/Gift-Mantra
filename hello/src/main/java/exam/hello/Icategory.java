package exam.hello;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Icategory  extends JpaRepository<category, Integer> {

}
