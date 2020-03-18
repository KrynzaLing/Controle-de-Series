/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import BancoDeDados.Select_Banco;
import Classes.Categoria;
import Classes.Series;
import Classes.Sessao;
import Controle.Acction;
import Controle.Convert;
import java.awt.Button;
import java.awt.ComponentOrientation;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author bissm
 */
public class tela_Principal extends javax.swing.JFrame {

    public tela_Principal() {
        initComponents();
        iniciar();
        imagembutton();
        loadCat();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pn_Gerenciar = new javax.swing.JPanel();
        bt_gerencLogin = new javax.swing.JButton();
        bt_geren_ser = new javax.swing.JButton();
        pn_Favorito = new javax.swing.JPanel();
        btn_teste = new javax.swing.JButton();
        bt_teste = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        pn_Categorias = new javax.swing.JPanel();
        bt_Login = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        pn_Principal = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bt_gerencLogin.setText("G Login");
        bt_gerencLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_gerencLoginActionPerformed(evt);
            }
        });

        bt_geren_ser.setText("GSerie");
        bt_geren_ser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_geren_serActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pn_GerenciarLayout = new javax.swing.GroupLayout(pn_Gerenciar);
        pn_Gerenciar.setLayout(pn_GerenciarLayout);
        pn_GerenciarLayout.setHorizontalGroup(
            pn_GerenciarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_GerenciarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_GerenciarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt_gerencLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_geren_ser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        pn_GerenciarLayout.setVerticalGroup(
            pn_GerenciarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_GerenciarLayout.createSequentialGroup()
                .addComponent(bt_geren_ser, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(bt_gerencLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btn_teste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_testeActionPerformed(evt);
            }
        });

        bt_teste.setText("teste img");
        bt_teste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_testeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pn_FavoritoLayout = new javax.swing.GroupLayout(pn_Favorito);
        pn_Favorito.setLayout(pn_FavoritoLayout);
        pn_FavoritoLayout.setHorizontalGroup(
            pn_FavoritoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_FavoritoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_teste, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_FavoritoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(bt_teste))
        );
        pn_FavoritoLayout.setVerticalGroup(
            pn_FavoritoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_FavoritoLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(btn_teste, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bt_teste)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 61, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 29, Short.MAX_VALUE)
        );

        jScrollPane1.setToolTipText("");
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        javax.swing.GroupLayout pn_CategoriasLayout = new javax.swing.GroupLayout(pn_Categorias);
        pn_Categorias.setLayout(pn_CategoriasLayout);
        pn_CategoriasLayout.setHorizontalGroup(
            pn_CategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 492, Short.MAX_VALUE)
        );
        pn_CategoriasLayout.setVerticalGroup(
            pn_CategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(pn_Categorias);

        bt_Login.setText("Login");
        bt_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_LoginActionPerformed(evt);
            }
        });

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pn_PrincipalLayout = new javax.swing.GroupLayout(pn_Principal);
        pn_Principal.setLayout(pn_PrincipalLayout);
        pn_PrincipalLayout.setHorizontalGroup(
            pn_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_PrincipalLayout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(jButton1)
                .addContainerGap(327, Short.MAX_VALUE))
        );
        pn_PrincipalLayout.setVerticalGroup(
            pn_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_PrincipalLayout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(jButton1)
                .addContainerGap(104, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportView(pn_Principal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt_Login)))
                    .addComponent(pn_Favorito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pn_Gerenciar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(bt_Login, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pn_Gerenciar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pn_Favorito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_geren_serActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_geren_serActionPerformed
        tela_GerenciarSerie i = new tela_GerenciarSerie();
        i.setVisible(true);
    }//GEN-LAST:event_bt_geren_serActionPerformed

    private void bt_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_LoginActionPerformed
        tela_Logar login = new tela_Logar();
        login.setVisible(true);
    }//GEN-LAST:event_bt_LoginActionPerformed

    private void bt_gerencLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_gerencLoginActionPerformed
        tela_GerencLogin gL = new tela_GerencLogin();
        gL.setVisible(true);
    }//GEN-LAST:event_bt_gerencLoginActionPerformed

    private void btn_testeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_testeActionPerformed

    }//GEN-LAST:event_btn_testeActionPerformed

    private void bt_testeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_testeActionPerformed
        
        String URL = Convert.caminhoImg();
        byte[] cIpB = Convert.converterImagemParaByte(URL);//salvar em bd
        byte[] x = null ;//Byte vindo do banco 
        ImageIcon imgI = Convert.getImagem(cIpB);
              
        imgI.setImage(imgI.getImage().getScaledInstance(btn_teste.getWidth(), btn_teste.getHeight(), 1));
        btn_teste.setIcon(imgI);
        
    }//GEN-LAST:event_bt_testeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        tela_Serie s = new tela_Serie();
        s.setVisible(true);
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
            java.util.logging.Logger.getLogger(tela_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tela_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tela_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tela_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tela_Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_Login;
    private javax.swing.JButton bt_geren_ser;
    private javax.swing.JButton bt_gerencLogin;
    private javax.swing.JButton bt_teste;
    private javax.swing.JButton btn_teste;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel pn_Categorias;
    private javax.swing.JPanel pn_Favorito;
    private javax.swing.JPanel pn_Gerenciar;
    private javax.swing.JPanel pn_Principal;
    // End of variables declaration//GEN-END:variables

    private void iniciar() {
        Sessao.setId(0);
        Sessao.setPrin(this);
        atualizar_Tela();
    }

    public void atualizar_Tela() {
        if (Sessao.getId() == 0) {
            //Deslogado
            // bt_Categoria.setEnabled(false);
            bt_geren_ser.setEnabled(false);
            bt_gerencLogin.setEnabled(false);
            Sessao.setUse(null);
            Sessao.setLogin(null);

        } else {
            //logado
            //bt_Categoria.setEnabled(true);
            bt_geren_ser.setEnabled(true);
            bt_gerencLogin.setEnabled(true);
        }

    }

    private void imagembutton() {

        String url = "/Imagem/x.jpg";
        URL x = this.getClass().getResource(url);
        ImageIcon img = new ImageIcon(x);
        img.setImage(img.getImage().getScaledInstance(btn_teste.getWidth(), btn_teste.getHeight(), 1));
        btn_teste.setIcon(img);

    }

    private void loadCat() {
        Select_Banco sel = new Select_Banco();
        List<Categoria> listCat = new ArrayList();
        listCat = sel.Select_Categoria();
        FlowLayout experimentLayout = new FlowLayout();
        pn_Categorias.setLayout(experimentLayout);
        pn_Categorias.setComponentOrientation(
        ComponentOrientation.RIGHT_TO_LEFT);
        pn_Categorias.setVerifyInputWhenFocusTarget(rootPaneCheckingEnabled);
        int i =1;
        for (i = 1; i < listCat.size(); i++) {
            String nome = listCat.get(i).nome_Categoria;
            int id = listCat.get(i).id;
            JButton btn = new JButton(nome);
            getContentPane().add(btn);
            btn.setName(nome);
            btn.setText(nome);
            btn.setBounds(10, 22 * i, 80, 20);
            pn_Categorias.add(btn);
            pn_Categorias.setLayout(new FlowLayout());
                    btn.addActionListener(new ActionListener() { 
                      public void actionPerformed(java.awt.event.ActionEvent evt) {
                         List<Categoria> lista = new ArrayList();
                         List<Series> listaS = new ArrayList();
                         String nome = btn.getName();
                         System.out.println(nome); 
                         Select_Banco sec = new Select_Banco();
                         lista = sec.Select_idCategoria(nome); 
                         int id = lista.get(0).id;
                         listaS = sec.Select_Serie_Categorias(id);
                            FlowLayout experimentLayout = new FlowLayout();
                            pn_Principal.setLayout(experimentLayout);
                            pn_Principal.setComponentOrientation(
                            ComponentOrientation.RIGHT_TO_LEFT);
                            pn_Principal.setVerifyInputWhenFocusTarget(rootPaneCheckingEnabled);
                           // pn_Principal.removeAll();
                                for (int i = 0; i < listaS.size(); i++) {
                                String nomeS = listaS.get(i).nome;
                                int idS = listaS.get(i).id;
                                JButton btnS = new JButton(nomeS);
                                getContentPane().add(btn);
                                btnS.setName(nomeS);
                                btnS.setText(nomeS);
                                btnS.setBounds(5, 120 * i, 80, 120);
                                pn_Principal.add(btnS);
                                    Acction a = new Acction();
                                    a.botao(btnS);
                                // Dimencionar botão
                                //set img
                                //
                                ;}
                                pn_Principal.repaint();
                         
                      }

                
            });                    

        }
    }            

}


