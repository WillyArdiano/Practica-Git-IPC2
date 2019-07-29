
package practica1git.UI;
import javax.swing.JOptionPane;
public class RegistrarLibro extends javax.swing.JDialog {
    
    private int verificador =0;
    
    public RegistrarLibro(java.awt.Frame parent) {
        super(parent, true);
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        panelFondo = new javax.swing.JPanel();
        tituloLbl = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtDia = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtAño = new javax.swing.JTextField();
        txtMes = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtCdNumero = new javax.swing.JTextField();
        txtNoCopias = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtAutorLibro = new javax.swing.JTextField();
        txtTituloLibro = new javax.swing.JTextField();
        txtCdLetra = new javax.swing.JTextField();
        txtNombreEditorial = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();

        jLabel6.setFont(new java.awt.Font("Ubuntu", 0, 35)); // NOI18N
        jLabel6.setText("-");

        jLabel7.setFont(new java.awt.Font("Ubuntu", 0, 35)); // NOI18N
        jLabel7.setText("-");

        jTextField4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField4.setText("DÍA");
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jTextField5.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTextField5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField5.setText("AÑO");
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jTextField6.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTextField6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField6.setText("MES");
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panelFondo.setBackground(new java.awt.Color(219, 253, 235));

        tituloLbl.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        tituloLbl.setText("REGISTRAR NUEVO LIBRO");

        jLabel1.setFont(new java.awt.Font("Ubuntu", 0, 35)); // NOI18N
        jLabel1.setText("-");

        jLabel2.setFont(new java.awt.Font("Ubuntu", 0, 35)); // NOI18N
        jLabel2.setText("-");

        txtDia.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtDia.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiaActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel3.setText("Ingrese Codigo Del libro*  ejemplo: 123 - ABC ");

        txtAño.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtAño.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAñoActionPerformed(evt);
            }
        });

        txtMes.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtMes.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMesActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel4.setText("Ingrese Fecha de Publicacion  AÑO - MES - DÍA");

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel5.setText("Ingrese Autor del Libro:");

        jLabel8.setFont(new java.awt.Font("Ubuntu", 0, 35)); // NOI18N
        jLabel8.setText("-");

        txtCdNumero.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtCdNumero.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCdNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCdNumeroActionPerformed(evt);
            }
        });

        txtNoCopias.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtNoCopias.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNoCopias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNoCopiasActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel9.setText("Ingrese Editorial");

        jLabel10.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel10.setText("Ingrese Titulo del Libro");

        jLabel11.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel11.setText("Ingrese cantidad de Copias");

        txtAutorLibro.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtAutorLibro.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAutorLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAutorLibroActionPerformed(evt);
            }
        });

        txtTituloLibro.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtTituloLibro.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTituloLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTituloLibroActionPerformed(evt);
            }
        });

        txtCdLetra.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtCdLetra.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCdLetra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCdLetraActionPerformed(evt);
            }
        });

        txtNombreEditorial.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtNombreEditorial.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNombreEditorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreEditorialActionPerformed(evt);
            }
        });

        btnGuardar.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        btnGuardar.setText("GUARDAR");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelFondoLayout = new javax.swing.GroupLayout(panelFondo);
        panelFondo.setLayout(panelFondoLayout);
        panelFondoLayout.setHorizontalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tituloLbl))
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtCdLetra, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5)
                                .addComponent(jLabel3)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFondoLayout.createSequentialGroup()
                .addGap(0, 51, Short.MAX_VALUE)
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFondoLayout.createSequentialGroup()
                        .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(panelFondoLayout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addGap(28, 28, 28)
                                        .addComponent(txtNoCopias, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(15, 15, 15))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelFondoLayout.createSequentialGroup()
                                        .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelFondoLayout.createSequentialGroup()
                                                .addGap(120, 120, 120)
                                                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(panelFondoLayout.createSequentialGroup()
                                                        .addComponent(txtAño, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jLabel1))
                                                    .addGroup(panelFondoLayout.createSequentialGroup()
                                                        .addGap(106, 106, 106)
                                                        .addComponent(txtMes, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtDia, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(77, 77, 77)))
                                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(panelFondoLayout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtNombreEditorial, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panelFondoLayout.createSequentialGroup()
                                        .addGap(225, 225, 225)
                                        .addComponent(txtTituloLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panelFondoLayout.createSequentialGroup()
                                    .addComponent(txtCdNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel8))
                                .addComponent(txtAutorLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(131, 131, 131))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFondoLayout.createSequentialGroup()
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53))))
        );
        panelFondoLayout.setVerticalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloLbl)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCdNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtCdLetra, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addComponent(jLabel5)
                .addGap(1, 1, 1)
                .addComponent(txtAutorLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addGap(5, 5, 5)
                .addComponent(txtTituloLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtNoCopias, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtNombreEditorial, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtDia, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtAño, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtMes, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(1, 1, 1)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiaActionPerformed

    private void txtAñoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAñoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAñoActionPerformed

    private void txtMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMesActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void txtCdNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCdNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCdNumeroActionPerformed

    private void txtNoCopiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNoCopiasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNoCopiasActionPerformed

    private void txtAutorLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAutorLibroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAutorLibroActionPerformed

    private void txtTituloLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTituloLibroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTituloLibroActionPerformed

    private void txtCdLetraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCdLetraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCdLetraActionPerformed

    private void txtNombreEditorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreEditorialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreEditorialActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
      validarValores();
        System.out.println(verificador);
       if(verificador == 2 ){
            this.setVisible(false);
            System.out.println("cerrar" );
        }
       
    }//GEN-LAST:event_btnGuardarActionPerformed
    protected void validarValores(){
        verificador =0;
        if(verificador ==0){
                validarCodigo();
        } else if(verificador ==2){
            validarTituloVacio();
        }else if(verificador ==2){
            validarAutorVacio();
        }else if(verificador ==2){
            validarCopias();
        } else if(verificador == 2){
            if(!txtAño.getText().isEmpty()){
                validarFecha();
            }
        }
    }
    public int dia;
    public int mes;
    public int año;
    private void validarFecha(){
        try{
        	dia = Integer.parseInt(txtDia.getText());
            if (dia > 31){
                JOptionPane.showMessageDialog(null,"Dia no valido");
                 verificador =1;
            } else if (dia < 31){
                verificador =2;
            }
    	}catch(NumberFormatException ex){
        	JOptionPane.showMessageDialog(null,"No es un  numero");
                 verificador =1;
    	}
        try{
            if(mes > 12){
                mes = Integer.parseInt(txtMes.getText());
                JOptionPane.showMessageDialog(null,"Mes no valido");
                 verificador =1;
            }else if(mes < 12){
                verificador =2;
            }
    	}catch(NumberFormatException ex){
        	JOptionPane.showMessageDialog(null,"No es un  numero");
                verificador =1;
    	}
        
        try{
            año = Integer.parseInt(txtAño.getText());
            if(txtAño.getText().length() != 4  ){
                JOptionPane.showMessageDialog(null,"Año no valido");
            }else if(txtAño.getText().length() == 4  ){
                verificador =2;
            }
    	}catch(NumberFormatException ex){
        	JOptionPane.showMessageDialog(null,"No es un  numero");
                verificador =1;
    	} 
    }
    
    public int codigo;
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
        }else  if(txtCdLetra.getText().isEmpty()){
            verificador =2;
        }
        
        
        try{
            codigo = Integer.parseInt(txtCdNumero.getText());
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
            }
    	}
        
    }
    public int noCopias;
    
    private void validarCopias(){
        if(txtNoCopias.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Numero de Copias Obligatorio");
            verificador =1;
        }else  if(!txtNoCopias.getText().isEmpty()){
             verificador =2;
        }
        try{
            noCopias = Integer.parseInt(txtNoCopias.getText()); 
    	}catch(NumberFormatException ex){
           JOptionPane.showMessageDialog(null,"No Copias no es numero");
             verificador =1; 
    	}
    }
    private void validarTituloVacio(){
        if(txtTituloLibro.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"titulo del Libro Obligatorio");
            verificador =1;
        }else if(!txtTituloLibro.getText().isEmpty()){
            verificador = 2;
        }
    }
    
    private void validarAutorVacio(){
        if(txtAutorLibro.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"NOombre del Autor Obligatorio");
            verificador =1;
        }else if(!txtAutorLibro.getText().isEmpty()){
            verificador = 2;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JPanel panelFondo;
    private javax.swing.JLabel tituloLbl;
    private javax.swing.JTextField txtAutorLibro;
    private javax.swing.JTextField txtAño;
    private javax.swing.JTextField txtCdLetra;
    private javax.swing.JTextField txtCdNumero;
    private javax.swing.JTextField txtDia;
    private javax.swing.JTextField txtMes;
    private javax.swing.JTextField txtNoCopias;
    private javax.swing.JTextField txtNombreEditorial;
    private javax.swing.JTextField txtTituloLibro;
    // End of variables declaration//GEN-END:variables
}
