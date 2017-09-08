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
		if(monto > this.fondos) {
			System.out.println("Saldo Insuficiente");
			return;
		}
		cuentaDestino.fondos=this.fondos;
	}
	
	public double mostrar() {
		return this.fondos;
	}
	

}
