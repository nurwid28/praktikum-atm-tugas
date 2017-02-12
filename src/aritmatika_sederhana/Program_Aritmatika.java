/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semester2;

/**
 *
 * @author Widya
 */
public class Program_Aritmatika extends javax.swing.JFrame {

    String jns ="";
    int jml;
    
    public Program_Aritmatika() {
        initComponents();
        getJumlah();
        setjenis();
        panel.setVisible(false);
        pilihanbil.setEnabled(false);
        bil1.setVisible(false);
        bil2.setVisible(false);
        bil3.setVisible(false);
        bil4.setVisible(false);
        b1.setVisible(false);
        b2.setVisible(false);
        b3.setVisible(false);
        b4.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        bil1 = new javax.swing.JLabel();
        b1 = new javax.swing.JTextField();
        bil2 = new javax.swing.JLabel();
        b2 = new javax.swing.JTextField();
        bil3 = new javax.swing.JLabel();
        b3 = new javax.swing.JTextField();
        bil4 = new javax.swing.JLabel();
        thasil = new javax.swing.JTextField();
        pilihanbil = new javax.swing.JComboBox<>();
        ket = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        b4 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jenis = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 51, 51));
        getContentPane().setLayout(null);

        panel.setBackground(new java.awt.Color(255, 102, 102));
        panel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Operasi", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(0, 51, 51))); // NOI18N
        panel.setLayout(null);

        jLabel19.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Jumlah Bilangan");
        panel.add(jLabel19);
        jLabel19.setBounds(20, 70, 130, 30);

        bil1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        bil1.setForeground(new java.awt.Color(255, 255, 255));
        bil1.setText("Bilangan 1");
        panel.add(bil1);
        bil1.setBounds(40, 120, 100, 30);

        b1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        panel.add(b1);
        b1.setBounds(160, 110, 250, 40);

        bil2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        bil2.setForeground(new java.awt.Color(255, 255, 255));
        bil2.setText("Bilangan 2");
        panel.add(bil2);
        bil2.setBounds(40, 170, 100, 30);

        b2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        panel.add(b2);
        b2.setBounds(160, 160, 250, 40);

        bil3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        bil3.setForeground(new java.awt.Color(255, 255, 255));
        bil3.setText("Bilangan 3");
        panel.add(bil3);
        bil3.setBounds(40, 220, 120, 30);

        b3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        panel.add(b3);
        b3.setBounds(160, 210, 250, 40);

        bil4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        bil4.setForeground(new java.awt.Color(255, 255, 255));
        bil4.setText("Bilangan 4");
        panel.add(bil4);
        bil4.setBounds(40, 270, 120, 30);

        thasil.setEditable(false);
        thasil.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        panel.add(thasil);
        thasil.setBounds(30, 370, 380, 110);

        pilihanbil.setBackground(new java.awt.Color(153, 153, 153));
        pilihanbil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "2", "3", "4" }));
        pilihanbil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pilihanbilActionPerformed(evt);
            }
        });
        panel.add(pilihanbil);
        pilihanbil.setBounds(160, 70, 250, 30);

        ket.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        ket.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panel.add(ket);
        ket.setBounds(160, 30, 110, 30);

        jButton1.setText("Hitung");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        panel.add(jButton1);
        jButton1.setBounds(130, 320, 180, 30);

        b4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        panel.add(b4);
        b4.setBounds(160, 260, 250, 40);

        getContentPane().add(panel);
        panel.setBounds(40, 140, 440, 500);

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setLayout(null);

        jenis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Pilih Salah Satu-", "Penjumlahan", "Pengurangan", "Perkalian", "Pembagian", " " }));
        jenis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jenisActionPerformed(evt);
            }
        });
        jPanel1.add(jenis);
        jenis.setBounds(220, 90, 240, 40);

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Jenis Aritmatika");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(50, 90, 150, 40);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("PROGRAM ARITMATIKA");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(60, 30, 440, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 520, 660);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jenisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jenisActionPerformed
        setjenis();
    }//GEN-LAST:event_jenisActionPerformed

    private void pilihanbilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pilihanbilActionPerformed
        getJumlah();
    }//GEN-LAST:event_pilihanbilActionPerformed

    
    public void setjenis(){
            if (jenis.getSelectedItem().equals("Penjumlahan")) {
                jns = "Penjumlahan";
                ket.setText("Penjumlahan");
                panel.setVisible(true);
                pilihanbil.setEnabled(true);   
            }
            else if (jenis.getSelectedItem().equals("Pengurangan")) {
                jns = "Pengurangan";
                ket.setText("Pengurangan");
                panel.setVisible(true);
                pilihanbil.setEnabled(true);   
            }
             else if (jenis.getSelectedItem().equals("Perkalian")) {
                jns = "Perkalian";
                ket.setText("Perkalian");
                panel.setVisible(true);
                pilihanbil.setEnabled(true);   
            }
            else if (jenis.getSelectedItem().equals("Pembagian")) {
                jns = "Pembagian";
                ket.setText("Pembagian");
                panel.setVisible(true);
                pilihanbil.setEnabled(true);   
            }       
        }
        
        public void getJumlah(){
            if(pilihanbil.getSelectedItem().equals("2")){
                bil3.setVisible(false);
                bil4.setVisible(false);
                b3.setVisible(false);
                b4.setVisible(false);
                b1.setVisible(true);
                b2.setVisible(true);
                bil1.setVisible(true);
                bil2.setVisible(true);  
                jml=2;
            }
            else if(pilihanbil.getSelectedItem().equals("3")){
                bil3.setVisible(true);
                bil4.setVisible(false);
                b4.setVisible(false);
                b3.setVisible(true);
                jml=3;
            }
            else if(pilihanbil.getSelectedItem().equals("4")){
                bil3.setVisible(true);
                bil4.setVisible(true);
                b4.setVisible(true);
                b3.setVisible(true);
                jml=4;
            }
        }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Double hsl = 0.0;
        Double a1, a2, a3, a4;
        a1 = Double.parseDouble(b1.getText().toString());
        a2 = Double.parseDouble(b2.getText().toString());

        if(jns.equals("Penjumlahan")) {
            if(jml == 2) {
                hsl = a1 + a2;
                thasil.setText(""+a1 +" + "+ a2 + " = " + hsl);
            }
            if(jml == 3) {
                a3 = Double.parseDouble(b3.getText().toString());
                hsl = a1 + a2 + a3;
                thasil.setText(""+ a1 +" + "+ a2 +" + " + a3 + " = " + hsl);
            }
            if(jml == 4) {
                a3 = Double.parseDouble(b3.getText().toString());
                a4 = Double.parseDouble(b4.getText().toString());
                hsl = a1 + a2 + a3 + a4;
                thasil.setText(""+ a1 +" + "+ a2 +" + " + a3 + " + "+ a4 + " = " + hsl);
            }
        }
        else if(jns.equals("Pengurangan")) {
            if(jml == 2) {
                hsl = a1 - a2;
                thasil.setText(""+a1 +" - "+ a2 + " = " + hsl);
            }
            if(jml == 3) {
                a3 = Double.parseDouble(b3.getText().toString());
                hsl = a1 - a2 - a3;
                thasil.setText(""+ a1 +" - "+ a2 +" - " + a3 + " = " + hsl);
            }
            if(jml == 4) {
                a3 = Double.parseDouble(b3.getText().toString());
                a4 = Double.parseDouble(b4.getText().toString());
                hsl = a1 - a2 - a3 - a4;
                thasil.setText(""+ a1 +" - "+ a2 +" - " + a3 + " - "+ a4 + " = " + hsl);
            }
        }
        else if(jns.equals("Perkalian")) {
            if(jml == 2) {
                hsl = a1 * a2;
                thasil.setText(""+a1 +" x "+ a2 + " = " + hsl);
            }
            if(jml == 3) {
                a3 = Double.parseDouble(b3.getText().toString());
                hsl = a1 * a2 * a3;
                thasil.setText(""+ a1 +" x "+ a2 +" x " + a3 + " = " + hsl);
            }
            if(jml == 4) {
                a3 = Double.parseDouble(b3.getText().toString());
                a4 = Double.parseDouble(b4.getText().toString());
                hsl = a1 * a2 * a3 * a4;
                thasil.setText(""+ a1 +" x "+ a2 +" x " + a3 + " x "+ a4 + " = " + hsl);
            }
        }
        else if(jns.equals("Pembagian")) {
            if(jml == 2) {
                hsl = a1 / a2;
                thasil.setText(""+a1 +" : "+ a2 + " = " + hsl);
            }
            if(jml == 3) {
                a3 = Double.parseDouble(b3.getText().toString());
                hsl = a1 / a2 / a3;
                thasil.setText(""+ a1 +" : "+ a2 +" : " + a3 + " = " + hsl);
            }
            if(jml == 4) {
                a3 = Double.parseDouble(b3.getText().toString());
                a4 = Double.parseDouble(b4.getText().toString());
                hsl = a1 / a2 / a3 / a4;
                thasil.setText(""+ a1 +" : "+ a2 +" : " + a3 + " : "+ a4 + " = " + hsl);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Program_Aritmatika.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Program_Aritmatika.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Program_Aritmatika.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Program_Aritmatika.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Program_Aritmatika().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField b1;
    private javax.swing.JTextField b2;
    private javax.swing.JTextField b3;
    private javax.swing.JTextField b4;
    private javax.swing.JLabel bil1;
    private javax.swing.JLabel bil2;
    private javax.swing.JLabel bil3;
    private javax.swing.JLabel bil4;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> jenis;
    private javax.swing.JLabel ket;
    private javax.swing.JPanel panel;
    private javax.swing.JComboBox<String> pilihanbil;
    private javax.swing.JTextField thasil;
    // End of variables declaration//GEN-END:variables
}
