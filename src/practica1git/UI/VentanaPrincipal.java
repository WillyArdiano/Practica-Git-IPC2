/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1git.UI;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author astridmc
 */
public class VentanaPrincipal extends javax.swing.JFrame {
<<<<<<< HEAD

    /**
     * Creates new form VentanaPrincipal
     */
=======
    RegistrarLibro registrarLibro = new RegistrarLibro(this);
>>>>>>> Registros
    public VentanaPrincipal() {
        initComponents();
        Diseño();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondoTitulo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        logoLbl = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
<<<<<<< HEAD
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
=======
        btnRegistrarEstudiante = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnRegistrarLibro = new javax.swing.JButton();
>>>>>>> Registros
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
<<<<<<< HEAD
        jButton3 = new javax.swing.JButton();
=======
        btnregistrarLibroArchivo = new javax.swing.JButton();
>>>>>>> Registros
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fondoTitulo.setBackground(new java.awt.Color(167, 235, 186));

        jLabel1.setFont(new java.awt.Font("URW Bookman L", 1, 48)); // NOI18N
        jLabel1.setText("BIBLIOTECA");

        jLabel2.setFont(new java.awt.Font("URW Bookman L", 0, 48)); // NOI18N
        jLabel2.setText("REGISTRO DE ");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel3.setText("Importar Nuevos Libros(archivo)");

<<<<<<< HEAD
        jButton1.setText("IR");
=======
        btnRegistrarEstudiante.setText("IR");
>>>>>>> Registros

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel4.setText("Ingresar Nuevo Libro");

<<<<<<< HEAD
        jButton2.setText("IR");
=======
        btnRegistrarLibro.setText("IR");
        btnRegistrarLibro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnRegistrarLibroMouseReleased(evt);
            }
        });
        btnRegistrarLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarLibroActionPerformed(evt);
            }
        });
>>>>>>> Registros

        jSeparator1.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        jSeparator1.setPreferredSize(new java.awt.Dimension(100, 10));

        jLabel6.setFont(new java.awt.Font("DejaVu Serif", 0, 18)); // NOI18N
        jLabel6.setText("INGRESAR NUEVA INFORMACION AL SISTEMA");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel7.setText("Registrar Nuevo Estudiante");

        jSeparator2.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        jSeparator2.setPreferredSize(new java.awt.Dimension(100, 10));

        jLabel8.setFont(new java.awt.Font("DejaVu Serif", 0, 18)); // NOI18N
        jLabel8.setText("REGISTRAR");

<<<<<<< HEAD
        jButton3.setText("IR");
=======
        btnregistrarLibroArchivo.setText("IR");
>>>>>>> Registros

        jButton4.setText("PRESTAMO");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("DEVOLUCION");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jSeparator3.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        jSeparator3.setPreferredSize(new java.awt.Dimension(100, 10));

        jLabel9.setFont(new java.awt.Font("DejaVu Serif", 0, 18)); // NOI18N
        jLabel9.setText("REGISTROS");

<<<<<<< HEAD
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Libros que deben ser entregados hoy", "Libros en Mora", "Ganancias ", "Prestamos por Estudiante", "Prestamos por Carrera", " " }));
=======
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "reportes", "Libros que deben ser entregados hoy", "Libros en Mora", "Ganancias ", "Prestamos por Estudiante", "Prestamos por Carrera", " " }));
        jComboBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
>>>>>>> Registros

        jButton6.setText("ACEPTAR");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout fondoTituloLayout = new javax.swing.GroupLayout(fondoTitulo);
        fondoTitulo.setLayout(fondoTituloLayout);
        fondoTituloLayout.setHorizontalGroup(
            fondoTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(fondoTituloLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(fondoTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(fondoTituloLayout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(logoLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 17, Short.MAX_VALUE))
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(fondoTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(fondoTituloLayout.createSequentialGroup()
                .addGroup(fondoTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fondoTituloLayout.createSequentialGroup()
                        .addGap(208, 208, 208)
                        .addGroup(fondoTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(fondoTituloLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel8)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(fondoTituloLayout.createSequentialGroup()
                .addGroup(fondoTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(fondoTituloLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel9)
                        .addGap(43, 43, 43)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoTituloLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(fondoTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoTituloLayout.createSequentialGroup()
                        .addGroup(fondoTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(fondoTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
<<<<<<< HEAD
                                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)))
=======
                                .addComponent(btnRegistrarLibro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnregistrarLibroArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnRegistrarEstudiante, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)))
>>>>>>> Registros
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoTituloLayout.createSequentialGroup()
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51))))
        );
        fondoTituloLayout.setVerticalGroup(
            fondoTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fondoTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(fondoTituloLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1))
                    .addComponent(logoLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(fondoTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fondoTituloLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoTituloLayout.createSequentialGroup()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addGap(43, 43, 43)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(fondoTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
<<<<<<< HEAD
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(fondoTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
=======
                    .addComponent(btnRegistrarEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(fondoTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnregistrarLibroArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
>>>>>>> Registros
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoTituloLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)))
                .addGap(18, 18, 18)
                .addGroup(fondoTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
<<<<<<< HEAD
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
=======
                    .addComponent(btnRegistrarLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
>>>>>>> Registros
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondoTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondoTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed
<<<<<<< HEAD
=======

    private void btnRegistrarLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarLibroActionPerformed
      
    }//GEN-LAST:event_btnRegistrarLibroActionPerformed

    private void btnRegistrarLibroMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarLibroMouseReleased
        registrarLibro.setVisible(true);
    }//GEN-LAST:event_btnRegistrarLibroMouseReleased
>>>>>>> Registros
  

    protected void Diseño(){
        setTitle("REGISTRO BIBLIOTECA");
        setIconImage(new ImageIcon("logoUSAC.png").getImage()); //agrega imagen al icono del programa
        setLocation(400,100);
        ImageIcon logotipo = new ImageIcon("logoUSAC.png");
        logoLbl.setIcon(new ImageIcon(logotipo.getImage().getScaledInstance(logoLbl.getWidth(),logoLbl.getHeight(), Image.SCALE_SMOOTH)));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
<<<<<<< HEAD
    private javax.swing.JPanel fondoTitulo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
=======
    private javax.swing.JButton btnRegistrarEstudiante;
    private javax.swing.JButton btnRegistrarLibro;
    private javax.swing.JButton btnregistrarLibroArchivo;
    private javax.swing.JPanel fondoTitulo;
>>>>>>> Registros
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel logoLbl;
    // End of variables declaration//GEN-END:variables
}
