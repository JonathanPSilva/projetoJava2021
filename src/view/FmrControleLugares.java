package view;

import dao.Conexao;
import entidade.Lugar;
import java.awt.Toolkit;
import static java.time.Clock.system;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import util.TableModel;

public class FmrControleLugares extends javax.swing.JFrame {
    public FmrControleLugares() {
        initComponents();
        refreshTable();
    }

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
            java.util.logging.Logger.getLogger(FmrControleLugares.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FmrControleLugares.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FmrControleLugares.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FmrControleLugares.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FmrControleLugares().setVisible(true);
            }
        });   
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        btnSair = new javax.swing.JButton();
        panelBanner = new javax.swing.JPanel();
        lblBanner = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JButton();
        txtDescricao = new javax.swing.JTextField();
        txtEndereco = new javax.swing.JTextField();
        txtSite = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cboZona = new javax.swing.JComboBox<>();
        painelImg = new javax.swing.JPanel();
        lblImagem = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnNovo = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cboCategoria = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        panelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSair.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-exit-30.png"))); // NOI18N
        btnSair.setText("SAIR");
        btnSair.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        panelPrincipal.add(btnSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(1320, 820, 150, 60));

        panelBanner.setBackground(new java.awt.Color(102, 102, 255));

        lblBanner.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lblBanner.setForeground(new java.awt.Color(255, 255, 255));
        lblBanner.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBanner.setText("CONTROLE DE LUGARES");

        javax.swing.GroupLayout panelBannerLayout = new javax.swing.GroupLayout(panelBanner);
        panelBanner.setLayout(panelBannerLayout);
        panelBannerLayout.setHorizontalGroup(
            panelBannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBannerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblBanner, javax.swing.GroupLayout.DEFAULT_SIZE, 1498, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelBannerLayout.setVerticalGroup(
            panelBannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBannerLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(lblBanner)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        panelPrincipal.add(panelBanner, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1510, 100));

        btnVoltar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-back-arrow-30.png"))); // NOI18N
        btnVoltar.setText("VOLTAR");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        panelPrincipal.add(btnVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 820, 150, 60));

        txtDescricao.setEditable(false);
        panelPrincipal.add(txtDescricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 820, 60));

        txtEndereco.setEditable(false);
        panelPrincipal.add(txtEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 420, 30));

        txtSite.setEditable(false);
        panelPrincipal.add(txtSite, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 200, 360, 30));

        jLabel1.setText("Descrição do Lugar");
        panelPrincipal.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, -1, 20));

        jLabel2.setText("Endereço");
        panelPrincipal.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, -1, -1));

        jLabel3.setText("LOCALIZAÇÃO");
        panelPrincipal.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 120, -1, -1));

        jLabel4.setText("Site");
        panelPrincipal.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 180, -1, -1));

        cboZona.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CENTRO", "ZL", "ZN", "ZO", "ZS" }));
        cboZona.setEnabled(false);
        panelPrincipal.add(cboZona, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 140, 130, 30));

        lblImagem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImagem.setText("Se tudo der certo, a imagem vai ficar aqui aqui ");

        javax.swing.GroupLayout painelImgLayout = new javax.swing.GroupLayout(painelImg);
        painelImg.setLayout(painelImgLayout);
        painelImgLayout.setHorizontalGroup(
            painelImgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelImgLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblImagem, javax.swing.GroupLayout.DEFAULT_SIZE, 508, Short.MAX_VALUE)
                .addContainerGap())
        );
        painelImgLayout.setVerticalGroup(
            painelImgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelImgLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblImagem, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelPrincipal.add(painelImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 120, 520, 290));

        btnNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/new.png"))); // NOI18N
        btnNovo.setText("NOVO");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/update.png"))); // NOI18N
        btnAlterar.setText("ALTERAR");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/delete.png"))); // NOI18N
        btnExcluir.setText("EXCLUIR");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnAtualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/atualizar.png"))); // NOI18N
        btnAtualizar.setText("ATUALIZAR");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAtualizar, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnNovo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAlterar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(btnAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        panelPrincipal.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1320, 420, 150, 390));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "idLugar", "Nome", "Endereço", "Descrição", "Categoria", "Zona", "Site"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        panelPrincipal.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 420, 1240, 390));

        jLabel6.setText("Nome do Lugar");
        panelPrincipal.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, -1, 20));

        txtNome.setEditable(false);
        panelPrincipal.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 420, 30));

        jLabel5.setText("CATEGORIA");
        panelPrincipal.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 120, -1, -1));

        cboCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "RESTAURANTES", "ROLES", "CINEMAS", "EVENTOS" }));
        cboCategoria.setEnabled(false);
        panelPrincipal.add(cboCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 140, 180, 30));

        getContentPane().add(panelPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1510, 890));

        setSize(new java.awt.Dimension(1527, 929));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        FmrCadLugar cadLugar = new FmrCadLugar(this, true);
        cadLugar.setVisible(true);
        cadLugar.pack();
        cadLugar.setDefaultCloseOperation(FmrCadLugar.DISPOSE_ON_CLOSE);
        
        refreshTable(); // atualiza a tabela depois de fechar 

    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        int idSelecionado = -1;
        idSelecionado = jTable1.getSelectedRow();
        if (idSelecionado >= 0){
            
           FmrCadLugar alteraLugar = new FmrCadLugar(this, true);
           Lugar idlugar = new Lugar();
           
           idSelecionado = Integer.parseInt(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString()); // Converte o Valor do tabela para inteiro
           idlugar.setIdLugar(idSelecionado); 
        
           alteraLugar.pegaID(idlugar);// passar esse ID pro formulario de alterar
           alteraLugar.setVisible(true);
           alteraLugar.pack();
           alteraLugar.setDefaultCloseOperation(FmrCadLugar.DISPOSE_ON_CLOSE);
           refreshTable();
        
        }else {
            JOptionPane.showMessageDialog(this, "Selecione um registro!");
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        refreshTable();
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        if (evt.getClickCount()==1) {
            //preencheJTexts(jTable1.getSelectedRow());
            preencherCampos();
        } 
    }//GEN-LAST:event_jTable1MouseClicked

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        int idSelecionado = -1;
        idSelecionado = jTable1.getSelectedRow();
        if (idSelecionado >= 0){    
            if (JOptionPane.showConfirmDialog(this, "Tem certeza que deseja excluir o Lugar selectionado ?") == JOptionPane.YES_OPTION){
                idSelecionado = Integer.parseInt(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());
                
                Lugar lugar = new Lugar();
                lugar.setIdLugar(idSelecionado);

                Conexao con = new Conexao();
                con.conectarDB();
                Boolean retornoExcluir = con.excluir(lugar);

                if (retornoExcluir){
                    refreshTable();
                    JOptionPane.showMessageDialog(this, "Registro excluído com Sucesso !");                    
                } else {
                    JOptionPane.showMessageDialog(this, "Erro ao salvar no Banco de Dados !");
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Selecione um registro!");
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    // Metodo para preencher os JTexts
    public void preencherCampos (){
        
        txtNome.setText             (jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString());
        txtEndereco.setText         (jTable1.getValueAt(jTable1.getSelectedRow(), 2).toString());
        txtDescricao.setText        (jTable1.getValueAt(jTable1.getSelectedRow(), 3).toString());
        cboZona.setSelectedItem     (jTable1.getValueAt(jTable1.getSelectedRow(), 4).toString());
        cboCategoria.setSelectedItem(jTable1.getValueAt(jTable1.getSelectedRow(), 5).toString());
        txtSite.setText             (jTable1.getValueAt(jTable1.getSelectedRow(), 6).toString());
        
        
    }

    // Metodo que atualiza a table
    public void refreshTable () {
        
        DefaultTableModel dm = (DefaultTableModel) jTable1.getModel();
        dm.setNumRows(0);
        Conexao con = new Conexao();
        con.conectarDB();
        
        for (Lugar l: con.listarLugares()){
            dm.addRow(new Object[] {
                l.getIdLugar(),
                l.getNome(),
                l.getEndereco(),
                l.getDescricao(),
                l.getCategoria(),
                l.getZona(),
                l.getSite(),
                l.getImg()
            }) ;
        }
        
        jTable1.getColumnModel().getColumn(0).setResizable(false);
        jTable1.getColumnModel().getColumn(1).setResizable(false);
        jTable1.getColumnModel().getColumn(2).setResizable(false);
        jTable1.getColumnModel().getColumn(3).setResizable(false);
        jTable1.getColumnModel().getColumn(4).setResizable(false);
        jTable1.getColumnModel().getColumn(5).setResizable(false);
        jTable1.getColumnModel().getColumn(6).setResizable(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JComboBox<String> cboCategoria;
    private javax.swing.JComboBox<String> cboZona;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblBanner;
    private javax.swing.JLabel lblImagem;
    private javax.swing.JPanel painelImg;
    private javax.swing.JPanel panelBanner;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtSite;
    // End of variables declaration//GEN-END:variables

}
