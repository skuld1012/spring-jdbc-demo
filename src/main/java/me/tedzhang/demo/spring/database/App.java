package me.tedzhang.demo.spring.database;

import java.util.List;

import me.tedzhang.demo.spring.database.dao.OffersDAO;
import me.tedzhang.demo.spring.database.model.Offer;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {

		try (ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(
				"me/tedzhang/demo/spring/database/beans/beans.xml")) {
			OffersDAO offersDao = (OffersDAO) context.getBean("offersDAO");
			
			Offer offerUpdate = new Offer(6, "Dave2", "test Dave2", "Dave2@test.com");
			
			if(offersDao.update(offerUpdate)) {
				System.out.println("Offer updated.");
			}
			
			List<Offer> offers = offersDao.getOffers();
			offers.forEach(offer -> System.out.println(offer));
			
			Offer offer = offersDao.getOfferById(2);
			System.out.println("Should be Nemo: " + offer);
		}
	}

}
