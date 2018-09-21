/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isw_tp;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author aleex
 */
public class DE_Pedido implements Serializable{
    private LocalDate fechaEntrega;
    private String tipoEntrega;
    private String horaEntrega;
    private String calleDireccion;
    private int numeroDireccion;
    private String pisoDireccion;
    private String dptoDireccion;
    private double dineroIngresado;
    private double total;
    private double numeroTarjeta;
    private String nombreTarjeta;
    private int codigoTarjeta;
    private String fechaVencimiento;

    public DE_Pedido(LocalDate fechaEntrega, String tipoEntrega, String horaEntrega, String calleDireccion, int numeroDireccion, double dineroIngresado, double total) {
        this.fechaEntrega = fechaEntrega;
        this.tipoEntrega = tipoEntrega;
        this.horaEntrega = horaEntrega;
        this.calleDireccion = calleDireccion;
        this.numeroDireccion = numeroDireccion;
        this.dineroIngresado = dineroIngresado;
        this.total = total;
    }

    public DE_Pedido(LocalDate fechaEntrega, String tipoEntrega, String horaEntrega, String calleDireccion, int numeroDireccion, double total, double numeroTarjeta, String nombreTarjeta, int codigoTarjeta, String fechaVencimiento) {
        this.fechaEntrega = fechaEntrega;
        this.tipoEntrega = tipoEntrega;
        this.horaEntrega = horaEntrega;
        this.calleDireccion = calleDireccion;
        this.numeroDireccion = numeroDireccion;
        this.total = total;
        this.numeroTarjeta = numeroTarjeta;
        this.nombreTarjeta = nombreTarjeta;
        this.codigoTarjeta = codigoTarjeta;
        this.fechaVencimiento = fechaVencimiento;
    }

    public void setFechaEntrega(LocalDate fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public void setTipoEntrega(String tipoEntrega) {
        this.tipoEntrega = tipoEntrega;
    }

    public void setHoraEntrega(String horaEntrega) {
        this.horaEntrega = horaEntrega;
    }

    public void setCalleDireccion(String calleDireccion) {
        this.calleDireccion = calleDireccion;
    }

    public void setNumeroDireccion(int numeroDireccion) {
        this.numeroDireccion = numeroDireccion;
    }

    public void setPisoDireccion(String pisoDireccion) {
        this.pisoDireccion = pisoDireccion;
    }

    public void setDptoDireccion(String dptoDireccion) {
        this.dptoDireccion = dptoDireccion;
    }

    public void setDineroIngresado(double dineroIngresado) {
        this.dineroIngresado = dineroIngresado;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public void setNumeroTarjeta(double numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public void setNombreTarjeta(String nombreTarjeta) {
        this.nombreTarjeta = nombreTarjeta;
    }

    public void setCodigoTarjeta(int codigoTarjeta) {
        this.codigoTarjeta = codigoTarjeta;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public LocalDate getFechaEntrega() {
        return fechaEntrega;
    }

    public String getTipoEntrega() {
        return tipoEntrega;
    }

    public String getHoraEntrega() {
        return horaEntrega;
    }

    public String getCalleDireccion() {
        return calleDireccion;
    }

    public int getNumeroDireccion() {
        return numeroDireccion;
    }

    public String getPisoDireccion() {
        return pisoDireccion;
    }

    public String getDptoDireccion() {
        return dptoDireccion;
    }

    public double getDineroIngresado() {
        return dineroIngresado;
    }

    public double getTotal() {
        return total;
    }

    public double getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public String getNombreTarjeta() {
        return nombreTarjeta;
    }

    public int getCodigoTarjeta() {
        return codigoTarjeta;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }
    
    
}
