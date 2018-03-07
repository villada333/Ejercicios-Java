package Punto4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import Punto4.Cuenta;

public class Main {
	public static void Mostrar_Datos(Cuenta cuentaselec) {
		System.out.println("Numero de cuenta: " + cuentaselec.getnumero_cuenta());
		System.out.println("DNI: " + cuentaselec.getdni());
		System.out.println("Saldo de la cuenta: " + cuentaselec.getsaldo_cuenta());
		System.out.println("Interes: " + cuentaselec.getinteres());
	}
	public static Cuenta Agregar_Cuenta() throws IOException {
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Digite el numero de la cuenta: ");
		String numero1 = "100001" + entrada.readLine();
		System.out.println("Digite el DNI: ");
		String numero2 = entrada.readLine();
		System.out.println("Digite el saldo de la cuenta: ");
		String numero3 = entrada.readLine();
		System.out.println("Digite el interes: ");
		String numero4 = entrada.readLine();
		Cuenta micuenta = new Cuenta(Integer.parseInt(numero1), Integer.parseInt(numero2), Double.parseDouble(numero3), Double.parseDouble(numero4));
		System.out.println("Cuenta creada correctamente \n");
		return micuenta;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader opcion = new BufferedReader(new InputStreamReader(System.in));
		int opcion2 = 10;
		Cuenta micuenta = Main.Agregar_Cuenta();
		do {
			System.out.println("\n1)Mostrar datos de la cuenta\n"
			+ "2)Editar DNI \n"
			+ "3)Editar saldo \n"
			+ "4)Editar interes \n"
			+ "5)Actualizar saldo \n"
			+ "6)Agregar Saldo \n"
			+ "7)Retirar Saldo \n"
			+ "0)Salir\n");
			opcion2 =  Integer.parseInt(opcion.readLine());
			switch (opcion2){
				case 1: Main.Mostrar_Datos(micuenta);
						break;
				case 2: System.out.println("Ingrese el nuevo DNI: ");
						opcion2=Integer.parseInt(opcion.readLine());
						micuenta.setdni(opcion2);
						break;
				case 3: System.out.println("Ingrese el nuevo Saldo: ");
						opcion2=Integer.parseInt(opcion.readLine());
						micuenta.setsaldo_cuenta(opcion2);
						break;
				case 4: System.out.println("Ingrese el nuevo Interes: ");
						opcion2=Integer.parseInt(opcion.readLine());
						micuenta.setinteres(opcion2);
						break;
				case 5: System.out.println("Saldo antes de la actualizacion : "
						+ micuenta.getsaldo_cuenta());
						micuenta.actualizar_saldo();
						System.out.println("Saldo despues de la actualizacion : "
						+ micuenta.getsaldo_cuenta());
						break;
				case 6: System.out.println("Ingrese el valor a consignar: ");
						opcion2=Integer.parseInt(opcion.readLine());
						System.out.println("Saldo antes de la consignacion : "
						+ micuenta.getsaldo_cuenta());
						micuenta.agregar_saldo(opcion2);
						System.out.println("Saldo despues de la consignacion : "
						+ micuenta.getsaldo_cuenta());
						break;
				case 7: System.out.println("Ingrese el valor a retirar: ");
						opcion2=Integer.parseInt(opcion.readLine());
						System.out.println("Saldo antes del retiro : "
						+ micuenta.getsaldo_cuenta());
						micuenta.retirar_saldo(opcion2);
						System.out.println("Saldo despues del retiro : "
						+ micuenta.getsaldo_cuenta());
						break;
				case 0: System.out.println("El programa ha terminado \n");
						opcion2=-10;
						break;
			}
		}while(opcion2>-1);
	}
}