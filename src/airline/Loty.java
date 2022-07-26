/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package airline;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author micha
 */
public class Loty extends javax.swing.JFrame {

    /**
     * Creates new form Loty
     */
    public Loty() {
        initComponents();
        WyswietlLoty();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        LotNrJava = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        LotOdlotJava = new javax.swing.JComboBox<>();
        LotDocelJava = new javax.swing.JComboBox<>();
        LotDataJava = new com.toedter.calendar.JDateChooser();
        LotSiedzeniaJava = new javax.swing.JTextField();
        LotZapiszJava = new javax.swing.JButton();
        LotEdytujJava = new javax.swing.JButton();
        LotUsunJava = new javax.swing.JButton();
        LotPowrotJava = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        LotListaJava = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Zarządzanie lotem");

        jLabel2.setText("Numer Lotu");

        jLabel3.setText("Miejsce odlotu");

        jLabel4.setText("Miejsce docelowe");

        jLabel5.setText("Data odlotu");

        jLabel6.setText("Liczba siedzeń");

        LotOdlotJava.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Warszawa", "Kraków", "Łódź", "Gdańsk" }));

        LotDocelJava.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Warszawa", "Kraków", "Berlin", "Londyn", "Amsterdam", "Barcelona" }));

        LotZapiszJava.setText("Zapisz");
        LotZapiszJava.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LotZapiszJavaMouseClicked(evt);
            }
        });

        LotEdytujJava.setText("Edytuj");
        LotEdytujJava.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LotEdytujJavaMouseClicked(evt);
            }
        });

        LotUsunJava.setText("Usuń");
        LotUsunJava.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LotUsunJavaMouseClicked(evt);
            }
        });

        LotPowrotJava.setText("Powrót");
        LotPowrotJava.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LotPowrotJavaMouseClicked(evt);
            }
        });

        LotListaJava.setModel(new javax.swing.table.DefaultTableModel(
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
        LotListaJava.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LotListaJavaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(LotListaJava);

        jLabel7.setText("X");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(564, 564, 564)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(LotNrJava, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(115, 115, 115)
                                .addComponent(jLabel3)
                                .addGap(140, 140, 140)
                                .addComponent(jLabel4)
                                .addGap(177, 177, 177)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(237, 237, 237)
                                        .addComponent(LotZapiszJava))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(84, 84, 84)
                                        .addComponent(LotOdlotJava, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(49, 49, 49)
                                        .addComponent(LotEdytujJava)
                                        .addGap(55, 55, 55)
                                        .addComponent(LotUsunJava)
                                        .addGap(58, 58, 58)
                                        .addComponent(LotPowrotJava))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(14, 14, 14)
                                        .addComponent(LotDocelJava, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(101, 101, 101)
                                        .addComponent(LotDataJava, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LotSiedzeniaJava, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(160, 160, 160)
                .addComponent(jLabel7)
                .addGap(65, 65, 65))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LotDataJava, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(99, 99, 99))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LotNrJava, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LotOdlotJava, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LotDocelJava, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(LotSiedzeniaJava, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LotZapiszJava)
                    .addComponent(LotEdytujJava)
                    .addComponent(LotUsunJava)
                    .addComponent(LotPowrotJava))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void LotPowrotJavaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LotPowrotJavaMouseClicked
        // TODO add your handling code here:
        new Główne_Okno().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_LotPowrotJavaMouseClicked

    Connection Con = null;
    PreparedStatement pst = null;
    ResultSet Rs = null, RS1 = null;
    Statement St = null, St1 = null;
    int LotID = 0;
    
    private void WyswietlLoty()
    {
        try{
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airline", "root","");
            St = Con.createStatement();
            Rs = St.executeQuery("select * from lot");
            LotListaJava.setModel(DbUtils.resultSetToTableModel(Rs));
        } catch (Exception e){
            
        }
    }

        private void Czyszczenie()
    {
    LotNrJava.setText("");
    LotSiedzeniaJava.setText("");
    }
    
    private void LotZapiszJavaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LotZapiszJavaMouseClicked
        // TODO add your handling code here:
        if(LotNrJava.getText().isEmpty() || LotSiedzeniaJava.getText().isEmpty() || LotOdlotJava.getSelectedIndex() == -1 || LotDocelJava.getSelectedIndex() == -1)
        {
            JOptionPane.showMessageDialog(this, "Brakuje danych!");
        }else{
            try{
                Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airline", "root","");
                PreparedStatement Add = Con.prepareStatement("insert into lot values(?, ?, ?, ?, ?)");
                Add.setString(1, LotNrJava.getText());
                Add.setString(2, LotOdlotJava.getSelectedItem().toString());
                Add.setString(3, LotDocelJava.getSelectedItem().toString());
                Add.setString(4, LotDataJava.getDate().toString());
                Add.setInt (5, Integer.valueOf(LotSiedzeniaJava.getText()));
                int wiersz = Add.executeUpdate();
                JOptionPane.showMessageDialog(this, "Lot zarejestrowany"); 
                Con.close();
                WyswietlLoty();
                Czyszczenie();
            } catch(Exception e){
                JOptionPane.showMessageDialog(this,e);
            }
        }
    }//GEN-LAST:event_LotZapiszJavaMouseClicked

    String pomocnicza = "";
    private void LotUsunJavaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LotUsunJavaMouseClicked
        // TODO add your handling code here:
        if(pomocnicza==""){
            JOptionPane.showMessageDialog(this, "Wybierz lot!");
        } else{
            try{
                Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airline", "root","");
                String ZapytanieSQL = "Delete from lot where LotNUMER='"+pomocnicza+"'";
                Statement Del = Con.createStatement();
                Del.executeUpdate(ZapytanieSQL);
                JOptionPane.showMessageDialog(this, "Lot pomyślnie usunięty!");
                WyswietlLoty();
            } catch(Exception e){
                JOptionPane.showMessageDialog(this, e);
            }
        }      
    }//GEN-LAST:event_LotUsunJavaMouseClicked

    private void LotListaJavaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LotListaJavaMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)LotListaJava.getModel();
                int indeks = LotListaJava.getSelectedRow();
                pomocnicza = model.getValueAt(indeks, 0).toString();
                LotOdlotJava.setSelectedItem(model.getValueAt(indeks, 1).toString());
                LotDocelJava.setSelectedItem(model.getValueAt(indeks, 2).toString());
                LotSiedzeniaJava.setText(model.getValueAt(indeks, 4).toString());
    }//GEN-LAST:event_LotListaJavaMouseClicked

    private void LotEdytujJavaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LotEdytujJavaMouseClicked
        // TODO add your handling code here:
        if (pomocnicza == "")
        {
            JOptionPane.showMessageDialog(this, "Wybierz pasażera!");
        }else{
            try{
                Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airline", "root","");
                String Zapytanie = "Update lot set MiejsceWylotu=?, MiejsceDocelowe=?, DataLotu=?, Siedzenia=? where LotNUMER=?";
                PreparedStatement Add = Con.prepareStatement(Zapytanie);
                Add.setString(5, pomocnicza);
                Add.setString(1, LotOdlotJava.getSelectedItem().toString());
                Add.setString(2, LotDocelJava.getSelectedItem().toString());
                Add.setString(3, LotDataJava.getDate().toString());
                Add.setString(4, LotSiedzeniaJava.getText());
                int wiersz = Add.executeUpdate();
                JOptionPane.showMessageDialog(this, "Lot zaktualizowany!"); 
                Con.close();
                WyswietlLoty();
                Czyszczenie();
            } catch(Exception e){
                JOptionPane.showMessageDialog(this, e);
            }
        }
    }//GEN-LAST:event_LotEdytujJavaMouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel7MouseClicked

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
            java.util.logging.Logger.getLogger(Loty.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Loty.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Loty.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Loty.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Loty().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser LotDataJava;
    private javax.swing.JComboBox<String> LotDocelJava;
    private javax.swing.JButton LotEdytujJava;
    private javax.swing.JTable LotListaJava;
    private javax.swing.JTextField LotNrJava;
    private javax.swing.JComboBox<String> LotOdlotJava;
    private javax.swing.JButton LotPowrotJava;
    private javax.swing.JTextField LotSiedzeniaJava;
    private javax.swing.JButton LotUsunJava;
    private javax.swing.JButton LotZapiszJava;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
