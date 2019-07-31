
package practica1git.UI;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import practica1git.Backend.Buscador;
import practica1git.Backend.Estudiante;
import practica1git.Backend.Libro;
import practica1git.Backend.Prestamo;

public class RegistroPrestamo extends javax.swing.JDialog {

    /**
     * Creates new form RegistroPrestamo
     * @param parent
     */
    private int verificador =0;
    protected LocalDateTime fecha;
    protected Prestamo nuevoPrestamo;
    protected Buscador buscar= new Buscador();
    protected Estudiante estudiante;
    protected Libro libro;
    protected ArrayList <Estudiante> estudiantes;
    
    public RegistroPrestamo(java.awt.Frame parent) {
        super(parent, true);
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        tituloLbl = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNoCarnet = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        nombreAlumnotxt = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtCdNumero = new javax.swing.JTextField();
        txtCdLetra = new javax.swing.JTextField();
        btnAgregarOtroLibro = new javax.swing.JButton();
        btnRegistrarPrestamo = new javax.swing.JButton();

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel3.setText("Ingrese Codigo Del libro*  ejemplo: 123 - ABC ");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(219, 253, 235));

        tituloLbl.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        tituloLbl.setText("REGISTRAR NUEVO PRESTAMO");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel4.setText("INGRESE CARNET DEL ALUMNO:");

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel5.setText("NOMBRE ALUMNO:");

        txtNoCarnet.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        txtNoCarnet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNoCarnetActionPerformed(evt);
            }
        });

        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        nombreAlumnotxt.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        nombreAlumnotxt.setText("****************************");

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel7.setText("INGRESE CODIGO DEL LIBRO  EJ: 123  -    ABC");

        jLabel8.setFont(new java.awt.Font("Ubuntu", 0, 35)); // NOI18N
        jLabel8.setText("-");

        txtCdNumero.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtCdNumero.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCdNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCdNumeroActionPerformed(evt);
            }
        });

        txtCdLetra.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtCdLetra.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCdLetra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCdLetraActionPerformed(evt);
            }
        });

        btnAgregarOtroLibro.setText("Agregar otro libro");
        btnAgregarOtroLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarOtroLibroActionPerformed(evt);
            }
        });

        btnRegistrarPrestamo.setText("REGISTRAR PRESTAMO");
        btnRegistrarPrestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarPrestamoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtNoCarnet, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnAgregarOtroLibro)
                .addGap(33, 33, 33)
                .addComponent(txtCdNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(txtCdLetra, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(nombreAlumnotxt, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tituloLbl)
                                    .addComponent(jLabel4)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(257, 257, 257)
                        .addComponent(btnRegistrarPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(tituloLbl)
                .addGap(44, 44, 44)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNoCarnet, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreAlumnotxt)
                    .addComponent(jLabel5))
                .addGap(29, 29, 29)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtCdLetra, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCdNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnAgregarOtroLibro)))
                .addGap(38, 38, 38)
                .addComponent(btnRegistrarPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNoCarnetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNoCarnetActionPerformed

    }//GEN-LAST:event_txtNoCarnetActionPerformed

    private void txtCdNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCdNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCdNumeroActionPerformed

    private void txtCdLetraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCdLetraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCdLetraActionPerformed

    private void btnAgregarOtroLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarOtroLibroActionPerformed
        vaciarCampos();
    }//GEN-LAST:event_btnAgregarOtroLibroActionPerformed

    private void btnRegistrarPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarPrestamoActionPerformed
        validarDatos();
    }//GEN-LAST:event_btnRegistrarPrestamoActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        validarCarnet();
    }//GEN-LAST:event_btnBuscarActionPerformed

   public void validarDatos(){
       verificador =0;
       nuevoPrestamo = new Prestamo();
       estudiante=new Estudiante();
       libro=new Libro();
       if(verificador==0){
           validarCarnet();
           if(verificador==2){
               estudiante.setCarnet(carnet);
               validarCodigo();
                if(verificador==2){
                    libro.setCodigo(codigo);
                    camposVacios();
                    if(verificador ==2){
                        if(buscar.buscarEstudiante(estudiantes, estudiante, nombreAlumnotxt)==1){
                            if(buscar.buscarLibroEstudiante(estudiante, libro)==1){
                            JOptionPane.showMessageDialog(null,"El prestamo se ha realizado con exito");
                            vaciarCampos();
                            fecha = LocalDateTime.now();
                            }
                        }
                    }
                }
           }
       }
   }
   
    // vaciar campos
    private void vaciarCampos(){
        if(verificador==0){
            txtNoCarnet.setText("");
        }
        txtCdLetra.setText("");
        txtCdNumero.setText("");
    }
    

   
    
   public int carnet;
   
    private void validarCarnet(){
        try{
        	carnet = Integer.parseInt(txtNoCarnet.getText());
            if (txtNoCarnet.getText().length() !=9){
                JOptionPane.showMessageDialog(null,"carnet requiere 9 digitos");
                 verificador =1;
            } else if (txtNoCarnet.getText().length()==9){
                verificador =2;
            }
    	}catch(NumberFormatException ex){
        	JOptionPane.showMessageDialog(null,"Carnet invalido");
                 verificador =1;
        }
    }
    public String codigo;
    public int codigoNumero;
    public int codigoLetra;
    
    private void validarCodigo(){
        if(txtCdNumero.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"codigo Obligatorio");
            verificador =1;
        }else if(!txtCdNumero.getText().isEmpty()){
            verificador =2;
        }
        if(txtCdLetra.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"codigo Obligatorio");
            verificador =1;
        }else  if(!txtCdLetra.getText().isEmpty()){
            verificador =2;
        }
        
        
        try{
            codigoNumero = Integer.parseInt(txtCdNumero.getText());
            if(txtCdNumero.getText().length() != 3  ){
                JOptionPane.showMessageDialog(null,"codigo numerico no valido");
                verificador =1;
            }else  if(txtCdNumero.getText().length() != 3  ){
                verificador =2;
            }
    	}catch(NumberFormatException ex){
        	JOptionPane.showMessageDialog(null,"Codigo No es un  numero");
                verificador =1;
    	}
        
        try{
            codigoLetra = Integer.parseInt(txtCdLetra.getText());
            JOptionPane.showMessageDialog(null,"codigo alfavetico no es letra");
             verificador =1;
    	}catch(NumberFormatException ex){
            if(txtCdLetra.getText().length() != 3  ){
                JOptionPane.showMessageDialog(null,"codigo alfavetico de 3 caracteres");
                 verificador =1;
            }else{
                 verificador =2;
                 codigo = codigoLetra + "-" + codigoNumero;
            }
    	}
        
    }
    
    private void camposVacios(){
        if(txtNoCarnet.getText().isEmpty()){
            verificador =1;
            JOptionPane.showMessageDialog(null,"codigo Requerido");
        }else if(!txtNoCarnet.getText().isEmpty()){
            verificador=2;
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarOtroLibro;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnRegistrarPrestamo;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel nombreAlumnotxt;
    private javax.swing.JLabel tituloLbl;
    private javax.swing.JTextField txtCdLetra;
    private javax.swing.JTextField txtCdNumero;
    private javax.swing.JTextField txtNoCarnet;
    // End of variables declaration//GEN-END:variables
}
