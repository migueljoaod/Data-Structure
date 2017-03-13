package test;

import org.junit.Assert;
import org.junit.Test;

import estd.Aula;

public class AulaTest {

	@Test
	public void invertTest(){
		Aula aula = new Aula();
		String resultado = aula.inverter("ola");
		Assert.assertEquals	("alo", resultado);
	}
	
}
