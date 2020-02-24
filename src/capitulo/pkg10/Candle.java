/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo.pkg10;
import java.awt.Color;

/**
 *
 * @author jonhy
 */
public class Candle {
    private Color color;
    private double precio;
    private Integer tamaño;
 public static final Integer PRICE=2;
   
        
    public void setColor(Color color) {
        this.color = color;
    }

    

    public void setTamaño(Integer tamaño) {
        this.tamaño = tamaño;
        calcular(PRICE);
        
    }

    public Color getColor() {
        return color;
    }

    

    public Integer getTamaño() {
        return tamaño;
        
    }

    public double getPrecio() {
        return precio;
    }
    
    public double calcular(Integer t1){
    this.precio=t1*this.tamaño;
        return this.precio;
    }
    
}
