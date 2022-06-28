package View;

import java.awt.Font;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import modelBeans.BeansHospital;
import modelBeans.ModeloTabela;
import modelConection.ConexaoBD;
import modelDao.DaoHospital;

/**
 *
 * @author daniel
 */
public class HospitalCadastrar extends javax.swing.JInternalFrame {

    BeansHospital mod = new BeansHospital();
    DaoHospital dao = new DaoHospital();
    ConexaoBD conex = new ConexaoBD();
    
    int flag = 0;
    
    public HospitalCadastrar() {
        initComponents();
        
        preencherTabela("select * from usuarios order by nome_hosp");
    }
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jpCabecalho = new javax.swing.JPanel();
        lbCabecalho = new javax.swing.JLabel();
        jButtunSair = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jComboBoxEstado = new javax.swing.JComboBox();
        jButtonSalvar = new javax.swing.JButton();
        jButtonNovo = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableHospital = new javax.swing.JTable();
        jButtonCancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButtonExcluir = new javax.swing.JButton();
        jtCOD = new javax.swing.JTextField();
        jButtonAlterar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
        setMaximumSize(new java.awt.Dimension(853, 517));
        setMinimumSize(new java.awt.Dimension(853, 517));
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
        lbCabecalho.setText("Cadastrar Hospital");
        lbCabecalho.setMaximumSize(new java.awt.Dimension(853, 29));
        lbCabecalho.setMinimumSize(new java.awt.Dimension(853, 29));
        lbCabecalho.setPreferredSize(new java.awt.Dimension(853, 29));

        jButtunSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sair.png"))); // NOI18N
        jButtunSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtunSairMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jpCabecalhoLayout = new javax.swing.GroupLayout(jpCabecalho);
        jpCabecalho.setLayout(jpCabecalhoLayout);
        jpCabecalhoLayout.setHorizontalGroup(
            jpCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCabecalhoLayout.createSequentialGroup()
                .addComponent(lbCabecalho, javax.swing.GroupLayout.PREFERRED_SIZE, 759, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtunSair)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jpCabecalhoLayout.setVerticalGroup(
            jpCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButtunSair, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(lbCabecalho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jLabel2.setText("Nome do Hospital");

        jTextFieldNome.setEnabled(false);

        jComboBoxEstado.setFont(new java.awt.Font("Fira Sans", 1, 14)); // NOI18N
        jComboBoxEstado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "JOÃO PESSOA - PB", "CAMPINA GRANDE - PB", "RECIFE - PE", "NATAL - RN" }));
        jComboBoxEstado.setEnabled(false);
        jComboBoxEstado.setMinimumSize(new java.awt.Dimension(103, 22));
        jComboBoxEstado.setPreferredSize(new java.awt.Dimension(103, 22));

        jButtonSalvar.setBackground(new java.awt.Color(0, 255, 0));
        jButtonSalvar.setFont(new java.awt.Font("Fira Sans", 1, 18)); // NOI18N
        jButtonSalvar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSalvar.setText("Salvar");
        jButtonSalvar.setEnabled(false);
        jButtonSalvar.setFocusCycleRoot(true);
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jButtonNovo.setBackground(new java.awt.Color(17, 128, 216));
        jButtonNovo.setFont(new java.awt.Font("Fira Sans", 1, 18)); // NOI18N
        jButtonNovo.setForeground(new java.awt.Color(255, 255, 255));
        jButtonNovo.setText("Novo");
        jButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoActionPerformed(evt);
            }
        });

        jTableHospital.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTableHospital.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jTableHospital.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableHospital.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableHospitalMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableHospital);

        jButtonCancelar.setBackground(new java.awt.Color(102, 102, 102));
        jButtonCancelar.setFont(new java.awt.Font("Fira Sans", 1, 18)); // NOI18N
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.setEnabled(false);
        jButtonCancelar.setFocusCycleRoot(true);
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jLabel1.setText("Localidade");

        jButtonExcluir.setBackground(new java.awt.Color(255, 0, 51));
        jButtonExcluir.setFont(new java.awt.Font("Fira Sans", 1, 18)); // NOI18N
        jButtonExcluir.setForeground(new java.awt.Color(255, 255, 255));
        jButtonExcluir.setText("Excluir");
        jButtonExcluir.setEnabled(false);
        jButtonExcluir.setFocusCycleRoot(true);
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        jtCOD.setFont(new java.awt.Font("Fira Sans", 0, 1)); // NOI18N
        jtCOD.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        jButtonAlterar.setBackground(new java.awt.Color(102, 102, 102));
        jButtonAlterar.setFont(new java.awt.Font("Fira Sans", 1, 18)); // NOI18N
        jButtonAlterar.setText("Editar");
        jButtonAlterar.setEnabled(false);
        jButtonAlterar.setFocusCycleRoot(true);
        jButtonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpCabecalho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jComboBoxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jtCOD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 1, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 830, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(jButtonAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jpCabecalho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jtCOD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(jButtonNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(jButtonAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.CENTER, layout.createSequentialGroup()
                        .addGap(451, 451, 451)
                        .addComponent(jButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    //TEXTO DO CABECARIO
    private String cabecario = "Cadastrar Hospital";
    
    public String getCabecario() {
        return cabecario;
    }

    public void setCabecario(String cabecario) {
        this.cabecario = cabecario;
    }
   
    
    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
      if(jTextFieldNome.getText().isEmpty()){
            JOptionPane.showConfirmDialog(null, "Preencha o NOME do HOSPITAL!");
            jTextFieldNome.requestFocus();
        }else{
            if(flag==1){
                mod.setNomeHosp(jTextFieldNome.getText());
                mod.setEstadoHosp((String)jComboBoxEstado.getSelectedItem());
                                
                dao.Salvar(mod);
                preencherTabela("select * from hospital where nome_hosp like'%" + mod.getPesquisa()+"%'");

                jTextFieldNome.setText("");
                jTextFieldNome.setEnabled(false);
                
                jButtonSalvar.setEnabled(false);
                jButtonCancelar.setEnabled(false);
                jButtonCancelar.setEnabled(false);
                                             
            }else{
                mod.setCodHosp(Integer.parseInt(jtCOD.getText()));
                mod.setNomeHosp(jTextFieldNome.getText());
                mod.setEstadoHosp((String)jComboBoxEstado.getSelectedItem());
                             
                try {
                    dao.Editar(mod);
                    preencherTabela("select * from hospital order by cod_hosp");
                    jTextFieldNome.setEnabled(false);
                    
                    jButtonSalvar.setEnabled(false);
                    jtCOD.setText("");
                    jTextFieldNome.setText("");
                    jTextFieldNome.setEnabled(false);
                    
                    jButtonNovo.setEnabled(true);
                    jButtonCancelar.setEnabled(false);
                } catch (SQLException ex) {
                    Logger.getLogger(CadastrarPaciente.class.getName()).log(Level.SEVERE, null, ex);
                }               
            }
        }   
    }//GEN-LAST:event_jButtonSalvarActionPerformed
    
   
    //INTERFACE INICIA
    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        //Colocar a variavel cabecario no jlabel
        lbCabecalho.setText(cabecario);
    }//GEN-LAST:event_formInternalFrameOpened
      
    //FORM EXIBIDO
    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        lbCabecalho.setText(cabecario);
    }//GEN-LAST:event_formComponentShown
    
    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
       flag = 1;
       jTextFieldNome.setEnabled(true);       
       
       jButtonCancelar.setEnabled(true);
       jButtonSalvar.setEnabled(true);
       jButtonAlterar.setEnabled(false);
       jButtonExcluir.setEnabled(false);   
       
       jTextFieldNome.setEnabled(true);
       
       jtCOD.setText("");
       jTextFieldNome.setText("");
    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
       jTextFieldNome.setEnabled(!true);
       
       jButtonCancelar.setEnabled(!true);
       jButtonSalvar.setEnabled(!true);
       jButtonAlterar.setEnabled(false);
       jButtonExcluir.setEnabled(false);
       jButtonNovo.setEnabled(true);
       
       jtCOD.setText("");
       jTextFieldNome.setText("");
       
       jTextFieldNome.setEnabled(false);
    }//GEN-LAST:event_jButtonCancelarActionPerformed

//GEN-FIRST:event_btnSairActionPerformed
 
//GEN-LAST:event_btnSairActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
       int resposta = 0;
        
        resposta = JOptionPane.showConfirmDialog(rootPane, "Deseja realmente excluir?");
        if(resposta == JOptionPane.YES_OPTION){
            mod.setCodHosp(Integer.parseInt(jtCOD.getText()));
            dao.Excluir(mod);
            preencherTabela("select * from hospital order by nome_hosp");
            
            jtCOD.setText("");
            jTextFieldNome.setText("");
            
            jTextFieldNome.setEnabled(false);
                        
            jButtonNovo.setEnabled(true);
            jButtonCancelar.setEnabled(false);
            jButtonExcluir.setEnabled(false);
            jButtonAlterar.setEnabled(false);
            
        }
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jTableHospitalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableHospitalMouseClicked
        String nome_hospital = ""+jTableHospital.getValueAt(jTableHospital.getSelectedRow(), 1);
        conex.conexao();
        conex.executaSql("select * from hospital where nome_hosp='"+nome_hospital+"'");
        try {
            conex.rs.first();
            
            jtCOD.setText(String.valueOf(conex.rs.getInt("cod_hosp")));
            jTextFieldNome.setText(conex.rs.getString("nome_hosp"));
            jComboBoxEstado.setSelectedItem(conex.rs.getString("estado_hosp"));
        }catch(SQLException ex){
            
            JOptionPane.showMessageDialog(null, "Erro ao selecionar HOSPITAL");
        }
        conex.desconecta();
        jButtonNovo.setEnabled(!true);
        jButtonAlterar.setEnabled(true);
        jButtonExcluir.setEnabled(true);
        jButtonCancelar.setEnabled(true);
        jButtonSalvar.setEnabled(!true);
        
        jtCOD.setEnabled(false);
        jTextFieldNome.setEnabled(false);
    }//GEN-LAST:event_jTableHospitalMouseClicked

    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed
       flag = 2;

        preencherTabela("select * from hospital order by nome_hosp");

        jTextFieldNome.setEnabled(true);
        jComboBoxEstado.setEnabled(true);

        jButtonCancelar.setEnabled(true);
        jButtonSalvar.setEnabled(true);
        jButtonCancelar.setEnabled(true);

        jButtonNovo.setEnabled(!false);
        jButtonAlterar.setEnabled(false);
        jButtonExcluir.setEnabled(false);
    }//GEN-LAST:event_jButtonAlterarActionPerformed

    private void jButtunSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtunSairMouseClicked
        this.dispose();
    }//GEN-LAST:event_jButtunSairMouseClicked


    public void preencherTabela(String Sql){
        ArrayList dados = new ArrayList();
        String [] colunas = new String [] {"ID", "Nome do Hospital", "Estado"};
        
        conex.conexao();
        conex.executaSql("select * from hospital order by nome_hosp");
        
        try{
            conex.rs.first();
            do{
                dados.add(new Object[]{conex.rs.getInt("cod_hosp"), conex.rs.getString("nome_hosp"), conex.rs.getString("estado_hosp")});
                
            }while(conex.rs.next());
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "FECHE E ABRA A TELA NOVAMENTE PARA PREENCHER A TABELA!"+ ex);
        }
        ModeloTabela modelo = new ModeloTabela(dados, colunas);
        
        jTableHospital.setModel(modelo);
        jTableHospital.getColumnModel().getColumn(0).setPreferredWidth(43);
        jTableHospital.getColumnModel().getColumn(0).setResizable(false);
        jTableHospital.getColumnModel().getColumn(1).setPreferredWidth(600);
        jTableHospital.getColumnModel().getColumn(1).setResizable(false);
        jTableHospital.getColumnModel().getColumn(2).setPreferredWidth(170);
        jTableHospital.getColumnModel().getColumn(2).setResizable(false);
        
        
        
        jTableHospital.getTableHeader().setReorderingAllowed(false);
        jTableHospital.setAutoResizeMode(jTableHospital.AUTO_RESIZE_OFF);
        jTableHospital.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        conex.desconecta();
    }
    
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
            java.util.logging.Logger.getLogger(HospitalCadastrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HospitalCadastrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HospitalCadastrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HospitalCadastrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new HospitalCadastrar().setVisible(true);
            }
        });
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JLabel jButtunSair;
    private javax.swing.JComboBox jComboBoxEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableHospital;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JPanel jpCabecalho;
    private javax.swing.JTextField jtCOD;
    private javax.swing.JLabel lbCabecalho;
    // End of variables declaration//GEN-END:variables
}
