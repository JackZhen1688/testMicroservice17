package njit.cs.demo.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	private final DemoService demoService;
	
	@Autowired
	private DemoAppProperties demoConfiguration;
	
    public DemoController(DemoService demoService) {
        this.demoService = demoService;
    }
    
    @GetMapping(value = "/test")
	public String getString() 
	{
		System.out.println("get test controller ...");
		String name = "Hello World! Jack";
		return name;
	}
	
	@GetMapping(value = "/property")
	public DemoAppProperties getProperties() 
	{
		System.out.println("get property controller ...");
		return demoConfiguration;
	}
	
	@GetMapping(value = "/phonetype")
	public List<PhoneType> getPhoneType() 
	{
		System.out.println("get phone type controller ...");
		return demoService.getPhoneType();
	}
	
	
}
