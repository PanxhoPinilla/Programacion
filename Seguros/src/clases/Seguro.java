/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author PanxhoPinilla
 */
public class Seguro {
    private int valorUF;
    private int anoAntiguedad;
    private int anoActual;
    private int anoAuto;
    private double porcentajeSeguro = 0.1;
    private double valorSeguro;
    
    public int getValorUF() {
        return valorUF;
    }

    public void setValorUF(int valorUF) {
        this.valorUF = valorUF;
    }

    public double getAnoAntiguedad() {
        return anoAntiguedad;
    }

    public void setAnoAntiguedad(int anoAntiguedad) {
        this.anoAntiguedad = anoAntiguedad;
    }

    public int getAnoActual() {
        return anoActual;
    }

    public void setAnoActual(int anoActual) {
        this.anoActual = anoActual;
    }

    public int getAnoAuto() {
        return anoAuto;
    }

    public void setAnoAuto(int anoAuto) {
        this.anoAuto = anoAuto;
    }

    public void calcularAntiguedad(){
        int antiguedad = 0;
        if(this.anoActual == this.anoAuto){
            antiguedad = 1;
        }
        if(this.anoActual != this.anoAuto){
            antiguedad = this.anoActual - this.anoAuto;
        }
        this.anoAntiguedad = antiguedad;
    }
    
    
    public void pagoSeguro(){
        double porcentajeSeguro = (double) (this.anoAntiguedad * this.porcentajeSeguro);
        double seguro = (double) porcentajeSeguro * this.valorUF;
        this.valorSeguro = seguro;
    }

    public double getValorSeguro() {
        return valorSeguro;
    }

    public void setValorSeguro(double valorSeguro) {
        this.valorSeguro = valorSeguro;
    }
    
    public void mostrarValorSeguro(){
        System.out.println("Valor del Seguro: $" + this.valorSeguro);
    } 
}
