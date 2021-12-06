package view;


import java.awt.Toolkit;
import static java.time.Clock.system;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

public class FrmPrincipal extends javax.swing.JFrame {

    FmrApresenta fmrApresenta = new FmrApresenta();
   
    String categoriaSelecionado;
    String zonaSelecionada;
    
    public void limpaVariaveis (){
        categoriaSelecionado = "";
        zonaSelecionada = "";
    }
    
    public FrmPrincipal() {
        initComponents();
    }
    
     

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        lblSubTitulo = new javax.swing.JLabel();
        btnSair = new javax.swing.JButton();
        panelBanner = new javax.swing.JPanel();
        lblBanner = new javax.swing.JLabel();
        painelTab = new javax.swing.JTabbedPane();
        painelCategorias = new javax.swing.JPanel();
        btnRestau = new javax.swing.JButton();
        btnCinema = new javax.swing.JButton();
        btnEventos = new javax.swing.JButton();
        btnRoles = new javax.swing.JButton();
        painelLocalizacao = new javax.swing.JPanel();
        btnZO = new javax.swing.JButton();
        btnLeste = new javax.swing.JButton();
        btnSul = new javax.swing.JButton();
        btnZN = new javax.swing.JButton();
        btnCentro = new javax.swing.JButton();
        painelPraiaCateg = new javax.swing.JPanel();
        btnLitoralSul = new javax.swing.JButton();
        btnLitoralNorte = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        btnAdmin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        panelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblSubTitulo.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        lblSubTitulo.setForeground(new java.awt.Color(0, 0, 255));
        lblSubTitulo.setText("CATEGORIAS:");
        panelPrincipal.add(lblSubTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 720, 90));

        btnSair.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-exit-30.png"))); // NOI18N
        btnSair.setText("SAIR");
        btnSair.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        panelPrincipal.add(btnSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 680, 150, 60));

        panelBanner.setBackground(new java.awt.Color(102, 102, 255));

        lblBanner.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lblBanner.setForeground(new java.awt.Color(255, 255, 255));
        lblBanner.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBanner.setText("Para começar, me diga quais as coisas que gosto e no final te informo um lugar legal baseado nas informações");

        javax.swing.GroupLayout panelBannerLayout = new javax.swing.GroupLayout(panelBanner);
        panelBanner.setLayout(panelBannerLayout);
        panelBannerLayout.setHorizontalGroup(
            panelBannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBannerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblBanner, javax.swing.GroupLayout.DEFAULT_SIZE, 1138, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelBannerLayout.setVerticalGroup(
            panelBannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBannerLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(lblBanner)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        panelPrincipal.add(panelBanner, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1150, 100));

        painelTab.setBackground(new java.awt.Color(255, 255, 255));
        painelTab.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        painelCategorias.setBackground(new java.awt.Color(255, 255, 255));

        btnRestau.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnRestau.setText("RESTAURANTES");
        btnRestau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestauActionPerformed(evt);
            }
        });

        btnCinema.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnCinema.setText("CINEMAS");
        btnCinema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCinemaActionPerformed(evt);
            }
        });

        btnEventos.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnEventos.setText("EVENTOS");
        btnEventos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEventosActionPerformed(evt);
            }
        });

        btnRoles.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnRoles.setText("ROLES");
        btnRoles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRolesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelCategoriasLayout = new javax.swing.GroupLayout(painelCategorias);
        painelCategorias.setLayout(painelCategoriasLayout);
        painelCategoriasLayout.setHorizontalGroup(
            painelCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCategoriasLayout.createSequentialGroup()
                .addGap(322, 322, 322)
                .addGroup(painelCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelCategoriasLayout.createSequentialGroup()
                        .addComponent(btnRestau, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(110, 110, 110)
                        .addComponent(btnRoles, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelCategoriasLayout.createSequentialGroup()
                        .addComponent(btnCinema, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(110, 110, 110)
                        .addComponent(btnEventos, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(347, Short.MAX_VALUE))
        );
        painelCategoriasLayout.setVerticalGroup(
            painelCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCategoriasLayout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addGroup(painelCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRestau, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRoles, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(painelCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCinema, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEventos, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(173, Short.MAX_VALUE))
        );

        painelTab.addTab("tab1", painelCategorias);

        painelLocalizacao.setBackground(new java.awt.Color(255, 255, 255));

        btnZO.setText("ZONA OESTE");
        btnZO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnZOActionPerformed(evt);
            }
        });

        btnLeste.setText("ZONA LESTA");
        btnLeste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLesteActionPerformed(evt);
            }
        });

        btnSul.setText("ZONA SUL");
        btnSul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSulActionPerformed(evt);
            }
        });

        btnZN.setText("ZONA NORTE");
        btnZN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnZNActionPerformed(evt);
            }
        });

        btnCentro.setText("CENTRO SP");
        btnCentro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCentroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelLocalizacaoLayout = new javax.swing.GroupLayout(painelLocalizacao);
        painelLocalizacao.setLayout(painelLocalizacaoLayout);
        painelLocalizacaoLayout.setHorizontalGroup(
            painelLocalizacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLocalizacaoLayout.createSequentialGroup()
                .addGap(255, 255, 255)
                .addGroup(painelLocalizacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(painelLocalizacaoLayout.createSequentialGroup()
                        .addGap(275, 275, 275)
                        .addGroup(painelLocalizacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnZN, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSul, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(painelLocalizacaoLayout.createSequentialGroup()
                        .addComponent(btnZO, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCentro, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(152, 152, 152)
                .addComponent(btnLeste, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(261, Short.MAX_VALUE))
        );
        painelLocalizacaoLayout.setVerticalGroup(
            painelLocalizacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLocalizacaoLayout.createSequentialGroup()
                .addComponent(btnZN, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addGroup(painelLocalizacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCentro, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnZO, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLeste, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 135, Short.MAX_VALUE)
                .addComponent(btnSul, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        painelTab.addTab("tab2", painelLocalizacao);

        painelPraiaCateg.setBackground(new java.awt.Color(255, 255, 255));
        painelPraiaCateg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnLitoralSul.setText("LITORAL SUL");
        btnLitoralSul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLitoralSulActionPerformed(evt);
            }
        });
        painelPraiaCateg.add(btnLitoralSul, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 180, 140));

        btnLitoralNorte.setText("LITORAL NORTE");
        painelPraiaCateg.add(btnLitoralNorte, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 150, 180, 140));

        painelTab.addTab("tab4", painelPraiaCateg);

        panelPrincipal.add(painelTab, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, 190, 1200, 480));

        btnVoltar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-back-arrow-30.png"))); // NOI18N
        btnVoltar.setText("VOLTAR");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        panelPrincipal.add(btnVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 680, 150, 60));

        btnAdmin.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/setting.png"))); // NOI18N
        btnAdmin.setText("ADMIN");
        btnAdmin.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminActionPerformed(evt);
            }
        });
        panelPrincipal.add(btnAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 680, 150, 60));

        getContentPane().add(panelPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1150, 760));

        setSize(new java.awt.Dimension(1166, 803));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRestauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestauActionPerformed
        painelTab.setSelectedIndex(1);
        lblSubTitulo.setText("EM QUAL LOCALIZAÇÃO: ");
        categoriaSelecionado = "RESTAURANTES";
    }//GEN-LAST:event_btnRestauActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
       
        int index = painelTab.getSelectedIndex(); // Pega index do painel
        if (index == -1){      
        } else {
            switch (index){ // verificar se o index do painel for 0 1 ou 2 
                case 0:
                    painelTab.setSelectedIndex(index); 
                    lblSubTitulo.setText("CATEGORIAS:");               
                    limpaVariaveis();
                    break;
                case 1:
                    painelTab.setSelectedIndex(index - 1); 
                    lblSubTitulo.setText("EM QUAL LOCALIZAÇÃO:");
                    limpaVariaveis();
                    break;
                case 2:
                    painelTab.setSelectedIndex(0);
                    lblSubTitulo.setText("CATEGORIAS:");
                    limpaVariaveis();
                    break;
            }    
        }
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnRolesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRolesActionPerformed
        painelTab.setSelectedIndex(1);
        lblSubTitulo.setText("EM QUAL LOCALIZAÇÃO: ");
        categoriaSelecionado = "ROLES";
    }//GEN-LAST:event_btnRolesActionPerformed

    private void btnCinemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCinemaActionPerformed
        painelTab.setSelectedIndex(1);
        lblSubTitulo.setText("EM QUAL LOCALIZAÇÃO: ");
        categoriaSelecionado = "CINEMAS";
    }//GEN-LAST:event_btnCinemaActionPerformed

    private void btnEventosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEventosActionPerformed
        painelTab.setSelectedIndex(1);
        lblSubTitulo.setText("EM QUAL LOCALIZAÇÃO: ");
        categoriaSelecionado = "EVENTOS";
    }//GEN-LAST:event_btnEventosActionPerformed

    private void btnLitoralSulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLitoralSulActionPerformed
        
    }//GEN-LAST:event_btnLitoralSulActionPerformed

    private void btnZNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnZNActionPerformed
        zonaSelecionada = "ZN";
        mostraTelaApresentação();    
    }//GEN-LAST:event_btnZNActionPerformed

    private void btnZOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnZOActionPerformed
        zonaSelecionada = "ZO";
        mostraTelaApresentação();
    }//GEN-LAST:event_btnZOActionPerformed

    private void btnCentroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCentroActionPerformed
        zonaSelecionada = "CENTRO";
        mostraTelaApresentação();
        
    }//GEN-LAST:event_btnCentroActionPerformed

    private void btnLesteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLesteActionPerformed
        zonaSelecionada = "ZL";
        mostraTelaApresentação();
    }//GEN-LAST:event_btnLesteActionPerformed

    private void btnSulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSulActionPerformed
        zonaSelecionada = "ZS";
        mostraTelaApresentação();
        
       
    }//GEN-LAST:event_btnSulActionPerformed

    private void btnAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminActionPerformed
        FmrControleLugares control = new FmrControleLugares();
        control.setVisible(true);
    }//GEN-LAST:event_btnAdminActionPerformed

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
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
    }
    
    
    // Mostrar lugar que o Usuário esta buscando (Tela de Apresentação)
    public void mostraTelaApresentação(){
        
        fmrApresenta.recebeLugareZonaSelectionado(zonaSelecionada, categoriaSelecionado);
        fmrApresenta.setVisible(true);
        this.hide();
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdmin;
    private javax.swing.JButton btnCentro;
    private javax.swing.JButton btnCinema;
    private javax.swing.JButton btnEventos;
    private javax.swing.JButton btnLeste;
    private javax.swing.JButton btnLitoralNorte;
    private javax.swing.JButton btnLitoralSul;
    private javax.swing.JButton btnRestau;
    private javax.swing.JButton btnRoles;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSul;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JButton btnZN;
    private javax.swing.JButton btnZO;
    private javax.swing.JLabel lblBanner;
    private javax.swing.JLabel lblSubTitulo;
    private javax.swing.JPanel painelCategorias;
    private javax.swing.JPanel painelLocalizacao;
    private javax.swing.JPanel painelPraiaCateg;
    private javax.swing.JTabbedPane painelTab;
    private javax.swing.JPanel panelBanner;
    private javax.swing.JPanel panelPrincipal;
    // End of variables declaration//GEN-END:variables

}
