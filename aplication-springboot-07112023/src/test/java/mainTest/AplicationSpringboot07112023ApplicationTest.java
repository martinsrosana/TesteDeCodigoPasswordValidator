package mainTest;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;

import org.junit.jupiter.api.Test;

import br.com.rosanam.aplicationspringboot07112023.AplicationSpringboot07112023Application;

class AplicationSpringboot07112023ApplicationTest {

	  @Test
	    public void testValidInput() {
	        String input = "Abcdefg1@\n";
	        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
	        System.setIn(in);

	        AplicationSpringboot07112023Application.main(new String[0]);

	        assertTrue(true); // Teste bem-sucedido se não houver exceções lançadas

	        // Restaurar a entrada padrão do sistema
	        System.setIn(System.in);
	    }
	}