package serv;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import prod.Product;
import shopper.Shopper;



public class ShopperController extends MultiActionController{
	
	public ModelAndView index(HttpServletRequest request, 
				HttpServletResponse response){
		System.out.println("in shopperController index method..");
		Shopper command= new Shopper();
		ModelAndView mv =new ModelAndView();
		mv.setViewName("shopperindex");
		Shopper s = new Shopper();
		s.setName("Test Shopper");
		mv.addObject("command",s);
		return mv;
	}
	public ModelAndView displayallproducts(HttpServletRequest request,HttpServletResponse response, Shopper command)
	{
		String inputName=command.getName();
		System.out.println(inputName);
		ModelAndView mvDispAllProds = new ModelAndView();
		Shopper processedShopper = new Shopper();
		processedShopper.setName(inputName);
		mvDispAllProds.addObject("command",processedShopper);
		mvDispAllProds.setViewName("/products/displayallproducts");
		return mvDispAllProds;
	}
	
	// Request attributes are bound to product 
	public ModelAndView updateCart(HttpServletRequest request,
				HttpServletResponse response, HttpSession session, Product product)
	{
		return null;
	}

}
