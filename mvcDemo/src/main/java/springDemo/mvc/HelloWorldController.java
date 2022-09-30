package springDemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("hello")
public class HelloWorldController {
	 
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloForm";
	}
	
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloStudent";
	}
	
	@RequestMapping("/processFormTwo")
	public String shout(HttpServletRequest request, Model model) {
		
		String name = request.getParameter("studentName");
		
		String message = "Yo "+name;
		
		model.addAttribute("message",message.toUpperCase());
		
		return "helloStudent";
		
	}
	
	@RequestMapping("/processFormThree")
	public String processFormThree(@RequestParam("studentName") String name, Model model) {
		
		
		String message = "processFormThree : "+name;
		
		model.addAttribute("message",message.toUpperCase());
		
		return "helloStudent";
		
	}

}
