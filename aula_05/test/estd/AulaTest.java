package estd;

import org.junit.Assert;
import org.junit.Test;

public class AulaTest {

	
	@Test
	public void invertTest() {
		Aula aula = new Aula();
		String resultado = aula.invert("ola");
		Assert.assertEquals("alo", resultado);
	}
	
}
