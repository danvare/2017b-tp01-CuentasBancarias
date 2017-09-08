package cuentasBancarias;

public class CuentasBancarias {
	
	private double fondos;
	
	public CuentasBancarias() {
		this.fondos = 0;
	}
	
	public CuentasBancarias(Double fondos) {
		this.fondos = fondos;
	}
	
	public CuentasBancarias(CuentasBancarias cuentaB) {
		this.fondos = cuentaB.fondos;
	}
	
	public void transferirMontoHacia(double monto, CuentasBancarias cuentaDestino) {
		this.fondos=cuentaDestino.fondos;
	}
	
	public double mostrar() {
		return this.fondos;
	}
	

}
