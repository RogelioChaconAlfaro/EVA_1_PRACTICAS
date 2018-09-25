
import Practicas.Automovil;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rogelio Chacón
 */
public class Principal {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		Automovil auto = new Automovil();
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingresa el modelo de tu auto: ");
		auto.setModelo(scan.nextLine());
		System.out.println("Ingresa la marca de tu auto: ");
		auto.setMarca(scan.nextLine());
		System.out.println("Ingresa el color de tu auto: ");
		auto.setColor(scan.nextLine());
		System.out.println("Ingresa el país de tu auto: ");
		auto.setPais(scan.nextLine());
		System.out.println("Ingresa 's' o 'n' si tu auto es automático o no: ");
		auto.setAutomatico(scan.nextLine().charAt(0));
		System.out.println("Ingresa 's' o 'n' si tu auto es eléctrico o no: ");
		auto.setElectrico(scan.nextLine().charAt(0));
		System.out.println("Ingresa el año de tu auto: ");
		auto.setAño(scan.nextInt());
		System.out.println("Ingresa el número de cilíndros de tu auto: ");
		auto.setCilindros(scan.nextInt());
		System.out.println("Ingresa el combustible de tu auto: ");
		auto.setCombustible(scan.nextInt());
		System.out.println("Ingresa el tamaño de rin de tu auto: ");
		auto.setTamañoRin(scan.nextInt());
		
		
	}
	
}
