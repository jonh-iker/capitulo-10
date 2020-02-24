/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo.pkg10;

/**
 *
 * @author jonhy
 */
public class ScentedCandlle extends Candle {
    private String aroma;
    public static final Integer PRICE=3;

    public void setAroma(String aroma) {
        this.aroma = aroma;
    }

    public String getAroma() {
        return aroma;
    }

    @Override
    public void setTamaño(Integer tamaño) {
        super.setTamaño(tamaño); //To change body of generated methods, choose Tools | Templates.
        calcular(PRICE);
    }
    
}
