package tn.esprit.rh.achat.services;

import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;


import tn.esprit.rh.achat.entities.SecteurActivite;
import tn.esprit.rh.achat.repositories.SecteurActiviteRepository;
import org.junit.Test;

import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import tn.esprit.rh.achat.AchatApplication;


import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;



@RunWith(SpringRunner.class)
@SpringBootTest(classes = AchatApplication.class)
public class SecteurServiceImplTest {

    @Mock
    private SecteurActiviteRepository secteurActiviteRepository;


    @InjectMocks
    SecteurActiviteServiceImpl secteurActiviteService;

    private SecteurActivite secteurActivite1 = new SecteurActivite();
    private SecteurActivite secteurActivite2 = new SecteurActivite();

    @Test
    public void addSecteurActiviteTest() {
        when(secteurActiviteRepository.save(secteurActivite1)).thenReturn(secteurActivite1);
        assertNotNull(secteurActivite1);

        SecteurActivite persisted = secteurActiviteService.addSecteurActivite(secteurActivite1);
        assertEquals(secteurActivite1, persisted);

        System.out.println("add secteurActivite works !");
    }

    @Test
    public void retrieveAllSecteurActivitesTest() {
        when(secteurActiviteRepository.findAll()).thenReturn(Stream
                .of(secteurActivite1,secteurActivite2)
                .collect(Collectors.toList()));

        assertEquals(2,secteurActiviteService.retrieveAllSecteurActivite().size());
        System.out.println("Retrieve all secteurActivites works !");
    }

    @Test
    public void UpdateSecteurActiviteTest() {
        when(secteurActiviteRepository.save(secteurActivite1)).thenReturn(secteurActivite1);
        assertNotNull(secteurActivite1);
        assertEquals(secteurActivite1, secteurActiviteService.updateSecteurActivite(secteurActivite1));
        System.out.println("Update secteurActivites works!");
    }

    @Test
    public void retrieveSecteurActiviteTest() {
        when(secteurActiviteRepository.findById(secteurActivite1.getIdSecteurActivite())).thenReturn(Optional.of(secteurActivite1));
        assertEquals(secteurActivite1, secteurActiviteService.retrieveSecteurActivite(secteurActivite1.getIdSecteurActivite()));
        System.out.println("Retrieve secteurActivite by id works !");
    }


}
