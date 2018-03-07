
package Punto4;

public class Cuenta {
	private int numero_cuenta;
	private int dni;
	private double saldo_cuenta;
	private double interes;
	//constructor normal
	public Cuenta (int numero_cuenta, int dni, double saldo_cuenta, double interes) {
		super();
		this.numero_cuenta = numero_cuenta;
		this.dni = dni;
		this.saldo_cuenta = saldo_cuenta;
		this.interes = interes;
	}
	//constructor por defecto
	public Cuenta() {
		super();
	}
	//accedentes
	public int getnumero_cuenta() {
		return numero_cuenta;
	}
	public int getdni() {
		return dni;
	}
	public double getsaldo_cuenta() {
		return saldo_cuenta;
	}
	public double getinteres() {
		return interes;
	}
	//mutadores
	public void setdni(int dni) {
		this.dni = dni;
	}
	public void setsaldo_cuenta(double saldo_cuenta) {
		this.saldo_cuenta = saldo_cuenta;
	}
	public void setinteres(double interes) {
		this.interes = interes;
	}
	//actualizar saldo
	public void actualizar_saldo() {
		double auxinteres = this.interes/100;
		double aux = this.saldo_cuenta*auxinteres;
		auxinteres = aux/365;
		this.saldo_cuenta = this.saldo_cuenta-auxinteres;
	}
	//agregar saldo
	public void agregar_saldo(double valor) {
		this.saldo_cuenta = this.saldo_cuenta + valor;
	}
	//retirar saldo
	public void retirar_saldo(double valor) {
		if(valor > this.saldo_cuenta) {
			System.out.println("Valor a retirar es mayor que el saldo actual de la cuenta");
		}else {
			this.saldo_cuenta = this.saldo_cuenta - valor;
		}
	}
}