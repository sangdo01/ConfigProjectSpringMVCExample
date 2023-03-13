package abc.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/trang1")
	public String Index1() {
	return "hello1";
	}
	@RequestMapping("/trang2")
	public String Index2() {
	return "hello2";
	}

}
