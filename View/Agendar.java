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
public class Agendar extends javax.swing.JInternalFrame {

    ConexaoBD conex = new ConexaoBD();
    BeansAgendamento agenda = new BeansAgendamento();
    
    int flag = 0;
    public Agendar() {
        initComponents();
        preencherHospital();
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
        jTablePaciente = new javax.swing.JTable();
        jTextFieldPaciente = new javax.swing.JTextField();
        jButtonPesquisar1 = new javax.swing.JButton();
        jButtonFinalizarAgendamento = new javax.swing.JButton();
        jButtonCancelarAgendamento = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBoxHospital = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBoxTurno = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jFormattedTextFieldHora = new javax.swing.JFormattedTextField();
        jComboBoxCarro = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jDateChooserData = new com.toedter.calendar.JDateChooser();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
        setMaximumSize(new java.awt.Dimension(853, 514));
        setMinimumSize(new java.awt.Dimension(853, 514));
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
        lbCabecalho.setText("Agendar Paciente");
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

        jTablePaciente.setBorder(new javax.swing.border.MatteBorder(null));
        jTablePaciente.setFont(new java.awt.Font("Liberation Sans", 1, 12)); // NOI18N
        jTablePaciente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTablePaciente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablePacienteMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTablePaciente);

        jButtonPesquisar1.setBackground(new java.awt.Color(17, 128, 216));
        jButtonPesquisar1.setFont(new java.awt.Font("Fira Sans", 1, 18)); // NOI18N
        jButtonPesquisar1.setForeground(new java.awt.Color(255, 255, 255));
        jButtonPesquisar1.setText("Pesquisar");
        jButtonPesquisar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisar1ActionPerformed(evt);
            }
        });

        jButtonFinalizarAgendamento.setBackground(new java.awt.Color(0, 255, 0));
        jButtonFinalizarAgendamento.setFont(new java.awt.Font("Fira Sans", 1, 18)); // NOI18N
        jButtonFinalizarAgendamento.setForeground(new java.awt.Color(255, 255, 255));
        jButtonFinalizarAgendamento.setText("Salvar");
        jButtonFinalizarAgendamento.setEnabled(false);
        jButtonFinalizarAgendamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFinalizarAgendamentoActionPerformed(evt);
            }
        });

        jButtonCancelarAgendamento.setBackground(new java.awt.Color(153, 153, 153));
        jButtonCancelarAgendamento.setFont(new java.awt.Font("Fira Sans", 1, 18)); // NOI18N
        jButtonCancelarAgendamento.setText("Cancelar");
        jButtonCancelarAgendamento.setEnabled(false);
        jButtonCancelarAgendamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarAgendamentoActionPerformed(evt);
            }
        });

        jLabel1.setText("Pesquisar Paciente");

        jLabel2.setText("Local da Consulta");

        jComboBoxHospital.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxHospital.setEnabled(false);

        jLabel3.setText("Data da Consulta");

        jLabel4.setText("Turno");

        jComboBoxTurno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MANHÃ", "TARDE" }));
        jComboBoxTurno.setEnabled(false);

        jLabel5.setText("Horário");

        try {
            jFormattedTextFieldHora.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldHora.setEnabled(false);

        jComboBoxCarro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NÃO", "SIM", "ESPC", "DUCA" }));
        jComboBoxCarro.setEnabled(false);

        jLabel6.setText("Carro Especial");

        jDateChooserData.setEnabled(false);

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jComboBoxHospital, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jDateChooserData, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jComboBoxTurno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jFormattedTextFieldHora, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBoxCarro, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 688, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonPesquisar1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButtonFinalizarAgendamento)
                        .addGap(91, 91, 91)
                        .addComponent(jButtonCancelarAgendamento)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpCabecalho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPesquisar1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jComboBoxHospital, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jFormattedTextFieldHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxCarro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxTurno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDateChooserData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCancelarAgendamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonFinalizarAgendamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    //TEXTO DO CABECARIO
    private String cabecario = "Agendar Paciente";
    

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
    
    private void jTablePacienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablePacienteMouseClicked
        String nome_paciente = ""+jTablePaciente.getValueAt(jTablePaciente.getSelectedRow(), 1);
        conex.conexao();
        conex.executaSql("select * from paciente where paci_nome='"+nome_paciente+"' order by paci_nome");
        try {
            conex.rs.first();
            jTextFieldPaciente.setText(conex.rs.getString("paci_nome"));
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao selecionar PACIENTE" + ex);
        }
        conex.desconecta();
        
        jComboBoxCarro.setEnabled(true);
        jComboBoxHospital.setEnabled(true);
        jComboBoxTurno.setEnabled(true);
        jButtonCancelarAgendamento.setEnabled(true);
        jButtonFinalizarAgendamento.setEnabled(true);
        jFormattedTextFieldHora.setEnabled(true);
        jDateChooserData.setEnabled(true);
    }//GEN-LAST:event_jTablePacienteMouseClicked

    private void jButtonPesquisar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisar1ActionPerformed
       preencherTabela("select * from paciente where paci_nome like'%" + jTextFieldPaciente.getText()+"%' order by paci_nome");
    }//GEN-LAST:event_jButtonPesquisar1ActionPerformed

    private void jButtonFinalizarAgendamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFinalizarAgendamentoActionPerformed
        agenda.setNomePac(jTextFieldPaciente.getText());
        agenda.setNomeHosp((String) jComboBoxHospital.getSelectedItem());
        agenda.setTurno((String) jComboBoxTurno.getSelectedItem());
        agenda.setCarro((String) jComboBoxCarro.getSelectedItem());
        agenda.setHora(jFormattedTextFieldHora.getText());
        agenda.setData(jDateChooserData.getDate());
        agenda.setStatus("Aguardando...");
                
        DaoAgendamento dao = new DaoAgendamento();
        dao.Salvar(agenda); 
        
        jTextFieldPaciente.setText("");
        jFormattedTextFieldHora.setText("");
        
        jComboBoxCarro.setEnabled(!true);
        jComboBoxHospital.setEnabled(!true);
        jComboBoxTurno.setEnabled(!true);
        jButtonCancelarAgendamento.setEnabled(!true);
        jButtonFinalizarAgendamento.setEnabled(!true);
        jFormattedTextFieldHora.setEnabled(!true);
        jDateChooserData.setEnabled(!true);
    }                                                        

    private void jButtonCancelarAgendamentoMouseClicked(java.awt.event.MouseEvent evt) {                                                        
        jTextFieldPaciente.setText("");
        jFormattedTextFieldHora.setText("");
        
        jComboBoxCarro.setEnabled(!true);
        jComboBoxHospital.setEnabled(!true);
        jComboBoxTurno.setEnabled(!true);
        jButtonCancelarAgendamento.setEnabled(!true);
        jButtonFinalizarAgendamento.setEnabled(!true);
        jFormattedTextFieldHora.setEnabled(!true);
        jDateChooserData.setEnabled(!true);
    }//GEN-LAST:event_jButtonFinalizarAgendamentoActionPerformed

    private void jButtonCancelarAgendamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarAgendamentoActionPerformed
        jTextFieldPaciente.setText("");
        jFormattedTextFieldHora.setText("");
        
        jComboBoxCarro.setEnabled(!true);
        jComboBoxHospital.setEnabled(!true);
        jComboBoxTurno.setEnabled(!true);
        jButtonCancelarAgendamento.setEnabled(!true);
        jButtonFinalizarAgendamento.setEnabled(!true);
        jFormattedTextFieldHora.setEnabled(!true);
        jDateChooserData.setEnabled(!true);
    }//GEN-LAST:event_jButtonCancelarAgendamentoActionPerformed

    private void jButtonSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSairMouseClicked
        this.dispose();
    }//GEN-LAST:event_jButtonSairMouseClicked


    public void preencherHospital(){
        conex.conexao();
        conex.executaSql("select * from hospital order by nome_hosp");
        
        try {
            conex.rs.first();
            jComboBoxHospital.removeAllItems();
            do{
                jComboBoxHospital.addItem(conex.rs.getString("nome_hosp"));
            }while(conex.rs.next());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "ERRO ao Preencher Hospitais!" + ex);
        }
        conex.desconecta();
    }
    
    
    public void preencherTabela(String Sql){
        ArrayList dados = new ArrayList();
        String [] colunas = new String [] {"ID", "Nome", "CPF", "Telefone", "Nascimento", "Cormobidade", "Residencia"};
        
        conex.conexao();
        conex.executaSql(Sql);
        
        try{
            conex.rs.first();
            do{
                dados.add(new Object[]{conex.rs.getInt("paci_codigo"), conex.rs.getString("paci_nome"), conex.rs.getString("paci_cpf"), conex.rs.getString("paci_telefone"), conex.rs.getString("paci_nasc"), conex.rs.getString("cormobidade"), conex.rs.getString("residencia")});
                
            }while(conex.rs.next());
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(rootPane, "Busque outro PACIENTE para preencher a tabela!"+ex);
        }
        ModeloTabela modelo = new ModeloTabela(dados, colunas);
        
        jTablePaciente.setModel(modelo);
        jTablePaciente.getColumnModel().getColumn(0).setPreferredWidth(43);
        jTablePaciente.getColumnModel().getColumn(0).setResizable(false);
        jTablePaciente.getColumnModel().getColumn(1).setPreferredWidth(250);
        jTablePaciente.getColumnModel().getColumn(1).setResizable(false);
        jTablePaciente.getColumnModel().getColumn(2).setPreferredWidth(115);
        jTablePaciente.getColumnModel().getColumn(2).setResizable(false);
        jTablePaciente.getColumnModel().getColumn(3).setPreferredWidth(118);
        jTablePaciente.getColumnModel().getColumn(3).setResizable(false);
        jTablePaciente.getColumnModel().getColumn(4).setPreferredWidth(90);
        jTablePaciente.getColumnModel().getColumn(4).setResizable(false);
        jTablePaciente.getColumnModel().getColumn(5).setPreferredWidth(130);
        jTablePaciente.getColumnModel().getColumn(5).setResizable(false);
        jTablePaciente.getColumnModel().getColumn(6).setPreferredWidth(140);
        jTablePaciente.getColumnModel().getColumn(6).setResizable(false);
        
        
        jTablePaciente.getTableHeader().setReorderingAllowed(false);
        jTablePaciente.setAutoResizeMode(jTablePaciente.AUTO_RESIZE_OFF);
        jTablePaciente.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
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
            java.util.logging.Logger.getLogger(Agendar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agendar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agendar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agendar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Agendar().setVisible(true);
            }
        });
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButtonCancelarAgendamento;
    private javax.swing.JButton jButtonFinalizarAgendamento;
    private javax.swing.JButton jButtonPesquisar1;
    private javax.swing.JLabel jButtonSair;
    private javax.swing.JComboBox<String> jComboBoxCarro;
    private javax.swing.JComboBox<String> jComboBoxHospital;
    private javax.swing.JComboBox<String> jComboBoxTurno;
    private com.toedter.calendar.JDateChooser jDateChooserData;
    private javax.swing.JFormattedTextField jFormattedTextFieldHora;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JTable jTablePaciente;
    private javax.swing.JTextField jTextFieldPaciente;
    private javax.swing.JPanel jpCabecalho;
    private javax.swing.JLabel lbCabecalho;
    // End of variables declaration//GEN-END:variables
}
