package com.wft.creditcardvalidator.web;

import java.io.IOException;

import com.wft.creditcardvalidator.service.CreditCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * Handles requests for the application home page.
 */
@Controller
public class CreditCardController {
	
	@Autowired
    private CreditCardService CreditCardService;
	

	@RequestMapping(value = "/")
	public ModelAndView getHome(HttpServletRequest request) throws IOException {
		ModelAndView model = new ModelAndView("index");
		return model;
	}



	@RequestMapping(value = "/CreditCardValidation", method = RequestMethod.GET)
	public ModelAndView checkCreditScore(HttpServletRequest request) {
		String pannumber = request.getParameter("PAN_No");
		String validity = "";
		try {
			if (CreditCardService.validateCreditScore(pannumber) == null) {
				validity = "invalid";
			} else if (CreditCardService.validateCreditScore(pannumber).get(0).getCreditscore() > 5) {
				validity = "eligible";
			} else {
				validity = "ineligible";
			}
		}catch(Exception e){
			validity = "invalid";
		}
		ModelAndView model = new ModelAndView(validity);


		return model;
	}
	

	
}
