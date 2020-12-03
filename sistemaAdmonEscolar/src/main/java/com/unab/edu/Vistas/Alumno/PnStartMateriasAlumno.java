/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unab.edu.Vistas.Alumno;

import com.unab.edu.DAO.CLSMateria;
import com.unab.edu.DAO.CLSMateriaAlumno;
import com.unab.edu.DAO.CLSNotas;
import com.unab.edu.Entidades.Materia;
import com.unab.edu.Entidades.Materias_Alumnos;
import com.unab.edu.Entidades.Notas;
import com.unab.edu.Vistas.FrmLogin;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author CruzCalles
 */
public class PnStartMateriasAlumno extends javax.swing.JPanel {

    /**
     * Creates new form PnStartMateriasAlumno
     */
    public PnStartMateriasAlumno() {
        initComponents();
        
        tb_Materias.getTableHeader().setOpaque(false);
        tb_Materias.setBackground(new Color(0,201,215));
        tb_Materias.setForeground(new Color(255,255,255));
        tb_Materias.setRowHeight(25);
        
        tb_MateriasAInscribir.getTableHeader().setFont(new Font("Century Gothic", Font.PLAIN, 11));
        tb_MateriasAInscribir.getTableHeader().setOpaque(false);
        tb_MateriasAInscribir.setBackground(new Color(0,201,215));
        tb_MateriasAInscribir.setForeground(new Color(255,255,255));
        tb_MateriasAInscribir.setRowHeight(25);
        

        limpiarTabla(tb_MateriasAInscribir);
        Mostrar_Tabla_Materias();
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnInscribir = new com.unab.edu.Otros.Boton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tb_Materias = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        tb_MateriasAInscribir = new javax.swing.JTable();
        lblEliminar = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(68, 130, 195));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(850, 590));

        jLabel1.setBackground(new java.awt.Color(68, 130, 195));
        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("¡Bienvenido a tu sección de Materias!");

        jLabel5.setBackground(new java.awt.Color(68, 130, 195));
        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Materias a Inscribir:");

        btnInscribir.setText("      Inscribir");
        btnInscribir.setBorderPainted(false);
        btnInscribir.setFocusPainted(false);
        btnInscribir.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        btnInscribir.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnInscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInscribirActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/estudiante.png"))); // NOI18N

        tb_Materias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "CODIGO", "NOMBRE MATERIA"
            }
        ));
        tb_Materias.setFocusable(false);
        tb_Materias.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tb_Materias.setRowHeight(25);
        tb_Materias.setSelectionBackground(new java.awt.Color(48, 218, 174));
        tb_Materias.setShowVerticalLines(false);
        tb_Materias.getTableHeader().setReorderingAllowed(false);
        tb_Materias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_MateriasMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tb_Materias);

        tb_MateriasAInscribir.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "CODIGO", "MATERIA SELECCIONADA"
            }
        ));
        tb_MateriasAInscribir.setFocusable(false);
        tb_MateriasAInscribir.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tb_MateriasAInscribir.setRowHeight(25);
        tb_MateriasAInscribir.setSelectionBackground(new java.awt.Color(48, 218, 174));
        tb_MateriasAInscribir.setShowVerticalLines(false);
        tb_MateriasAInscribir.getTableHeader().setReorderingAllowed(false);
        jScrollPane4.setViewportView(tb_MateriasAInscribir);

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

        jLabel6.setBackground(new java.awt.Color(68, 130, 195));
        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Materias disponibles para inscribir:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnInscribir, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 786, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblEliminar))
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 786, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lblEliminar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(btnInscribir, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 850, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 590, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lblEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEliminarMouseClicked

        if (tb_MateriasAInscribir.getRowCount() == 0) {
            JOptionPane.showMessageDialog(null, "¡Aún no ha seleccionado ninguna materia!");
        } else if (tb_MateriasAInscribir.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "¡Aún no ha seleccionado ninguna materia!");
        } else {
            ModeloTabla_MatSele.removeRow(tb_MateriasAInscribir.getSelectedRow());
        }
    }//GEN-LAST:event_lblEliminarMouseClicked

    private void tb_MateriasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_MateriasMouseClicked

        //Acá estamos obteniendo la fila que el usuario seleccionó.
        int filas = tb_Materias.getSelectedRow();
        //Asignamos todos los campos de la tabla.
        String ID = String.valueOf(tb_Materias.getValueAt(filas, 0));
        String Nombre = String.valueOf(tb_Materias.getValueAt(filas, 1));
        //Pasamos los datos para la tabla a inscribir.
        String Filas[] = new String[3];
        Filas[0] = ID;
        Filas[1] = Nombre;

        for (int i = 0; i < tb_MateriasAInscribir.getRowCount(); i++) {

            if (tb_MateriasAInscribir.getValueAt(i, 0) == ID) {
                JOptionPane.showMessageDialog(null, "¡Ya ha seleccionado esta materia!");
                ModeloTabla_MatSele.removeRow(i);
            }
        }

        ModeloTabla_MatSele.addRow(Filas);
        tb_MateriasAInscribir.setModel(ModeloTabla_MatSele);
    }//GEN-LAST:event_tb_MateriasMouseClicked

    private void btnInscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInscribirActionPerformed

        Date date = new Date();
        if (tb_MateriasAInscribir.getRowCount() == 0) {
            JOptionPane.showMessageDialog(null, "¡Aún no ha seleccionado ninguna materia!");
        } else {

            String botones[] = {"Aceptar", "Cancelar"};
            int opcion = JOptionPane.showOptionDialog(this, "¿Estás seguro que quieres matricular " + tb_MateriasAInscribir.getRowCount() + " materias? \n\nYo que tu, lo pensara más.", "Confirmar", 0, 0, null, botones, this);

            if (opcion == JOptionPane.YES_OPTION) {
                for (int i = 0; i < tb_MateriasAInscribir.getRowCount(); i++) {
                    CLSNotas clsNotas = new CLSNotas();
                    Notas notas = new Notas();
                    String idMateria = String.valueOf(tb_MateriasAInscribir.getValueAt(i, 0));
                    int idMateriaC = Integer.parseInt(idMateria);

                    notas.setIdEstudiante(FrmLogin.envioIdEstudiante);
                    notas.setIdMateria(idMateriaC);
                    notas.setPeriodo1(0);
                    notas.setPeriodo2(0);
                    notas.setPeriodo3(0);
                    notas.setNotaFinal(0);
                    notas.setRecuperacion(0);
                    notas.setUltima_Modificacion(date);
                    notas.setEstado(1);

                    clsNotas.AgregarNotas(notas);
                }

                JOptionPane.showMessageDialog(null, "¡" + tb_MateriasAInscribir.getRowCount() + " Materias inscritas con éxito!");
                limpiarTabla(tb_MateriasAInscribir);
            } else if (opcion == JOptionPane.NO_OPTION) {
                System.out.println("¡Cancelado!");
            }

        }
    }//GEN-LAST:event_btnInscribirActionPerformed

    String TITULOS1[] = {"CODIGO", "MATERIA SELECCIONADA"};
    DefaultTableModel ModeloTabla_MatSele = new DefaultTableModel(null, TITULOS1);

    public void Mostrar_Tabla_Materias() {

        String TITULOS2[] = {"CODIGO", "NOMBRE MATERIA"};
        DefaultTableModel ModeloTabla = new DefaultTableModel(null, TITULOS2);
        CLSMateria clsMateria = new CLSMateria();
        Materia materia = new Materia();
        materia.setIdGradoAcademico(FrmLogin.envioID);
        ArrayList<Materia> vistaMaterias = clsMateria.MostrarMateria(materia);
        String Filas[] = new String[5];

        for (var iterar : vistaMaterias) {

            Filas[0] = String.valueOf(iterar.getIdMateria());
            Filas[1] = String.valueOf(iterar.getNombre_Materia());

            ModeloTabla.addRow(Filas);
        }

        tb_Materias.setModel(ModeloTabla);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.unab.edu.Otros.Boton btnInscribir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lblEliminar;
    private javax.swing.JTable tb_Materias;
    private javax.swing.JTable tb_MateriasAInscribir;
    // End of variables declaration//GEN-END:variables
}
