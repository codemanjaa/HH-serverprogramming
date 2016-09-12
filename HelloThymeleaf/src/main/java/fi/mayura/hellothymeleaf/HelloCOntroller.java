package fi.mayura.hellothymeleaf;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody


public class HelloCOntroller {

	 @RequestMapping(value="/hello", method=RequestMethod.GET)
public String greeting(@RequestParam(value="name") String name, Model model) {
//public String greeting(@RequestParam(value="name") String name, @RequestParam(name="age") int age, Model model) {
model.addAttribute("name", name);
//model.addAttribute("age",age);
	//public String hello(@RequestParam(name="name")String name,@RequestParam(name="age") int age){
		return "hello" ;
	}
	
}
