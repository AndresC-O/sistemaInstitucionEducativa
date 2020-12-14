/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unab.edu.Vistas.Docente;

import com.unab.edu.DAO.CLSActividades;
import com.unab.edu.DAO.CLSMateriaDocente;
import com.unab.edu.Entidades.Actividades;
import com.unab.edu.Entidades.Materias_Docentes;
import com.unab.edu.Vistas.FrmLogin;
import java.awt.Color;
import java.awt.Font;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author AndresC
 */
public class PnActividades_Docente extends javax.swing.JPanel {

    /**
     * Creates new form PnActividades_Docente
     */
    public PnActividades_Docente() {
        initComponents();
        MostrarMaterias();

        lbl_id.setVisible(false);
        MostrarActividades();
        btnPublicarTarea.setEnabled(false);
        btnEditarTarea.setEnabled(false);
        btnEliminarTarea.setEnabled(false);
      
        tb_Actividades.getTableHeader().setFont(new Font("Century Gothic", Font.PLAIN, 11));
        tb_Actividades.getTableHeader().setOpaque(false);
        tb_Actividades.setBackground(new Color(45, 86, 130));
        tb_Actividades.setForeground(new Color(255, 255, 255));
        tb_Actividades.setRowHeight(25);
    }

    void LimpiarControles() {
        cbMateria.setSelectedItem("Seleccione una opcion");
        txtActividad.setText("");
        txtPorcentaje.setText("");
        txtFechaLimite.setDate(null);
        lbl_id.setText("0");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        cbMateria = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        txtActividad = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        txtPorcentaje = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_Actividades = new javax.swing.JTable();
        btnPublicarTarea = new com.unab.edu.Otros.Boton();
        btnNuevaTarea = new com.unab.edu.Otros.Boton();
        btnEditarTarea = new com.unab.edu.Otros.Boton();
        btnEliminarTarea = new com.unab.edu.Otros.Boton();
        lblActualizar = new javax.swing.JLabel();
        txtFechaLimite = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        lbl_id = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(68, 130, 195));

        jLabel2.setBackground(new java.awt.Color(68, 130, 195));
        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Materia:");

        cbMateria.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        jLabel3.setBackground(new java.awt.Color(68, 130, 195));
        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre de la Actividad:");

        txtActividad.setBackground(new java.awt.Color(68, 130, 195));
        txtActividad.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtActividad.setForeground(new java.awt.Color(255, 255, 255));
        txtActividad.setBorder(null);

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel4.setBackground(new java.awt.Color(68, 130, 195));
        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Porcentaje:");

        txtPorcentaje.setBackground(new java.awt.Color(68, 130, 195));
        txtPorcentaje.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtPorcentaje.setForeground(new java.awt.Color(255, 255, 255));
        txtPorcentaje.setBorder(null);

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel5.setBackground(new java.awt.Color(68, 130, 195));
        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("%");

        tb_Actividades.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        tb_Actividades.setModel(new javax.swing.table.DefaultTableModel(
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
        tb_Actividades.setFocusable(false);
        tb_Actividades.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tb_Actividades.setRowHeight(25);
        tb_Actividades.setSelectionBackground(new java.awt.Color(93, 173, 226));
        tb_Actividades.setShowVerticalLines(false);
        tb_Actividades.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_ActividadesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_Actividades);

        btnPublicarTarea.setText("     Publicar Tarea");
        btnPublicarTarea.setBorderPainted(false);
        btnPublicarTarea.setFocusPainted(false);
        btnPublicarTarea.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnPublicarTarea.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnPublicarTarea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPublicarTareaActionPerformed(evt);
            }
        });

        btnNuevaTarea.setText("      Nueva Tarea");
        btnNuevaTarea.setBorderPainted(false);
        btnNuevaTarea.setFocusPainted(false);
        btnNuevaTarea.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnNuevaTarea.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnNuevaTarea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaTareaActionPerformed(evt);
            }
        });

        btnEditarTarea.setText("      Editar Tarea");
        btnEditarTarea.setBorderPainted(false);
        btnEditarTarea.setFocusPainted(false);
        btnEditarTarea.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnEditarTarea.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnEditarTarea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarTareaActionPerformed(evt);
            }
        });

        btnEliminarTarea.setText("     Eliminar  Tarea");
        btnEliminarTarea.setBorderPainted(false);
        btnEliminarTarea.setFocusPainted(false);
        btnEliminarTarea.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnEliminarTarea.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnEliminarTarea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarTareaActionPerformed(evt);
            }
        });

        lblActualizar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lblActualizar.setForeground(new java.awt.Color(255, 255, 255));
        lblActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/browser.png"))); // NOI18N
        lblActualizar.setText("Actualizar Tabla");
        lblActualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblActualizarMouseClicked(evt);
            }
        });

        txtFechaLimite.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        jLabel6.setBackground(new java.awt.Color(68, 130, 195));
        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Fecha de Entrega:");

        lbl_id.setBackground(new java.awt.Color(68, 130, 195));
        lbl_id.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lbl_id.setForeground(new java.awt.Color(255, 255, 255));
        lbl_id.setText("Id");

        jLabel7.setBackground(new java.awt.Color(68, 130, 195));
        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("¡Bienvenido a tu sección de Actividades!");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/leyendo.png"))); // NOI18N
        jLabel8.setText("jLabel8");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(btnNuevaTarea, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnPublicarTarea, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditarTarea, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminarTarea, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblActualizar)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cbMateria, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFechaLimite, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtActividad)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtPorcentaje, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel5)))
                        .addGap(42, 42, 42)
                        .addComponent(lbl_id)
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(lbl_id))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtActividad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtPorcentaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFechaLimite, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPublicarTarea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNuevaTarea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditarTarea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminarTarea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblActualizar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevaTareaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaTareaActionPerformed

        btnPublicarTarea.setEnabled(true);
        btnEditarTarea.setEnabled(false);
        btnEliminarTarea.setEnabled(false);
        LimpiarControles();
    }//GEN-LAST:event_btnNuevaTareaActionPerformed

    private void btnPublicarTareaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPublicarTareaActionPerformed

        int combo = Integer.parseInt(valueMember[cbMateria.getSelectedIndex()]);

        if (txtActividad.getText().isEmpty() || txtPorcentaje.getText().isEmpty() || txtFechaLimite.getDate() == null || cbMateria.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "¡Complete todos los datos para poder continuar!");
        } else {
            Date date = new Date();
            Double porcents = Double.parseDouble(txtPorcentaje.getText());
            CLSActividades clsActividad = new CLSActividades();
            Actividades act = new Actividades();

            act.setIdDocente(FrmLogin.envioIdDocente);
            act.setIdMateria(combo);
            act.setNombre_Actividad(txtActividad.getText());
            act.setPorcentaje(porcents / 100);
            act.setFecha_Entrega(txtFechaLimite.getDate());
            act.setEstado_Actividad("Recibida");
            act.setUltima_Modificacion(date);
            act.setEstado(1);
            clsActividad.AgregarActividad(act);
            LimpiarControles();
            btnPublicarTarea.setEnabled(false);
            btnEditarTarea.setEnabled(false);
            btnEliminarTarea.setEnabled(false);
            MostrarActividades();
        }


    }//GEN-LAST:event_btnPublicarTareaActionPerformed

    private void lblActualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblActualizarMouseClicked
        MostrarActividades();
    }//GEN-LAST:event_lblActualizarMouseClicked

    SimpleDateFormat formato = new SimpleDateFormat("d MMM y");
    private void tb_ActividadesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_ActividadesMouseClicked

        //Acá estamos obteniendo la fila que el usuario seleccionó.
        int filas = tb_Actividades.getSelectedRow();
        //Asignamos todos los campos de la tabla.
        String ID = String.valueOf(tb_Actividades.getValueAt(filas, 0));
        String idMateria = String.valueOf(tb_Actividades.getValueAt(filas, 1));
        //String Materia = String.valueOf(tb_Actividades.getValueAt(filas, 2));
        String Actividad = String.valueOf(tb_Actividades.getValueAt(filas, 3));
        String Porcentaje = String.valueOf(tb_Actividades.getValueAt(filas, 4));
        String FechaLimite = String.valueOf(tb_Actividades.getValueAt(filas, 5));
        //Pasamos los datos para la tabla a inscribir.
        lbl_id.setText(ID);
        txtActividad.setText(Actividad);
        txtPorcentaje.setText(String.valueOf(Math.round(Double.parseDouble(Porcentaje) * 100)));

        Date castfecha = new Date();
        try {
            castfecha = formato.parse(FechaLimite);
            txtFechaLimite.setDate(castfecha);
        } catch (ParseException ex) {
            txtFechaLimite.setDate(null);
        }

        int seleccionadorDeVista = 0;
        for (var iterar : valueMember) {
            if (idMateria.equals(iterar)) {
                cbMateria.setSelectedIndex(seleccionadorDeVista);
            }
            seleccionadorDeVista += 1;
        }

        btnPublicarTarea.setEnabled(false);
        btnEditarTarea.setEnabled(true);
        btnEliminarTarea.setEnabled(true);
    }//GEN-LAST:event_tb_ActividadesMouseClicked

    private void btnEditarTareaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarTareaActionPerformed

        int combo = Integer.parseInt(valueMember[cbMateria.getSelectedIndex()]);
        int idAct = Integer.parseInt(lbl_id.getText());
        System.out.println(idAct);
        if (txtActividad.getText().isEmpty() || txtPorcentaje.getText().isEmpty() || txtFechaLimite.getDate() == null) {
            JOptionPane.showMessageDialog(null, "¡Complete todos los datos para poder continuar!");
        } else {

            Date date = new Date();
            Double porcents = Double.parseDouble(txtPorcentaje.getText());
            CLSActividades clsActividad = new CLSActividades();
            Actividades act = new Actividades();

            act.setIdActividad(idAct);
            act.setIdDocente(FrmLogin.envioIdDocente);
            act.setIdMateria(combo);
            act.setNombre_Actividad(txtActividad.getText());
            act.setPorcentaje(porcents / 100);
            act.setFecha_Entrega(txtFechaLimite.getDate());
            act.setEstado_Actividad("Recibida");
            act.setUltima_Modificacion(date);
            act.setEstado(1);
            clsActividad.ActualizarActividad(act);
            LimpiarControles();
            btnPublicarTarea.setEnabled(false);
            btnEditarTarea.setEnabled(false);
            btnEliminarTarea.setEnabled(false);
            MostrarActividades();
        }
    }//GEN-LAST:event_btnEditarTareaActionPerformed

    private void btnEliminarTareaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarTareaActionPerformed
        int idAct = Integer.parseInt(lbl_id.getText());
        CLSActividades clsActividad = new CLSActividades();
        Actividades act = new Actividades();

        String botones[] = {"Eliminar", "Cancelar"};
        int opcion = JOptionPane.showOptionDialog(this, "¿Estás seguro que quieres eliminar esta actividad?", "Confirmar", 0, 0, null, botones, this);

        if (opcion == JOptionPane.YES_OPTION) {
            act.setIdActividad(idAct);
            clsActividad.EliminarActividad(act);
            LimpiarControles();
            btnPublicarTarea.setEnabled(false);
            btnEditarTarea.setEnabled(false);
            btnEliminarTarea.setEnabled(false);
            MostrarActividades();
        } else if (opcion == JOptionPane.NO_OPTION) {
            System.out.println("¡Cancelado!");
        }


    }//GEN-LAST:event_btnEliminarTareaActionPerformed

    String valueMember[];
    int contador = 1;

    public void MostrarMaterias() {

        DefaultComboBoxModel cbdefault = new DefaultComboBoxModel();
        CLSMateriaDocente clsMateria = new CLSMateriaDocente();
        Materias_Docentes m = new Materias_Docentes();
        m.setIdDocente(FrmLogin.envioIdDocente);
        ArrayList<Materias_Docentes> materia = clsMateria.ShowMateriasByDocente(m);
        valueMember = new String[materia.size() + 1];

        String Filas[] = new String[6];
        cbdefault.addElement("Seleccione una opcion");
        for (var iterar : materia) {

            Filas[0] = String.valueOf(iterar.getIdMateria());
            Filas[1] = iterar.getNombre_Materia();
            valueMember[contador] = Filas[0];
            cbdefault.addElement(Filas[1]);
            contador++;
        }

        cbMateria.setModel(cbdefault);
    }

    
    public void MostrarActividades() {

        String TITULOS[] = {"CODIGO", "", "MATERIA", "ACTIVIDAD", "PORCENTAJE", "FECHA LIMITE"};
        DefaultTableModel ModeloTabla = new DefaultTableModel(null, TITULOS);

        CLSActividades clsActividades = new CLSActividades();
        ArrayList<Actividades> vistaActividades = clsActividades.MostrarActividades();
        String Filas[] = new String[6];

        for (var iterar : vistaActividades) {

            Filas[0] = String.valueOf(iterar.getIdActividad());
            Filas[1] = String.valueOf(iterar.getIdMateria());
            Filas[2] = String.valueOf(iterar.getNombre_Materia());
            Filas[3] = String.valueOf(iterar.getNombre_Actividad());
            Filas[4] = String.valueOf(iterar.getPorcentaje());

            if (iterar.getFecha_Entrega() == null) {
                Filas[5] = "--/--/--";
            } else {
                Filas[5] = String.valueOf(formato.format(iterar.getFecha_Entrega()));
            }

            ModeloTabla.addRow(Filas);
        }

        tb_Actividades.setModel(ModeloTabla);
        //AJUSTANDO EL TAMAÑO DE LA COLUMNA ID
        tb_Actividades.getTableHeader().getColumnModel().getColumn(0).setPreferredWidth(60);
        tb_Actividades.getTableHeader().getColumnModel().getColumn(0).setMaxWidth(60);
        tb_Actividades.getTableHeader().getColumnModel().getColumn(0).setMinWidth(60);
        //AJUSTANDO EL TAMAÑO DE LA COLUMNA ID_MATERIA
        tb_Actividades.getTableHeader().getColumnModel().getColumn(1).setPreferredWidth(0);
        tb_Actividades.getTableHeader().getColumnModel().getColumn(1).setMaxWidth(0);
        tb_Actividades.getTableHeader().getColumnModel().getColumn(1).setMinWidth(0);
        //AJUSTANDO EL TAMAÑO DE LA COLUMNA PORCENTAJE
        tb_Actividades.getTableHeader().getColumnModel().getColumn(4).setPreferredWidth(80);
        tb_Actividades.getTableHeader().getColumnModel().getColumn(4).setMaxWidth(80);
        tb_Actividades.getTableHeader().getColumnModel().getColumn(4).setMinWidth(80);
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.unab.edu.Otros.Boton btnEditarTarea;
    private com.unab.edu.Otros.Boton btnEliminarTarea;
    private com.unab.edu.Otros.Boton btnNuevaTarea;
    private com.unab.edu.Otros.Boton btnPublicarTarea;
    private javax.swing.JComboBox<String> cbMateria;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblActualizar;
    private javax.swing.JLabel lbl_id;
    private javax.swing.JTable tb_Actividades;
    private javax.swing.JTextField txtActividad;
    private com.toedter.calendar.JDateChooser txtFechaLimite;
    private javax.swing.JTextField txtPorcentaje;
    // End of variables declaration//GEN-END:variables
}
