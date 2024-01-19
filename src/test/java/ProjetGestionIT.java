import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

import com.example.*;

class ProjetGestionIT {
    
    private Projet projet;

    @BeforeEach
    void setUp(){
        projet = new Projet("Projet de test");
    }

    /**
     * On teste que les listes sont bien synchronisées
     */
    @Test
    void synchroTest(){
        projet.ajouterTache("Test", "Une desc", 3);
        assertEquals(projet.taches, projet.gestionTaches.taches);
    }
}
