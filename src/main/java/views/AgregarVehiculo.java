package views;

import domain.VehiculoTipo;
import javax.swing.JOptionPane;

public class AgregarVehiculo extends javax.swing.JFrame {

    public AgregarVehiculo() {
        initComponents();
        setTitle("Ingreso de Vehiculos"); 
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        patenteLbl = new javax.swing.JLabel();
        modeloLbl = new javax.swing.JLabel();
        marcaNombreLbl = new javax.swing.JLabel();
        anioLbl = new javax.swing.JLabel();
        marcaPaisLbl = new javax.swing.JLabel();
        patenteTxt = new javax.swing.JTextField();
        modeloTxt = new javax.swing.JTextField();
        marcaNombreTxt = new javax.swing.JTextField();
        anioTxt = new javax.swing.JTextField();
        marcaPaisTxt = new javax.swing.JTextField();
        capCargaLbl = new javax.swing.JLabel();
        sucursalLbl = new javax.swing.JLabel();
        capCargaTxt = new javax.swing.JTextField();
        sucursalCombo = new javax.swing.JComboBox<>();
        tipoLbl = new javax.swing.JLabel();
        tipoCombo = new javax.swing.JComboBox<>();
        kmLitroLbl = new javax.swing.JLabel();
        kmLitroTxt = new javax.swing.JTextField();
        litrosExtraLbl = new javax.swing.JLabel();
        litrosExtraTxt = new javax.swing.JTextField();
        kwhLbl = new javax.swing.JLabel();
        kwhTxt = new javax.swing.JTextField();
        guardarBtn = new javax.swing.JButton();
        cancelarBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        patenteLbl.setText("Patente");

        modeloLbl.setText("Modelo");

        marcaNombreLbl.setText("Marca");

        anioLbl.setText("Año");

        marcaPaisLbl.setText("Pais");

        patenteTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patenteTxtActionPerformed(evt);
            }
        });

        marcaNombreTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marcaNombreTxtActionPerformed(evt);
            }
        });

        capCargaLbl.setText("Capacidad de carga");

        sucursalLbl.setText("Sucursal");

        sucursalCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SUC01", "SUC02" }));

        tipoLbl.setText("Tipo");

        tipoCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ELECTRICO", "COMBUSTIBLE" }));

        kmLitroLbl.setText("Km por litro");

        litrosExtraLbl.setText("Litros extra");

        kwhLbl.setText("Kwh");

        guardarBtn.setText("Guardar");
        guardarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarBtnActionPerformed(evt);
            }
        });

        cancelarBtn.setText("Cancelar");
        cancelarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(guardarBtn)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(patenteLbl)
                            .addComponent(modeloLbl)
                            .addComponent(marcaNombreLbl)
                            .addComponent(anioLbl))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(patenteTxt)
                            .addComponent(modeloTxt)
                            .addComponent(marcaNombreTxt)
                            .addComponent(anioTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(marcaPaisLbl)
                            .addComponent(capCargaLbl)
                            .addComponent(sucursalLbl)
                            .addComponent(tipoLbl))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(marcaPaisTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sucursalCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(capCargaTxt)
                            .addComponent(tipoCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(74, 74, 74)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(kmLitroLbl)
                            .addComponent(litrosExtraLbl)
                            .addComponent(kwhLbl))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(kmLitroTxt)
                            .addComponent(litrosExtraTxt)
                            .addComponent(kwhTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(cancelarBtn)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(patenteLbl)
                    .addComponent(marcaPaisLbl)
                    .addComponent(patenteTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(marcaPaisTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kmLitroLbl)
                    .addComponent(kmLitroTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(modeloLbl)
                    .addComponent(modeloTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(capCargaLbl)
                    .addComponent(capCargaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(litrosExtraLbl)
                    .addComponent(litrosExtraTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(marcaNombreLbl)
                    .addComponent(marcaNombreTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sucursalLbl)
                    .addComponent(sucursalCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kwhLbl)
                    .addComponent(kwhTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(anioLbl)
                    .addComponent(anioTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tipoLbl)
                    .addComponent(tipoCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guardarBtn)
                    .addComponent(cancelarBtn))
                .addGap(65, 65, 65))
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

    private void patenteTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patenteTxtActionPerformed
 
    }//GEN-LAST:event_patenteTxtActionPerformed

    private void marcaNombreTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marcaNombreTxtActionPerformed

    }//GEN-LAST:event_marcaNombreTxtActionPerformed

    private void guardarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarBtnActionPerformed
        try {
            String patente      = patenteTxt    .getText().trim().toUpperCase();
            String nombreMarca  = marcaNombreTxt.getText().trim();
            String paisMarca    = marcaPaisTxt  .getText().trim();
            String modelo       = modeloTxt     .getText().trim();
            String sucursal     = (String) sucursalCombo.getSelectedItem(); 
            VehiculoTipo tipo   = VehiculoTipo.valueOf((String) tipoCombo.getSelectedItem());

            if (modelo.isBlank()) {
                throw new IllegalArgumentException("El modelo no puede estar vacío.");
            }

            int    anio     = Integer.parseInt(anioTxt    .getText().trim()); 
            double capCarga = Double.parseDouble(capCargaTxt.getText().trim());

            double param1 = 0;
            double param2 = 0;

            if (tipo == VehiculoTipo.ELECTRICO) {
                param1 = Double.parseDouble(kwhTxt.getText().trim());
            } else {
                param1 = Double.parseDouble(kmLitroTxt    .getText().trim());
                param2 = Double.parseDouble(litrosExtraTxt.getText().trim());
            }
            
            Controlador.agregarVehiculo(
                    patente, nombreMarca, paisMarca,
                    modelo, anio, capCarga,
                    sucursal, tipo, param1, param2);

            JOptionPane.showMessageDialog(this,
                    "Vehículo agregado correctamente.",
                    "Éxito", JOptionPane.INFORMATION_MESSAGE);
            dispose();

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this,
                    "Ingresá valores numéricos válidos en Año, Cap. de Carga y los campos de consumo.",
                    "Error de formato", JOptionPane.ERROR_MESSAGE);
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(this,
                    e.getMessage(),
                    "Error de validación", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_guardarBtnActionPerformed

    private void cancelarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarBtnActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancelarBtnActionPerformed

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
            java.util.logging.Logger.getLogger(AgregarVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarVehiculo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel anioLbl;
    private javax.swing.JTextField anioTxt;
    private javax.swing.JButton cancelarBtn;
    private javax.swing.JLabel capCargaLbl;
    private javax.swing.JTextField capCargaTxt;
    private javax.swing.JButton guardarBtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel kmLitroLbl;
    private javax.swing.JTextField kmLitroTxt;
    private javax.swing.JLabel kwhLbl;
    private javax.swing.JTextField kwhTxt;
    private javax.swing.JLabel litrosExtraLbl;
    private javax.swing.JTextField litrosExtraTxt;
    private javax.swing.JLabel marcaNombreLbl;
    private javax.swing.JTextField marcaNombreTxt;
    private javax.swing.JLabel marcaPaisLbl;
    private javax.swing.JTextField marcaPaisTxt;
    private javax.swing.JLabel modeloLbl;
    private javax.swing.JTextField modeloTxt;
    private javax.swing.JLabel patenteLbl;
    private javax.swing.JTextField patenteTxt;
    private javax.swing.JComboBox<String> sucursalCombo;
    private javax.swing.JLabel sucursalLbl;
    private javax.swing.JComboBox<String> tipoCombo;
    private javax.swing.JLabel tipoLbl;
    // End of variables declaration//GEN-END:variables
}
