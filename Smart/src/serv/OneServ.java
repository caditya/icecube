package serv;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class OneServ extends AbstractController {
	private static final long serialVersionUID = 1L;
    @Override
	protected ModelAndView handleRequestInternal(HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {
    	System.out.println("Printing from OneServ...");
    	ModelAndView mav = new ModelAndView("index");
    	mav.addObject("message", "Hello World!");
	
		return mav;
	}

}
