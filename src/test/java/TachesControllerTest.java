import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

import com.example.*;

class TachesControllerTest {

    private TachesController tachesController;
    
    @BeforeEach
    void setUp(){
        tachesController = new TachesController("Test controller");
    }

    @Test
    void toStringTest(){
        tachesController.projet.ajouterTache("Test1", "Desc1", 1);

        assertEquals("Liste des taches :\n- Titre : Test1 ; description : Desc1 ; durée : 1\n", tachesController.toString());
    }
}
