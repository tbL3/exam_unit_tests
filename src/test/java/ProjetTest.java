import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

import com.example.*;

class ProjetTest {
    
    private Projet projet;

    @BeforeEach
    void setUp(){
        projet = new Projet("Projet de test");
    }

    @Test
    void ajouterTacheTest(){
        projet.ajouterTache("Test 1", "desc 1", 4);
        assertEquals(1, projet.taches.size());
    }

    @Test
    void supprimerTacheTest(){
        projet.ajouterTache("Test 1", "desc 1", 4);
        projet.supprimerTache("Test 1");
        assertEquals(0, projet.taches.size());
    }

    @Test
    void calculerDureeTotaleTest(){
        projet.ajouterTache("Test 1", "desc 1", 5);
        projet.ajouterTache("Test 2", "desc 2", 6);
        assertEquals(11, projet.calculerDureeTotale());
        projet.supprimerTache("Test 1");
        projet.supprimerTache("Test 2");
        assertEquals(0, projet.calculerDureeTotale());
        projet.ajouterTache("Test 1", "desc 1", 5);
        projet.ajouterTache("Test 2", "desc 2", -1);
        assertEquals(5, projet.calculerDureeTotale());
    }
}
