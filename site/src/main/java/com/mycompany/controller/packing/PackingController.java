package com.mycompany.controller.packing;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.broadleafcommerce.core.web.controller.cart.AbstractCartController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/packing")
public class PackingController extends AbstractCartController {

	@RequestMapping("")
	public ModelAndView pack(@RequestParam("product") String product,
			HttpServletRequest request, HttpServletResponse response,
			Model model) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("packing/pack");
		modelAndView.addObject("test", product);
		model.addAttribute("test", product);
		return modelAndView;
	}
}
