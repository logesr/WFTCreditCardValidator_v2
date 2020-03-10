package com.wft.creditcardvalidator.service;

import java.util.List;

import com.wft.creditcardvalidator.model.CreditCard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreditCardService {
	
	@Autowired
    private com.wft.creditcardvalidator.dao.CreditCardDAO creditCardDAO;

	public List<CreditCard> validateCreditScore(String pannumber) {
		return creditCardDAO.validateCreditScore(pannumber);
	}

}
