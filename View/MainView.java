package View;

import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import time.AtualizadorHorario;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author daniel
 */
public class MainView extends javax.swing.JFrame {
    public MainView() {
        initComponents();
        AtualizadorHorario.start(jLabelTime);
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    
    private CadastrarPaciente cadastrarPaciente;
    private HospitalCadastrar cadastrarHospital;
    private PesquisarPaciente pesquisarPaciente;
    private Agendar agendarPaciente;
    private Agendados pacientesAgendados;
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelPrincipal = new javax.swing.JPanel();
        jPanelTop = new javax.swing.JPanel();
        jLabelLogoSec = new javax.swing.JLabel();
        jLabelPower = new javax.swing.JLabel();
        jLabelTime = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanelMenu = new javax.swing.JPanel();
        jLabelCadPaciente = new javax.swing.JLabel();
        jLabelPesquisarPaciente = new javax.swing.JLabel();
        jLabelAgendar = new javax.swing.JLabel();
        jLabelAgendados = new javax.swing.JLabel();
        jLabelCadHospital = new javax.swing.JLabel();
        jButtonCadastrarPaciente = new javax.swing.JButton();
        jButtonPesquisarPaciente = new javax.swing.JButton();
        jButtonAgendarPaciente = new javax.swing.JButton();
        jButtonPacienteAgendado = new javax.swing.JButton();
        jButtonCadastrarHospital = new javax.swing.JButton();
        DNLogo = new javax.swing.JLabel();
        jPanelBody = new javax.swing.JPanel();
        jDesktopPaneMain = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 51));

        jPanelPrincipal.setBackground(new java.awt.Color(204, 204, 204));
        jPanelPrincipal.setMaximumSize(new java.awt.Dimension(1024, 560));
        jPanelPrincipal.setMinimumSize(new java.awt.Dimension(1024, 560));
        jPanelPrincipal.setPreferredSize(new java.awt.Dimension(1024, 560));

        jPanelTop.setBackground(new java.awt.Color(255, 255, 0));
        jPanelTop.setMaximumSize(new java.awt.Dimension(1024, 40));
        jPanelTop.setMinimumSize(new java.awt.Dimension(1024, 40));
        jPanelTop.setPreferredSize(new java.awt.Dimension(1024, 40));

        jLabelLogoSec.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Sec. de Transporte - Araçagi.png"))); // NOI18N

        jLabelPower.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/power.png"))); // NOI18N
        jLabelPower.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelPowerMouseClicked(evt);
            }
        });

        jLabelTime.setFont(new java.awt.Font("TeXGyreCursor", 3, 14)); // NOI18N
        jLabelTime.setText("15/10/1999 08:30:59");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bus.png"))); // NOI18N

        javax.swing.GroupLayout jPanelTopLayout = new javax.swing.GroupLayout(jPanelTop);
        jPanelTop.setLayout(jPanelTopLayout);
        jPanelTopLayout.setHorizontalGroup(
            jPanelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTopLayout.createSequentialGroup()
                .addComponent(jLabelLogoSec)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(128, 128, 128)
                .addComponent(jLabelTime)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 410, Short.MAX_VALUE)
                .addComponent(jLabelPower)
                .addContainerGap())
        );
        jPanelTopLayout.setVerticalGroup(
            jPanelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTopLayout.createSequentialGroup()
                .addGroup(jPanelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabelLogoSec)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanelTopLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTime)
                    .addComponent(jLabelPower))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelMenu.setBackground(new java.awt.Color(255, 255, 0));
        jPanelMenu.setMaximumSize(new java.awt.Dimension(165, 502));
        jPanelMenu.setMinimumSize(new java.awt.Dimension(165, 502));
        jPanelMenu.setPreferredSize(new java.awt.Dimension(165, 502));

        jLabelCadPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/addPaciente.png"))); // NOI18N

        jLabelPesquisarPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sheredPaciente.png"))); // NOI18N

        jLabelAgendar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/agendar.png"))); // NOI18N

        jLabelAgendados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/agendados.png"))); // NOI18N

        jLabelCadHospital.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/addHospital.png"))); // NOI18N

        jButtonCadastrarPaciente.setBackground(new java.awt.Color(255, 255, 0));
        jButtonCadastrarPaciente.setFont(new java.awt.Font("SansSerif", 1, 10)); // NOI18N
        jButtonCadastrarPaciente.setText("Cadastrar Paciente");
        jButtonCadastrarPaciente.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jButtonCadastrarPaciente.setMaximumSize(new java.awt.Dimension(106, 17));
        jButtonCadastrarPaciente.setMinimumSize(new java.awt.Dimension(106, 17));
        jButtonCadastrarPaciente.setPreferredSize(new java.awt.Dimension(106, 17));
        jButtonCadastrarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarPacienteActionPerformed(evt);
            }
        });

        jButtonPesquisarPaciente.setBackground(new java.awt.Color(255, 255, 0));
        jButtonPesquisarPaciente.setFont(new java.awt.Font("SansSerif", 1, 10)); // NOI18N
        jButtonPesquisarPaciente.setText("Pesquisar Paciente");
        jButtonPesquisarPaciente.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jButtonPesquisarPaciente.setMaximumSize(new java.awt.Dimension(106, 17));
        jButtonPesquisarPaciente.setMinimumSize(new java.awt.Dimension(106, 17));
        jButtonPesquisarPaciente.setPreferredSize(new java.awt.Dimension(106, 17));
        jButtonPesquisarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarPacienteActionPerformed(evt);
            }
        });

        jButtonAgendarPaciente.setBackground(new java.awt.Color(255, 255, 0));
        jButtonAgendarPaciente.setFont(new java.awt.Font("SansSerif", 1, 10)); // NOI18N
        jButtonAgendarPaciente.setText("Agendar Paciente");
        jButtonAgendarPaciente.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jButtonAgendarPaciente.setMaximumSize(new java.awt.Dimension(106, 17));
        jButtonAgendarPaciente.setMinimumSize(new java.awt.Dimension(106, 17));
        jButtonAgendarPaciente.setPreferredSize(new java.awt.Dimension(106, 17));
        jButtonAgendarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgendarPacienteActionPerformed(evt);
            }
        });

        jButtonPacienteAgendado.setBackground(new java.awt.Color(255, 255, 0));
        jButtonPacienteAgendado.setFont(new java.awt.Font("SansSerif", 1, 10)); // NOI18N
        jButtonPacienteAgendado.setText("Paciente Agendado");
        jButtonPacienteAgendado.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jButtonPacienteAgendado.setMaximumSize(new java.awt.Dimension(106, 17));
        jButtonPacienteAgendado.setMinimumSize(new java.awt.Dimension(106, 17));
        jButtonPacienteAgendado.setPreferredSize(new java.awt.Dimension(106, 17));
        jButtonPacienteAgendado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPacienteAgendadoActionPerformed(evt);
            }
        });

        jButtonCadastrarHospital.setBackground(new java.awt.Color(255, 255, 0));
        jButtonCadastrarHospital.setFont(new java.awt.Font("SansSerif", 1, 10)); // NOI18N
        jButtonCadastrarHospital.setText("Cadastrar Hospital");
        jButtonCadastrarHospital.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jButtonCadastrarHospital.setMaximumSize(new java.awt.Dimension(106, 17));
        jButtonCadastrarHospital.setMinimumSize(new java.awt.Dimension(106, 17));
        jButtonCadastrarHospital.setPreferredSize(new java.awt.Dimension(106, 17));
        jButtonCadastrarHospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarHospitalActionPerformed(evt);
            }
        });

        DNLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logoDaniel.png"))); // NOI18N

        javax.swing.GroupLayout jPanelMenuLayout = new javax.swing.GroupLayout(jPanelMenu);
        jPanelMenu.setLayout(jPanelMenuLayout);
        jPanelMenuLayout.setHorizontalGroup(
            jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMenuLayout.createSequentialGroup()
                .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelCadPaciente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelPesquisarPaciente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelAgendar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelCadHospital, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelAgendados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonCadastrarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPesquisarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAgendarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPacienteAgendado, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCadastrarHospital, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(jPanelMenuLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(DNLogo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelMenuLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButtonAgendarPaciente, jButtonCadastrarHospital, jButtonCadastrarPaciente, jButtonPacienteAgendado, jButtonPesquisarPaciente});

        jPanelMenuLayout.setVerticalGroup(
            jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMenuLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabelCadPaciente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelMenuLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jButtonCadastrarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(jPanelMenuLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabelPesquisarPaciente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelMenuLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jButtonPesquisarPaciente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(jPanelMenuLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabelAgendar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelMenuLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jButtonAgendarPaciente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonPacienteAgendado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelMenuLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabelAgendados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jButtonCadastrarHospital, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelMenuLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabelCadHospital, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(84, 84, 84)
                .addComponent(DNLogo)
                .addGap(65, 65, 65))
        );

        jPanelBody.setBackground(new java.awt.Color(255, 255, 255));
        jPanelBody.setMaximumSize(new java.awt.Dimension(853, 514));
        jPanelBody.setMinimumSize(new java.awt.Dimension(853, 514));
        jPanelBody.setPreferredSize(new java.awt.Dimension(853, 514));

        jDesktopPaneMain.setMaximumSize(new java.awt.Dimension(853, 514));
        jDesktopPaneMain.setMinimumSize(new java.awt.Dimension(853, 514));
        jDesktopPaneMain.setPreferredSize(new java.awt.Dimension(853, 0));

        javax.swing.GroupLayout jDesktopPaneMainLayout = new javax.swing.GroupLayout(jDesktopPaneMain);
        jDesktopPaneMain.setLayout(jDesktopPaneMainLayout);
        jDesktopPaneMainLayout.setHorizontalGroup(
            jDesktopPaneMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jDesktopPaneMainLayout.setVerticalGroup(
            jDesktopPaneMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanelBodyLayout = new javax.swing.GroupLayout(jPanelBody);
        jPanelBody.setLayout(jPanelBodyLayout);
        jPanelBodyLayout.setHorizontalGroup(
            jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPaneMain, javax.swing.GroupLayout.DEFAULT_SIZE, 875, Short.MAX_VALUE)
        );
        jPanelBodyLayout.setVerticalGroup(
            jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBodyLayout.createSequentialGroup()
                .addComponent(jDesktopPaneMain, javax.swing.GroupLayout.DEFAULT_SIZE, 553, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelPrincipalLayout = new javax.swing.GroupLayout(jPanelPrincipal);
        jPanelPrincipal.setLayout(jPanelPrincipalLayout);
        jPanelPrincipalLayout.setHorizontalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                .addComponent(jPanelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelBody, javax.swing.GroupLayout.DEFAULT_SIZE, 875, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanelTop, javax.swing.GroupLayout.DEFAULT_SIZE, 1082, Short.MAX_VALUE)
        );
        jPanelPrincipalLayout.setVerticalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                .addComponent(jPanelTop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelBody, javax.swing.GroupLayout.DEFAULT_SIZE, 554, Short.MAX_VALUE)
                    .addComponent(jPanelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 554, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 1082, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1092, 630));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCadastrarHospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarHospitalActionPerformed
        //verifica se a tela ja existe
        if(cadastrarHospital == null )
        {   
            //se não existir faz uma tela
            cadastrarHospital = new HospitalCadastrar();
        }
        
        //verifico se a tela ja esta no painel
        if(!cadastrarHospital.isVisible())
        {    
            //mostro a tela no painel principal caso nao esteja la
            jDesktopPaneMain.add(cadastrarHospital);
            cadastrarHospital.setVisible(true);
        }
        
        //coloco ela na frente de todas para todos os casos
        cadastrarHospital.toFront();
        
        //redimensiona tela para tamanho do painel
        try {
            cadastrarHospital.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(MainView.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //retira o painel superior
        ((BasicInternalFrameUI)cadastrarHospital.getUI()).setNorthPane(null);
    }//GEN-LAST:event_jButtonCadastrarHospitalActionPerformed

    private void jButtonCadastrarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarPacienteActionPerformed
        //verifica se a tela ja existe
        if(cadastrarPaciente == null )
        {   
            //se não existir faz uma tela
            cadastrarPaciente = new CadastrarPaciente();
        }
        
        //coloca cabecario de acordo com a funcao cadasto/alteracao
        cadastrarPaciente.setCabecario("Cadastrar Paciente");
        
        //verifico se a tela ja esta no painel
        if(!cadastrarPaciente.isVisible())
        {    
            //mostro a tela no painel principal caso nao esteja la
            jDesktopPaneMain.add(cadastrarPaciente);
            cadastrarPaciente.setVisible(true);
        }
        
        //coloco ela na frente de todas para todos os casos
        cadastrarPaciente.toFront();
        
        //redimensiona tela para tamanho do painel
        try {
            cadastrarPaciente.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(MainView.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //retira o painel superior
        ((BasicInternalFrameUI)cadastrarPaciente.getUI()).setNorthPane(null);
    }//GEN-LAST:event_jButtonCadastrarPacienteActionPerformed

    private void jButtonPesquisarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarPacienteActionPerformed
        //verifica se a tela ja existe
        if(pesquisarPaciente == null )
        {   
            //se não existir faz uma tela
            pesquisarPaciente = new PesquisarPaciente();
        }
        
        //coloca cabecario de acordo com a funcao cadasto/alteracao
        pesquisarPaciente.setCabecario("Pesquisar Paciente");
        
        //verifico se a tela ja esta no painel
        if(!pesquisarPaciente.isVisible())
        {    
            //mostro a tela no painel principal caso nao esteja la
            jDesktopPaneMain.add(pesquisarPaciente);
            pesquisarPaciente.setVisible(true);
        }
        
        //coloco ela na frente de todas para todos os casos
        pesquisarPaciente.toFront();
        
        //redimensiona tela para tamanho do painel
        try {
            pesquisarPaciente.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(MainView.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //retira o painel superior
        ((BasicInternalFrameUI)pesquisarPaciente.getUI()).setNorthPane(null);
    }//GEN-LAST:event_jButtonPesquisarPacienteActionPerformed

    private void jButtonAgendarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgendarPacienteActionPerformed
        //verifica se a tela ja existe
        if(agendarPaciente == null )
        {   
            //se não existir faz uma tela
            agendarPaciente = new Agendar();
        }
        
        //verifico se a tela ja esta no painel
        if(!agendarPaciente.isVisible())
        {    
            //mostro a tela no painel principal caso nao esteja la
            jDesktopPaneMain.add(agendarPaciente);
            agendarPaciente.setVisible(true);
        }
        
        //coloco ela na frente de todas para todos os casos
        agendarPaciente.toFront();
        
        //redimensiona tela para tamanho do painel
        try {
            agendarPaciente.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(MainView.class.getName()).log(Level.SEVERE, null, ex);
        }
                
        //retira o painel superior
        ((BasicInternalFrameUI)agendarPaciente.getUI()).setNorthPane(null);
    }//GEN-LAST:event_jButtonAgendarPacienteActionPerformed

    private void jButtonPacienteAgendadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPacienteAgendadoActionPerformed
        //verifica se a tela ja existe
        if(pacientesAgendados == null )
        {   
            //se não existir faz uma tela
            pacientesAgendados = new Agendados();
        }
        
        //verifico se a tela ja esta no painel
        if(!pacientesAgendados.isVisible())
        {    
            //mostro a tela no painel principal caso nao esteja la
            jDesktopPaneMain.add(pacientesAgendados);
            pacientesAgendados.setVisible(true);
        }
        
        //coloco ela na frente de todas para todos os casos
        pacientesAgendados.toFront();
        
        //redimensiona tela para tamanho do painel
        try {
            pacientesAgendados.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(MainView.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //retira o painel superior
        ((BasicInternalFrameUI)pacientesAgendados.getUI()).setNorthPane(null);
    }//GEN-LAST:event_jButtonPacienteAgendadoActionPerformed

    private void jLabelPowerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelPowerMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabelPowerMouseClicked

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DNLogo;
    private javax.swing.JButton jButtonAgendarPaciente;
    private javax.swing.JButton jButtonCadastrarHospital;
    private javax.swing.JButton jButtonCadastrarPaciente;
    private javax.swing.JButton jButtonPacienteAgendado;
    private javax.swing.JButton jButtonPesquisarPaciente;
    private javax.swing.JDesktopPane jDesktopPaneMain;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelAgendados;
    private javax.swing.JLabel jLabelAgendar;
    private javax.swing.JLabel jLabelCadHospital;
    private javax.swing.JLabel jLabelCadPaciente;
    private javax.swing.JLabel jLabelLogoSec;
    private javax.swing.JLabel jLabelPesquisarPaciente;
    private javax.swing.JLabel jLabelPower;
    private javax.swing.JLabel jLabelTime;
    private javax.swing.JPanel jPanelBody;
    private javax.swing.JPanel jPanelMenu;
    private javax.swing.JPanel jPanelPrincipal;
    private javax.swing.JPanel jPanelTop;
    // End of variables declaration//GEN-END:variables
}
