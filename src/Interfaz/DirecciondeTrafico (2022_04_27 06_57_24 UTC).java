/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import controlador.ControladorPersona;
import controlador.ControladorVehiculo;
import controlador.controladorAlegaciones;
import controlador.controladorMultas;
import javax.swing.table.DefaultTableModel;

/**
 * import java.util.logging.Level; import java.sql.PreparedStatement; import
 * java.sql.ResultSet; import java.sql.SQLException; import
 * java.util.logging.Logger;
 */
/**
 *
 * @author Emigdio J
 */
public class DirecciondeTrafico extends javax.swing.JFrame {

    //conectar conect = new conectar();
    //String[] multas = new String[10];
    /**
     * Creates new form DirecciónProvicialdetrafico
     */
    public static DefaultTableModel modelo2;

    public DirecciondeTrafico() {
        initComponents();
        modelo2 = new DefaultTableModel();

        tabla2.setModel(modelo2);

        modelo2.addColumn("ID multa");
        modelo2.addColumn("Nombres");
        modelo2.addColumn("Apellidos");
        modelo2.addColumn("CC");
        modelo2.addColumn("N° placa");
        modelo2.addColumn("Fecha");
        modelo2.addColumn("Hora");
        modelo2.addColumn("N° de celular");
        modelo2.addColumn("Correo");
        modelo2.addColumn("Descipcion");

        /**
         * this.conect.conectar();
         *
         * try { PreparedStatement consulta = (PreparedStatement)
         * this.conect.con.prepareStatement("SELECT codCurso,grado,grupo FROM
         * curso"); ResultSet result = consulta.executeQuery(); while
         * (result.next()) { multas[0]=result.getString(1);
         * multas[1]=result.getString(1); multas[2]=result.getString(1);
         * multas[3]=result.getString(1); multas[4]=result.getString(1);
         * multas[5]=result.getString(1); multas[6]=result.getString(1);
         * multas[7]=result.getString(1); multas[8]=result.getString(1);
         * multas[9]=result.getString(1);
         *
         * this.modelo.addRow(multas); }
         *
         * } catch (SQLException ex) {
         * Logger.getLogger(DirecciondeTrafico.class.getName()).log(Level.SEVERE,
         * null, ex); }
         */
    }

    DirecciondeTrafico(MenuPrincipal aThis, ControladorPersona persona, ControladorVehiculo vehiculo, controladorAlegaciones alegaciones, controladorMultas multas) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla2 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        nombre1 = new javax.swing.JLabel();
        apellido1 = new javax.swing.JLabel();
        correo1 = new javax.swing.JLabel();
        cc1 = new javax.swing.JLabel();
        fecha1 = new javax.swing.JLabel();
        hora1 = new javax.swing.JLabel();
        celular1 = new javax.swing.JLabel();
        descripcion1 = new javax.swing.JLabel();
        id1 = new javax.swing.JLabel();
        multa1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        Ayuda = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Arial", 1, 25)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Multas guardadas");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, 240, 40));

        jButton2.setText("Atras");
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, 90, 50));

        jButton1.setBackground(new java.awt.Color(51, 255, 255));
        jButton1.setText("Abrir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 460, 100, 50));

        tabla2.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        tabla2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Codigo", "Fecha", "ID", "Placa"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla2.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jScrollPane1.setViewportView(tabla2);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 611, 364));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/descarga.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 120, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pngwing.com.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 140, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/campana-fondo-amarillo-en-redes-sociales.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1130, 530));

        nombre1.setText("jLabel1");
        getContentPane().add(nombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 340, -1, -1));

        apellido1.setText("jLabel1");
        getContentPane().add(apellido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 390, -1, -1));

        correo1.setText("jLabel1");
        getContentPane().add(correo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 430, -1, 20));

        cc1.setText("jLabel1");
        getContentPane().add(cc1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 440, -1, -1));

        fecha1.setText("jLabel1");
        getContentPane().add(fecha1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 400, -1, -1));

        hora1.setText("jLabel1");
        getContentPane().add(hora1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 370, -1, -1));

        celular1.setText("jLabel1");
        getContentPane().add(celular1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 370, -1, -1));

        descripcion1.setText("jLabel1");
        getContentPane().add(descripcion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 410, -1, 20));

        id1.setText("jLabel5");
        getContentPane().add(id1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 360, -1, -1));

        multa1.setText("jLabel5");
        getContentPane().add(multa1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 380, -1, -1));

        jMenuBar1.setBorder(new javax.swing.border.MatteBorder(null));
        jMenuBar1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        jMenu3.setText("Archivo");

        jMenuItem2.setText("Agente de Dirección de Transito");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem2);

        jMenuItem3.setText("Dirección Provicial de trafico");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        jMenuItem4.setText("Conductor");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem4);

        jMenuItem5.setText("Menu Principal");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem5);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Edición");

        jMenuItem8.setText("Deshacer");
        jMenu4.add(jMenuItem8);

        jMenuItem9.setText("Cortar");
        jMenu4.add(jMenuItem9);

        jMenuItem10.setText("Pegar");
        jMenu4.add(jMenuItem10);

        jMenuBar1.add(jMenu4);

        Ayuda.setText("Ayuda");
        jMenuBar1.add(Ayuda);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        /**
         * Object[] object = new Object[10]; object[0] = id1.getText();
         * object[1] = nombre1.getText(); object[2] = apellido1.getText();
         * object[3] = cc1.getText(); object[4] = multa1.getText(); object[5] =
         * fecha1.getText(); object[6] = hora1.getText(); object[7] =
         * celular1.getText(); object[8] = correo1.getText(); object[9] =
         * descripcion1.getText();
         *
         * modelo2.addRow(object);
         *
         * /*
         * /**
         * try{ PreparedStatement consulta=(PreparedStatement)
         * this.conect.con.prepareStatement("INSERT INTO curso
         * (codCurso,grado,grupo) VALUES(?,?,?)");
         *
         * consulta.setInt(1,(this.id1.getText()));
         * consulta.setInt(2,(this.nombre1.getText()));
         * consulta.setInt(3,(this.apellido1.getText()));
         * consulta.setInt(4,(this.cc1.getText()));
         * consulta.setInt(5,(this.multa1.getText()));
         * consulta.setInt(6,(this.fecha1.getText()));
         * consulta.setInt(7,(this.hora1.getText()));
         * consulta.setInt(8,(this.celular1.getText()));
         * consulta.setInt(9,(this.correo1.getText()));
         * consulta.setInt(10,(this.descripcion1.getText()));
         * consulta.executeUpdate();
         *
         * //this.conect.setText("Datos Almacenados"); } catch (SQLException ex)
         * {
         * Logger.getLogger(DirecciondeTrafico.class.getName()).log(Level.SEVERE,
         * null, ex); }
         *
         *
         * this.id1.setText(""); this.nombre1.setText("");
         * this.apellido1.setText(""); this.cc1.setText("");
         * this.multa1.setText(""); this.fecha1.setText("");
         * this.hora1.setText(""); this.celular1.setText("");
         * this.correo1.setText(""); this.descripcion1.setText("");
         */
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        AgentedeDiredeTransito d = new AgentedeDiredeTransito();

        d.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        DirecciónProvicialdetrafico a = new DirecciónProvicialdetrafico();

        a.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        Conductor user = new Conductor();

        user.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        MenuPrincipal c = new MenuPrincipal();

        c.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Ayuda;
    private javax.swing.JLabel apellido1;
    private javax.swing.JLabel cc1;
    private javax.swing.JLabel celular1;
    private javax.swing.JLabel correo1;
    private javax.swing.JLabel descripcion1;
    private javax.swing.JLabel fecha1;
    private javax.swing.JLabel hora1;
    private javax.swing.JLabel id1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel multa1;
    private javax.swing.JLabel nombre1;
    public javax.swing.JTable tabla2;
    // End of variables declaration//GEN-END:variables
}
