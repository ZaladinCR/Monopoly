
package interfaz;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import dado.generanumero;
import dado.imagenes1;
import dado.imagenesResul;
import logica.Principal;
import static logica.Principal.jugadorActual;


public class Tablero extends javax.swing.JFrame {
    int pares = 0;
    
    public Tablero() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Tablero");
        this.setSize(1000, 800); 
        ((JPanel)getContentPane()).setOpaque(false);
        
        
        
        
       
    }
     
    public void comprarPropiedad(int costo){
        if (JOptionPane.showConfirmDialog(null, "Desea comprar esta propiedad por: "+ "\n" +costo+" €", "Opción", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Propiedad comprada");
        } 
        else {
            JOptionPane.showMessageDialog(null, "Propiedad libre");
        }  
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbtnAtras = new javax.swing.JButton();
        jlbDado2 = new javax.swing.JLabel();
        jbtnTirarDados = new javax.swing.JButton();
        jbtnSalida = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jbtn9 = new javax.swing.JButton();
        jbtn21 = new javax.swing.JButton();
        jbtn7 = new javax.swing.JButton();
        jbtn6 = new javax.swing.JButton();
        jbtn5 = new javax.swing.JButton();
        jbtn4 = new javax.swing.JButton();
        jbtn3 = new javax.swing.JButton();
        jbtn2 = new javax.swing.JButton();
        jbtn1 = new javax.swing.JButton();
        jbt8 = new javax.swing.JButton();
        jbtn11 = new javax.swing.JButton();
        jbtn12 = new javax.swing.JButton();
        jbtn13 = new javax.swing.JButton();
        jbtn14 = new javax.swing.JButton();
        jbtn15 = new javax.swing.JButton();
        jbtn16 = new javax.swing.JButton();
        jbtn17 = new javax.swing.JButton();
        jbtn39 = new javax.swing.JButton();
        jbtn18 = new javax.swing.JButton();
        jbtn10 = new javax.swing.JButton();
        jbtn29 = new javax.swing.JButton();
        jbtn22 = new javax.swing.JButton();
        jbtn23 = new javax.swing.JButton();
        jbtn26 = new javax.swing.JButton();
        jbtn25 = new javax.swing.JButton();
        jbtn24 = new javax.swing.JButton();
        jbtn27 = new javax.swing.JButton();
        jbtn28 = new javax.swing.JButton();
        jbtn20 = new javax.swing.JButton();
        jbtn19 = new javax.swing.JButton();
        jbtn31 = new javax.swing.JButton();
        jbtn32 = new javax.swing.JButton();
        jbtn33 = new javax.swing.JButton();
        jbtn34 = new javax.swing.JButton();
        jbtn35 = new javax.swing.JButton();
        jbtn36 = new javax.swing.JButton();
        jbtn37 = new javax.swing.JButton();
        jbtn38 = new javax.swing.JButton();
        jlbCentroInfo = new javax.swing.JLabel();
        jbtn30 = new javax.swing.JButton();
        jlbAvanza = new javax.swing.JLabel();
        jlbDado1 = new javax.swing.JLabel();
        jlbCentro = new javax.swing.JLabel();
        jlbTarjetas = new javax.swing.JLabel();
        jbtnFinalizarTurno = new javax.swing.JButton();
        jTextField23 = new javax.swing.JTextField();
        jTextField25 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        jTextField19 = new javax.swing.JTextField();
        jTextField20 = new javax.swing.JTextField();
        jTextField21 = new javax.swing.JTextField();
        jTextField22 = new javax.swing.JTextField();
        jbtnVerCasas = new javax.swing.JButton();
        jbtnVerHotel = new javax.swing.JButton();
        jTextField12 = new javax.swing.JTextField();
        jbtnIniciarJuego = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbtnAtras.setText("Atras");
        jbtnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAtrasActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 590, -1, -1));

        jlbDado2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jlbDado2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 340, 64, 78));

        jbtnTirarDados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/dados.jpg"))); // NOI18N
        jbtnTirarDados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jbtnTirarDadosMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jbtnTirarDadosMouseReleased(evt);
            }
        });
        jbtnTirarDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTirarDadosActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnTirarDados, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 170, 90, 40));

        jbtnSalida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Salida.jpg"))); // NOI18N
        jbtnSalida.setBorder(null);
        jbtnSalida.setBorderPainted(false);
        jbtnSalida.setContentAreaFilled(false);
        jbtnSalida.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnSalida.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtnSalida.setIconTextGap(-3);
        jbtnSalida.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jbtnSalida.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbtnSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSalidaActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 660, 100, -1));

        jButton14.setBorder(null);
        jButton14.setBorderPainted(false);
        jButton14.setContentAreaFilled(false);
        jButton14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton14.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton14.setIconTextGap(-3);
        jButton14.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton14.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 870, 150, 140));

        jbtn9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/nueve.jpg"))); // NOI18N
        jbtn9.setBorder(null);
        jbtn9.setBorderPainted(false);
        jbtn9.setContentAreaFilled(false);
        jbtn9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtn9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtn9.setIconTextGap(-3);
        jbtn9.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jbtn9.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbtn9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbtn9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbtn9MouseExited(evt);
            }
        });
        jbtn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn9ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn9, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 660, 60, 100));

        jbtn21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/21.jpg"))); // NOI18N
        jbtn21.setBorder(null);
        jbtn21.setBorderPainted(false);
        jbtn21.setContentAreaFilled(false);
        jbtn21.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtn21.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtn21.setIconTextGap(-3);
        jbtn21.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jbtn21.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbtn21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbtn21MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbtn21MouseExited(evt);
            }
        });
        jbtn21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn21ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn21, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 60, 100));

        jbtn7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ocho_1.jpg"))); // NOI18N
        jbtn7.setBorder(null);
        jbtn7.setBorderPainted(false);
        jbtn7.setContentAreaFilled(false);
        jbtn7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtn7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtn7.setIconTextGap(-3);
        jbtn7.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jbtn7.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbtn7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbtn7MouseExited(evt);
            }
        });
        jbtn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn7ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 660, 60, 100));

        jbtn6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/seis.jpg"))); // NOI18N
        jbtn6.setBorder(null);
        jbtn6.setBorderPainted(false);
        jbtn6.setContentAreaFilled(false);
        jbtn6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtn6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtn6.setIconTextGap(-3);
        jbtn6.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jbtn6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbtn6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbtn6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbtn6MouseExited(evt);
            }
        });
        jbtn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn6ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 660, 60, 100));

        jbtn5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cinco.jpg"))); // NOI18N
        jbtn5.setBorder(null);
        jbtn5.setBorderPainted(false);
        jbtn5.setContentAreaFilled(false);
        jbtn5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtn5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtn5.setIconTextGap(-3);
        jbtn5.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jbtn5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbtn5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbtn5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbtn5MouseExited(evt);
            }
        });
        jbtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn5ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 660, 60, 100));

        jbtn4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cuatro.jpg"))); // NOI18N
        jbtn4.setBorder(null);
        jbtn4.setBorderPainted(false);
        jbtn4.setContentAreaFilled(false);
        jbtn4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtn4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtn4.setIconTextGap(-3);
        jbtn4.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jbtn4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn4ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 660, 60, 100));

        jbtn3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/tres.jpg"))); // NOI18N
        jbtn3.setBorder(null);
        jbtn3.setBorderPainted(false);
        jbtn3.setContentAreaFilled(false);
        jbtn3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtn3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtn3.setIconTextGap(-3);
        jbtn3.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jbtn3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbtn3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbtn3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbtn3MouseExited(evt);
            }
        });
        jbtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn3ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 660, 60, 100));

        jbtn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/dos.jpg"))); // NOI18N
        jbtn2.setBorder(null);
        jbtn2.setBorderPainted(false);
        jbtn2.setContentAreaFilled(false);
        jbtn2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtn2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtn2.setIconTextGap(-3);
        jbtn2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jbtn2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn2ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 660, 60, 100));

        jbtn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/uno.jpg"))); // NOI18N
        jbtn1.setBorder(null);
        jbtn1.setBorderPainted(false);
        jbtn1.setContentAreaFilled(false);
        jbtn1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtn1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtn1.setIconTextGap(-3);
        jbtn1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jbtn1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbtn1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbtn1MouseExited(evt);
            }
        });
        jbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn1ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 660, 60, 100));

        jbt8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ocho.jpg"))); // NOI18N
        jbt8.setBorder(null);
        jbt8.setBorderPainted(false);
        jbt8.setContentAreaFilled(false);
        jbt8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbt8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbt8.setIconTextGap(-3);
        jbt8.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jbt8.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbt8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbt8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbt8MouseExited(evt);
            }
        });
        jbt8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt8ActionPerformed(evt);
            }
        });
        getContentPane().add(jbt8, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 660, 60, 100));

        jbtn11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/diez.jpg"))); // NOI18N
        jbtn11.setBorder(null);
        jbtn11.setBorderPainted(false);
        jbtn11.setContentAreaFilled(false);
        jbtn11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtn11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtn11.setIconTextGap(-3);
        jbtn11.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jbtn11.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbtn11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbtn11MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbtn11MouseExited(evt);
            }
        });
        jbtn11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn11ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 600, 100, 60));

        jbtn12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/11.jpg"))); // NOI18N
        jbtn12.setBorder(null);
        jbtn12.setBorderPainted(false);
        jbtn12.setContentAreaFilled(false);
        jbtn12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtn12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtn12.setIconTextGap(-3);
        jbtn12.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jbtn12.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbtn12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbtn12MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbtn12MouseExited(evt);
            }
        });
        jbtn12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn12ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 540, 100, 60));

        jbtn13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/12.jpg"))); // NOI18N
        jbtn13.setBorder(null);
        jbtn13.setBorderPainted(false);
        jbtn13.setContentAreaFilled(false);
        jbtn13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtn13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtn13.setIconTextGap(-3);
        jbtn13.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jbtn13.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbtn13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbtn13MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbtn13MouseExited(evt);
            }
        });
        jbtn13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn13ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, 100, 60));

        jbtn14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/13.jpg"))); // NOI18N
        jbtn14.setBorder(null);
        jbtn14.setBorderPainted(false);
        jbtn14.setContentAreaFilled(false);
        jbtn14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtn14.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtn14.setIconTextGap(-3);
        jbtn14.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jbtn14.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbtn14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbtn14MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbtn14MouseExited(evt);
            }
        });
        jbtn14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn14ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 100, 60));

        jbtn15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/14.jpg"))); // NOI18N
        jbtn15.setBorder(null);
        jbtn15.setBorderPainted(false);
        jbtn15.setContentAreaFilled(false);
        jbtn15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtn15.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtn15.setIconTextGap(-3);
        jbtn15.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jbtn15.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbtn15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbtn15MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbtn15MouseExited(evt);
            }
        });
        jbtn15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn15ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 100, 60));

        jbtn16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/15.jpg"))); // NOI18N
        jbtn16.setBorder(null);
        jbtn16.setBorderPainted(false);
        jbtn16.setContentAreaFilled(false);
        jbtn16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtn16.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtn16.setIconTextGap(-3);
        jbtn16.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jbtn16.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbtn16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbtn16MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbtn16MouseExited(evt);
            }
        });
        jbtn16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn16ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 100, 60));

        jbtn17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/16.jpg"))); // NOI18N
        jbtn17.setBorder(null);
        jbtn17.setBorderPainted(false);
        jbtn17.setContentAreaFilled(false);
        jbtn17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtn17.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtn17.setIconTextGap(-3);
        jbtn17.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jbtn17.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbtn17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn17ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 100, 60));

        jbtn39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/39.jpg"))); // NOI18N
        jbtn39.setBorder(null);
        jbtn39.setBorderPainted(false);
        jbtn39.setContentAreaFilled(false);
        jbtn39.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtn39.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtn39.setIconTextGap(-3);
        jbtn39.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jbtn39.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbtn39.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbtn39MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbtn39MouseExited(evt);
            }
        });
        jbtn39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn39ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn39, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 600, 100, 60));

        jbtn18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/17.jpg"))); // NOI18N
        jbtn18.setBorder(null);
        jbtn18.setBorderPainted(false);
        jbtn18.setContentAreaFilled(false);
        jbtn18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtn18.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtn18.setIconTextGap(-3);
        jbtn18.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jbtn18.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbtn18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbtn18MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbtn18MouseExited(evt);
            }
        });
        jbtn18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn18ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 100, 60));

        jbtn10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/carcel.jpg"))); // NOI18N
        jbtn10.setBorder(null);
        jbtn10.setBorderPainted(false);
        jbtn10.setContentAreaFilled(false);
        jbtn10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtn10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtn10.setIconTextGap(-3);
        jbtn10.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jbtn10.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(jbtn10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 660, 100, -1));

        jbtn29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/29.jpg"))); // NOI18N
        jbtn29.setBorder(null);
        jbtn29.setBorderPainted(false);
        jbtn29.setContentAreaFilled(false);
        jbtn29.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtn29.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtn29.setIconTextGap(-3);
        jbtn29.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jbtn29.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbtn29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbtn29MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbtn29MouseExited(evt);
            }
        });
        jbtn29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn29ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn29, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 20, 60, 100));

        jbtn22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/22.jpg"))); // NOI18N
        jbtn22.setBorder(null);
        jbtn22.setBorderPainted(false);
        jbtn22.setContentAreaFilled(false);
        jbtn22.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtn22.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtn22.setIconTextGap(-3);
        jbtn22.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jbtn22.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbtn22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbtn22MouseExited(evt);
            }
        });
        jbtn22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn22ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn22, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 60, 100));

        jbtn23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/23.jpg"))); // NOI18N
        jbtn23.setBorder(null);
        jbtn23.setBorderPainted(false);
        jbtn23.setContentAreaFilled(false);
        jbtn23.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtn23.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtn23.setIconTextGap(-3);
        jbtn23.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jbtn23.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbtn23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbtn23MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbtn23MouseExited(evt);
            }
        });
        jbtn23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn23ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn23, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 60, 100));

        jbtn26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/26.jpg"))); // NOI18N
        jbtn26.setBorder(null);
        jbtn26.setBorderPainted(false);
        jbtn26.setContentAreaFilled(false);
        jbtn26.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtn26.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtn26.setIconTextGap(-3);
        jbtn26.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jbtn26.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbtn26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbtn26MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbtn26MouseExited(evt);
            }
        });
        jbtn26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn26ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn26, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, 60, 100));

        jbtn25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/25.jpg"))); // NOI18N
        jbtn25.setBorder(null);
        jbtn25.setBorderPainted(false);
        jbtn25.setContentAreaFilled(false);
        jbtn25.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtn25.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtn25.setIconTextGap(-3);
        jbtn25.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jbtn25.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbtn25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbtn25MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbtn25MouseExited(evt);
            }
        });
        jbtn25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn25ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn25, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, 60, 100));

        jbtn24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/24.jpg"))); // NOI18N
        jbtn24.setBorder(null);
        jbtn24.setBorderPainted(false);
        jbtn24.setContentAreaFilled(false);
        jbtn24.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtn24.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtn24.setIconTextGap(-3);
        jbtn24.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jbtn24.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbtn24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbtn24MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbtn24MouseExited(evt);
            }
        });
        jbtn24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn24ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn24, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, 60, 100));

        jbtn27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/27.jpg"))); // NOI18N
        jbtn27.setBorder(null);
        jbtn27.setBorderPainted(false);
        jbtn27.setContentAreaFilled(false);
        jbtn27.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtn27.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtn27.setIconTextGap(-3);
        jbtn27.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jbtn27.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbtn27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbtn27MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbtn27MouseExited(evt);
            }
        });
        jbtn27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn27ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn27, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, 60, 100));

        jbtn28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/28.jpg"))); // NOI18N
        jbtn28.setBorder(null);
        jbtn28.setBorderPainted(false);
        jbtn28.setContentAreaFilled(false);
        jbtn28.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtn28.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtn28.setIconTextGap(-3);
        jbtn28.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jbtn28.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbtn28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbtn28MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbtn28MouseExited(evt);
            }
        });
        jbtn28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn28ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn28, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 20, 60, 100));

        jbtn20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/19.jpg"))); // NOI18N
        jbtn20.setBorder(null);
        jbtn20.setBorderPainted(false);
        jbtn20.setContentAreaFilled(false);
        jbtn20.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtn20.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtn20.setIconTextGap(-3);
        jbtn20.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jbtn20.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(jbtn20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 100, -1));

        jbtn19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/18.jpg"))); // NOI18N
        jbtn19.setBorder(null);
        jbtn19.setBorderPainted(false);
        jbtn19.setContentAreaFilled(false);
        jbtn19.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtn19.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtn19.setIconTextGap(-3);
        jbtn19.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jbtn19.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbtn19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbtn19MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbtn19MouseExited(evt);
            }
        });
        jbtn19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn19ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 100, 60));

        jbtn31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/31.jpg"))); // NOI18N
        jbtn31.setBorder(null);
        jbtn31.setBorderPainted(false);
        jbtn31.setContentAreaFilled(false);
        jbtn31.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtn31.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtn31.setIconTextGap(-3);
        jbtn31.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jbtn31.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbtn31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbtn31MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbtn31MouseExited(evt);
            }
        });
        jbtn31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn31ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn31, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 120, 100, 60));

        jbtn32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/32.jpg"))); // NOI18N
        jbtn32.setBorder(null);
        jbtn32.setBorderPainted(false);
        jbtn32.setContentAreaFilled(false);
        jbtn32.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtn32.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtn32.setIconTextGap(-3);
        jbtn32.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jbtn32.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbtn32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbtn32MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbtn32MouseExited(evt);
            }
        });
        jbtn32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn32ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn32, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 180, 100, 60));

        jbtn33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/33.jpg"))); // NOI18N
        jbtn33.setBorder(null);
        jbtn33.setBorderPainted(false);
        jbtn33.setContentAreaFilled(false);
        jbtn33.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtn33.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtn33.setIconTextGap(-3);
        jbtn33.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jbtn33.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbtn33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn33ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn33, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 240, 100, 60));

        jbtn34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/34.jpg"))); // NOI18N
        jbtn34.setBorder(null);
        jbtn34.setBorderPainted(false);
        jbtn34.setContentAreaFilled(false);
        jbtn34.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtn34.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtn34.setIconTextGap(-3);
        jbtn34.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jbtn34.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbtn34.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbtn34MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbtn34MouseExited(evt);
            }
        });
        jbtn34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn34ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn34, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 300, 100, 60));

        jbtn35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/35.jpg"))); // NOI18N
        jbtn35.setBorder(null);
        jbtn35.setBorderPainted(false);
        jbtn35.setContentAreaFilled(false);
        jbtn35.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtn35.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtn35.setIconTextGap(-3);
        jbtn35.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jbtn35.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbtn35.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbtn35MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbtn35MouseExited(evt);
            }
        });
        jbtn35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn35ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn35, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 360, 100, 60));

        jbtn36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/36.jpg"))); // NOI18N
        jbtn36.setBorder(null);
        jbtn36.setBorderPainted(false);
        jbtn36.setContentAreaFilled(false);
        jbtn36.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtn36.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtn36.setIconTextGap(-3);
        jbtn36.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jbtn36.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbtn36.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbtn36MouseExited(evt);
            }
        });
        jbtn36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn36ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn36, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 420, 100, 60));

        jbtn37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/37.jpg"))); // NOI18N
        jbtn37.setBorder(null);
        jbtn37.setBorderPainted(false);
        jbtn37.setContentAreaFilled(false);
        jbtn37.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtn37.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtn37.setIconTextGap(-3);
        jbtn37.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jbtn37.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbtn37.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbtn37MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbtn37MouseExited(evt);
            }
        });
        jbtn37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn37ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn37, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 480, 100, 60));

        jbtn38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/38.jpg"))); // NOI18N
        jbtn38.setBorder(null);
        jbtn38.setBorderPainted(false);
        jbtn38.setContentAreaFilled(false);
        jbtn38.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtn38.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtn38.setIconTextGap(-3);
        jbtn38.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jbtn38.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbtn38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn38ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn38, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 540, 100, 60));
        getContentPane().add(jlbCentroInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, 230, 360));

        jbtn30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/30.jpg"))); // NOI18N
        jbtn30.setBorder(null);
        jbtn30.setBorderPainted(false);
        jbtn30.setContentAreaFilled(false);
        jbtn30.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtn30.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtn30.setIconTextGap(-3);
        jbtn30.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jbtn30.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(jbtn30, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 20, 100, -1));

        jlbAvanza.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(jlbAvanza, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 190, 130, 20));
        getContentPane().add(jlbDado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 350, 60, 70));

        jlbCentro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Centro.png"))); // NOI18N
        jlbCentro.setOpaque(true);
        getContentPane().add(jlbCentro, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 460, 460));
        getContentPane().add(jlbTarjetas, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, 360, 200));

        jbtnFinalizarTurno.setText("Finalizar Turno");
        jbtnFinalizarTurno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnFinalizarTurnoActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnFinalizarTurno, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 720, -1, -1));

        jTextField23.setEditable(false);
        jTextField23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField23ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField23, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 220, 40, 20));

        jTextField25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField25ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField25, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 160, 40, -1));

        jTextField3.setEditable(false);
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 120, 60, -1));
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 120, 60, -1));

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 120, 60, -1));

        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, 60, -1));
        getContentPane().add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 60, -1));
        getContentPane().add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 60, -1));

        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 340, 40, -1));
        getContentPane().add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 480, 40, -1));
        getContentPane().add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 600, 40, -1));

        jTextField1.setEditable(false);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 640, 60, -1));

        jTextField2.setEditable(false);
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 640, 60, -1));
        getContentPane().add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 640, 60, -1));
        getContentPane().add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 640, 60, -1));
        getContentPane().add(jTextField16, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 640, 60, -1));

        jTextField17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField17ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField17, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 40, -1));
        getContentPane().add(jTextField18, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 40, -1));
        getContentPane().add(jTextField19, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 340, 40, -1));
        getContentPane().add(jTextField20, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 420, 40, -1));
        getContentPane().add(jTextField21, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 480, 40, -1));
        getContentPane().add(jTextField22, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 600, 40, -1));

        jbtnVerCasas.setText("Ver Casas");
        jbtnVerCasas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnVerCasasActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnVerCasas, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 720, -1, -1));

        jbtnVerHotel.setText("Ver Hoteles");
        jbtnVerHotel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnVerHotelActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnVerHotel, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 680, 90, -1));

        jTextField12.setEditable(false);
        jTextField12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField12ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 30, 100, -1));

        jbtnIniciarJuego.setText("Iniciar Juego");
        jbtnIniciarJuego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnIniciarJuegoActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnIniciarJuego, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 680, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAtrasActionPerformed
        principal obj=new principal();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_jbtnAtrasActionPerformed

    private void jbtnTirarDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTirarDadosActionPerformed
    }//GEN-LAST:event_jbtnTirarDadosActionPerformed

    private void jbtn39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn39ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtn39ActionPerformed

    private void jbtn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtn9ActionPerformed

    private void jbtn21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtn21ActionPerformed

    private void jbtn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn7ActionPerformed
        jlbTarjetas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Suerte1.png"))); 
        getContentPane().add(jlbTarjetas, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 240, 408, 252));
        jlbTarjetas.setOpaque(true);
    }//GEN-LAST:event_jbtn7ActionPerformed

    private void jbtn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn6ActionPerformed
        comprarPropiedad(100);
    }//GEN-LAST:event_jbtn6ActionPerformed

    private void jbtn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn5ActionPerformed
        comprarPropiedad(200);
    }//GEN-LAST:event_jbtn5ActionPerformed

    private void jbtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtn4ActionPerformed

    private void jbtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn3ActionPerformed
        comprarPropiedad(60);
    }//GEN-LAST:event_jbtn3ActionPerformed

    private void jbtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn2ActionPerformed
        jlbTarjetas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Comunal1.png"))); 
        getContentPane().add(jlbTarjetas, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 240, 408, 252));
        jlbTarjetas.setOpaque(true);
    }//GEN-LAST:event_jbtn2ActionPerformed

    private void jbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn1ActionPerformed
        comprarPropiedad(60);
    }//GEN-LAST:event_jbtn1ActionPerformed

    private void jbt8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt8ActionPerformed
       
    }//GEN-LAST:event_jbt8ActionPerformed

    private void jbtn11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtn11ActionPerformed

    private void jbtn12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtn12ActionPerformed

    private void jbtn13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtn13ActionPerformed

    private void jbtn14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtn14ActionPerformed

    private void jbtn15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtn15ActionPerformed

    private void jbtn16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtn16ActionPerformed

    private void jbtn17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtn17ActionPerformed

    private void jbtn18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtn18ActionPerformed

    private void jbtn29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn29ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtn29ActionPerformed

    private void jbtn22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn22ActionPerformed
        jlbTarjetas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Suerte3.png"))); 
        getContentPane().add(jlbTarjetas, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 240, 408, 252));
        jlbTarjetas.setOpaque(true);
    }//GEN-LAST:event_jbtn22ActionPerformed

    private void jbtn23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn23ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtn23ActionPerformed

    private void jbtn26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn26ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtn26ActionPerformed

    private void jbtn25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtn25ActionPerformed

    private void jbtn24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn24ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtn24ActionPerformed

    private void jbtn27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn27ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtn27ActionPerformed

    private void jbtn28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn28ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtn28ActionPerformed

    private void jbtn19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtn19ActionPerformed

    private void jbtn31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn31ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtn31ActionPerformed

    private void jbtn32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn32ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtn32ActionPerformed

    private void jbtn33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn33ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtn33ActionPerformed

    private void jbtn34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn34ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtn34ActionPerformed

    private void jbtn35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn35ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtn35ActionPerformed

    private void jbtn36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn36ActionPerformed
       jlbTarjetas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Suerte2.png"))); 
        getContentPane().add(jlbTarjetas, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 240, 408, 252));
        jlbTarjetas.setOpaque(true);
    }//GEN-LAST:event_jbtn36ActionPerformed

    private void jbtn37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn37ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtn37ActionPerformed

    private void jbtn38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn38ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtn38ActionPerformed

    private void jbtnSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSalidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnSalidaActionPerformed
    public void pintarInfo(String direccion){
        jlbCentroInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource(direccion))); 
        getContentPane().add(jlbCentroInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, 230, 360));
        jlbCentroInfo.setOpaque(true);
    }
    public void quitarInfo(){
        jlbCentroInfo.setIcon(new javax.swing.ImageIcon()); 
        getContentPane().add(jlbCentroInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, 230, 360));
        jlbCentroInfo.setOpaque(false);
    }
    private void jbtn1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtn1MouseEntered
        pintarInfo("/imagenes/Ronda.png");
    }//GEN-LAST:event_jbtn1MouseEntered

    private void jbtn3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtn3MouseEntered
        pintarInfo("/imagenes/Plaza.png");
    }//GEN-LAST:event_jbtn3MouseEntered

    private void jbtn1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtn1MouseExited
        quitarInfo();
    }//GEN-LAST:event_jbtn1MouseExited

    private void jbtn3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtn3MouseExited
        quitarInfo();
    }//GEN-LAST:event_jbtn3MouseExited

    private void jbtn5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtn5MouseEntered
        pintarInfo("/imagenes/Goya.png");
    }//GEN-LAST:event_jbtn5MouseEntered

    private void jbtn5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtn5MouseExited
        quitarInfo();
    }//GEN-LAST:event_jbtn5MouseExited

    private void jbtn6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtn6MouseEntered
        pintarInfo("/imagenes/Glorieta.png");
    }//GEN-LAST:event_jbtn6MouseEntered

    private void jbtn6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtn6MouseExited
        quitarInfo();
    }//GEN-LAST:event_jbtn6MouseExited

    private void jbt8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbt8MouseEntered
        pintarInfo("/imagenes/Reina.png");
    }//GEN-LAST:event_jbt8MouseEntered

    private void jbt8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbt8MouseExited
        quitarInfo();
    
    }//GEN-LAST:event_jbt8MouseExited

    private void jbtn9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtn9MouseEntered
        pintarInfo("/imagenes/Bravo.png");
    }//GEN-LAST:event_jbtn9MouseEntered

    private void jbtn9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtn9MouseExited
        quitarInfo();
    }//GEN-LAST:event_jbtn9MouseExited

    private void jbtn11MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtn11MouseEntered
        pintarInfo("/imagenes/Bilbao.png");
    }//GEN-LAST:event_jbtn11MouseEntered

    private void jbtn11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtn11MouseExited
        quitarInfo();
    }//GEN-LAST:event_jbtn11MouseExited

    private void jbtn13MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtn13MouseEntered
        pintarInfo("/imagenes/Aguilera.png");
    }//GEN-LAST:event_jbtn13MouseEntered

    private void jbtn13MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtn13MouseExited
        quitarInfo();
    }//GEN-LAST:event_jbtn13MouseExited

    private void jbtn14MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtn14MouseEntered
        pintarInfo("/imagenes/Fuencarral.png");
    }//GEN-LAST:event_jbtn14MouseEntered

    private void jbtn14MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtn14MouseExited
        quitarInfo();
    }//GEN-LAST:event_jbtn14MouseExited

    private void jbtn15MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtn15MouseEntered
        pintarInfo("/imagenes/Delicias.png");
    }//GEN-LAST:event_jbtn15MouseEntered

    private void jbtn15MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtn15MouseExited
        quitarInfo();
    }//GEN-LAST:event_jbtn15MouseExited

    private void jbtn35MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtn35MouseEntered
        pintarInfo("/imagenes/Norte.png");
    }//GEN-LAST:event_jbtn35MouseEntered

    private void jbtn35MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtn35MouseExited
        quitarInfo();
    }//GEN-LAST:event_jbtn35MouseExited

    private void jbtn25MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtn25MouseEntered
        pintarInfo("/imagenes/Mediodia.png");
    }//GEN-LAST:event_jbtn25MouseEntered

    private void jbtn25MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtn25MouseExited
        quitarInfo();
    }//GEN-LAST:event_jbtn25MouseExited

    private void jbtn16MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtn16MouseEntered
        pintarInfo("/imagenes/Felipe.png");
    }//GEN-LAST:event_jbtn16MouseEntered

    private void jbtn16MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtn16MouseExited
        quitarInfo();
    }//GEN-LAST:event_jbtn16MouseExited

    private void jbtn18MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtn18MouseEntered
        pintarInfo("/imagenes/Velazquez.png");
    }//GEN-LAST:event_jbtn18MouseEntered

    private void jbtn18MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtn18MouseExited
        quitarInfo();
    }//GEN-LAST:event_jbtn18MouseExited

    private void jbtn19MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtn19MouseEntered
        pintarInfo("/imagenes/Serrano.png");
    }//GEN-LAST:event_jbtn19MouseEntered

    private void jbtn19MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtn19MouseExited
        quitarInfo();
    }//GEN-LAST:event_jbtn19MouseExited

    private void jbtn21MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtn21MouseEntered
        pintarInfo("/imagenes/America.png");
    }//GEN-LAST:event_jbtn21MouseEntered

    private void jbtn21MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtn21MouseExited
        quitarInfo();
    }//GEN-LAST:event_jbtn21MouseExited

    private void jbtn23MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtn23MouseEntered
        pintarInfo("/imagenes/Molina.png");
    }//GEN-LAST:event_jbtn23MouseEntered

    private void jbtn23MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtn23MouseExited
        quitarInfo();
    }//GEN-LAST:event_jbtn23MouseExited

    private void jbtn24MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtn24MouseEntered
        pintarInfo("/imagenes/Cea.png");
    }//GEN-LAST:event_jbtn24MouseEntered

    private void jbtn24MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtn24MouseExited
        quitarInfo();
    }//GEN-LAST:event_jbtn24MouseExited

    private void jbtn26MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtn26MouseEntered
        pintarInfo("/imagenes/Catolicos.png");
    }//GEN-LAST:event_jbtn26MouseEntered

    private void jbtn26MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtn26MouseExited
        quitarInfo();
    }//GEN-LAST:event_jbtn26MouseExited

    private void jbtn27MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtn27MouseEntered
        pintarInfo("/imagenes/Bailen.png");
    }//GEN-LAST:event_jbtn27MouseEntered

    private void jbtn27MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtn27MouseExited
        quitarInfo();
    }//GEN-LAST:event_jbtn27MouseExited

    private void jbtn29MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtn29MouseEntered
        pintarInfo("/imagenes/Espana.png");
    }//GEN-LAST:event_jbtn29MouseEntered

    private void jbtn29MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtn29MouseExited
        quitarInfo();
    }//GEN-LAST:event_jbtn29MouseExited

    private void jbtn31MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtn31MouseEntered
        pintarInfo("/imagenes/Sol.png");
    }//GEN-LAST:event_jbtn31MouseEntered

    private void jbtn31MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtn31MouseExited
        quitarInfo();
    }//GEN-LAST:event_jbtn31MouseExited

    private void jbtn32MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtn32MouseEntered
        pintarInfo("/imagenes/Alcala.png");
    }//GEN-LAST:event_jbtn32MouseEntered

    private void jbtn32MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtn32MouseExited
        quitarInfo();
    }//GEN-LAST:event_jbtn32MouseExited

    private void jbtn34MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtn34MouseEntered
        pintarInfo("/imagenes/Via.png");
    }//GEN-LAST:event_jbtn34MouseEntered

    private void jbtn34MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtn34MouseExited
       quitarInfo();
    }//GEN-LAST:event_jbtn34MouseExited

    private void jbtn37MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtn37MouseEntered
        pintarInfo("/imagenes/Castellana.png");
    }//GEN-LAST:event_jbtn37MouseEntered

    private void jbtn37MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtn37MouseExited
        quitarInfo();
    }//GEN-LAST:event_jbtn37MouseExited

    private void jbtn39MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtn39MouseEntered
        pintarInfo("/imagenes/Prado.png");
    }//GEN-LAST:event_jbtn39MouseEntered

    private void jbtn39MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtn39MouseExited
        quitarInfo();
    }//GEN-LAST:event_jbtn39MouseExited

    private void jbtn28MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtn28MouseEntered
        pintarInfo("/imagenes/Aguas.png");
    }//GEN-LAST:event_jbtn28MouseEntered

    private void jbtn28MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtn28MouseExited
        quitarInfo();
    }//GEN-LAST:event_jbtn28MouseExited

    private void jbtn12MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtn12MouseEntered
        pintarInfo("/imagenes/Electricidad.png");
    }//GEN-LAST:event_jbtn12MouseEntered

    private void jbtn12MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtn12MouseExited
       quitarInfo();
    }//GEN-LAST:event_jbtn12MouseExited

    private void jbtnTirarDadosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnTirarDadosMousePressed
        jlbAvanza.setText("");
        generanumero objDado = new generanumero();
        int dados = objDado.calcularnumero();
        
        imagenes1 objImag1 = new imagenes1();
        jlbDado1.setIcon(objImag1.gifDado1(dados));
        
        generanumero objDado1 = new generanumero();
        int dados1 = objDado1.calcularnumero();
        imagenes1 objImag = new imagenes1();
        jlbDado2.setIcon(objImag.gifDado1(dados1));
    }//GEN-LAST:event_jbtnTirarDadosMousePressed

    private void jbtnTirarDadosMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnTirarDadosMouseReleased
        generanumero objDado1 = new generanumero();
        imagenesResul objImag1 = new imagenesResul();
        int num1 = objDado1.calcularnumero();
        jlbDado1.setIcon(objImag1.Imaen(num1));
        
        generanumero objDado2 = new generanumero();
        imagenesResul objImag2 = new imagenesResul();
        int num2 = objDado2.calcularnumero();
        jlbDado2.setIcon(objImag2.Imaen(num2));
        
        
        if (num1 == num2){
            pares += 1;
            if (pares == 3){
                JOptionPane.showMessageDialog(null, "Vas a la carcel");
            }
            else
                JOptionPane.showMessageDialog(null, "Felicidades Tiro Doble, puede volver a lanzar los dados"+"\n"+"Si saca tres dobles se va a la carcel");
 
            
        }
        
        jlbAvanza.setText("Avance "+(num1+num2));
    }//GEN-LAST:event_jbtnTirarDadosMouseReleased

    private void jbtn7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtn7MouseExited
        jlbTarjetas.setIcon(new javax.swing.ImageIcon()); 
        getContentPane().add(jlbTarjetas, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 240, 405, 252));
        jlbTarjetas.setOpaque(false);
    }//GEN-LAST:event_jbtn7MouseExited

    
    private void jbtnFinalizarTurnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnFinalizarTurnoActionPerformed
        Principal.siguienteJugador();
    }//GEN-LAST:event_jbtnFinalizarTurnoActionPerformed

    private void jTextField23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField23ActionPerformed
        
        
    }//GEN-LAST:event_jTextField23ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jTextField17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField17ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed

    private void jTextField25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField25ActionPerformed

    private void jbtnVerCasasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnVerCasasActionPerformed
        
        int largoListProp=jugadorActual.getPropiedades().size();
        int i;
        int numeroCasas;
        String numero;
        for(i=0;i<22;i++) {
            numeroCasas=Principal.getNumCasasTotal(i,largoListProp);
            switch(i) {
                case 1:
                    numero=Integer.toString(numeroCasas);
                    jTextField1.setText(numero);
                case 2:
                    numero=Integer.toString(numeroCasas);
                    jTextField2.setText(numero);
                case 3:
                    numero=Integer.toString(numeroCasas);
                    jTextField3.setText(numero);
                case 4:
                    numero=Integer.toString(numeroCasas);
                    jTextField4.setText(numero);
                case 5:
                     numero=Integer.toString(numeroCasas);
                    jTextField5.setText(numero);
                case 6:
                    numero=Integer.toString(numeroCasas);
                    jTextField6.setText(numero);
                case 7:
                    numero=Integer.toString(numeroCasas);
                    jTextField7.setText(numero);
                case 8:
                    numero=Integer.toString(numeroCasas);
                    jTextField8.setText(numero);
                case 9:
                    numero=Integer.toString(numeroCasas);
                    jTextField9.setText(numero);
                case 10:
                    numero=Integer.toString(numeroCasas);
                    jTextField10.setText(numero);
                case 11:
                    numero=Integer.toString(numeroCasas);
                    jTextField11.setText(numero);
                case 12:
                    numero=Integer.toString(numeroCasas);
                    jTextField23.setText(numero);
                case 13:
                    numero=Integer.toString(numeroCasas);
                    jTextField25.setText(numero);
                case 14:
                    numero=Integer.toString(numeroCasas);
                    jTextField14.setText(numero);
                case 15:
                    numero=Integer.toString(numeroCasas);
                    jTextField15.setText(numero);
                case 16:
                    numero=Integer.toString(numeroCasas);
                    jTextField16.setText(numero);
                case 17:
                    numero=Integer.toString(numeroCasas);
                    jTextField17.setText(numero);
                case 18:
                    numero=Integer.toString(numeroCasas);
                    jTextField18.setText(numero);
                case 19:
                    numero=Integer.toString(numeroCasas);
                    jTextField19.setText(numero);
                case 20:
                    numero=Integer.toString(numeroCasas);
                    jTextField20.setText(numero);
                case 21:
                    numero=Integer.toString(numeroCasas);
                    jTextField21.setText(numero);
                case 22:
                    numero=Integer.toString(numeroCasas);
                    jTextField22.setText(numero);
                    
            
            
            
            
            }
        }
      
    
    }//GEN-LAST:event_jbtnVerCasasActionPerformed

    private void jbtnVerHotelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnVerHotelActionPerformed
        int largoListProp=jugadorActual.getPropiedades().size();
        int i;
        int numeroCasas;
        String numero;
        for(i=0;i<22;i++) {
            numeroCasas=Principal.getNumHotelesTotal(i,largoListProp);
            switch(i) {
                case 1:
                    numero=Integer.toString(numeroCasas);
                    jTextField1.setText(numero);
                case 2:
                    numero=Integer.toString(numeroCasas);
                    jTextField2.setText(numero);
                case 3:
                    numero=Integer.toString(numeroCasas);
                    jTextField3.setText(numero);
                case 4:
                    numero=Integer.toString(numeroCasas);
                    jTextField4.setText(numero);
                case 5:
                     numero=Integer.toString(numeroCasas);
                    jTextField5.setText(numero);
                case 6:
                    numero=Integer.toString(numeroCasas);
                    jTextField6.setText(numero);
                case 7:
                    numero=Integer.toString(numeroCasas);
                    jTextField7.setText(numero);
                case 8:
                    numero=Integer.toString(numeroCasas);
                    jTextField8.setText(numero);
                case 9:
                    numero=Integer.toString(numeroCasas);
                    jTextField9.setText(numero);
                case 10:
                    numero=Integer.toString(numeroCasas);
                    jTextField10.setText(numero);
                case 11:
                    numero=Integer.toString(numeroCasas);
                    jTextField11.setText(numero);
                case 12:
                    numero=Integer.toString(numeroCasas);
                    jTextField23.setText(numero);
                case 13:
                    numero=Integer.toString(numeroCasas);
                    jTextField25.setText(numero);
                case 14:
                    numero=Integer.toString(numeroCasas);
                    jTextField14.setText(numero);
                case 15:
                    numero=Integer.toString(numeroCasas);
                    jTextField15.setText(numero);
                case 16:
                    numero=Integer.toString(numeroCasas);
                    jTextField16.setText(numero);
                case 17:
                    numero=Integer.toString(numeroCasas);
                    jTextField17.setText(numero);
                case 18:
                    numero=Integer.toString(numeroCasas);
                    jTextField18.setText(numero);
                case 19:
                    numero=Integer.toString(numeroCasas);
                    jTextField19.setText(numero);
                case 20:
                    numero=Integer.toString(numeroCasas);
                    jTextField20.setText(numero);
                case 21:
                    numero=Integer.toString(numeroCasas);
                    jTextField21.setText(numero);
                case 22:
                    numero=Integer.toString(numeroCasas);
                    jTextField22.setText(numero);
                    
            
            
            
            
            }
        }
    }//GEN-LAST:event_jbtnVerHotelActionPerformed

    private void jTextField12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField12ActionPerformed
        
    }//GEN-LAST:event_jTextField12ActionPerformed

    private void jbtnIniciarJuegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnIniciarJuegoActionPerformed
        Principal.siguienteJugador();
        String monto = Integer.toString(Principal.jugadorActual.getMonto());
        jTextField12.setText(monto);
    }//GEN-LAST:event_jbtnIniciarJuegoActionPerformed

    private void jbtn36MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtn36MouseExited
        jlbTarjetas.setIcon(new javax.swing.ImageIcon()); 
        getContentPane().add(jlbTarjetas, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 240, 405, 252));
        jlbTarjetas.setOpaque(false);
    }//GEN-LAST:event_jbtn36MouseExited

    private void jbtn22MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtn22MouseExited
        jlbTarjetas.setIcon(new javax.swing.ImageIcon()); 
        getContentPane().add(jlbTarjetas, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 240, 405, 252));
        jlbTarjetas.setOpaque(false);
    }//GEN-LAST:event_jbtn22MouseExited
     
    
  
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tablero().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton14;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JButton jbt8;
    private javax.swing.JButton jbtn1;
    private javax.swing.JButton jbtn10;
    private javax.swing.JButton jbtn11;
    private javax.swing.JButton jbtn12;
    private javax.swing.JButton jbtn13;
    private javax.swing.JButton jbtn14;
    private javax.swing.JButton jbtn15;
    private javax.swing.JButton jbtn16;
    private javax.swing.JButton jbtn17;
    private javax.swing.JButton jbtn18;
    private javax.swing.JButton jbtn19;
    private javax.swing.JButton jbtn2;
    private javax.swing.JButton jbtn20;
    private javax.swing.JButton jbtn21;
    private javax.swing.JButton jbtn22;
    private javax.swing.JButton jbtn23;
    private javax.swing.JButton jbtn24;
    private javax.swing.JButton jbtn25;
    private javax.swing.JButton jbtn26;
    private javax.swing.JButton jbtn27;
    private javax.swing.JButton jbtn28;
    private javax.swing.JButton jbtn29;
    private javax.swing.JButton jbtn3;
    private javax.swing.JButton jbtn30;
    private javax.swing.JButton jbtn31;
    private javax.swing.JButton jbtn32;
    private javax.swing.JButton jbtn33;
    private javax.swing.JButton jbtn34;
    private javax.swing.JButton jbtn35;
    private javax.swing.JButton jbtn36;
    private javax.swing.JButton jbtn37;
    private javax.swing.JButton jbtn38;
    private javax.swing.JButton jbtn39;
    private javax.swing.JButton jbtn4;
    private javax.swing.JButton jbtn5;
    private javax.swing.JButton jbtn6;
    private javax.swing.JButton jbtn7;
    private javax.swing.JButton jbtn9;
    private javax.swing.JButton jbtnAtras;
    private javax.swing.JButton jbtnFinalizarTurno;
    private javax.swing.JButton jbtnIniciarJuego;
    private javax.swing.JButton jbtnSalida;
    private javax.swing.JButton jbtnTirarDados;
    private javax.swing.JButton jbtnVerCasas;
    private javax.swing.JButton jbtnVerHotel;
    private javax.swing.JLabel jlbAvanza;
    private javax.swing.JLabel jlbCentro;
    private javax.swing.JLabel jlbCentroInfo;
    private javax.swing.JLabel jlbDado1;
    private javax.swing.JLabel jlbDado2;
    private javax.swing.JLabel jlbTarjetas;
    // End of variables declaration//GEN-END:variables
}
