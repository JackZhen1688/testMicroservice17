package njit.cs.demo.demo;

import java.util.List;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface DemoRepository extends JpaRepository<PhoneType, Long> {

	public List<PhoneType> findAll();
}
