package cuentasBancarias;

import org.junit.Assert;
import org.junit.Test;

public class CuentasBancariasTest {
	
	@Test
	public void queInicia() {
		CuentasBancarias origen = new CuentasBancarias();
		CuentasBancarias destino = new CuentasBancarias();
		
		double monto = 0;

		origen.transferirMontoHacia(monto, destino);
		
		Assert.assertEquals(0, destino.mostrar(),0);
	}

}
