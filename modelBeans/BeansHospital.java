/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelBeans;

/**
 *
 * @author daniel
 */
public class BeansHospital {
    private int codHosp;
    private String nomeHosp;
    private String estadoHosp;
    private String hospPesquisa;

    public String getHospPesquisa() {
        return hospPesquisa;
    }

    public void setHospPesquisa(String hospPesquisa) {
        this.hospPesquisa = hospPesquisa;
    }

    public String getEstadoHosp() {
        return estadoHosp;
    }

    public void setEstadoHosp(String estadoHosp) {
        this.estadoHosp = estadoHosp;
    }
    private String pesquisa;

    public String getPesquisa() {
        return pesquisa;
    }

    public void setPesquisa(String pesquisa) {
        this.pesquisa = pesquisa;
    }

    public int getCodHosp() {
        return codHosp;
    }

    public void setCodHosp(int codHosp) {
        this.codHosp = codHosp;
    }

    public String getNomeHosp() {
        return nomeHosp;
    }

    public void setNomeHosp(String nomeHosp) {
        this.nomeHosp = nomeHosp;
    }   
    
}