/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentacar.View;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import rentacar.Arac;
import rentacar.Kiralama;
import rentacar.Musteri;
import rentacar.RentACar;

/**
 *
 * @author furka
 */
public class AdminFrame extends javax.swing.JFrame {
    private RentACar r;
    /**
     * Creates new form AdminFrame
     */
    public AdminFrame() {
        initComponents();
        initialize();
    }

    AdminFrame(RentACar r) {
        initComponents();
        initialize();
        this.r = r;
    }
    private void initialize() {
        ButtonGroup bg = new ButtonGroup();
        bg.add(rdBtnAracAra);
        bg.add(rdBtnAracEkle);
        bg.add(rdBtnAracGoster);
        bg.add(rdBtnAracSayisi);
        bg.add(rdBtnAracSil);
        bg.add(rdBtnKiralamaGoster);
        bg.add(rdBtnTeslimAl);
        gizle();
        
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rdBtnAracEkle = new javax.swing.JRadioButton();
        rdBtnAracAra = new javax.swing.JRadioButton();
        rdBtnAracSayisi = new javax.swing.JRadioButton();
        rdBtnAracSil = new javax.swing.JRadioButton();
        rdBtnAracGoster = new javax.swing.JRadioButton();
        marka = new javax.swing.JTextField();
        fiyat = new javax.swing.JTextField();
        kapasite = new javax.swing.JTextField();
        aralik1 = new javax.swing.JTextField();
        aralik2 = new javax.swing.JTextField();
        btnAracEkle = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        output = new javax.swing.JTextArea();
        btnAracAra = new javax.swing.JButton();
        listAraclar = new javax.swing.JComboBox<>();
        btnAracSil = new javax.swing.JButton();
        rdBtnKiralamaGoster = new javax.swing.JRadioButton();
        rdBtnTeslimAl = new javax.swing.JRadioButton();
        btnTeslimAlAra = new javax.swing.JButton();
        ehliyetNo = new javax.swing.JTextField();
        btnTeslimAl = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(java.awt.Color.white);

        rdBtnAracEkle.setBackground(new java.awt.Color(187, 181, 207));
        rdBtnAracEkle.setText("Araç Ekle");
        rdBtnAracEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdBtnAracEkleActionPerformed(evt);
            }
        });

        rdBtnAracAra.setBackground(new java.awt.Color(187, 181, 207));
        rdBtnAracAra.setText("Araç Ara");
        rdBtnAracAra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdBtnAracAraActionPerformed(evt);
            }
        });

        rdBtnAracSayisi.setBackground(new java.awt.Color(187, 181, 207));
        rdBtnAracSayisi.setText("Araç Sayısı");
        rdBtnAracSayisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdBtnAracSayisiActionPerformed(evt);
            }
        });

        rdBtnAracSil.setBackground(new java.awt.Color(187, 181, 207));
        rdBtnAracSil.setText("Araç Sil");
        rdBtnAracSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdBtnAracSilActionPerformed(evt);
            }
        });

        rdBtnAracGoster.setBackground(new java.awt.Color(187, 181, 207));
        rdBtnAracGoster.setText("Araçları Göster");
        rdBtnAracGoster.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdBtnAracGosterActionPerformed(evt);
            }
        });

        marka.setText("Arac Adı");
        marka.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                markaFocusGained(evt);
            }
        });

        fiyat.setText("Fiyat");
        fiyat.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                fiyatFocusGained(evt);
            }
        });

        kapasite.setText("Kapasite");
        kapasite.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                kapasiteFocusGained(evt);
            }
        });

        aralik1.setText("Min. Fiyat");

        aralik2.setText("Max. Fiyat");

        btnAracEkle.setBackground(new java.awt.Color(255, 0, 0));
        btnAracEkle.setText("Ekle");
        btnAracEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAracEkleActionPerformed(evt);
            }
        });

        output.setBackground(new java.awt.Color(236, 215, 215));
        output.setColumns(20);
        output.setRows(5);
        jScrollPane1.setViewportView(output);

        btnAracAra.setBackground(new java.awt.Color(255, 0, 0));
        btnAracAra.setText("Ara");
        btnAracAra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAracAraActionPerformed(evt);
            }
        });

        listAraclar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnAracSil.setBackground(new java.awt.Color(255, 0, 0));
        btnAracSil.setText("Sil");
        btnAracSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAracSilActionPerformed(evt);
            }
        });

        rdBtnKiralamaGoster.setBackground(new java.awt.Color(187, 181, 207));
        rdBtnKiralamaGoster.setText("Kiralamları Göster");
        rdBtnKiralamaGoster.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdBtnKiralamaGosterActionPerformed(evt);
            }
        });

        rdBtnTeslimAl.setBackground(new java.awt.Color(187, 181, 207));
        rdBtnTeslimAl.setText("Araç Teslim Al");
        rdBtnTeslimAl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdBtnTeslimAlActionPerformed(evt);
            }
        });

        btnTeslimAlAra.setBackground(new java.awt.Color(255, 0, 0));
        btnTeslimAlAra.setText("Ara");
        btnTeslimAlAra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTeslimAlAraActionPerformed(evt);
            }
        });

        ehliyetNo.setText("Ehliyet No");
        ehliyetNo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ehliyetNoFocusGained(evt);
            }
        });

        btnTeslimAl.setBackground(new java.awt.Color(255, 0, 0));
        btnTeslimAl.setText("Sil");
        btnTeslimAl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTeslimAlActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnAracEkle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(kapasite)
                            .addComponent(fiyat)
                            .addComponent(marka, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rdBtnAracEkle, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(aralik1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ehliyetNo, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(aralik2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(rdBtnAracAra, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(rdBtnAracSayisi, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(btnAracAra, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(rdBtnAracSil, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(rdBtnAracGoster)
                                                .addGap(14, 14, 14)
                                                .addComponent(rdBtnKiralamaGoster))
                                            .addComponent(btnAracSil, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(rdBtnTeslimAl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnTeslimAlAra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(listAraclar, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnTeslimAl, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdBtnAracEkle)
                    .addComponent(rdBtnAracAra)
                    .addComponent(rdBtnAracSayisi)
                    .addComponent(rdBtnAracSil)
                    .addComponent(rdBtnAracGoster)
                    .addComponent(rdBtnKiralamaGoster)
                    .addComponent(rdBtnTeslimAl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(marka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aralik1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ehliyetNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fiyat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aralik2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kapasite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAracEkle)
                    .addComponent(btnAracAra)
                    .addComponent(btnAracSil)
                    .addComponent(btnTeslimAlAra))
                .addGap(8, 8, 8)
                .addComponent(listAraclar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addComponent(btnTeslimAl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void gizle(){
        aralik1.setVisible(false);
        aralik2.setVisible(false);
        marka.setVisible(false);
        fiyat.setVisible(false);
        kapasite.setVisible(false);
        btnAracEkle.setVisible(false);
        btnAracAra.setVisible(false);
        listAraclar.setVisible(false);
        btnAracSil.setVisible(false);
        btnTeslimAlAra.setVisible(false);
        ehliyetNo.setVisible(false);
        btnTeslimAl.setVisible(false);
    }
    private void rdBtnAracEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdBtnAracEkleActionPerformed
        gizle();
        marka.setVisible(true);
        fiyat.setVisible(true);
        kapasite.setVisible(true);
        btnAracEkle.setVisible(true);
    }//GEN-LAST:event_rdBtnAracEkleActionPerformed

    private void btnAracEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAracEkleActionPerformed
        Arac a = new Arac(Integer.parseInt(kapasite.getText()),Integer.parseInt(fiyat.getText()),marka.getText());
        r.arabaEkle(a);
        
    }//GEN-LAST:event_btnAracEkleActionPerformed

    private void btnAracAraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAracAraActionPerformed
        output.setText(r.arabaAra(Integer.parseInt(aralik1.getText()),Integer.parseInt(aralik2.getText())));
    }//GEN-LAST:event_btnAracAraActionPerformed

    private void rdBtnAracAraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdBtnAracAraActionPerformed
        gizle();
        aralik1.setVisible(true);
        aralik2.setVisible(true);
        btnAracAra.setVisible(true);
    }//GEN-LAST:event_rdBtnAracAraActionPerformed

    private void rdBtnAracSayisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdBtnAracSayisiActionPerformed
        gizle();
        output.setText("Toplam Araç Sayısı: " + String.valueOf(r.arabaSayisi()));
    }//GEN-LAST:event_rdBtnAracSayisiActionPerformed
    
    private void fillListAraclar(){
        listAraclar.removeAllItems();
        listAraclar.addItem("Lütfen Silinecek Aracı Seçiniz...");
        for(int i=0;i<r.kiralanabilirAraclar.size();i++)
	{
           listAraclar.addItem( r.kiralanabilirAraclar.get(i).toString() );
	}
    }
    private void fillOutputKiralamalar(){
        output.setText(r.kiralananlariGor());
    }
    private void fillListKiralamalar(String ehliyetNo)
    {
        DefaultComboBoxModel comboModel = new DefaultComboBoxModel();
        listAraclar.setModel(comboModel);
        listAraclar.removeAllItems();
        for(int i=0;i<r.kiralamalar.size();i++)
	{
           if(r.kiralamalar.get(i).getMusteri().getEhliyetNo().equals(ehliyetNo) )
           {
               comboModel.addElement( r.kiralamalar.get(i) );
           }
	}
    }
    
    private void rdBtnAracSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdBtnAracSilActionPerformed
        gizle();
        listAraclar.setVisible(true);
        btnAracSil.setVisible(true);
        fillListAraclar();
    }//GEN-LAST:event_rdBtnAracSilActionPerformed

    private void btnAracSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAracSilActionPerformed
        int i = listAraclar.getSelectedIndex() - 1;
        r.kiralanabilirAraclar.remove(i);
        fillListAraclar();
    }//GEN-LAST:event_btnAracSilActionPerformed

    private void rdBtnAracGosterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdBtnAracGosterActionPerformed
        gizle();
        String o = "";
        for(int i=0;i<r.kiralanabilirAraclar.size();i++)
	{
           o += ( r.kiralanabilirAraclar.get(i).toString() + "\n" );
	}
        output.setText(o);
    }//GEN-LAST:event_rdBtnAracGosterActionPerformed

    private void kapasiteFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_kapasiteFocusGained
        kapasite.setText("");
    }//GEN-LAST:event_kapasiteFocusGained

    private void markaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_markaFocusGained
        marka.setText("");
    }//GEN-LAST:event_markaFocusGained

    private void fiyatFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fiyatFocusGained
        fiyat.setText("");
    }//GEN-LAST:event_fiyatFocusGained

    private void rdBtnKiralamaGosterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdBtnKiralamaGosterActionPerformed
        gizle();
        fillOutputKiralamalar();
    }//GEN-LAST:event_rdBtnKiralamaGosterActionPerformed

    private void rdBtnTeslimAlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdBtnTeslimAlActionPerformed
        gizle();
        btnTeslimAlAra.setVisible(true);
        btnTeslimAl.setVisible(true);
        listAraclar.setVisible(true);
        listAraclar.removeAllItems();
        ehliyetNo.setVisible(true);
    }//GEN-LAST:event_rdBtnTeslimAlActionPerformed

    private void btnTeslimAlAraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTeslimAlAraActionPerformed
        fillListKiralamalar(ehliyetNo.getText());
    }//GEN-LAST:event_btnTeslimAlAraActionPerformed

    private void ehliyetNoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ehliyetNoFocusGained
        ehliyetNo.setText("");
    }//GEN-LAST:event_ehliyetNoFocusGained

    private void btnTeslimAlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTeslimAlActionPerformed
        Kiralama k = (Kiralama)listAraclar.getSelectedItem();
        Musteri m = k.getMusteri();
        r.geriAlimIslemi(m, k.getIslemTarihi());
        fillListKiralamalar(ehliyetNo.getText());
    }//GEN-LAST:event_btnTeslimAlActionPerformed

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
            java.util.logging.Logger.getLogger(AdminFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminFrame().setVisible(true);
            }
        });
    }

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField aralik1;
    private javax.swing.JTextField aralik2;
    private javax.swing.JButton btnAracAra;
    private javax.swing.JButton btnAracEkle;
    private javax.swing.JButton btnAracSil;
    private javax.swing.JButton btnTeslimAl;
    private javax.swing.JButton btnTeslimAlAra;
    private javax.swing.JTextField ehliyetNo;
    private javax.swing.JTextField fiyat;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField kapasite;
    private javax.swing.JComboBox<String> listAraclar;
    private javax.swing.JTextField marka;
    private javax.swing.JTextArea output;
    private javax.swing.JRadioButton rdBtnAracAra;
    private javax.swing.JRadioButton rdBtnAracEkle;
    private javax.swing.JRadioButton rdBtnAracGoster;
    private javax.swing.JRadioButton rdBtnAracSayisi;
    private javax.swing.JRadioButton rdBtnAracSil;
    private javax.swing.JRadioButton rdBtnKiralamaGoster;
    private javax.swing.JRadioButton rdBtnTeslimAl;
    // End of variables declaration//GEN-END:variables
    }
