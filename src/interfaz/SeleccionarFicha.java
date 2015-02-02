
package interfaz;

import interfaz.Tablero;
import interfaz.principal;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import logica.Ficha;
import logica.Principal;


public class SeleccionarFicha extends javax.swing.JFrame {

   
    public SeleccionarFicha() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Seleccionar Ficha");
        
        ((JPanel)getContentPane()).setOpaque(false);
        ImageIcon uno=new ImageIcon(this.getClass().getResource("/imagenes/Monopoly3.jpg"));
        JLabel fondo= new JLabel();
        fondo.setIcon(uno);
        getLayeredPane().add(fondo,JLayeredPane.FRAME_CONTENT_LAYER);
        fondo.setBounds(0,0,uno.getIconWidth(),uno.getIconHeight());
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbtnAtras = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jbtnBarco = new javax.swing.JButton();
        jbtnCarretillo = new javax.swing.JButton();
        jbtnCarro = new javax.swing.JButton();
        jbtnDedal = new javax.swing.JButton();
        jbtnPerro = new javax.swing.JButton();
        jbtnPlancha = new javax.swing.JButton();
        jbtnSombrero = new javax.swing.JButton();
        jbtnZapato = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbtnAtras.setText("Atras");
        jbtnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAtrasActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 78, -1));

        jButton2.setText("Jugar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 300, -1, -1));

        jbtnBarco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/barco.jpg"))); // NOI18N
        jbtnBarco.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtnBarcoMouseClicked(evt);
            }
        });
        jbtnBarco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBarcoActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnBarco, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 60, 70));

        jbtnCarretillo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/carretillo.jpg"))); // NOI18N
        jbtnCarretillo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtnCarretilloMouseClicked(evt);
            }
        });
        jbtnCarretillo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCarretilloActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnCarretillo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 70, 60));

        jbtnCarro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/carro.jpg"))); // NOI18N
        jbtnCarro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtnCarroMouseClicked(evt);
            }
        });
        jbtnCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCarroActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnCarro, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, 70, 70));

        jbtnDedal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/dedal.jpg"))); // NOI18N
        jbtnDedal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtnDedalMouseClicked(evt);
            }
        });
        jbtnDedal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDedalActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDedal, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 120, 50, -1));

        jbtnPerro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/perro.jpg"))); // NOI18N
        jbtnPerro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtnPerroMouseClicked(evt);
            }
        });
        jbtnPerro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPerroActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnPerro, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, 70, 70));

        jbtnPlancha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/plancha.jpg"))); // NOI18N
        jbtnPlancha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtnPlanchaMouseClicked(evt);
            }
        });
        jbtnPlancha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPlanchaActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnPlancha, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, 60, 70));

        jbtnSombrero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/sombrero.jpg"))); // NOI18N
        jbtnSombrero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtnSombreroMouseClicked(evt);
            }
        });
        jbtnSombrero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSombreroActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnSombrero, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 220, 70, 70));

        jbtnZapato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/zapato.jpg"))); // NOI18N
        jbtnZapato.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtnZapatoMouseClicked(evt);
            }
        });
        jbtnZapato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnZapatoActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnZapato, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 220, 70, 70));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAtrasActionPerformed
       principal obj = new principal();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_jbtnAtrasActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Tablero obj =new Tablero();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jbtnCarretilloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCarretilloActionPerformed
        Ficha ficha = new Ficha("Carretillo");
       Principal.agregarJugador(ficha);
    }//GEN-LAST:event_jbtnCarretilloActionPerformed

    private void jbtnCarretilloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnCarretilloMouseClicked
        jbtnCarretillo.setEnabled(false);
    }//GEN-LAST:event_jbtnCarretilloMouseClicked

    private void jbtnBarcoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnBarcoMouseClicked
        jbtnBarco.setEnabled(false);
    }//GEN-LAST:event_jbtnBarcoMouseClicked

    private void jbtnCarroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnCarroMouseClicked
        jbtnCarro.setEnabled(false);
    }//GEN-LAST:event_jbtnCarroMouseClicked

    private void jbtnDedalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnDedalMouseClicked
        jbtnDedal.setEnabled(false);
    }//GEN-LAST:event_jbtnDedalMouseClicked

    private void jbtnPerroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnPerroMouseClicked
        jbtnPerro.setEnabled(false);
    }//GEN-LAST:event_jbtnPerroMouseClicked

    private void jbtnPlanchaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnPlanchaMouseClicked
        jbtnPlancha.setEnabled(false);
    }//GEN-LAST:event_jbtnPlanchaMouseClicked

    private void jbtnSombreroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnSombreroMouseClicked
        jbtnSombrero.setEnabled(false);
    }//GEN-LAST:event_jbtnSombreroMouseClicked

    private void jbtnZapatoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnZapatoMouseClicked
        jbtnZapato.setEnabled(false);
    }//GEN-LAST:event_jbtnZapatoMouseClicked

    private void jbtnBarcoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBarcoActionPerformed
       Ficha ficha = new Ficha("Barco");
       Principal.agregarJugador(ficha);
    }//GEN-LAST:event_jbtnBarcoActionPerformed

    private void jbtnCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCarroActionPerformed
       Ficha ficha = new Ficha("Carro");
       Principal.agregarJugador(ficha);
    }//GEN-LAST:event_jbtnCarroActionPerformed

    private void jbtnDedalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDedalActionPerformed
        Ficha ficha = new Ficha("Dedal");
       Principal.agregarJugador(ficha);
    }//GEN-LAST:event_jbtnDedalActionPerformed

    private void jbtnPerroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPerroActionPerformed
       Ficha ficha = new Ficha("Perro");
       Principal.agregarJugador(ficha);
    }//GEN-LAST:event_jbtnPerroActionPerformed

    private void jbtnPlanchaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPlanchaActionPerformed
       Ficha ficha = new Ficha("Plancha");
       Principal.agregarJugador(ficha);
       
    }//GEN-LAST:event_jbtnPlanchaActionPerformed

    private void jbtnSombreroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSombreroActionPerformed
       Ficha ficha = new Ficha("Sombrero");
       Principal.agregarJugador(ficha);
    }//GEN-LAST:event_jbtnSombreroActionPerformed

    private void jbtnZapatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnZapatoActionPerformed
       Ficha ficha = new Ficha("Zapato");
       Principal.agregarJugador(ficha);
    }//GEN-LAST:event_jbtnZapatoActionPerformed

    
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
            java.util.logging.Logger.getLogger(SeleccionarFicha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SeleccionarFicha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SeleccionarFicha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SeleccionarFicha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SeleccionarFicha().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jbtnAtras;
    private javax.swing.JButton jbtnBarco;
    private javax.swing.JButton jbtnCarretillo;
    private javax.swing.JButton jbtnCarro;
    private javax.swing.JButton jbtnDedal;
    private javax.swing.JButton jbtnPerro;
    private javax.swing.JButton jbtnPlancha;
    private javax.swing.JButton jbtnSombrero;
    private javax.swing.JButton jbtnZapato;
    // End of variables declaration//GEN-END:variables
}
