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
	
	public boolean transferirMontoHacia(double monto, CuentasBancarias cuentaDestino) {
		if(monto > this.fondos) {
			System.out.println("Saldo Insuficiente");
			return false;
		}
		if(monto <= 0) {
			System.out.println("No se puede realizar esta tarea");
			return false;
		}
		return true;
	}
	
	public double mostrar() {
		return this.fondos;
	}
	

}
