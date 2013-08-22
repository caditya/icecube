package serv;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import prod.FileUpload;

public class VendorController extends MultiActionController {
	private static final long serialVersionUID = 1L;
    
	public ModelAndView andlerRequest(HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {
    	System.out.println("Printing from twoserv vv...");
    	ModelAndView mav = new ModelAndView("vendorinbox");
    	mav.addObject("message", "Hello World!");
	
		return mav;
	}
	
	public ModelAndView productView(HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {
    	System.out.println("Printing from productUpload method..");
    	ModelAndView mav = new ModelAndView("productupload");
    	FileUpload command = new FileUpload();
    	mav.addObject("commmand", command);
    	mav.addObject("message", "Hello World!");
	
		return mav;
	}
	public ModelAndView productupload(HttpServletRequest arg0,
			HttpServletResponse arg1, FileUpload command) throws Exception {
		prod.FileUpload file = (FileUpload)command;
		 
		MultipartFile multipartFile = file.getFile();
 
		String fileName="";
		
		
		
		if(multipartFile!=null){
			fileName = multipartFile.getOriginalFilename();
			System.out.println("file Name: "+ fileName);
		}
 
		return new ModelAndView("FileUploadSuccess","fileName",fileName);
	}

}
