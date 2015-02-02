

package dado;
import  javax.swing.ImageIcon;

public class imagenes1 {
    public ImageIcon icoImagen;
    public ImageIcon gifDado1(int Dado1){
        switch(Dado1){
            case 1:
                icoImagen = new ImageIcon("D:\\monopoly\\dados\\dado.gif");
                break;
            case 2:
                icoImagen = new ImageIcon("D:\\monopoly\\dados\\dado.gif");
                break;
            case 3:
                icoImagen = new ImageIcon("D:\\monopoly\\dados\\dado.gif"); 
                break;
            case 4:
                icoImagen = new ImageIcon("D:\\monopoly\\dados\\dado.gif");
                break;
            case 5:
                icoImagen = new ImageIcon("D:\\monopoly\\dados\\dado.gif");
                break;
            case 6:
                icoImagen = new ImageIcon("D:\\monopoly\\dados\\dado.gif");  
                break;
        }
        return icoImagen;
    }
    
    
}
