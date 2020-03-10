/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minicalculadoraejemplo;

/**
 *
 * @author Juan Luis
 */
public class MiniCalculadoraejemplo {

    private double num;

    public MiniCalculadoraejemplo(double n) {
        this.num = n;
    }

    /**
     *
     * @param n número que le pasamos para calcular valor absoluto
     * @return devuelve valor del valor absoluto
     */
    public double valorAbsoluto(double n) {
        return Math.abs(n);
    }

    /**
     *
     * @param n número que le pasamos para calcular la raiz cuadrada
     * @return devuelve valor de la raiz cuadrada
     */
    public double raizCuadrada(double n) { //Este metodo devuelve el resultado de la raiz cuadrada
        return Math.sqrt(n);
    }

}
