
import java.awt.Frame;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Juan Pedro Gil
 */
public class VentanaGauss extends javax.swing.JFrame {
    DefaultTableModel model;
    double[][] matriz;
    /**
     * Creates new form VentanaGauss
     */
    public VentanaGauss() {
        initComponents();
        this.setLocationRelativeTo(null);
        model=new DefaultTableModel();
        model.addColumn("x1");
        model.addColumn("x2");
        model.addColumn("x3");
        model.addColumn("VD");
        model.addRow(new Object[4]);
        model.addRow(new Object[4]);
        model.addRow(new Object[4]);
        tabla.setModel(model);
        tabla.requestFocus();
    }
    public void start(double[][] m){
        matriz=m;
        asignar(matriz,model);
    }
    private void asignar(double[][] mat,DefaultTableModel m){
        while(m.getRowCount()!=0){
            m.removeRow(0);
        }
        for(int i=0;i<3;i++){
            Object[] object=new Object[4];
            object[0]=mat[i][0];
            object[1]=mat[i][1];
            object[2]=mat[i][2];
            object[3]=mat[i][3];
            m.addRow(object);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        btnGaussN = new javax.swing.JButton();
        btnGaussJ = new javax.swing.JButton();
        gaussS = new javax.swing.JButton();
        cramer = new javax.swing.JButton();
        btnClean = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu Principal");
        setResizable(false);

        tabla.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tabla);

        btnGaussN.setText("Gauss Normal");
        btnGaussN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGaussNActionPerformed(evt);
            }
        });

        btnGaussJ.setText("Gauss Jordan");
        btnGaussJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGaussJActionPerformed(evt);
            }
        });

        gaussS.setText("Guass Seidel");
        gaussS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gaussSActionPerformed(evt);
            }
        });

        cramer.setText("Cramer");
        cramer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cramerActionPerformed(evt);
            }
        });

        btnClean.setText("Limpiar Matriz");
        btnClean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCleanActionPerformed(evt);
            }
        });

        jLabel1.setText("Integrantes:");

        jLabel2.setText("Juan Pedro Gil Llanos");

        jLabel3.setText("Guillermo Guadalupe Reyes Guerrero");

        jLabel4.setText("Guillermo Zamorano Alcalá");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 517, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addComponent(btnGaussN, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnGaussJ, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(gaussS, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cramer, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(87, 87, 87)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(259, 259, 259)
                        .addComponent(btnClean)))
                .addGap(0, 28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnClean)
                .addGap(8, 8, 8)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnGaussN, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                    .addComponent(btnGaussJ, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(gaussS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cramer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGaussNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGaussNActionPerformed
        // TODO add your handling code here:
        try{
            matriz=new double[3][4];
            for(int i=0;i<3;i++){
                for(int j=0;j<4;j++){
                    matriz[i][j]=Double.parseDouble(model.getValueAt(i, j).toString());
                }
            }
            Gauss gauss=new Gauss();
            gauss.start(matriz);
            gauss.setVisible(true);
            this.setVisible(false);
        }catch(NullPointerException e){
            javax.swing.JOptionPane.showMessageDialog(this, "Termine de insertar la matriz");
        }
    }//GEN-LAST:event_btnGaussNActionPerformed

    private void btnGaussJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGaussJActionPerformed
        // TODO add your handling code here:
        try{
            matriz=new double[3][4];
            for(int i=0;i<3;i++){
                for(int j=0;j<4;j++){
                    matriz[i][j]=Double.parseDouble(model.getValueAt(i, j).toString());
                }
            }
            GaussJordan gaussJ=new GaussJordan();
            gaussJ.start(matriz);
            gaussJ.setVisible(true);
            this.setVisible(false);
        }catch(NullPointerException e){
            javax.swing.JOptionPane.showMessageDialog(this, "Termine de insertar la matriz");
        }catch(NumberFormatException er){
            javax.swing.JOptionPane.showMessageDialog(this, "Solo inserte numeros");
        }
        
    }//GEN-LAST:event_btnGaussJActionPerformed

    private void gaussSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gaussSActionPerformed
        // TODO add your handling code here:
        try{
            matriz=new double[3][4];
            for(int i=0;i<3;i++){
                for(int j=0;j<4;j++){
                    matriz[i][j]=Double.parseDouble(model.getValueAt(i, j).toString());
                }
            }
            GaussSeidel gaussSeidel=new GaussSeidel();
            try{
                gaussSeidel.start(matriz,Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Ingrese el numero de cifras significativas")));
                gaussSeidel.setVisible(true);
                this.setVisible(false);
            }catch(NumberFormatException e){
                
            }
        }catch(NullPointerException e){
            javax.swing.JOptionPane.showMessageDialog(this, "Termine de insertar la matriz");
        }
    }//GEN-LAST:event_gaussSActionPerformed

    private void cramerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cramerActionPerformed
        // TODO add your handling code here:
        try{
            matriz=new double[3][4];
            for(int i=0;i<3;i++){
                for(int j=0;j<4;j++){
                    matriz[i][j]=Double.parseDouble(model.getValueAt(i, j).toString());
                }
            }
            Cramer cramer=new Cramer();
            cramer.start(matriz);
            cramer.setVisible(true);
            this.setVisible(false);
        }catch(NullPointerException e){
            javax.swing.JOptionPane.showMessageDialog(this, "Termine de insertar la matriz");
        }
    }//GEN-LAST:event_cramerActionPerformed

    private void btnCleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCleanActionPerformed
        // TODO add your handling code here:
        while(model.getRowCount()!=0){
            model.removeRow(0);
        }
        for(int i=0;i<3;i++){
            model.addRow(new Object[3]);
        }
    }//GEN-LAST:event_btnCleanActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaGauss.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaGauss.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaGauss.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaGauss.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaGauss().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClean;
    private javax.swing.JButton btnGaussJ;
    private javax.swing.JButton btnGaussN;
    private javax.swing.JButton cramer;
    private javax.swing.JButton gaussS;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
