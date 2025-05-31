package in.balu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import in.balu.binding.*;
@Controller
public class BookController {
	@GetMapping("/book")
	public ModelAndView loadForm() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("bookObj", new Book());
		mav.setViewName("index");
		return mav;
	}
	@PostMapping("/book")
	public ModelAndView handleBookForm(Book book) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg", "Book Saved");
		mav.setViewName("success");
		return mav;
	}
	
}
