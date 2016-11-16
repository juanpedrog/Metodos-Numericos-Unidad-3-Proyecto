
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
public class GaussSeidel extends javax.swing.JFrame {
    DefaultTableModel model,model2;
    double[][] matriz;
    Object[] row=new Object[7];
    double a11,a12,a13,b1,a21,a22,a23,b2,a31,a32,a33,b3,x1=0,x2=0,x3=0,cifras;
    /**
     * Creates new form GaussSeidel
     */
    public GaussSeidel() {
        initComponents();
        this.setLocationRelativeTo(null);
        //int n=Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Ingrese el numero de cifras significativas"));
        model=new DefaultTableModel();
        model.addColumn("X1");
        model.addColumn("X2");
        model.addColumn("X3");
        model.addColumn("VD");
        tabla.setModel(model);
        /////////////////////
        model2=new DefaultTableModel();
        model2.addColumn("it");
        model2.addColumn("X1");
        model2.addColumn("ea");
        model2.addColumn("X2");
        model2.addColumn("ea");
        model2.addColumn("X3");
        model2.addColumn("ea");
        tabla2.setModel(model2);
    }
    public void start(double[][] m,int n){
        matriz=m;
        cifras=0.5*Math.pow(10, 2-n);
        load(matriz);
        boolean ea=false;
        asignar(matriz,model);
        firstRow(model2,1);
        int i=1;
        do{
            ea=gaussSeidel(i,x1,x2,x3,cifras);
            model2.addRow(row);
            i++;
        }while(!ea);
        lblx1.setText("X1= "+model2.getValueAt(model2.getRowCount()-1, 1));
        lblx2.setText("X2= "+model2.getValueAt(model2.getRowCount()-1, 3));
        lblx3.setText("X3= "+model2.getValueAt(model2.getRowCount()-1, 5));
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
    private void firstRow(DefaultTableModel m,int it){
        Object[] rowtemp=new Object[7];
        rowtemp[0]=it;
        rowtemp[1]=0;
        rowtemp[2]="--";
        rowtemp[3]=0;
        rowtemp[4]="--";
        rowtemp[5]=0;
        rowtemp[6]="--";
        m.addRow(rowtemp);
    }
    private boolean gaussSeidel(int it,double x1,double x2,double x3,double cif){
        double x1n,x2n,x3n,ea1,ea2,ea3;
        x1n=(b1-a12*x2-a13*x3)/a11;
        x2n=(b2-a21*x1n-a23*x3)/a22;
        x3n=(b3-a31*x1n-a32*x2n)/a33;
        ea1=Math.abs((x1n-x1)/x1n)*100;
        ea2=Math.abs((x2n-x2)/x2n)*100;
        ea3=Math.abs((x3n-x3)/x3n)*100;
        row[0]=it;
        row[1]=x1n;
        row[2]=ea1;
        row[3]=x2n;
        row[4]=ea2;
        row[5]=x3n;
        row[6]=ea3;
        if(ea1>cif){
            this.x1=x1n;
            this.x2=x2n;
            this.x3=x3n;
            return false;
        }else{
            if(ea2>cif){
                this.x1=x1n;
                this.x2=x2n;
                this.x3=x3n;
                return false;
            }else{
                if(ea3>cif){
                    this.x1=x1n;
                    this.x2=x2n;
                    this.x3=x3n;
                    return false;
                }else{
                    this.x1=x1n;
                    this.x2=x2n;
                    this.x3=x3n;
                    return true;
                }
            }
        }
    }
    private void load(double[][] m){
        a11=m[0][0];
        a12=m[0][1];
        a13=m[0][2];
        b1=m[0][3];
        a21=m[1][0];
        a22=m[1][1];
        a23=m[1][2];
        b2=m[1][3];
        a31=m[2][0];
        a32=m[2][1];
        a33=m[2][2];
        b3=m[2][3];
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
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla2 = new javax.swing.JTable();
        btnMP = new javax.swing.JButton();
        lblx1 = new javax.swing.JLabel();
        lblx2 = new javax.swing.JLabel();
        lblx3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gauss Seidel");
        setResizable(false);

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
        tabla.setEnabled(false);
        jScrollPane1.setViewportView(tabla);

        tabla2.setModel(new javax.swing.table.DefaultTableModel(
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
        tabla2.setEnabled(false);
        jScrollPane2.setViewportView(tabla2);

        btnMP.setText("Menu Principal");
        btnMP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMPActionPerformed(evt);
            }
        });

        lblx1.setText("jLabel1");

        lblx2.setText("jLabel1");

        lblx3.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 675, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
            .addGroup(layout.createSequentialGroup()
                .addGap(182, 182, 182)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(btnMP, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblx2)
                            .addComponent(lblx1)
                            .addComponent(lblx3))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(lblx1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblx2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblx3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnMP, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMPActionPerformed
        // TODO add your handling code here:
        VentanaGauss menu=new VentanaGauss();
        menu.start(matriz);
        menu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnMPActionPerformed

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
            java.util.logging.Logger.getLogger(GaussSeidel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GaussSeidel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GaussSeidel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GaussSeidel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GaussSeidel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMP;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblx1;
    private javax.swing.JLabel lblx2;
    private javax.swing.JLabel lblx3;
    private javax.swing.JTable tabla;
    private javax.swing.JTable tabla2;
    // End of variables declaration//GEN-END:variables
}
