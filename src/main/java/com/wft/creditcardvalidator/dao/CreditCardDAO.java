package com.wft.creditcardvalidator.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import com.wft.creditcardvalidator.model.CreditCard;
import org.springframework.stereotype.Component;

@Component
public class CreditCardDAO {

	@PersistenceContext
	private EntityManager em;
	public List<CreditCard> validateCreditScore(String pannumber){
		TypedQuery<CreditCard> query = em.createQuery(
				"SELECT c FROM CreditCard c WHERE LOWER(c.pannumber) = LOWER(:pannumber)", CreditCard.class);
		query.setParameter("pannumber",pannumber);
		//System.out.println("Test"+query.getSingleResult());
		return query.getResultList();
	}


}
