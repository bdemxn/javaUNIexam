
package Depreciacion;

import javax.swing.JFrame;

/**
 *
 * @author arturo-collado
 */
public class MetodosDeDepreciacion extends javax.swing.JFrame {

    /**
     * Creates new form deprecia
     */
    public MetodosDeDepreciacion() {
        initComponents();
        setLocationRelativeTo(null);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        LineaRecta = new javax.swing.JRadioButtonMenuItem();
        SumaDigitos = new javax.swing.JRadioButtonMenuItem();
        DepAcele = new javax.swing.JRadioButtonMenuItem();
        ReduccionDatos = new javax.swing.JRadioButtonMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Examen de Programación II");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout EscritorioLayout = new javax.swing.GroupLayout(Escritorio);
        Escritorio.setLayout(EscritorioLayout);
        EscritorioLayout.setHorizontalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 987, Short.MAX_VALUE)
        );
        EscritorioLayout.setVerticalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 646, Short.MAX_VALUE)
        );

        jMenu2.setText("Metodos de Depreciación");

        LineaRecta.setSelected(true);
        LineaRecta.setText("Método de Linea Recta");
        LineaRecta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LineaRectaActionPerformed(evt);
            }
        });
        jMenu2.add(LineaRecta);

        SumaDigitos.setSelected(true);
        SumaDigitos.setText("Método de la suma de los digitos del año");
        SumaDigitos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SumaDigitosActionPerformed(evt);
            }
        });
        jMenu2.add(SumaDigitos);

        DepAcele.setSelected(true);
        DepAcele.setText("Metodo de la unidad producida");
        DepAcele.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DepAceleActionPerformed(evt);
            }
        });
        jMenu2.add(DepAcele);

        ReduccionDatos.setSelected(true);
        ReduccionDatos.setText("Método Doble Saldo Decreciente");
        ReduccionDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReduccionDatosActionPerformed(evt);
            }
        });
        jMenu2.add(ReduccionDatos);

        jMenuBar1.add(jMenu2);

        jMenu1.setText("Acerca de");

        jMenuItem1.setText("Integrantes");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SumaDigitosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SumaDigitosActionPerformed
        // TODO add your handling code here:
        
         SumaDigitos verSumaDigitos = new SumaDigitos();
Escritorio.add(verSumaDigitos);
verSumaDigitos.show();
    }//GEN-LAST:event_SumaDigitosActionPerformed

    private void DepAceleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DepAceleActionPerformed
        // TODO add your handling code here:
        
        UnidadProducida verDepAcele = new UnidadProducida();
Escritorio.add(verDepAcele);
verDepAcele.show();
    }//GEN-LAST:event_DepAceleActionPerformed

    private void LineaRectaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LineaRectaActionPerformed
        // TODO add your handling code here:
        
        LineaRecta verLineaRecta = new LineaRecta();
Escritorio.add(verLineaRecta);
verLineaRecta.show();
    }//GEN-LAST:event_LineaRectaActionPerformed

    private void ReduccionDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReduccionDatosActionPerformed
        // TODO add your handling code here:
        
        DobleSaldoDecreciente verReduccionDatos = new DobleSaldoDecreciente();
        Escritorio.add(verReduccionDatos);
        verReduccionDatos.show();
        
    }//GEN-LAST:event_ReduccionDatosActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        Acerca acercaForm = new Acerca();
        Escritorio.add(acercaForm);
        acercaForm.show();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(MetodosDeDepreciacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MetodosDeDepreciacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MetodosDeDepreciacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MetodosDeDepreciacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MetodosDeDepreciacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButtonMenuItem DepAcele;
    private javax.swing.JDesktopPane Escritorio;
    private javax.swing.JRadioButtonMenuItem LineaRecta;
    private javax.swing.JRadioButtonMenuItem ReduccionDatos;
    private javax.swing.JRadioButtonMenuItem SumaDigitos;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    // End of variables declaration//GEN-END:variables
}