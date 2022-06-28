/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelDao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelBeans.BeansHospital;
import modelConection.ConexaoBD;

/**
 *
 * @author daniel
 */
public class DaoHospital {
    ConexaoBD conex = new ConexaoBD();
    BeansHospital mod = new BeansHospital();
    
    public void Salvar (BeansHospital mod){
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("insert into hospital (nome_hosp, estado_hosp) values(?,?)");
            pst.setString(1, mod.getNomeHosp());
            pst.setString(2, mod.getEstadoHosp());
                        
            pst.execute();
            JOptionPane.showMessageDialog(null, "Hospital Inseridos Com Sucesso!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Inserir Hospital!/nErro: "+ ex);
        }
        conex.desconecta();
    }
    
    public void Editar(BeansHospital mod) throws SQLException{
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("update hospital set nome_hosp=?, estado_hosp=? where cod_hosp=?");
            pst.setString(1, mod.getNomeHosp());
            pst.setString(2, mod.getEstadoHosp());
            pst.setInt(3, mod.getCodHosp());
            
            pst.execute();
            conex.desconecta();
            JOptionPane.showMessageDialog(null, "Dados Alterados com SUCESSO!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar dados!/nErro: "+ ex);
        }
        
    }
    
    public void Excluir(BeansHospital mod){
        conex.conexao();
        
        try {
            PreparedStatement pst = conex.con.prepareStatement("delete from hospital where cod_hosp=?");
            pst.setInt(1, mod.getCodHosp());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados Excluidos com SUCESSO!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir dados!/nErro: "+ ex);
        }
        
        conex.desconecta();
    }
    
    
    public BeansHospital buscaHospital(BeansHospital mod){
        conex.conexao();
        conex.executaSql("select * from hospital where nome_hosp like'%" + mod.getHospPesquisa()+"%'");
        
        try {
            conex.rs.first();
            mod.setCodHosp(conex.rs.getInt("cod_hosp"));
            mod.setNomeHosp(conex.rs.getString("nome_hosp"));
            mod.setEstadoHosp(conex.rs.getString("estado_hosp"));
            
            } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "HOSPITAL NÃO CADASTRADO!");
        }
        
        conex.desconecta();
        return mod;
    }
    
}