/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentacar.View;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import rentacar.Arac;
import rentacar.Musteri;
import rentacar.RentACar;

/**
 *
 * @author furka
 */
public class RentFrame extends javax.swing.JFrame {
    private RentACar r;
    /**
     * Creates new form MainFrame
     */
    public RentFrame() {
        initComponents();
        initialize();
    }

    RentFrame(RentACar r) {
        this.r = r;
        initComponents();
        initialize();
    }
    private void initialize()
    {
        fillAracList();
        gizleAll();
    }
    
    private void gizleAll()
    {
        labelAdSoyad.setVisible(false);
        labelEhliyetNo.setVisible(false);
        labelGun.setVisible(false);
        adSoyad.setVisible(false);
        kiraGun.setVisible(false);
        ehliyetNo.setVisible(false);
        btnHesapla.setVisible(false);
        btnOnay.setVisible(false);
        output.setVisible(false);
    }
    private void goster1()
    {
        labelAdSoyad.setVisible(true);
        labelEhliyetNo.setVisible(true);
        labelGun.setVisible(true);
        adSoyad.setVisible(true);
        kiraGun.setVisible(true);
        ehliyetNo.setVisible(true);
        btnHesapla.setVisible(true);
    }
    private void fillAracList()
    {
        DefaultComboBoxModel comboModel = new DefaultComboBoxModel();
        listAraclar.setModel(comboModel);
        listAraclar.removeAllItems();
        for(int i=0;i<r.kiralanabilirAraclar.size();i++)
	{
           comboModel.addElement( r.kiralanabilirAraclar.get(i) );
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

        alertFrame = new javax.swing.JFrame();
        jLabel1 = new javax.swing.JLabel();
        listAraclar = new javax.swing.JComboBox<>();
        aralik1 = new javax.swing.JTextField();
        aralik2 = new javax.swing.JTextField();
        btnAracFiltrele = new javax.swing.JButton();
        btnHesapla = new javax.swing.JButton();
        labelAdSoyad = new javax.swing.JLabel();
        adSoyad = new javax.swing.JTextField();
        labelEhliyetNo = new javax.swing.JLabel();
        ehliyetNo = new javax.swing.JTextField();
        labelGun = new javax.swing.JLabel();
        kiraGun = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        output = new javax.swing.JTextArea();
        btnOnay = new javax.swing.JButton();

        javax.swing.GroupLayout alertFrameLayout = new javax.swing.GroupLayout(alertFrame.getContentPane());
        alertFrame.getContentPane().setLayout(alertFrameLayout);
        alertFrameLayout.setHorizontalGroup(
            alertFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 427, Short.MAX_VALUE)
        );
        alertFrameLayout.setVerticalGroup(
            alertFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 134, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Kiralanabilir Araclar");

        listAraclar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        listAraclar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listAraclarActionPerformed(evt);
            }
        });

        aralik1.setText("Min. Fiyat");
        aralik1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                aralik1FocusGained(evt);
            }
        });

        aralik2.setText("Max. Fiyat");
        aralik2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                aralik2FocusGained(evt);
            }
        });

        btnAracFiltrele.setText("Filtrele");
        btnAracFiltrele.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAracFiltreleActionPerformed(evt);
            }
        });

        btnHesapla.setText("Hesapla");
        btnHesapla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHesaplaActionPerformed(evt);
            }
        });

        labelAdSoyad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelAdSoyad.setText("Ad - Soyad");

        labelEhliyetNo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelEhliyetNo.setText("Ehliyet No");

        labelGun.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelGun.setText("Kiralama Gün Sayısı");

        output.setColumns(20);
        output.setRows(5);
        jScrollPane1.setViewportView(output);

        btnOnay.setText("Onayla");
        btnOnay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOnayActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(listAraclar, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(aralik1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(aralik2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnAracFiltrele, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(kiraGun)
                                    .addComponent(adSoyad, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelEhliyetNo, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(labelGun, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                                        .addComponent(ehliyetNo, javax.swing.GroupLayout.Alignment.LEADING)))
                                .addGap(39, 39, 39))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelAdSoyad, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(btnHesapla, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnOnay)
                .addGap(218, 218, 218))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(listAraclar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aralik1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAracFiltrele)
                    .addComponent(aralik2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelAdSoyad)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(adSoyad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelEhliyetNo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ehliyetNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelGun)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kiraGun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnHesapla)
                    .addComponent(btnOnay))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAracFiltreleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAracFiltreleActionPerformed
        listAraclar.removeAllItems();
        DefaultComboBoxModel comboModel = new DefaultComboBoxModel();
        listAraclar.setModel(comboModel);
        for(int i=0;i<r.kiralanabilirAraclar.size();i++)
	{
            int aralikBir = Integer.valueOf(aralik1.getText());
            int aralikIki = Integer.valueOf(aralik2.getText());
            if(r.kiralanabilirAraclar.get(i).getGunlukKiraFiyat() >= aralikBir && r.kiralanabilirAraclar.get(i).getGunlukKiraFiyat() <= aralikIki )
            {
                comboModel.addElement(r.kiralanabilirAraclar.get(i));
            }
	}
    }//GEN-LAST:event_btnAracFiltreleActionPerformed

    private void btnHesaplaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHesaplaActionPerformed
        output.setVisible(true);
        btnOnay.setVisible(true);
        Arac a = (Arac)listAraclar.getSelectedItem();
        double ucret = a.getGunlukKiraFiyat() * Integer.valueOf(kiraGun.getText());
        String o = "Araç Markası: " + a.getArabaMarka() + "\nAraç Kapasitesi: " + a.getArabaMaxKapasite() + "\nGünlük Kiralama Bedeli: " + a.getGunlukKiraFiyat();
        o += "\nToplam Tutar: " + String.valueOf(ucret) + "TL";
        output.setText(o);
    }//GEN-LAST:event_btnHesaplaActionPerformed

    private void aralik1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_aralik1FocusGained
        aralik1.setText("");
    }//GEN-LAST:event_aralik1FocusGained

    private void aralik2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_aralik2FocusGained
        aralik2.setText("");
    }//GEN-LAST:event_aralik2FocusGained

    private void listAraclarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listAraclarActionPerformed
        if(listAraclar.getSelectedItem() != null)
        {
            goster1();
        }
    }//GEN-LAST:event_listAraclarActionPerformed

    private void btnOnayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOnayActionPerformed
        
        Arac a = (Arac)listAraclar.getSelectedItem();
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        Date today = Calendar.getInstance().getTime();
        String tarih = df.format(today);
        Musteri m = new Musteri(adSoyad.getText(),ehliyetNo.getText());
        r.addMusteri(m);
        r.kiralamaIslemi(a, m, tarih, Integer.valueOf(kiraGun.getText()));
        
        fillAracList();
        JOptionPane.showMessageDialog(alertFrame, "Kiralama işlemi başarıyla gerçekleştirildi.");
    }//GEN-LAST:event_btnOnayActionPerformed

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
            java.util.logging.Logger.getLogger(RentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RentFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adSoyad;
    private javax.swing.JFrame alertFrame;
    private javax.swing.JTextField aralik1;
    private javax.swing.JTextField aralik2;
    private javax.swing.JButton btnAracFiltrele;
    private javax.swing.JButton btnHesapla;
    private javax.swing.JButton btnOnay;
    private javax.swing.JTextField ehliyetNo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField kiraGun;
    private javax.swing.JLabel labelAdSoyad;
    private javax.swing.JLabel labelEhliyetNo;
    private javax.swing.JLabel labelGun;
    private javax.swing.JComboBox<String> listAraclar;
    private javax.swing.JTextArea output;
    // End of variables declaration//GEN-END:variables
}
