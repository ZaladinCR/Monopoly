

package mipaquete;

import javax.swing.ImageIcon;


public class imagenesResul {
    public ImageIcon icoImagen;
    public ImageIcon Imaen(int vDados){
        switch(vDados){
            case 1:
                icoImagen = new ImageIcon("C:\\Users\\Usuario\\Desktop\\dados\\uno.png");
                break;
            case 2:
                icoImagen = new ImageIcon("C:\\Users\\Usuario\\Desktop\\dados\\dos.png");
                break;
            case 3:
                icoImagen = new ImageIcon("C:\\Users\\Usuario\\Desktop\\dados\\tres.png"); 
                break;
            case 4:
                icoImagen = new ImageIcon("C:\\Users\\Usuario\\Desktop\\dados\\cuatro.png");
                break;
            case 5:
                icoImagen = new ImageIcon("C:\\Users\\Usuario\\Desktop\\dados\\cinco.png");
                break;
            case 6:
                icoImagen = new ImageIcon("C:\\Users\\Usuario\\Desktop\\dados\\seis.png");
                break;
        }
        return icoImagen;
    }
}
