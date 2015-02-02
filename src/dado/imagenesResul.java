

package dado;

import javax.swing.ImageIcon;


public class imagenesResul {
    public ImageIcon icoImagen;
    public ImageIcon Imaen(int vDados){
        switch(vDados){
            case 1:
                icoImagen = new ImageIcon("D:\\monopoly\\dados\\cara1.png");
                break;
            case 2:
                icoImagen = new ImageIcon("D:\\monopoly\\dados\\cara2.png");
                break;
            case 3:
                icoImagen = new ImageIcon("D:\\monopoly\\dados\\cara3.png"); 
                break;
            case 4:
                icoImagen = new ImageIcon("D:\\monopoly\\dados\\cara4.png");
                break;
            case 5:
                icoImagen = new ImageIcon("D:\\monopoly\\dados\\cara5.png");
                break;
            case 6:
                icoImagen = new ImageIcon("D:\\monopoly\\dados\\cara6.png");
                break;
        }
        return icoImagen;
    }
}
