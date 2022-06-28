/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelDao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelBeans.BeansAgendamento;
import modelConection.ConexaoBD;

/**
 *
 * @author daniel
 */
public class DaoAgendamento {
    BeansAgendamento agenda = new BeansAgendamento();
    ConexaoBD conex = new ConexaoBD();
    ConexaoBD conexPaciente = new ConexaoBD();
    ConexaoBD conexHospital = new ConexaoBD();
    
    int codPac;
    int codHosp;
    
    public void Salvar(BeansAgendamento agenda){
        BuscarHospital(agenda.getNomeHosp());
        BuscarPaciente(agenda.getNomePac());
        conex.conexao();
        
        try {
            PreparedStatement pst = conex.con.prepareStatement("insert into agenda (agenda_codpac, agenda_codhosp, hora_marcada, agenda_status, agenda_carro, agenda_turno, agenda_data) values(?,?,?,?,?,?,?)");
            pst.setInt(1, codPac);
            pst.setInt(2, codHosp);
            pst.setString(3, agenda.getHora());
            pst.setString(4, agenda.getStatus());
            pst.setString(5, agenda.getCarro());
            pst.setString(6, agenda.getTurno());
            pst.setDate(7, new java.sql.Date(agenda.getData().getTime()));
            
            pst.execute();
            
            JOptionPane.showMessageDialog(null,"Agendamento Realizado Com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao Salvar Agendamento!"+ex);
        }
        
        conex.desconecta();
    }
    
    public void BuscarHospital(String nomeHospital){
        conexHospital.conexao();
        conexHospital.executaSql("select * from hospital where nome_hosp='"+nomeHospital+"'");        
        try {           
            conexHospital.rs.first();
            codHosp = conexHospital.rs.getInt("cod_hosp");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"HOSPITAL NÃO ENCONTRADO!"+ex);
        }
        
    }
    
    public void BuscarPaciente(String nomePaciente){
        conexPaciente.conexao();
        conexPaciente.executaSql("select * from paciente where paci_nome='"+nomePaciente+"'");        
        try {           
            conexPaciente.rs.first();
            codPac = conexPaciente.rs.getInt("paci_codigo");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"PACIENTE NÃO ENCONTRADO!"+ex);
        }
    }
    
    public void Alterar(BeansAgendamento agenda){
        conex.conexao();
        
        try {
            PreparedStatement pst = conex.con.prepareStatement("update agenda set agenda_status=? where agenda_cod=?");
            pst.setString(1, agenda.getStatus());
            pst.setInt(2, agenda.getAgendaCod());
            
            pst.execute();
            conex.desconecta();
            JOptionPane.showMessageDialog(null, "Viagem Digitada Com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro Encontrado: "+ ex);
        }
        conex.desconecta();
    }
}