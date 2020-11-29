/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unab.edu.Vistas;

import com.unab.edu.DAO.CLSDocente;
import com.unab.edu.DAO.CLSEstudiante;
import com.unab.edu.Vistas.Alumno.FrmInicioAlumno;
import com.unab.edu.Vistas.Docente.FrmInicioDocente;
import javax.swing.JOptionPane;

/**
 *
 * @author AndresC
 */
public class FrmLogin extends javax.swing.JFrame {

    /**
     * Creates new form FrmLogin
     */
    public FrmLogin() {
        initComponents();
        this.setLocationRelativeTo(null);
        pwContra.setEchoChar('\u2022');
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        pwContra = new javax.swing.JPasswordField();
        jSeparator2 = new javax.swing.JSeparator();
        chMostrarCarac = new javax.swing.JCheckBox();
        btnEntrar = new javax.swing.JButton();
        lblRegistro = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblCerrar = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setOpacity(0.9F);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        jLabel1.setText("Inicio de Sesión");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(13, 94, 222));
        jLabel2.setText("Correo Electrónico:");

        txtCorreo.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtCorreo.setBorder(null);

        jSeparator1.setBackground(new java.awt.Color(13, 94, 222));
        jSeparator1.setForeground(new java.awt.Color(13, 94, 222));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(13, 94, 222));
        jLabel3.setText("Contraseña:");

        pwContra.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        pwContra.setBorder(null);

        jSeparator2.setBackground(new java.awt.Color(13, 94, 222));
        jSeparator2.setForeground(new java.awt.Color(13, 94, 222));

        chMostrarCarac.setBackground(new java.awt.Color(255, 255, 255));
        chMostrarCarac.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        chMostrarCarac.setForeground(new java.awt.Color(13, 94, 222));
        chMostrarCarac.setText("Mostrar Caracteres");
        chMostrarCarac.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        chMostrarCarac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chMostrarCaracActionPerformed(evt);
            }
        });

        btnEntrar.setBackground(new java.awt.Color(255, 255, 255));
        btnEntrar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnEntrar.setForeground(new java.awt.Color(255, 255, 255));
        btnEntrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/botonInicio.png"))); // NOI18N
        btnEntrar.setBorder(null);
        btnEntrar.setBorderPainted(false);
        btnEntrar.setFocusPainted(false);
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });

        lblRegistro.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lblRegistro.setForeground(new java.awt.Color(255, 0, 0));
        lblRegistro.setText("¡Aún no soy un usuario, Regístrame!");
        lblRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRegistroMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(chMostrarCarac)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel3)
                                .addComponent(jLabel2)
                                .addComponent(jLabel1)
                                .addComponent(txtCorreo)
                                .addComponent(jSeparator1)
                                .addComponent(pwContra, javax.swing.GroupLayout.DEFAULT_SIZE, 367, Short.MAX_VALUE)
                                .addComponent(jSeparator2))
                            .addComponent(btnEntrar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(lblRegistro)))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(50, 50, 50)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pwContra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chMostrarCarac)
                .addGap(27, 27, 27)
                .addComponent(btnEntrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addComponent(lblRegistro)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 470));

        jPanel2.setBackground(new java.awt.Color(13, 94, 222));

        lblCerrar.setBackground(new java.awt.Color(13, 94, 222));
        lblCerrar.setForeground(new java.awt.Color(13, 94, 222));
        lblCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/close.png"))); // NOI18N
        lblCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCerrarMouseClicked(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(13, 94, 222));
        jLabel4.setForeground(new java.awt.Color(13, 94, 222));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/graduation.png"))); // NOI18N
        jLabel4.setText("jLabel4");

        jLabel5.setBackground(new java.awt.Color(13, 94, 222));
        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("¡Te damos la bienvenida!");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(lblCerrar)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(45, 45, 45))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCerrar)
                .addGap(94, 94, 94)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addContainerGap(195, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 0, 270, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrarMouseClicked

        String botones[] = {"Cerrar", "Cancelar"};
        int opcion = JOptionPane.showOptionDialog(this, "¿Estás seguro que quieres salir?", "Confirmar", 0, 0, null, botones, this);

        if (opcion == JOptionPane.YES_OPTION) {
            System.exit(0);
        } else if (opcion == JOptionPane.NO_OPTION) {
            System.out.println("¡Cancelado!");
        }
    }//GEN-LAST:event_lblCerrarMouseClicked

    private void chMostrarCaracActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chMostrarCaracActionPerformed

        if (chMostrarCarac.isSelected()) {
            pwContra.setEchoChar((char) 0);
        } else {
            pwContra.setEchoChar('\u2022');
        }
    }//GEN-LAST:event_chMostrarCaracActionPerformed

    public static String FULLNAME;
    public static int envioID, envioIdEstudiante;
    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed

        String Correo = txtCorreo.getText();
        String Password = pwContra.getText();

        if (Correo.isEmpty() || Password.isEmpty()) {
            JOptionPane.showMessageDialog(null, "¡Por favor introduzca todos los datos para iniciar sesión!");
        } else {

            CLSDocente clsDocente = new CLSDocente();
            CLSEstudiante clsEstudiante = new CLSEstudiante();
            var validacionDocente = clsDocente.LoguinDocente(Correo, Password);
            var validacionEstudiante = clsEstudiante.LoguinEstudiante(Correo, Password);
            
            var envioNombres_E = clsEstudiante.RetornoFullName(Correo, Password);
            var enviarID = clsEstudiante.RetornoIdGrado(Correo, Password);
            var envioNombres_D = clsDocente.RetornoFullName(Correo, Password);
            var enviarIdEstudiante = clsEstudiante.RetornoIdEstudiante(Correo, Password);

            if (validacionDocente == true) {
                JOptionPane.showMessageDialog(null, "Bienvenido " + txtCorreo.getText() + ", usted acaba de iniciar sesión como DOCENTE.");
                FULLNAME = envioNombres_D;
                FrmInicioDocente loginDocente = new FrmInicioDocente();
                loginDocente.setVisible(true);
                this.dispose();
            } else if (validacionEstudiante == true) {
                JOptionPane.showMessageDialog(null, "Bienvenido " + txtCorreo.getText() + ", usted acaba de iniciar sesión como ESTUDIANTE.");
                FULLNAME = envioNombres_E;
                envioID = enviarID;
                envioIdEstudiante = enviarIdEstudiante;
                System.out.println("idGrado:"+envioID+" idEst:" +envioIdEstudiante);
                FrmInicioAlumno loginAlumno = new FrmInicioAlumno();
                loginAlumno.setVisible(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "¡El usuario no existe, verifique sus datos!");
            }

        }
    }//GEN-LAST:event_btnEntrarActionPerformed

    private void lblRegistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegistroMouseClicked

        FrmRegistroPersona newReg = new FrmRegistroPersona();
        newReg.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblRegistroMouseClicked

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntrar;
    private javax.swing.JCheckBox chMostrarCarac;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblCerrar;
    private javax.swing.JLabel lblRegistro;
    private javax.swing.JPasswordField pwContra;
    private javax.swing.JTextField txtCorreo;
    // End of variables declaration//GEN-END:variables
}
