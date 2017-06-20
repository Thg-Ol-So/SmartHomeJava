/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import com.towel.el.annotation.Resolvable;

/**
 *
 * @author oliveira
 */

    public class Agenda {
    @Resolvable(colName = "ID")
    private int id;
    @Resolvable(colName = "Data e Hora")
    private String data_hora;
    @Resolvable(colName = "Luz Sala")
    private String estadoLuzSala;
    @Resolvable(colName = "Luz Quarto")
    private String estadoLuzQuarto;
    @Resolvable(colName = "Ventilador")
    private String estadoVentilador;
    @Resolvable(colName = "Tv")
    private String estadoTelevisor;
    private String estado;

    public Agenda() {
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getData_hora() {
        return data_hora;
    }

    public void setData_hora(String data_hora) {
        this.data_hora = data_hora;
    }

    public String getEstadoLuzSala() {
        return estadoLuzSala;
    }

    public void setEstadoLuzSala(String estadoLuzSala) {
        this.estadoLuzSala = estadoLuzSala;
    }

    public String getEstadoLuzQuarto() {
        return estadoLuzQuarto;
    }

    public void setEstadoLuzQuarto(String estadoLuzQuarto) {
        this.estadoLuzQuarto = estadoLuzQuarto;
    }

    public String getEstadoVentilador() {
        return estadoVentilador;
    }

    public void setEstadoVentilador(String estadoVentilador) {
        this.estadoVentilador = estadoVentilador;
    }

    public String getEstadoTelevisor() {
        return estadoTelevisor;
    }

    public void setEstadoTelevisor(String estadoTelevisor) {
        this.estadoTelevisor = estadoTelevisor;
    }


    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

}
