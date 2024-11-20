
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author milanez.9985
 */
public class ContaBancaria extends javax.swing.JFrame {
    private Cliente cliente;
    private Conta conta;
    private Agencia agencia;
    /**
     * Creates new form ContaBancária
     */
    public ContaBancaria() {
        initComponents();

        agencia = new Agencia("1234", "MazeBank");
        conta = new Conta("1234567890", 500);
        cliente = new Cliente("Michael De Santa", conta);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        txtValor = new javax.swing.JTextField();
        btnSac = new javax.swing.JButton();
        btnDep = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtValorCen = new javax.swing.JTextField();
        tgbView = new javax.swing.JToggleButton();
        jLabel3 = new javax.swing.JLabel();
        btnExt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Insira um valor :");

        txtValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorActionPerformed(evt);
            }
        });

        btnSac.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSac.setText("Sacar");
        btnSac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSacActionPerformed(evt);
            }
        });

        btnDep.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnDep.setText("Depositar");
        btnDep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDepActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 0, 51));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Conta Bancária");

        txtValorCen.setEditable(false);
        txtValorCen.setText("••••••••••••••••");
        txtValorCen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorCenActionPerformed(evt);
            }
        });

        tgbView.setText("👁️");
        tgbView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tgbViewActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Seu saldo atual :");

        btnExt.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnExt.setText("Ver extrato");
        btnExt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tgbView)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtValorCen, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnExt, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                        .addComponent(btnExt))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tgbView, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtValorCen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnSac)
                            .addGap(18, 18, 18)
                            .addComponent(btnDep))
                        .addComponent(txtValor)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(7, 7, 7)
                .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSac)
                    .addComponent(btnDep))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorActionPerformed

    private void btnSacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSacActionPerformed
        double valor = Double.parseDouble(txtValor.getText());
        if (cliente.getConta().sacar(valor)) {
            JOptionPane.showMessageDialog(this, "Saque realizado com sucesso!");
            txtValor.setText("");
        } else {
            JOptionPane.showMessageDialog(this, "! Saque negado !\n Acima do limite");
            txtValor.setText("");
        }
        if(tgbView.isSelected()){
            tgbView.setSelected(false);
            txtValorCen.setText("••••••••••••••••");
        }
    }//GEN-LAST:event_btnSacActionPerformed

    private void btnDepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDepActionPerformed
        double valor = Double.parseDouble(txtValor.getText());
        if (cliente.getConta().depositar(valor)) {
            JOptionPane.showMessageDialog(this, "Depósito realizado com sucesso!");
            txtValor.setText("");
        } else {
            JOptionPane.showMessageDialog(this, "Erro no depósito");
            txtValor.setText("");
        }
        if(tgbView.isSelected()){
            tgbView.setSelected(false);
            txtValorCen.setText("••••••••••••••••");
        }
    }//GEN-LAST:event_btnDepActionPerformed

    private void btnExtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExtActionPerformed
        String nomeCliente = cliente.getNome();
        String nomeAgencia = agencia.getNome();
        String numeroAgencia = agencia.getNumero();
        String numeroConta = cliente.getConta().getNumeroConta();
        double saldoAtual = cliente.getConta().getSaldo();
        double limite = cliente.getConta().getLimite();
        
        String msgExtrato = "EXTRATO:\n\n"
                           + "Cliente: " + nomeCliente + "\n"
                           + "Agência: " + nomeAgencia + " (Número: " + numeroAgencia + ")\n"
                           + "Conta: " + numeroConta + "\n"
                           + "Saldo Atual: R$ " + saldoAtual + "\n"
                           + "Limite: R$ " + limite;
        
        JOptionPane.showMessageDialog(this, msgExtrato, "Extrato Bancário", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnExtActionPerformed

    private void tgbViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tgbViewActionPerformed
        double saldoAtual = cliente.getConta().getSaldo();
        
        if(tgbView.isSelected()){
            txtValorCen.setText("R$"+saldoAtual);
        }else{
            txtValorCen.setText("••••••••••••••••");
        }
    }//GEN-LAST:event_tgbViewActionPerformed

    private void txtValorCenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorCenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorCenActionPerformed

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
            java.util.logging.Logger.getLogger(ContaBancaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ContaBancaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ContaBancaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ContaBancaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ContaBancaria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDep;
    private javax.swing.JButton btnExt;
    private javax.swing.JButton btnSac;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToggleButton tgbView;
    private javax.swing.JTextField txtValor;
    private javax.swing.JTextField txtValorCen;
    // End of variables declaration//GEN-END:variables
}
