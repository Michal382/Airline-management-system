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
public class Pasażerowie extends javax.swing.JFrame {

    /**
     * Creates new form Pasażerowie
     */
    public Pasażerowie() {
        initComponents();
        WyswietlPasazerow();
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
        Pdane = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Pnarodowosc = new javax.swing.JComboBox<>();
        Pplec = new javax.swing.JComboBox<>();
        Zapisz = new javax.swing.JButton();
        Edytuj = new javax.swing.JButton();
        Usun = new javax.swing.JButton();
        Powrot = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListaPasazer = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        PPaszport = new javax.swing.JTextField();
        Padres = new javax.swing.JTextField();
        Ptelefon = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Pnazwisko = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jLabel1.setText("Pasażerowie");

        jLabel2.setText("Imię pasażera");

        jLabel3.setText("Narodowość");

        jLabel4.setText("Płeć");

        jLabel5.setText("Numer paszportu");

        jLabel6.setText("Adres");

        Pnarodowosc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Polska", "Ukraina", "Niemcy", "Hiszpania", "Czechy" }));

        Pplec.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kobieta", "Mężczyzna", "Inna (nie chcę podawać)" }));
        Pplec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PplecActionPerformed(evt);
            }
        });

        Zapisz.setText("Zapisz");
        Zapisz.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ZapiszMouseClicked(evt);
            }
        });

        Edytuj.setText("Edytuj");
        Edytuj.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EdytujMouseClicked(evt);
            }
        });

        Usun.setText("Usuń");
        Usun.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UsunMouseClicked(evt);
            }
        });

        Powrot.setText("Powrót");
        Powrot.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PowrotMouseClicked(evt);
            }
        });

        ListaPasazer.setModel(new javax.swing.table.DefaultTableModel(
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
        ListaPasazer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ListaPasazerMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ListaPasazer);

        jLabel7.setText("Numer telefonu");

        jLabel8.setText("Nazwisko pasażera");

        jLabel9.setText("X");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Pdane)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(268, 268, 268)
                                .addComponent(Zapisz))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(Pnazwisko, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(81, 81, 81)
                                        .addComponent(jLabel4))
                                    .addComponent(Pnarodowosc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(49, 49, 49)
                        .addComponent(Edytuj)
                        .addGap(55, 55, 55)
                        .addComponent(Usun))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(283, 283, 283)
                        .addComponent(Pplec, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(81, 81, 81)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(PPaszport)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(Powrot))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(93, 93, 93)
                                .addComponent(jLabel6)
                                .addGap(136, 136, 136))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Padres, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(104, 104, 104)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Ptelefon))))
                .addGap(0, 130, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(564, 564, 564)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(69, 69, 69))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel9)))
                .addGap(86, 86, 86)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Pdane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Pnarodowosc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Pplec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PPaszport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Padres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ptelefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Pnazwisko, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Zapisz)
                    .addComponent(Edytuj)
                    .addComponent(Usun)
                    .addComponent(Powrot))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void PplecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PplecActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PplecActionPerformed
    Connection Con = null;
    PreparedStatement pst = null;
    ResultSet Rs = null, RS1 = null;
    Statement St = null, St1 = null;
    int PassID = 0;
    private void WyswietlPasazerow()
    {
        try{
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airline", "root","");
            St = Con.createStatement();
            Rs = St.executeQuery("select * from pasazertabela");
            ListaPasazer.setModel(DbUtils.resultSetToTableModel(Rs));
        } catch (Exception e){
            
        }
    }
    private void Licznik()
    {
        try{
            St1 = Con.createStatement();
            RS1 = St1.executeQuery("select Max(PID) from pasazertabela");
            RS1.next();
            PassID = RS1.getInt(1)+1;
        }catch (Exception e){
            
        }
    }
    
    private void Czyszczenie()
    {
    Pdane.setText("");
    Pnazwisko.setText("");
    PPaszport.setText("");
    Padres.setText("");
    Ptelefon.setText("");
    
    }
    
    private void ZapiszMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ZapiszMouseClicked
        // TODO add your handling code here:
        if(Pdane.getText().isEmpty() || PPaszport.getText().isEmpty() || Padres.getText().isEmpty() || Ptelefon.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Brakuje danych!");
        }else{
            try{
                Licznik();
                Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airline", "root","");
                PreparedStatement Add = Con.prepareStatement("insert into pasazertabela values(?, ?, ?, ?, ?, ?, ?, ?)");
                Add.setInt(1, PassID);
                Add.setString(2, Pdane.getText());
                Add.setString(3, Pnazwisko.getText());
                Add.setString(4, Pnarodowosc.getSelectedItem().toString());
                Add.setString(5, Pplec.getSelectedItem().toString());
                Add.setString(6, PPaszport.getText());
                Add.setString(7, Padres.getText());
                Add.setString(8, Ptelefon.getText());
                int wiersz = Add.executeUpdate();
                JOptionPane.showMessageDialog(this, "Pasażer dodany pomyślnie"); 
                Con.close();
                WyswietlPasazerow();
                Czyszczenie();
            } catch(Exception e){
                JOptionPane.showMessageDialog(this,e);
            }
            
        }
    }//GEN-LAST:event_ZapiszMouseClicked
    int pomocnicza = 0;
    private void UsunMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UsunMouseClicked
        // TODO add your handling code here:
        if(pomocnicza==0){
            JOptionPane.showMessageDialog(this, "Wybierz pasażera!");
        } else{
            try{
                Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airline", "root","");
                String ZapytanieSQL = "Delete from pasazertabela where PID="+pomocnicza;
                Statement Del = Con.createStatement();
                Del.executeUpdate(ZapytanieSQL);
                JOptionPane.showMessageDialog(this, "Pasażer usunięty!");
                WyswietlPasazerow();
            } catch(Exception e){
                JOptionPane.showMessageDialog(this, e);
            }
        }      
    }//GEN-LAST:event_UsunMouseClicked

    private void ListaPasazerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListaPasazerMouseClicked
        // TODO add your handling code here:
                DefaultTableModel model = (DefaultTableModel)ListaPasazer.getModel();
                int indeks = ListaPasazer.getSelectedRow();
                pomocnicza = Integer.valueOf(model.getValueAt(indeks, 0).toString());
                Pdane.setText(model.getValueAt(indeks, 1).toString());
                Pnazwisko.setText(model.getValueAt(indeks, 2).toString());
                Pnarodowosc.setSelectedItem(model.getValueAt(indeks, 3).toString());
                Pplec.setSelectedItem(model.getValueAt(indeks, 4).toString());
                PPaszport.setText(model.getValueAt(indeks, 5).toString());
                Padres.setText(model.getValueAt(indeks, 6).toString());
                Ptelefon.setText(model.getValueAt(indeks, 7).toString());
    }//GEN-LAST:event_ListaPasazerMouseClicked

    private void PowrotMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PowrotMouseClicked
        // TODO add your handling code here:
        new Główne_Okno().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_PowrotMouseClicked

    private void EdytujMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EdytujMouseClicked
        // TODO add your handling code here:
        if (pomocnicza == 0)
        {
            JOptionPane.showMessageDialog(this, "Wybierz pasażera!");
        }else{
            try{
                Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airline", "root","");
                String Zapytanie = "Update pasazertabela set PImie=?, PNazwisko=?, PNarodowosc=?, PPlec=?, PPaszport=?, PAdres=?, PTelefon=? where PID=?";
                PreparedStatement Add = Con.prepareStatement(Zapytanie);
                Add.setInt(8, pomocnicza);
                Add.setString(1, Pdane.getText());
                Add.setString(2, Pnazwisko.getText());
                Add.setString(3, Pnarodowosc.getSelectedItem().toString());
                Add.setString(4, Pplec.getSelectedItem().toString());
                Add.setString(5, PPaszport.getText());
                Add.setString(6, Padres.getText());
                Add.setString(7, Ptelefon.getText());
                int wiersz = Add.executeUpdate();
                JOptionPane.showMessageDialog(this, "Dane zaktualizowane!"); 
                Con.close();
                WyswietlPasazerow();
                Czyszczenie();
            } catch(Exception e){
                JOptionPane.showMessageDialog(this, e);
            }
        }
    }//GEN-LAST:event_EdytujMouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel9MouseClicked

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
            java.util.logging.Logger.getLogger(Pasażerowie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pasażerowie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pasażerowie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pasażerowie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pasażerowie().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Edytuj;
    private javax.swing.JTable ListaPasazer;
    private javax.swing.JTextField PPaszport;
    private javax.swing.JTextField Padres;
    private javax.swing.JTextField Pdane;
    private javax.swing.JComboBox<String> Pnarodowosc;
    private javax.swing.JTextField Pnazwisko;
    private javax.swing.JButton Powrot;
    private javax.swing.JComboBox<String> Pplec;
    private javax.swing.JTextField Ptelefon;
    private javax.swing.JButton Usun;
    private javax.swing.JButton Zapisz;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
