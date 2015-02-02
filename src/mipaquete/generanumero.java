

package mipaquete;

import java.util.Random;

public class generanumero {
    public int valorTira;
    public int calcularnumero(){
        Random Generar = new Random();
        valorTira  = Generar.nextInt(6)+1;
        return valorTira;
    }
}
