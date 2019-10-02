/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seguros;

import clases.Automovil;
import clases.Seguro;
import java.util.Scanner;

/**
 *
 * @author PanxhoPinilla
 */
public class Seguros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Automovil automovil = new Automovil();
        Seguro seguro = new Seguro();
        solicitarYAlmacenarDatos();
        
        seguro.calcularAntiguedad();
        
        seguro.pagoSeguro();
        if(seguro.getAnoActual()<=10){
        seguro.mostrarValorSeguro();
        }else{
            System.out.println("No Asegurable");
        }
          
    }

    private static void solicitarYAlmacenarDatos() {
        Automovil automovil = new Automovil();
        Seguro seguro = new Seguro();
        
        solicitarAnoActual();
        seguro.setAnoActual(capturarAnoActual());
        
        solicitarMarca();
        automovil.setMarca(capturarMarca());
        
        solicitarModelo();
        automovil.setModelo(capturerModelo());
        
        solicitarAno();
        automovil.setAno(capturarAno()); 
        seguro.setAnoAuto(automovil.getAno());
                
        solicitarValorUf();
        seguro.setValorUF(capturarValorUf());
    }

    private static void solicitarMarca() {
        System.out.print("Ingrese Marca: ");
    }

    private static String capturarMarca() {
        Scanner scanner = new Scanner(System.in);
        String marca = scanner.nextLine();
        return marca;   
    }

    private static void solicitarModelo() {
        System.out.print("Ingrese Modelo: ");
    }

    private static String capturerModelo() {
        Scanner scanner = new Scanner(System.in);
        String modelo = scanner.nextLine();
        return modelo;
    }

    private static void solicitarAno() {
        System.out.print("Ingrese Año: ");
    }

    private static int capturarAno() {
        Scanner scanner = new Scanner(System.in);   
        int ano = scanner.nextInt();
        return ano;
    }

    private static void solicitarValorUf() {
        System.out.print("Ingrese Valor UF: ");
    }
    
    private static int capturarValorUf() {
        Scanner scanner = new Scanner(System.in);
        int valorUf = scanner.nextInt();
        return valorUf;
    }

    private static void solicitarAnoActual() {
        System.out.print("Ingrese Año Actual: ");
    }

    private static int capturarAnoActual() {
        Scanner scanner = new Scanner(System.in);
        int ano = scanner.nextInt();
        return ano;  
    }

    
 
}
