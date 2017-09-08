package cuentasBancarias;

public class CuentasBancarias {
	
	private double fondos;
	
	public CuentasBancarias() {
		this.fondos = 1;
	}
	
	public CuentasBancarias(CuentasBancarias cuentaB) {
		this.fondos = cuentaB.fondos;
	}
	
	public void transferirMontoHacia(double monto, CuentasBancarias cuentaDestino) {
	}
	
	public double mostrar() {
		return this.fondos;
	}
	

}
