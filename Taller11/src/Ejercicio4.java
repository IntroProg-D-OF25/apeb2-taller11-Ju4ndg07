import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
         Scanner tcl = new Scanner(System.in);
           double pres_kilov, num_kilov, totplani = 0, valBien;
        int opMenu;
        boolean op = true; 
        String nomCli = "", apellCli = "", numeCed = "";
        
        while (op){
            System.out.println("Escoja una opcion");
            System.out.println("1. Calculo Planilla Luz");
            System.out.println("2. Calculo de Predial");
            
            opMenu = tcl.nextInt();
               
        switch (opMenu) {
            case 1: 
            System.out.println("Ingresa nombre del Cliente");
            nomCli = tcl.nextLine();
            System.out.println("Ingresa apellido del Cliente");
            apellCli = tcl.nextLine(); // Solicitar también el apellido
            System.out.println("Ingresa número de cédula del Cliente");
            numeCed = tcl.nextLine();
            System.out.println("Ingrese valor del Kilovatio");
            pres_kilov = tcl.nextDouble();
            System.out.println("Ingrese cantidad de Kilovatios Consumidos");
            num_kilov = tcl.nextDouble();
            System.out.println("Nombre:" + nomCli + " " + apellCli);
              System.out.println("Número de cédula: " + numeCed);
            System.out.println("Total a pagar: " + calcularPlanillaLuz(pres_kilov, num_kilov,totplani));
            break;
           
             case 2: 
                    System.out.println("Ingrese nombre del cliente: ");
                    nomCli = tcl.nextLine();
                    apellCli = tcl.nextLine();
                    System.out.println("Ingrese el número de cédula del cliente: ");
                    numeCed = tcl.nextLine();
                    System.out.println("Ingrese el valor del bien inmueble: ");
                    valBien = tcl.nextDouble();
                    System.out.println("Nombre: " + nomCli + " " + apellCli);
                    System.out.println("Número cédula: " + numeCed);
                    System.out.println("Valor del bien inmueble: " + (valBien));
                    System.out.println("Valor a pagar por predio: " + calculoPredio(valBien));
                    break;
                    
                default:
                    System.out.println("Opción no válida, intenta de nuevo");
                    break;
            }
        }
    }
    public static double calcularPlanillaLuz(double pres_kilov, double num_kilov, double totplani) {
        totplani = pres_kilov * num_kilov;
        return totplani;
    }
    public static double calculoPredio(double valBien) {
        valBien *= 0.02; 
        return valBien;
       }

   
    }
/***
 * Escoja una opcion
1. Calculo Planilla Luz
2. Calculo de Predial
1
Ingresa nombre del Cliente
Ingresa apellido del Cliente
guerrero
Ingresa n�mero de c�dula del Cliente
1105214942
Ingrese valor del Kilovatio
90
Ingrese cantidad de Kilovatios Consumidos
50
Nombre: guerrero
N�mero de c�dula: 1105214942
Total a pagar: 4500.0
Escoja una opcion
1. Calculo Planilla Luz
2. Calculo de Predial
2
Ingrese nombre del cliente: 
Diego
Ingrese el n�mero de c�dula del cliente: 
1103913164
Ingrese el valor del bien inmueble: 
190
Nombre:  Diego
N�mero c�dula: 1103913164
Valor del bien inmueble: 190.0
Valor a pagar por predio: 3.8000000000000003
 */