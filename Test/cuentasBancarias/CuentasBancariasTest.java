package cuentasBancarias;

import org.junit.Assert;
import org.junit.Test;

public class CuentasBancariasTest {
	
	@Test
	public void queInicia() {
		CuentasBancarias origen = new CuentasBancarias(2000.0);
		CuentasBancarias destino = new CuentasBancarias();
		Assert.assertEquals(2000.0, origen.mostrar(),0);
		Assert.assertEquals(0.0, destino.mostrar(),0);
	}

	@Test
	public void queEvalueLosFondos() {
		CuentasBancarias origen = new CuentasBancarias(2000.0);
		CuentasBancarias destino = new CuentasBancarias();
		
		double monto = 2000.1;

		origen.transferirMontoHacia(monto, destino);
		
		Assert.assertEquals(0.0, destino.mostrar(),0);
	}

	@Test
	public void queTransfieraLosFondos() {
		CuentasBancarias origen = new CuentasBancarias(2000.1);
		CuentasBancarias destino = new CuentasBancarias();
		
		double monto = 2000.1;

		origen.transferirMontoHacia(monto, destino);
		Assert.assertEquals(2000.1, destino.mostrar(),0);
		Assert.assertEquals(0.0, origen.mostrar(),0);
	}

}
