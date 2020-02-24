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
public class Capitulo10 {

    
    public static void main(String[] args) {
     
    RaceHorse h2=new RaceHorse();
    h2.setName("rodolfo");
    h2.setAño(2001);
    h2.setC1(color.BLANCO);
    h2.setNumrace(6);
        System.out.println(h2.getName()+" "+h2.getAño()+" "+h2.getC1()+" "+h2.getNumrace());
        //
        Candle c1=new Candle();
        c1.setColor(Color.RED);
        c1.setTamaño(13);
        System.out.println(c1.getColor()+" "+c1.getTamaño()+" "+c1.getPrecio());
        ScentedCandlle c2=new ScentedCandlle();
        c2.setAroma("vainilla");
        c2.setColor(Color.yellow);
        c2.setTamaño(13);
        System.out.println(c2.getAroma()+" "+c2.getColor()+" "+c2.getTamaño()+" "+c2.getPrecio());
        //
    }
    
    
}
