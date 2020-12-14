/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unab.edu.Vistas.Docente;

import com.unab.edu.DAO.CLSMateria;
import com.unab.edu.DAO.CLSMateriaDocente;
import com.unab.edu.Entidades.Materia;
import com.unab.edu.Entidades.Materias_Docentes;
import com.unab.edu.Vistas.FrmLogin;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author CruzCalles
 */
public class PnStrarMateriasDocente extends javax.swing.JPanel {

    /**
     * Creates new form PnStrarMateriasDocente
     */
    public PnStrarMateriasDocente() {
        initComponents();
        setBackground(new Color(0, 0, 0, 0));

        tb_Materias_Docente.getTableHeader().setFont(new Font("Century Gothic", Font.PLAIN, 11));
        tb_Materias_Docente.getTableHeader().setOpaque(false);
        tb_Materias_Docente.setBackground(new Color(45, 86, 130));
        tb_Materias_Docente.setForeground(new Color(255, 255, 255));
        tb_Materias_Docente.setRowHeight(25);

        tb_Materias_Asignadas.getTableHeader().setFont(new Font("Century Gothic", Font.PLAIN, 11));
        tb_Materias_Asignadas.getTableHeader().setOpaque(false);
        tb_Materias_Asignadas.setBackground(new Color(45, 86, 130));
        tb_Materias_Asignadas.setForeground(new Color(255, 255, 255));
        tb_Materias_Asignadas.setRowHeight(25);

        Mostrar_Tabla_Materias();
        //limpiarTabla(tb_Materias_Docente);
    }

    public void limpiarTabla(JTable Tabla) {
        try {
            DefaultTableModel modelo = (DefaultTableModel) Tabla.getModel();
            int filas = Tabla.getRowCount();
            for (int i = 0; filas > i; i++) {
                modelo.removeRow(0);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al limpiar la tabla.");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        btnInscribir = new com.unab.edu.Otros.Boton();
        jPanel1 = new javax.swing.JPanel();
        lblActulizar = new javax.swing.JLabel();
        btnInscribir1 = new com.unab.edu.Otros.Boton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_Materias_Docente = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tb_Materias_Asignadas = new javax.swing.JTable();
        lblEliminar = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jLabel3.setBackground(new java.awt.Color(68, 130, 195));
        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Materia Seleccionada:");

        btnInscribir.setText("      Inscribir");
        btnInscribir.setBorderPainted(false);
        btnInscribir.setFocusPainted(false);
        btnInscribir.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        btnInscribir.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        jPanel1.setBackground(new java.awt.Color(68, 130, 195));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(850, 590));

        lblActulizar.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblActulizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/browser.png"))); // NOI18N
        lblActulizar.setText("Actualizar");

        btnInscribir1.setText("      Inscribir");
        btnInscribir1.setBorderPainted(false);
        btnInscribir1.setFocusPainted(false);
        btnInscribir1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        btnInscribir1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnInscribir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInscribir1ActionPerformed(evt);
            }
        });

        tb_Materias_Docente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "CÓDIGO", "NOMBRE MATERIA"
            }
        ));
        tb_Materias_Docente.setFocusable(false);
        tb_Materias_Docente.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tb_Materias_Docente.setRowHeight(25);
        tb_Materias_Docente.setSelectionBackground(new java.awt.Color(93, 173, 226));
        tb_Materias_Docente.setShowVerticalLines(false);
        tb_Materias_Docente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_Materias_DocenteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_Materias_Docente);

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Materias Asignadas.");

        tb_Materias_Asignadas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "CÓDIGO", "MATERIA SELECCIONADA"
            }
        ));
        tb_Materias_Asignadas.setFocusable(false);
        tb_Materias_Asignadas.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tb_Materias_Asignadas.setRowHeight(25);
        tb_Materias_Asignadas.setSelectionBackground(new java.awt.Color(93, 173, 226));
        tb_Materias_Asignadas.setShowVerticalLines(false);
        tb_Materias_Asignadas.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tb_Materias_Asignadas);

        lblEliminar.setBackground(new java.awt.Color(68, 130, 195));
        lblEliminar.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lblEliminar.setForeground(new java.awt.Color(255, 255, 255));
        lblEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/delete.png"))); // NOI18N
        lblEliminar.setText("Eliminar Seleccionada");
        lblEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        lblEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblEliminarMouseClicked(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(68, 130, 195));
        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("¡Bienvenido a tu sección de Materias!");

        jLabel6.setBackground(new java.awt.Color(68, 130, 195));
        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Materias disponibles para impartir");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Doc.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 777, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblActulizar)
                                .addGap(11, 11, 11))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnInscribir1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblEliminar)))
                        .addGap(8, 8, 8)))
                .addGap(26, 26, 26))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblActulizar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEliminar)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(btnInscribir1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    String TITULOS1[] = {"CODIGO", "MATERIA SELECCIONADA"};
    DefaultTableModel ModeloTabla_MatSele = new DefaultTableModel(null, TITULOS1);

    private void tb_Materias_DocenteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_Materias_DocenteMouseClicked

        //Acá estamos obteniendo la fila que el usuario seleccionó.
        int filas = tb_Materias_Docente.getSelectedRow();
        //Asignamos todos los campos de la tabla.
        String ID = String.valueOf(tb_Materias_Docente.getValueAt(filas, 0));
        String Nombre = String.valueOf(tb_Materias_Docente.getValueAt(filas, 1));
        //Pasamos los datos para la tabla a inscribir.
        String Filas[] = new String[3];
        Filas[0] = ID;
        Filas[1] = Nombre;

        for (int i = 0; i < tb_Materias_Asignadas.getRowCount(); i++) {

            if (tb_Materias_Asignadas.getValueAt(i, 0) == ID) {
                JOptionPane.showMessageDialog(null, "¡Ya ha seleccionado esta materia!");
                ModeloTabla_MatSele.removeRow(i);
                //no se de donde sale este atributo O de donde lo obtienen en el frm de estudiante materia.
            }
        }

        ModeloTabla_MatSele.addRow(Filas);
        tb_Materias_Asignadas.setModel(ModeloTabla_MatSele);
    }//GEN-LAST:event_tb_Materias_DocenteMouseClicked

    private void lblEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEliminarMouseClicked

        if (tb_Materias_Asignadas.getRowCount() == 0) {
            JOptionPane.showMessageDialog(null, "¡Aún no ha seleccionado ninguna materia!");
        } else if (tb_Materias_Asignadas.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "¡Aún no ha seleccionado ninguna materia!");
        } else {

            ModeloTabla_MatSele.removeRow(tb_Materias_Asignadas.getSelectedRow());
        }
    }//GEN-LAST:event_lblEliminarMouseClicked

    private void btnInscribir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInscribir1ActionPerformed

        Date date = new Date();
        if (tb_Materias_Asignadas.getRowCount() == 0) {
            JOptionPane.showMessageDialog(null, "¡Aún no ha seleccionado ninguna materia!");
        } else {
            CLSMateriaDocente materiadoc = new CLSMateriaDocente();

            if (materiadoc.Verificar_Materias(FrmLogin.envioIdDocente) == true) {
                JOptionPane.showMessageDialog(null, "¡Solo se permite una vez la inscripción de materias\n"
                        + "ponte en contacto con el encargado para poder eliminar o inscribir otra vez!");
                limpiarTabla(tb_Materias_Asignadas);
            } else {
                String botones[] = {"Aceptar", "Cancelar"};
                int opcion = JOptionPane.showOptionDialog(this, "¿Está seguro que quieres matricular " + tb_Materias_Asignadas.getRowCount() + " materias?", "Confirmar", 0, 0, null, botones, this);

                if (opcion == JOptionPane.YES_OPTION) {
                    for (int i = 0; i < tb_Materias_Asignadas.getRowCount(); i++) {

                        Materias_Docentes materiaDoc = new Materias_Docentes();

                        String idMateria = String.valueOf(tb_Materias_Asignadas.getValueAt(i, 0));
                        int idMateriaDoc = Integer.parseInt(idMateria);

                        materiaDoc.setIdMateria(idMateriaDoc);
                        materiaDoc.setIdDocente(FrmLogin.envioIdDocente);
                        materiaDoc.setUltima_Modificacion(date);
                        materiaDoc.setEstado(1);
                        materiadoc.AgregarMateriaDocente(materiaDoc);
                    }
                    JOptionPane.showMessageDialog(null, "¡" + tb_Materias_Asignadas.getRowCount() + " Materias registrada con éxito!");
                    limpiarTabla(tb_Materias_Asignadas);
                } else if (opcion == JOptionPane.NO_OPTION) {
                    System.out.println("¡Cancelado!");
                }
            }
        }
    }//GEN-LAST:event_btnInscribir1ActionPerformed

    public void Mostrar_Tabla_Materias() {

        String TITULOS2[] = {"CODIGO", "NOMBRE MATERIA"};
        DefaultTableModel ModeloTabla = new DefaultTableModel(null, TITULOS2);
        CLSMateria clsMateria = new CLSMateria();
        ArrayList<Materia> vistaMaterias = clsMateria.MostrarMateria();
        String Filas[] = new String[5];

        for (var iterar : vistaMaterias) {

            Filas[0] = String.valueOf(iterar.getIdMateria());
            Filas[1] = String.valueOf(iterar.getNombre_Materia());

            ModeloTabla.addRow(Filas);
        }

        tb_Materias_Docente.setModel(ModeloTabla);

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.unab.edu.Otros.Boton btnInscribir;
    private com.unab.edu.Otros.Boton btnInscribir1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblActulizar;
    private javax.swing.JLabel lblEliminar;
    private javax.swing.JTable tb_Materias_Asignadas;
    private javax.swing.JTable tb_Materias_Docente;
    // End of variables declaration//GEN-END:variables
}
