/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelDao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelBeans.BeansUsuario;
import modelConection.ConexaoBD;

/**
 *
 * @author daniel
 */
public class DaoUsuario {
    ConexaoBD conex = new ConexaoBD();
    BeansUsuario mod = new BeansUsuario();
    
    public void Salvar (BeansUsuario mod){
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("insert into usuarios (usu_nome, usu_usu, usu_senha, usu_tipo) values(?,?,?,?)");
            pst.setString(1, mod.getUsuNome());
            pst.setString(2, mod.getUsuario());
            pst.setString(3, mod.getUsuSenha());
            pst.setString(4, mod.getUsuTipo());
            
            pst.execute();
            JOptionPane.showMessageDialog(null, "Usuário Inserido Com Sucesso!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Inserir Usuário!/nErro: "+ ex);
        }
        conex.desconecta();
    }
    
    public void Alterar (BeansUsuario mod) throws SQLException{
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("update usuarios set usu_nome=?, usu_usu=?, usu_senha=?, usu_tipo=? where usu_cod=?");
            pst.setString(1, mod.getUsuNome());
            pst.setString(2, mod.getUsuario());
            pst.setString(3, mod.getUsuSenha());
            pst.setString(4, mod.getUsuTipo());
            pst.setInt(5, mod.getUsuCod());
            
            pst.execute();
            conex.desconecta();
            JOptionPane.showMessageDialog(null, "USUÁRIO Alterado com SUCESSO!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar USUÁRIO!/nErro: "+ ex);
        }
        
    }
    
    public void Excluir(BeansUsuario mod){
        conex.conexao();
        
        try {
            PreparedStatement pst = conex.con.prepareStatement("delete from usuarios where usu_cod=?");
            pst.setInt(1, mod.getUsuCod());
            pst.execute();
            JOptionPane.showMessageDialog(null, "USUÁRIO Excluido com SUCESSO!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir USUÁRIO!/nErro: "+ ex);
        }
        
        conex.desconecta();
    }
    
    
    public BeansUsuario buscaUsuario(BeansUsuario mod){
        conex.conexao();
        conex.executaSql("select * from usuarios where usu_nome like'%" + mod.getUsuPesquisa()+"%'");
        
        try {
            conex.rs.first();
            mod.setUsuCod(conex.rs.getInt("usu_cod"));
            mod.setUsuNome(conex.rs.getString("usu_nome"));
            mod.setUsuario(conex.rs.getString("usu_usu"));
            mod.setUsuSenha(conex.rs.getString("usu_senha"));
            mod.setUsuTipo(conex.rs.getString("usu_tipo"));
                    } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "USUARIO NÃO CADASTRADO!");
        }
        
        conex.desconecta();
        return mod;
    }
}