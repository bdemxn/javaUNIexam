
package Depreciacion;

import java.text.DecimalFormat;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author arturo-collado
 */
public class DobleSaldoDecreciente extends javax.swing.JInternalFrame {

    DefaultTableModel dm = new DefaultTableModel ();
    
    private JComboBox<String> Combobox;
      private JButton updateButton;
      
      
    private JButton refreshButton;
    
    private DefaultTableModel model;
    /**
     * Creates new form ReduccionDatos
     */
    public DobleSaldoDecreciente() {
        initComponents();
        String ids [] = {"Articulo", "Año", "Valor en Libros", "Tasa" , "Depreciacion Anual", "Depreciacion Acumulada", };
        
        dm.setColumnIdentifiers(ids);
        
        jTable2.setModel(dm);
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
        jLabel3 = new javax.swing.JLabel();
        VidaUtil = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        CostoInicial = new javax.swing.JTextField();
        Calcular = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        Articulo = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ValorSalvamento = new javax.swing.JTextField();
        Eliminar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Metodo Doble Saldo Decreciente");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel1.setText("Depreciacion por Doble Saldo Decreciente");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 360, -1));

        jLabel2.setText("Años de vida util:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, -1, 20));

        jLabel3.setText("Seleccione el activo a depreciar:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, -1, -1));
        getContentPane().add(VidaUtil, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, 100, -1));

        jLabel4.setText("Introduzca los siguientes datos:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, -1, -1));

        jLabel5.setText("Costo inicial del activo:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, -1, 20));
        getContentPane().add(CostoInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, 100, -1));

        Calcular.setText("Calcular");
        Calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalcularActionPerformed(evt);
            }
        });
        getContentPane().add(Calcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 170, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Edificio", "10-30 Años"},
                {"Maquinaria", "5-10 Años"},
                {"Mobiliario y Equipo de Oficina", "5-10 Años"},
                {"Muebles y Enseres", "2-10 Años"},
                {"Equipo de Transporte", "3-8 Años"},
                {"Equipo de Entrega y Reparto", "3-8 Años"}
            },
            new String [] {
                "Activo Fijo", "Años de Depreciacion"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 70, 310, 130));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Articulo", "Años", "Valor en Libros", "Tasa", "Depreciacion", "Depreciacion Acumulada"
            }
        ));
        jScrollPane1.setViewportView(jTable2);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 298, 1000, 289));

        Articulo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Edificio", "Maquinaria", "Mobiliario y Equipo de Oficina", "Muebles y Enseres", "Equipo de Transporte", "Equipo de Entrega y Reparto" }));
        getContentPane().add(Articulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, 130, -1));

        jLabel7.setText("Activo Fijo:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, -1, -1));

        jLabel6.setText("Valor de Salvamento:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, -1, 20));
        getContentPane().add(ValorSalvamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, 100, -1));

        Eliminar.setText("Eliminar");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });
        getContentPane().add(Eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 200, -1, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalcularActionPerformed
        
       
        
        String Art = String.valueOf(Articulo.getSelectedItem());
      
    int VidaU = Integer.valueOf(VidaUtil.getText());
    double ValorS = Double.parseDouble(ValorSalvamento.getText());
   double CostoI = Double.parseDouble(CostoInicial.getText());
        
   double DepreciacionAcumulada = 0;
        double ValorEnLibros = CostoI;
        for (int i = 1; i <= VidaU; i++) {
            if (i < VidaU) {
            double Tasa = 2.0 / VidaU;
            double DepreciacionAnual = ValorEnLibros * Tasa;
            if (ValorEnLibros - DepreciacionAnual < ValorS) {
                DepreciacionAnual = ValorEnLibros - ValorS;
            }
            DepreciacionAcumulada += DepreciacionAnual;
            ValorEnLibros -= DepreciacionAnual;
            
            DecimalFormat df = new DecimalFormat("#.##");
            String formattedTasa = df.format(Tasa * 100) + "%";

            dm.addRow(new Object[]{Art, i, ValorEnLibros, formattedTasa, DepreciacionAnual, DepreciacionAcumulada});
             } else {
                    
            double DepreciacionAnual = ValorEnLibros - ValorS;
                DepreciacionAcumulada += DepreciacionAnual;
                ValorEnLibros = ValorS;

                dm.addRow(new Object[]{Art, i, ValorEnLibros, "", DepreciacionAnual, DepreciacionAcumulada});
    }//GEN-LAST:event_CalcularActionPerformed

            } 
        } 
    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        // TODO add your handling code here:
        // Eliminar la fila seleccionada de la tabla
        int selectedRow = jTable2.getSelectedRow();
        if (selectedRow != -1) {
            dm.removeRow(selectedRow);
        } else {
            // Mostrar un mensaje si no se ha seleccionado ninguna fila
            JOptionPane.showMessageDialog(null, "Selecciona una fila para eliminar", "Error", JOptionPane.ERROR_MESSAGE);
            
    }//GEN-LAST:event_EliminarActionPerformed
} 
    
       
        
     
        

 
  
   
       
        
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Articulo;
    private javax.swing.JButton Calcular;
    private javax.swing.JTextField CostoInicial;
    private javax.swing.JButton Eliminar;
    private javax.swing.JTextField ValorSalvamento;
    private javax.swing.JTextField VidaUtil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}