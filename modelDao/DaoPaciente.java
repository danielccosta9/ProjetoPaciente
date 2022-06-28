/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelDao;

import modelConection.ConexaoBD;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelBeans.BeansPaciente;

/**
 *
 * @author daniel
 */
public class DaoPaciente {
    
    ConexaoBD conex = new ConexaoBD();
    BeansPaciente mod = new BeansPaciente();
    
    public void Salvar (BeansPaciente mod){
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("insert into paciente (paci_nome, paci_cpf, paci_telefone, cormobidade, residencia, paci_nasc) values(?,?,?,?,?,?)");
            pst.setString(1, mod.getNomePac());
            pst.setString(2, mod.getCpfPac());
            pst.setString(3, mod.getTelefonePac());
            pst.setString(4, mod.getCormobidade());
            pst.setString(5, mod.getResidencia());
            pst.setString(6, mod.getNas());
            
            pst.execute();
            JOptionPane.showMessageDialog(null, "PACIENTE Cadastrado Com Sucesso!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Cadastrar PACIENTE!/nErro: "+ ex);
        }
        conex.desconecta();
    }
    
    public void Editar(BeansPaciente mod) throws SQLException{
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("update paciente set paci_nome=?, paci_cpf=?, paci_telefone=?, cormobidade=?, residencia=?, paci_nasc=? where paci_codigo=?");
            pst.setString(1, mod.getNomePac());
            pst.setString(2, mod.getCpfPac());
            pst.setString(3, mod.getTelefonePac());
            pst.setString(4, mod.getCormobidade());
            pst.setString(5, mod.getResidencia());
            pst.setString(6, mod.getNas());
            pst.setInt(7, mod.getCodPac());

            pst.execute();
            conex.desconecta();
            JOptionPane.showMessageDialog(null, "Dados do PACIENTE Alterados com SUCESSO!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar dados do PACIENTE!/nErro: "+ ex);
        }
        conex.desconecta();
        
    }
    
    public void Excluir(BeansPaciente mod){
        conex.conexao();
        
        try {
            PreparedStatement pst = conex.con.prepareStatement("delete from paciente where paci_codigo=?");
            pst.setInt(1, mod.getCodPac());
            pst.execute();
            JOptionPane.showMessageDialog(null, "PACIENTE Excluidos com SUCESSO!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir PACIENTE!/nErro: "+ ex);
        }
        
        conex.desconecta();
    }
    
    public BeansPaciente buscaPaciente(BeansPaciente mod){
        conex.conexao();
        conex.executaSql("select * from paciente where paci_nome like'%" + mod.getPesquisa()+"%'");
        
        try {
            conex.rs.first();
            mod.setCodPac(conex.rs.getInt("paci_codigo"));
            mod.setNomePac(conex.rs.getString("paci_nome"));
            mod.setCpfPac(conex.rs.getString("paci_cpf"));
            mod.setTelefonePac(conex.rs.getString("paci_telefone"));
            mod.setNas(conex.rs.getString("paci_nasc"));
            mod.setCormobidade(conex.rs.getString("cormobidade"));
            mod.setResidencia(conex.rs.getString("residencia"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "PACIENTE NÃO CADASTRADO!");
        }
        
        conex.desconecta();
        return mod;
    }   
}