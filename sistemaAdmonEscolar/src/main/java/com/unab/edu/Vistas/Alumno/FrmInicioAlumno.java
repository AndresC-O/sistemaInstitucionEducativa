/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unab.edu.Vistas.Alumno;

import com.unab.edu.Otros.CambiarPanel;
import com.unab.edu.Vistas.FrmLogin;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author AndresC
 */
public class FrmInicioAlumno extends javax.swing.JFrame {

    /**
     * Creates new form FrmInicioAlumno
     */
    PnStartAlumno pnStart = new PnStartAlumno();
    PnStartMateriasAlumno pnMaterias = new PnStartMateriasAlumno();
    PnNotasAlumno pnNotas = new PnNotasAlumno();
    CambiarPanel cambio = new CambiarPanel();

    public FrmInicioAlumno() {
        initComponents();
        this.setLocationRelativeTo(null);
        cambio.CambiaPanel(pnCentral, new PnStartAlumno());
        lblUsuarioActual.setText("Estudiante Actual: " + FrmLogin.FULLNAME);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnSuperior = new javax.swing.JPanel();
        lblMinimize = new javax.swing.JLabel();
        lblCerrar = new javax.swing.JLabel();
        lblUsuarioActual = new javax.swing.JLabel();
        pnCentral = new javax.swing.JPanel();
        pnIzquierdo = new javax.swing.JPanel();
        lblImagen = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btninicio = new com.unab.edu.Otros.Boton();
        btnMaterias = new com.unab.edu.Otros.Boton();
        btnTareas = new com.unab.edu.Otros.Boton();
        btnNotas = new com.unab.edu.Otros.Boton();
        btnLogOut = new com.unab.edu.Otros.Boton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnSuperior.setBackground(new java.awt.Color(8, 62, 148));

        lblMinimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/minus-sign.png"))); // NOI18N
        lblMinimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMinimizeMouseClicked(evt);
            }
        });

        lblCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/close.png"))); // NOI18N
        lblCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCerrarMouseClicked(evt);
            }
        });

        lblUsuarioActual.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lblUsuarioActual.setForeground(new java.awt.Color(255, 255, 255));
        lblUsuarioActual.setText("Usuario Actual:");

        javax.swing.GroupLayout pnSuperiorLayout = new javax.swing.GroupLayout(pnSuperior);
        pnSuperior.setLayout(pnSuperiorLayout);
        pnSuperiorLayout.setHorizontalGroup(
            pnSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnSuperiorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblUsuarioActual)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 899, Short.MAX_VALUE)
                .addComponent(lblMinimize)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnSuperiorLayout.setVerticalGroup(
            pnSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnSuperiorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCerrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnSuperiorLayout.createSequentialGroup()
                        .addGroup(pnSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMinimize)
                            .addComponent(lblUsuarioActual))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        getContentPane().add(pnSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 40));

        pnCentral.setBackground(new java.awt.Color(68, 130, 195));
        pnCentral.setLayout(new javax.swing.BoxLayout(pnCentral, javax.swing.BoxLayout.LINE_AXIS));
        getContentPane().add(pnCentral, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, 850, 590));

        pnIzquierdo.setBackground(new java.awt.Color(18, 58, 108));

        lblImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icono.png"))); // NOI18N

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        btninicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Home.png"))); // NOI18N
        btninicio.setText("     Inicio");
        btninicio.setBorderPainted(false);
        btninicio.setFocusPainted(false);
        btninicio.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btninicio.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btninicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninicioActionPerformed(evt);
            }
        });

        btnMaterias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Subjects.png"))); // NOI18N
        btnMaterias.setText("     Materias");
        btnMaterias.setBorderPainted(false);
        btnMaterias.setFocusPainted(false);
        btnMaterias.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnMaterias.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnMaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMateriasActionPerformed(evt);
            }
        });

        btnTareas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Homeworks.png"))); // NOI18N
        btnTareas.setText("     Tereas");
        btnTareas.setBorderPainted(false);
        btnTareas.setFocusPainted(false);
        btnTareas.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnTareas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnTareas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTareasActionPerformed(evt);
            }
        });

        btnNotas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/grades.png"))); // NOI18N
        btnNotas.setText("     Notas");
        btnNotas.setBorderPainted(false);
        btnNotas.setFocusPainted(false);
        btnNotas.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnNotas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNotasActionPerformed(evt);
            }
        });

        btnLogOut.setForeground(new java.awt.Color(251, 74, 89));
        btnLogOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Logout.png"))); // NOI18N
        btnLogOut.setText("     Cerrar Sesión");
        btnLogOut.setBorderPainted(false);
        btnLogOut.setColorHover(new java.awt.Color(251, 74, 89));
        btnLogOut.setFocusPainted(false);
        btnLogOut.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnLogOut.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnIzquierdoLayout = new javax.swing.GroupLayout(pnIzquierdo);
        pnIzquierdo.setLayout(pnIzquierdoLayout);
        pnIzquierdoLayout.setHorizontalGroup(
            pnIzquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnIzquierdoLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(lblImagen)
                .addGap(0, 49, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnIzquierdoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btninicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnIzquierdoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnLogOut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnIzquierdoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnIzquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnMaterias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnIzquierdoLayout.createSequentialGroup()
                        .addComponent(jSeparator1)
                        .addContainerGap())
                    .addComponent(btnTareas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNotas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        pnIzquierdoLayout.setVerticalGroup(
            pnIzquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnIzquierdoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblImagen)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btninicio, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTareas, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNotas, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 161, Short.MAX_VALUE)
                .addComponent(btnLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(pnIzquierdo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 220, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed

        String botones[] = {"Cerrar Sesión", "Cancelar"};
        int opcion = JOptionPane.showOptionDialog(this, "¿Estás seguro que deseas cerrar sesión ahora?", "Confirmar", 0, 0, null, botones, this);

        if (opcion == JOptionPane.YES_OPTION) {
            FrmLogin logout = new FrmLogin();
            logout.setVisible(true);
            this.dispose();
        } else if (opcion == JOptionPane.NO_OPTION) {
            System.out.println("¡Cancelado!");
        }
    }//GEN-LAST:event_btnLogOutActionPerformed

    private void btninicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninicioActionPerformed
        cambio.CambiaPanel(pnCentral, new PnStartAlumno());
    }//GEN-LAST:event_btninicioActionPerformed

    private void lblMinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizeMouseClicked

        this.setExtendedState(this.ICONIFIED);
    }//GEN-LAST:event_lblMinimizeMouseClicked

    private void lblCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrarMouseClicked

        String botones[] = {"Salir", "Cancelar"};
        int opcion = JOptionPane.showOptionDialog(this, "¿Estás seguro que quieres salir?", "Confirmar", 0, 0, null, botones, this);

        if (opcion == JOptionPane.YES_OPTION) {
            System.exit(0);
        } else if (opcion == JOptionPane.NO_OPTION) {
            System.out.println("¡Cancelado!");
        }
    }//GEN-LAST:event_lblCerrarMouseClicked

    private void btnMateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMateriasActionPerformed
        cambio.CambiaPanel(pnCentral, pnMaterias);
    }//GEN-LAST:event_btnMateriasActionPerformed

    private void btnNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNotasActionPerformed
        PnNotasAlumno pnNota = new PnNotasAlumno();
        cambio.CambiaPanel(pnCentral, pnNotas);
    }//GEN-LAST:event_btnNotasActionPerformed

    private void btnTareasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTareasActionPerformed
       PnTareasAlumno pnTareas = new PnTareasAlumno();
       cambio.CambiaPanel(pnCentral, pnTareas);
    }//GEN-LAST:event_btnTareasActionPerformed

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
            java.util.logging.Logger.getLogger(FrmInicioAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmInicioAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmInicioAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmInicioAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmInicioAlumno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.unab.edu.Otros.Boton btnLogOut;
    private com.unab.edu.Otros.Boton btnMaterias;
    private com.unab.edu.Otros.Boton btnNotas;
    private com.unab.edu.Otros.Boton btnTareas;
    private com.unab.edu.Otros.Boton btninicio;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblCerrar;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblMinimize;
    private javax.swing.JLabel lblUsuarioActual;
    private javax.swing.JPanel pnCentral;
    private javax.swing.JPanel pnIzquierdo;
    private javax.swing.JPanel pnSuperior;
    // End of variables declaration//GEN-END:variables

}
