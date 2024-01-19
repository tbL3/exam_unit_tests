import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

import com.example.*;

class GestionTachesTest {

    private GestionTaches gestionTaches;
    
    @BeforeEach
    void setUp(){
        gestionTaches = new GestionTaches();
    }

    @Test
    void ajouterTacheTest(){
        gestionTaches.ajouterTache("Tester ajout", "On teste l'ajout");
        assertEquals(1, gestionTaches.taches.size());
        gestionTaches.ajouterTache(null, null);
        assertEquals(2, gestionTaches.taches.size());
    }

    @Test
    void completerTacheTest(){
        gestionTaches.ajouterTache("Test 2", "Bla bla");
        assertEquals(true, gestionTaches.completerTache("Test 2"));
        assertEquals(false, gestionTaches.completerTache("Test 3"));
    }

    @Test
    void verifierTacheTest(){
        gestionTaches.ajouterTache("Test 4", "Bla bla");
        gestionTaches.completerTache("Test 4");
        assertEquals("true", gestionTaches.verifierTache("Test 4"));
        assertEquals("La tache n'existe pas", gestionTaches.verifierTache("Test 5"));
    }
}
