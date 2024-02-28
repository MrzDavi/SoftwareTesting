package projectgradle;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test 
    void appHasAGreeting() {
        App classUnderTest = new App();
        assertEquals("Hello World!", classUnderTest.getGreeting());
    }

    @Test 
    void somaEsperado() {
        App temp = new App();        
        int obtido = temp.getSoma( 5, 5);
        assertEquals(10, classUnderTest.getSoma());
    }
    
    @Test
    void isEven(){
        App temp = new App();
        boolean obtido = temp.getEven(9);
        assertTrue(obtido);   
    }
}