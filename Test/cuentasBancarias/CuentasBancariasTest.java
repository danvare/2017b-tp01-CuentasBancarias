package cuentasBancarias;

import org.junit.Assert;
import org.junit.Test;

public class CuentasBancariasTest {
	
	@Test
	public void queInicia() {
		CuentasBancarias origen = new CuentasBancarias(2000.0);
		CuentasBancarias destino = new CuentasBancarias();
		
		double monto = 0;

		origen.transferirMontoHacia(monto, destino);
		
		Assert.assertEquals(origen.mostrar(), destino.mostrar(),0);
	}

}
