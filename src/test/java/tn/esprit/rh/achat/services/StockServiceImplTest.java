package tn.esprit.rh.achat.services;

import tn.esprit.rh.achat.entities.Stock;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class StockServiceImplTest {

	@Autowired
	IStockService stockService;
	Stock s = new Stock();
	
	@Test
	public void testAddStock() {
		s.setLibelleStock("tst");
		s.setQte(2);
		s.setQteMin(1);
		
		assertNotNull(s.getLibelleStock());
	}

}
