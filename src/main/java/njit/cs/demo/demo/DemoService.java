package njit.cs.demo.demo;

import org.springframework.stereotype.Service;
import jakarta.transaction.Transactional;
import java.util.List;


@Service
@Transactional
public class DemoService {

    private final DemoRepository demoRepository;

    public DemoService(DemoRepository demoRepository) {
        this.demoRepository = demoRepository;
    }
    
    public List<PhoneType> getPhoneType() {
        return demoRepository.findAll();
    }
    
}
