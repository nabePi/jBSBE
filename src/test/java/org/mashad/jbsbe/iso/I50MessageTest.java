package org.mashad.jbsbe.iso;

import static org.junit.Assert.fail;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;
import org.mashad.reflection.I50Reflector;

public class I50MessageTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		I50Factory.addField(4, "Amount", I50Type.AMOUNT, 0);
		I50Factory.addField(10, "Date", I50Type.DATE10, 0);
		I50Factory.addField(11, "stan", I50Type.NUMERIC, 6);
		
		I50Reflector reflector = new I50Reflector(null);
		PurchaseRequest purchaseRequest = PurchaseRequest.builder().amount(100L).date(new Date()).stan(123456).build();
		try {
			I50Message message = reflector.createI50Message(purchaseRequest);
			System.out.println(message);
		} catch (IllegalArgumentException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail("Not yet implemented");
		}
		
	}

}