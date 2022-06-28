package View;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import modelBeans.BeansAgendamento;
import modelBeans.ModeloTabela;
import modelConection.ConexaoBD;
import modelDao.DaoAgendamento;

/**
 *
 * @author daniel
 */
public class Agendados extends javax.swing.JInternalFrame {

    ConexaoBD conex = new ConexaoBD();
    BeansAgendamento agenda = new BeansAgendamento();
    BeansAgendamento agen = new BeansAgendamento();
    DaoAgendamento dao = new DaoAgendamento();
    
    String status;
    
    public Agendados() {
        initComponents();
        status = "Aguardando..."; 
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jSlider1 = new javax.swing.JSlider();
        jpCabecalho = new javax.swing.JPanel();
        lbCabecalho = new javax.swing.JLabel();
        jButtonSair = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableViagens = new javax.swing.JTable();
        jButtonFinalizar = new javax.swing.JButton();
        jButtonDigitar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
        setMaximumSize(new java.awt.Dimension(959, 553));
        setMinimumSize(new java.awt.Dimension(959, 553));
        setPreferredSize(new java.awt.Dimension(853, 514));
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jpCabecalho.setBackground(new java.awt.Color(17, 128, 216));
        jpCabecalho.setForeground(new java.awt.Color(255, 255, 255));
        jpCabecalho.setMaximumSize(new java.awt.Dimension(853, 29));
        jpCabecalho.setMinimumSize(new java.awt.Dimension(853, 29));
        jpCabecalho.setPreferredSize(new java.awt.Dimension(853, 29));

        lbCabecalho.setBackground(new java.awt.Color(17, 128, 216));
        lbCabecalho.setForeground(new java.awt.Color(255, 255, 255));
        lbCabecalho.setText("Pacientes Agendados");
        lbCabecalho.setMaximumSize(new java.awt.Dimension(853, 29));
        lbCabecalho.setMinimumSize(new java.awt.Dimension(853, 29));
        lbCabecalho.setPreferredSize(new java.awt.Dimension(853, 29));

        jButtonSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sair.png"))); // NOI18N
        jButtonSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonSairMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jpCabecalhoLayout = new javax.swing.GroupLayout(jpCabecalho);
        jpCabecalho.setLayout(jpCabecalhoLayout);
        jpCabecalhoLayout.setHorizontalGroup(
            jpCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCabecalhoLayout.createSequentialGroup()
                .addComponent(lbCabecalho, javax.swing.GroupLayout.PREFERRED_SIZE, 762, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonSair)
                .addGap(0, 5, Short.MAX_VALUE))
        );
        jpCabecalhoLayout.setVerticalGroup(
            jpCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButtonSair, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(lbCabecalho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jTableViagens.setBorder(new javax.swing.border.MatteBorder(null));
        jTableViagens.setFont(new java.awt.Font("Liberation Sans", 1, 9)); // NOI18N
        jTableViagens.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableViagens.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableViagensMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableViagens);

        jButtonFinalizar.setBackground(new java.awt.Color(0, 255, 0));
        jButtonFinalizar.setFont(new java.awt.Font("Fira Sans", 1, 18)); // NOI18N
        jButtonFinalizar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonFinalizar.setText("Finalizar Agenamento");
        jButtonFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFinalizarActionPerformed(evt);
            }
        });

        jButtonDigitar.setBackground(new java.awt.Color(17, 128, 216));
        jButtonDigitar.setFont(new java.awt.Font("Fira Sans", 1, 18)); // NOI18N
        jButtonDigitar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonDigitar.setText("Atualizar");
        jButtonDigitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDigitarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jScrollPane2)
                .addGap(6, 6, 6))
            .addComponent(jpCabecalho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonFinalizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonDigitar, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpCabecalho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonDigitar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonFinalizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    //TEXTO DO CABECARIO
    private String cabecario = "Pacientes Agendados";
    

    public String getCabecario() {
        return cabecario;
    }

    public void setCabecario(String cabecario) {
        this.cabecario = cabecario;
    }
     
    //INTERFACE INICIA
    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        //Colocar a variavel cabecario no jlabel
        lbCabecalho.setText(cabecario);
    }//GEN-LAST:event_formInternalFrameOpened
      
    //FORM EXIBIDO
    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        //Colocar a variavel cabecario no jlabel
        lbCabecalho.setText(cabecario);
    }//GEN-LAST:event_formComponentShown
    
    private void jTableViagensMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableViagensMouseClicked
        String agenda_cod = ""+jTableViagens.getValueAt(jTableViagens.getSelectedRow(), 0);
        conex.conexao();
        conex.executaSql("select * from agenda where agenda_cod='"+agenda_cod+"'");
        try {
            conex.rs.first();
            agen.setStatus("Viajou");
            agen.setAgendaCod(conex.rs.getInt("agenda_cod"));
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao selecionar dados" + ex);
        }
        conex.desconecta(); 
    }//GEN-LAST:event_jTableViagensMouseClicked

    private void jButtonFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFinalizarActionPerformed
        dao.Alterar(agen);
        preencherTabela("select * from agenda inner join paciente on agenda_codpac = paci_codigo inner join hospital on agenda_codhosp = cod_hosp where agenda_status = '"+status+"' order by agenda_data");
    }//GEN-LAST:event_jButtonFinalizarActionPerformed

    private void jButtonDigitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDigitarActionPerformed
        preencherTabela("select * from agenda inner join paciente on agenda_codpac = paci_codigo inner join hospital on agenda_codhosp = cod_hosp where agenda_status = '"+status+"' order by agenda_data");
        jButtonFinalizar.setEnabled(true);
    }//GEN-LAST:event_jButtonDigitarActionPerformed

    private void jButtonSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSairMouseClicked
        this.dispose();
    }//GEN-LAST:event_jButtonSairMouseClicked


    public void preencherTabela(String Sql){
        ArrayList dados = new ArrayList();
        String [] colunas = new String [] {"ID", "Nome", "CPF", "Telefone", "Hospital", "Data", "Turno", "Hora", "CBaixo"};
        
        conex.conexao();
        conex.executaSql(Sql);
        
        try{
            conex.rs.first();
            do{
                dados.add(new Object[]{conex.rs.getInt("agenda_cod"), conex.rs.getString("paci_nome"), conex.rs.getString("paci_cpf"), conex.rs.getString("paci_telefone"), conex.rs.getString("nome_hosp"),conex.rs.getString("agenda_data") ,conex.rs.getString("agenda_turno"), conex.rs.getString("hora_marcada"), conex.rs.getString("agenda_carro")});
                
            }while(conex.rs.next());
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(rootPane, "NÃO HÁ PACIENTE AGENDADO!");
        }
        ModeloTabela modelo = new ModeloTabela(dados, colunas);
        
        jTableViagens.setModel(modelo);
        jTableViagens.getColumnModel().getColumn(0).setPreferredWidth(35);
        jTableViagens.getColumnModel().getColumn(0).setResizable(false);
        jTableViagens.getColumnModel().getColumn(1).setPreferredWidth(200);
        jTableViagens.getColumnModel().getColumn(1).setResizable(false);
        jTableViagens.getColumnModel().getColumn(2).setPreferredWidth(75);
        jTableViagens.getColumnModel().getColumn(2).setResizable(false);
        jTableViagens.getColumnModel().getColumn(3).setPreferredWidth(80);
        jTableViagens.getColumnModel().getColumn(3).setResizable(false);
        jTableViagens.getColumnModel().getColumn(4).setPreferredWidth(250);
        jTableViagens.getColumnModel().getColumn(4).setResizable(false);
        jTableViagens.getColumnModel().getColumn(5).setPreferredWidth(60);
        jTableViagens.getColumnModel().getColumn(5).setResizable(false);
        jTableViagens.getColumnModel().getColumn(6).setPreferredWidth(55);
        jTableViagens.getColumnModel().getColumn(6).setResizable(false);
        jTableViagens.getColumnModel().getColumn(7).setPreferredWidth(50);
        jTableViagens.getColumnModel().getColumn(7).setResizable(false);
        jTableViagens.getColumnModel().getColumn(8).setPreferredWidth(50);
        jTableViagens.getColumnModel().getColumn(8).setResizable(false);
        
        
        jTableViagens.getTableHeader().setReorderingAllowed(false);
        jTableViagens.setAutoResizeMode(jTableViagens.AUTO_RESIZE_OFF);
        jTableViagens.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        conex.desconecta();
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
            java.util.logging.Logger.getLogger(Agendados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agendados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agendados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agendados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Agendados().setVisible(true);
            }
        });
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButtonDigitar;
    private javax.swing.JButton jButtonFinalizar;
    private javax.swing.JLabel jButtonSair;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JTable jTableViagens;
    private javax.swing.JPanel jpCabecalho;
    private javax.swing.JLabel lbCabecalho;
    // End of variables declaration//GEN-END:variables
}
