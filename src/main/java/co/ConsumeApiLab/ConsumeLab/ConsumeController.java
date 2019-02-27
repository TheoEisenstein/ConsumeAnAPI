package co.ConsumeApiLab.ConsumeLab;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ConsumeController {

	@Autowired
	private ApiService apiService;
	
	@RequestMapping("/")
	public ModelAndView index() {
		List<Tiny> tiny = apiService.findTiny();
		return new ModelAndView("index", "Tiny", tiny);
	}

	@RequestMapping("/complete")
	public ModelAndView complete() {
		List<Complete> complete = apiService.findComplete();
											//Actual List name
		return new ModelAndView("complete","Complete", complete);
	}
	
	@RequestMapping("/test")
	public ModelAndView quoteFun() {
		String wit = apiService.findWit();
		return new ModelAndView("test","wit",wit);
	}
	
}
