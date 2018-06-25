/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author otavi
 */
public class FrmMenu extends javax.swing.JFrame {

    /**
     * Creates new form FrmMenu
     */
    public FrmMenu() {
        initComponents();
        ActionListener tmrHoraAction = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy - HH:mm:ss");
                lblData.setText(sdf.format(new Date()));
            }
        };
        Timer tmrHora = new Timer(1000, tmrHoraAction);
        tmrHora.start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        lblData = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuArquivo = new javax.swing.JMenu();
        itemCliente = new javax.swing.JMenuItem();
        itemProduto = new javax.swing.JMenuItem();
        itemVenda = new javax.swing.JMenuItem();
        itemSair = new javax.swing.JMenuItem();
        menuRelatório = new javax.swing.JMenu();
        itemRptCliente = new javax.swing.JMenuItem();
        itemRptVenda = new javax.swing.JMenuItem();
        itemRptProdutos = new javax.swing.JMenuItem();
        menuAjuda = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);
        jToolBar1.setFocusable(false);

        lblData.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jToolBar1.add(lblData);

        menuArquivo.setText("Arquivo");

        itemCliente.setText("Clientes");
        itemCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemClienteActionPerformed(evt);
            }
        });
        menuArquivo.add(itemCliente);

        itemProduto.setText("Produto");
        itemProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemProdutoActionPerformed(evt);
            }
        });
        menuArquivo.add(itemProduto);

        itemVenda.setText("Venda");
        itemVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemVendaActionPerformed(evt);
            }
        });
        menuArquivo.add(itemVenda);

        itemSair.setText("Sair");
        itemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemSairActionPerformed(evt);
            }
        });
        menuArquivo.add(itemSair);

        jMenuBar1.add(menuArquivo);

        menuRelatório.setText("Relatório");

        itemRptCliente.setText("Relatório de Cliente");
        itemRptCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemRptClienteActionPerformed(evt);
            }
        });
        menuRelatório.add(itemRptCliente);

        itemRptVenda.setText("Relatório de Vendas");
        itemRptVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemRptVendaActionPerformed(evt);
            }
        });
        menuRelatório.add(itemRptVenda);

        itemRptProdutos.setText("Relatório de Produtos");
        itemRptProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemRptProdutosActionPerformed(evt);
            }
        });
        menuRelatório.add(itemRptProdutos);

        jMenuBar1.add(menuRelatório);

        menuAjuda.setText("Ajuda");
        jMenuBar1.add(menuAjuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(254, Short.MAX_VALUE)
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemClienteActionPerformed
        FrmClientes frmClientes = new FrmClientes();
        frmClientes.setVisible(true);
    }//GEN-LAST:event_itemClienteActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        Object[] options = {"Sim", "Não"};
        if(JOptionPane.showOptionDialog(null, "Deseja mesmo sair?", "Sair", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[1]) == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_formWindowClosing

    private void itemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemSairActionPerformed
        formWindowClosing(null);
    }//GEN-LAST:event_itemSairActionPerformed

    private void itemProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemProdutoActionPerformed
        FrmProdutos frmProdutos = new FrmProdutos();
        frmProdutos.setVisible(true);
    }//GEN-LAST:event_itemProdutoActionPerformed

    private void itemVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemVendaActionPerformed
        FrmVenda frmVenda;
        try {
            frmVenda = new FrmVenda();
        frmVenda.setVisible(true);
        } catch (ParseException ex) {
            Logger.getLogger(FrmMenu.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(FrmMenu.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FrmMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_itemVendaActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        setExtendedState(FrmMenu.MAXIMIZED_BOTH);
    }//GEN-LAST:event_formWindowOpened

    private void itemRptClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemRptClienteActionPerformed
        try {
            VisualizaRpt.GeraRelatorio("rptClientes.jasper", null, "Relatório de Clientes");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro: " + ex);
        }
    }//GEN-LAST:event_itemRptClienteActionPerformed

    private void itemRptVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemRptVendaActionPerformed
       try {
            VisualizaRpt.GeraRelatorio("rptVendas.jasper", null, "Relatório de Vendas");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro: " + ex);
        }
    }//GEN-LAST:event_itemRptVendaActionPerformed

    private void itemRptProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemRptProdutosActionPerformed
        try {
            VisualizaRpt.GeraRelatorio("rptProdutos.jasper", null, "Relatório de Produtos");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro: " + ex);
        }
    }//GEN-LAST:event_itemRptProdutosActionPerformed

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
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem itemCliente;
    private javax.swing.JMenuItem itemProduto;
    private javax.swing.JMenuItem itemRptCliente;
    private javax.swing.JMenuItem itemRptProdutos;
    private javax.swing.JMenuItem itemRptVenda;
    private javax.swing.JMenuItem itemSair;
    private javax.swing.JMenuItem itemVenda;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lblData;
    private javax.swing.JMenu menuAjuda;
    private javax.swing.JMenu menuArquivo;
    private javax.swing.JMenu menuRelatório;
    // End of variables declaration//GEN-END:variables
}
