/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelBeans;

import java.util.Date;

/**
 *
 * @author daniel
 */
public class BeansAgendamento {
    private int agendaCod;
    private String hora;
    private String nomeHosp;
    private String nomePac;
    private String nomeAcom;
    private String turno;
    private String carro;
    private String status;
    private Date data;

    public String getNomeAcom() {
        return nomeAcom;
    }

    public void setNomeAcom(String nomeAcom) {
        this.nomeAcom = nomeAcom;
    }

    public int getAgendaCod() {
        return agendaCod;
    }

    public void setAgendaCod(int agendaCod) {
        this.agendaCod = agendaCod;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getNomeHosp() {
        return nomeHosp;
    }

    public void setNomeHosp(String nomeHosp) {
        this.nomeHosp = nomeHosp;
    }

    public String getNomePac() {
        return nomePac;
    }

    public void setNomePac(String nomePac) {
        this.nomePac = nomePac;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getCarro() {
        return carro;
    }

    public void setCarro(String carro) {
        this.carro = carro;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
}