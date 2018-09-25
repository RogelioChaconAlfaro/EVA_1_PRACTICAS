/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Momentum;

/**
 *
 * @author Rogelio Chacón
 */
public class MejorBanco {
	// Atributos de la clase
	// Siempre tienen que ser privados
	private String Nombre;
	private double Saldo;
	private String Contraseña;
	
	// Siempre debe existir un intermediario con los datos
	// Intermediario son métodos: get(Lectura) y set(Escritura)
	// Metodos:
	// Nivel de acceso - Valor de retorno - Nombre (Variables de entrada)
	// Leer datos de nuestra clase

	public String getNombre() {
		
		return Nombre;
		
	}

	public void setNombre(String Nombre) {
		this.Nombre = Nombre;
	}
	
	public void setContraseña(String Contraseña){
		this.Contraseña = Contraseña;
	}

	public double getSaldo(){
		return Saldo;
	}

	public void setSaldo(double Saldo) {
		this.Saldo = Saldo;
	}

	
	
}
