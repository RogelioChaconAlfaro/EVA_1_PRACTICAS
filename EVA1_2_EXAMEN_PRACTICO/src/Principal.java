
import java.util.Scanner;

/*
 * Práctica del examen de diagnóstico
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
        
        //char cSalir = 'n';                    //Declaración de variable para opción de terminar el programa
        int eNum;  
	 boolean vc;// Declaración de la variable que se usará para guardar el número ingresado por el usuario
        Scanner sCaptu = new Scanner(System.in); // Variable para captura del teclado
        // Scanner es una clase para facilitar la lectura del teclado
        // System.in es la entrada de perifericos de Java
       do{
        System.out.println("Ingrese un número"); // Indicación para el usuario
        eNum = sCaptu.nextInt(); // Convierte a entero cualquier texto o número que el usuario ingrese.
        switch(eNum){ // Identificando el número
            case 1:
                System.out.println("Enero");
		  vc = true;
                //System.out.println("¿Desea ingresar otro número? (s/n)"); //Indicación para repetir el programa o terminarlo
                break;
            case 2:
                System.out.println("Febrero");
		  vc = true;
                //System.out.println("¿Desea ingresar otro número? (s/n)");
                break;
            case 3:
                System.out.println("Marzo");
		  vc = true;
                //System.out.println("¿Desea ingresar otro número? (s/n)");
                break;
            case 4:
                System.out.println("Abril");
		  vc = true;
                //System.out.println("¿Desea ingresar otro número? (s/n)");
                break;
            case 5:
                System.out.println("Mayo");
		  vc = true;
                //System.out.println("¿Desea ingresar otro número? (s/n)");
                break;
            case 6:
                System.out.println("Junio");
		   vc = true;
                //System.out.println("¿Desea ingresar otro número? (s/n)");
                break;
            case 7:
                System.out.println("Julio");
		   vc = true;
                //System.out.println("¿Desea ingresar otro número? (s/n)");
                break;
            case 8:
                System.out.println("Agosto");
		   vc = true;
               // System.out.println("¿Desea ingresar otro número? (s/n)");
                break;
            case 9:
                System.out.println("Septiembre");
		   vc  = true;
                //System.out.println("¿Desea ingresar otro número? (s/n)");
                break;
            case 10:
                System.out.println("Octubre");
		  vc = true;
                //System.out.println("¿Desea ingresar otro número? (s/n)");
                break;
            case 11:
                System.out.println("Noviembre");
		   vc = true;
               // System.out.println("¿Desea ingresar otro número? (s/n)");
                break;
            case 12:
                System.out.println("Diciembre");
		   vc = true;
                //System.out.println("¿Desea ingresar otro número? (s/n)");
                break;
            default:
                System.out.println("Número ingresado incorrecto, intentelo de nuevo");
		  vc = false;
                break;
        }
        }while(vc == false);
    }
    
}
