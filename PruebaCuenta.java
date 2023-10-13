
package actividad4_1_herencia;
import java.util.Scanner;
public class PruebaCuenta {
    public static void main(String[] args){
        Scanner entrada=new Scanner(System.in);
        System.out.println("Cuenta de ahorros");
        System.out.println("Ingrese saldo inicial=$");
        float saldoInicialAhorros=entrada.nextFloat();
        System.out.println("Ingrese tasa de interes=");
        float tasaAhorros=entrada.nextFloat();
        CuentaAhorros cuenta1=new CuentaAhorros(saldoInicialAhorros, tasaAhorros);
        System.out.println("Ingresar cantidad a consignar: $");
        float cantidadDepositar=entrada.nextFloat();
        cuenta1.consignar(cantidadDepositar);
        System.out.println("Ingresar cantidad a retirar: $");
        float cantidadRetirar=entrada.nextFloat();
        cuenta1.retirar(cantidadRetirar);
        cuenta1.extractoMensual();
        cuenta1.imprimir();
        
    }
    
}
