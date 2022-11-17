package tn.esprit.rh.achat.services;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import tn.esprit.rh.achat.entities.Fournisseur;
import tn.esprit.rh.achat.repositories.FournisseurRepository;

@ExtendWith(MockitoExtension.class)
class FournisseurTest {

	@InjectMocks
	Fournisseur f;
	
	@Mock
	FournisseurRepository fr;
	
	@Test
	public void addF() {
		fr.save(f);
	}

}
