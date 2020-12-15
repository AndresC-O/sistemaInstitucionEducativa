/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unab.edu.Vistas.Alumno;

import com.unab.edu.DAO.CLSActividades;
import com.unab.edu.DAO.CLSActividades_Alumno;
import com.unab.edu.DAO.CLSNotas;
import com.unab.edu.Entidades.Actividades;
import com.unab.edu.Entidades.Actividades_Estudiantes;
import com.unab.edu.Entidades.Notas;
import com.unab.edu.Vistas.FrmLogin;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author AndresC
 */
public class PnTareasAlumno extends javax.swing.JPanel {

    /**
     * Creates new form PnTareasAlumno
     */
    public PnTareasAlumno() {
        initComponents();
        txtActividad.setEditable(false);
        MostrarMaterias();
        limpiarTabla(tb_Tareas);
        lbl_idActividad.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cb_Materias = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        txtActividad = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        lbl_Actualizar = new javax.swing.JLabel();
        btnEntregar = new com.unab.edu.Otros.Boton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tb_Tareas = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        btnSeleccionar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        lblEstado = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lbl_idActividad = new javax.swing.JLabel();

        setBackground(new java.awt.Color(68, 130, 195));
        setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(68, 130, 195));
        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("¡Bienvenido a tu sección de Tareas!");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Seleccione una materia para visualizar las tareas:");

        cb_Materias.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        cb_Materias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Tarea seleccionada:");
        jLabel3.setToolTipText("");

        txtActividad.setBackground(new java.awt.Color(68, 130, 195));
        txtActividad.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtActividad.setForeground(new java.awt.Color(255, 255, 255));
        txtActividad.setBorder(null);

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        lbl_Actualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/browser.png"))); // NOI18N
        lbl_Actualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_ActualizarMouseClicked(evt);
            }
        });

        btnEntregar.setText("  Marcar como Entregada");
        btnEntregar.setBorderPainted(false);
        btnEntregar.setFocusPainted(false);
        btnEntregar.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        btnEntregar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnEntregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntregarActionPerformed(evt);
            }
        });

        tb_Tareas.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        tb_Tareas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tb_Tareas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_TareasMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tb_Tareas);

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Seleccionar un archivo:");
        jLabel5.setToolTipText("");

        btnSeleccionar.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnSeleccionar.setText("Selecionar pdf...");
        btnSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Estado:");
        jLabel6.setToolTipText("");

        lblEstado.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lblEstado.setForeground(new java.awt.Color(255, 255, 255));
        lblEstado.setText("********");
        lblEstado.setToolTipText("");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/leer.png"))); // NOI18N
        jLabel7.setText("jLabel7");

        lbl_idActividad.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cb_Materias, 0, 327, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbl_Actualizar)
                        .addGap(21, 21, 21))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtActividad, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lbl_idActividad)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnEntregar, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(btnSeleccionar, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblEstado)
                        .addGap(190, 190, 190))))
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_Actualizar)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(cb_Materias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6)
                    .addComponent(lblEstado))
                .addGap(8, 8, 8)
                .addComponent(txtActividad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSeleccionar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEntregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_idActividad))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarActionPerformed

        SeleccionarPDF();
    }//GEN-LAST:event_btnSeleccionarActionPerformed

    public void Guardar_Actividad(int idEstudiante, int idActividad, int combo, File ruta){
        
        byte[] pdf = null;
        Date date = new Date();
        CLSActividades_Alumno clsAct_Almuno = new CLSActividades_Alumno();
        Actividades_Estudiantes act_est = new Actividades_Estudiantes();
        
        act_est.setIdEstudiante(idEstudiante);
        act_est.setIdActividad(idActividad);
        act_est.setIdMateria(combo);
        act_est.setNota_Obtenida(0.00);
        
        try {

            pdf = new byte[(int) ruta.length()];
            InputStream input = new FileInputStream(ruta);
            input.read(pdf);
            
            act_est.setArchivo(pdf);
        } catch (Exception e) {

            act_est.setArchivo(null);
        }
        
        act_est.setEstado_Actividad("Entregada");
        act_est.setUltima_Modificacion(date);
        act_est.setEstado(1);
        
        System.out.println("Hay datos: " + clsAct_Almuno.Verificar_Entrega(act_est));
        if (clsAct_Almuno.Verificar_Entrega(act_est) == true) {
            JOptionPane.showMessageDialog(null, "¡Esta actividad ya ha sido enviada!");
        } else {

            String botones[] = {"Entregar", "Cancelar"};
            int opcion = JOptionPane.showOptionDialog(this, "¿Estás seguro que quieres enviar " + txtActividad.getText() + "? \nLa acción no se podrá deshacer", "Confirmar", 0, 0, null, botones, this);

            if (opcion == JOptionPane.YES_OPTION) {
                clsAct_Almuno.Insertar_Actividad(act_est);
                Limpiar_Controles();
            } else if (opcion == JOptionPane.NO_OPTION) {
                System.out.println("¡Cancelado!");
            }

        }
    }
    private void btnEntregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntregarActionPerformed
  
        int combo = Integer.parseInt(valueMember[cb_Materias.getSelectedIndex()]);
        int idActividad = Integer.parseInt(lbl_idActividad.getText());
        
        File ruta = new File(ruta_archivo);
        Guardar_Actividad(FrmLogin.envioIdEstudiante, idActividad, combo, ruta);
    }//GEN-LAST:event_btnEntregarActionPerformed

    private void lbl_ActualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_ActualizarMouseClicked

        if (cb_Materias.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "¡Aún no se ha seleccionado una materia!");
        } else {
            Mostrar_Tareas();
        }
    }//GEN-LAST:event_lbl_ActualizarMouseClicked

    private void tb_TareasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_TareasMouseClicked

        int combo = Integer.parseInt(valueMember[cb_Materias.getSelectedIndex()]);
        //Acá estamos obteniendo la fila que el usuario seleccionó.
        int filas = tb_Tareas.getSelectedRow();

        String IdActividad = String.valueOf(tb_Tareas.getValueAt(filas, 0));
        String NombreActividad = String.valueOf(tb_Tareas.getValueAt(filas, 1));
        String Estado = String.valueOf(tb_Tareas.getValueAt(filas, 4));

        lbl_idActividad.setText(IdActividad);
        txtActividad.setText(NombreActividad);
        lblEstado.setText(Estado);
    }//GEN-LAST:event_tb_TareasMouseClicked

    String ruta_archivo = "";

    public void SeleccionarPDF() {

        JFileChooser jchooser = new JFileChooser();
        jchooser.setDialogTitle("Buscar PDF");
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("pdf", "pdf");
        jchooser.setFileFilter(filtro);
        int c = jchooser.showOpenDialog(this);

        if (c == 0) {
            this.btnSeleccionar.setText("" + jchooser.getSelectedFile().getName());
            ruta_archivo = jchooser.getSelectedFile().getAbsolutePath();
        }
    }

    public void Limpiar_Controles() {

        cb_Materias.setSelectedIndex(0);
        txtActividad.setText("");
        lblEstado.setText("");
        lbl_idActividad.setText("0");
        limpiarTabla(tb_Tareas);
        ruta_archivo = "";
        btnSeleccionar.setText("Seleccione un archivo pdf...");
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

    String valueMember[];
    int contador = 1;

    public void MostrarMaterias() {

        DefaultComboBoxModel cbdefault = new DefaultComboBoxModel();
        CLSNotas clsNotas = new CLSNotas();
        Notas nota = new Notas();
        nota.setIdEstudiante(FrmLogin.envioIdEstudiante);
        ArrayList<Notas> vistaNotas = clsNotas.MostrarNotaByStudente(nota);
        valueMember = new String[vistaNotas.size() + 1];

        String Filas[] = new String[6];
        cbdefault.addElement("");
        for (var iterar : vistaNotas) {

            Filas[0] = String.valueOf(iterar.getIdMateria());
            Filas[1] = iterar.getNombre_Materia();
            valueMember[contador] = Filas[0];
            cbdefault.addElement(Filas[1]);
            contador++;
        }

        cb_Materias.setModel(cbdefault);
    }

    SimpleDateFormat formato = new SimpleDateFormat("d MMM y");

    public void Mostrar_Tareas() {

        int combo = Integer.parseInt(valueMember[cb_Materias.getSelectedIndex()]);
        String TITULOS[] = {"CODIGO", "ACTIVIDAD", "PORCENTAJE", "FECHA LIMITE", "ESTADO"};
        DefaultTableModel ModeloTabla = new DefaultTableModel(null, TITULOS);
        CLSActividades clsActividades = new CLSActividades();
        Actividades act = new Actividades();
        act.setIdMateria(combo);
        ArrayList<Actividades> vistaTareas = clsActividades.Mostrar_Tareas_By_Materia(act);
        String Filas[] = new String[6];

        for (var iterar : vistaTareas) {

            Filas[0] = String.valueOf(iterar.getIdActividad());
            Filas[1] = String.valueOf(iterar.getNombre_Actividad());
            Filas[2] = String.valueOf(iterar.getPorcentaje());

            if (iterar.getFecha_Entrega() == null) {
                Filas[3] = "--/--/--";
            } else {
                Filas[3] = String.valueOf(formato.format(iterar.getFecha_Entrega()));
            }

            Filas[4] = String.valueOf(iterar.getEstado_Actividad());

            ModeloTabla.addRow(Filas);
        }

        tb_Tareas.setModel(ModeloTabla);

        tb_Tareas.getTableHeader().getColumnModel().getColumn(0).setPreferredWidth(60);
        tb_Tareas.getTableHeader().getColumnModel().getColumn(0).setMaxWidth(60);
        tb_Tareas.getTableHeader().getColumnModel().getColumn(0).setMinWidth(60);

        tb_Tareas.getTableHeader().getColumnModel().getColumn(2).setPreferredWidth(85);
        tb_Tareas.getTableHeader().getColumnModel().getColumn(2).setMaxWidth(85);
        tb_Tareas.getTableHeader().getColumnModel().getColumn(2).setMinWidth(85);

        tb_Tareas.getTableHeader().getColumnModel().getColumn(4).setPreferredWidth(85);
        tb_Tareas.getTableHeader().getColumnModel().getColumn(4).setMaxWidth(85);
        tb_Tareas.getTableHeader().getColumnModel().getColumn(4).setMinWidth(85);

        tb_Tareas.getTableHeader().getColumnModel().getColumn(3).setPreferredWidth(100);
        tb_Tareas.getTableHeader().getColumnModel().getColumn(3).setMaxWidth(100);
        tb_Tareas.getTableHeader().getColumnModel().getColumn(3).setMinWidth(100);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.unab.edu.Otros.Boton btnEntregar;
    private javax.swing.JButton btnSeleccionar;
    private javax.swing.JComboBox<String> cb_Materias;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lbl_Actualizar;
    private javax.swing.JLabel lbl_idActividad;
    private javax.swing.JTable tb_Tareas;
    private javax.swing.JTextField txtActividad;
    // End of variables declaration//GEN-END:variables
}
