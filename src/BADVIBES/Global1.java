/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BADVIBES;

import static BADVIBES.PARAMETROS.contResiduo;
import static BADVIBES.PARAMETROS.residuo;
import static BADVIBES.PROCESOS.Procesos;
import static BADVIBES.PROCESOS.contProcesos;
import static BADVIBES.Participante.i;
import static BADVIBES.Participante.participante;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author YAEL
 */
public class Global1 extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public Global1() {
        initComponents();
    this.setIconImage(new ImageIcon(getClass().getResource("/source/registro.png")).getImage());

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jButton9 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTable8 = new javax.swing.JTable();
        jButton15 = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jTextField25 = new javax.swing.JTextField();
        jTextField26 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setText("Fecha Inicial: ");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, -1, -1));

        jTextField13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField13ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 173, -1));
        jPanel1.add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 170, -1));

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/New Icon/101-taxes_15x15.png"))); // NOI18N
        jButton9.setText("Mostrar");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 177, 257, 30));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setText("Fecha Final: ");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 85, -1));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Fecha", "Residuo", "Cantidad", "Bonus", "Estaci??n"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 225, 388, 92));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/XANAX/depositphotos_14038315-stock-illustration-recycling-glass.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-410, 0, 850, 350));

        jTabbedPane1.addTab("Periodo", jPanel1);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable8.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Fecha", "Residuo", "Cantidad", "Bonus", "Estaci??n"
            }
        ));
        jScrollPane8.setViewportView(jTable8);

        jPanel2.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 225, 388, 93));

        jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/New Icon/101-taxes_15x15.png"))); // NOI18N
        jButton15.setText("Mostrar");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 177, 257, 30));

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel27.setText("Fecha Final: ");
        jPanel2.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 85, -1));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione residuo..." }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        jPanel2.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 160, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Residuo:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, -1, -1));

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel28.setText("Fecha Inicial: ");
        jPanel2.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, -1, -1));

        jTextField25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField25ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField25, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 173, -1));
        jPanel2.add(jTextField26, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 170, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/XANAX/depositphotos_14038315-stock-illustration-recycling-glass.jpg"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-450, 0, 890, 350));

        jTabbedPane1.addTab("Residuo", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField13ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
         DefaultTableModel modelo = (DefaultTableModel) jTable2.getModel();
        int filas = modelo.getRowCount();
        for (int m = 1; m <= filas; m++){
            modelo.removeRow(0);
        }
    String varFechaInicial,varBandera, varFechafinal;
    int diaI, mesI, anioI, numI, diaF, mesF, anioF, numF;
    int diaA, mesA, anioA, numA;
    
    varFechaInicial = jTextField13.getText();
    varFechafinal = jTextField14.getText();
    
    String[]FechaI = varFechaInicial.split("/");
    diaI = Integer.parseInt(FechaI [0]);
    mesI = Integer.parseInt(FechaI [1]);
    anioI = Integer.parseInt(FechaI [2]);
    numI = (diaI*diaI) + (mesI*mesI) + (anioI*anioI);
            
    String[]FechaF = varFechaInicial.split("/");
    diaF = Integer.parseInt(FechaF [0]);
    mesF = Integer.parseInt(FechaF [1]);
    anioF = Integer.parseInt(FechaF [2]);
    numF = (diaF*diaF) + (mesF*mesF) + (anioF*anioF);
    //JOptionPane.showMessageDialog(null, "F1"+numI+"-"+numF,"Aviso",1);
    
    for(int m = 0; m < contProcesos; m++){   
    String[] FechaA = Procesos[m][3].split("/");
    diaA = Integer.parseInt(FechaA[0]);
    mesA = Integer.parseInt(FechaA [1]);
    anioA = Integer.parseInt(FechaA[2]);
    numA = (diaA*diaA) + (mesA*mesA) + (anioA*anioA);
    
    if ((numA >= numI) && (numA <= numF)) {
        modelo.addRow(new Object[]{Procesos[m][3],Procesos[m][2],Procesos[m][6],Procesos[m][8],Procesos[m][5]});
        }
        
      }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
     DefaultTableModel modelo = (DefaultTableModel) jTable8.getModel();
        int filas = modelo.getRowCount();
        for (int m = 1; m <= filas; m++){
            modelo.removeRow(0);
        }
    String varFechaInicial,varBandera, varFechafinal,varResiduo;
    int diaI, mesI, anioI, numI, diaF, mesF, anioF, numF;
    int diaA, mesA, anioA, numA;
    
    varFechaInicial = jTextField25.getText();
    varFechafinal = jTextField26.getText();
    varResiduo = (String) jComboBox2.getSelectedItem(); 
    
    String[]FechaI = varFechaInicial.split("/");
    diaI = Integer.parseInt(FechaI [0]);
    mesI = Integer.parseInt(FechaI [1]);
    anioI = Integer.parseInt(FechaI [2]);
    numI = (diaI*diaI) + (mesI*mesI) + (anioI*anioI);
            
    String[]FechaF = varFechaInicial.split("/");
    diaF = Integer.parseInt(FechaF [0]);
    mesF = Integer.parseInt(FechaF [1]);
    anioF = Integer.parseInt(FechaF [2]);
    numF = (diaF*diaF) + (mesF*mesF) + (anioF*anioF);
    //JOptionPane.showMessageDialog(null, "F1"+numI+"-"+numF,"Aviso",1);
    
    for(int m = 0; m < contProcesos; m++){   
    String[] FechaA = Procesos[m][3].split("/");
    diaA = Integer.parseInt(FechaA[0]);
    mesA = Integer.parseInt(FechaA [1]);
    anioA = Integer.parseInt(FechaA[2]);
    numA = (diaA*diaA) + (mesA*mesA) + (anioA*anioA);
    
    if ((numA >= numI) && (numA <= numF)) {
        modelo.addRow(new Object[]{Procesos[m][3],Procesos[m][2],Procesos[m][6],Procesos[m][8],Procesos[m][5]});
        }
        
      }
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jTextField25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField25ActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        jComboBox2.removeAllItems();
        jComboBox2.addItem("Selecciona el residuo...");

        for(int x = 0;x < contResiduo;x++){
            if(!residuo[x][1].equals("")){
            jComboBox2.addItem(residuo[x][1]);
        }
      }
    }//GEN-LAST:event_formComponentShown

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

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
            java.util.logging.Logger.getLogger(Global1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Global1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Global1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Global1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Global1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable8;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField26;
    // End of variables declaration//GEN-END:variables
}
