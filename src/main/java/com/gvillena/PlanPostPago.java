/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gvillena;

/**
 *
 * @author Fortress of Solitude
 */
public class PlanPostPago {
    
    private String codigoPlan; 
            
    private String nombrePlan;
    
    private int minutos;
    private boolean minutosIlimitado; 
    
    private int rpc;
    private boolean rpcIlimitado;
    
    private int sms;
    private boolean smsIlimitado;
    
    private int internet;
    private boolean internetIlimitado;

    /**
     * 
     */
    public PlanPostPago() {        
    }

    /**
     * 
     * @return 
     */
    public String getCodigoPlan() {
        return codigoPlan;
    }

    /**
     * 
     * @param codigoPlan 
     */
    public void setCodigoPlan(String codigoPlan) {
        this.codigoPlan = codigoPlan;
    }    
    
    /**
     * 
     * @return Devuelve el nombre del plan
     */
    public String getNombrePlan() {
        return nombrePlan;
    }

    /**
     * Obtener nombre del plan 
     * @param nombrePlan 
     */
    public void setNombrePlan(String nombrePlan) {
        this.nombrePlan = nombrePlan;
    }    
        
    /**
     * 
     * @param minutos 
     */
    public void setMinutos(int minutos) {        
        this.minutos = minutos;
        this.minutosIlimitado = false;
    }
    
    /**
     * Obtener Minutos Ilimitados
     * @param minutosIlimitado 
     */
    public void setMinutosIlimitado(boolean minutosIlimitado) {                        
        this.minutosIlimitado = minutosIlimitado;        
        this.minutos = 0;        
    }
    
    /**
     * 
     */
    public String getMinutos() {
        return minutosIlimitado ? "Ilimitado" : String.format("%d", minutos);
    }    
    
    
    public void setRpc(int rpc) {
        this.rpc = rpc;
        this.rpcIlimitado = false;
    }
    
    public void setRpcIlimitado(boolean rpcIlimitado) {
        this.rpcIlimitado = rpcIlimitado;        
        this.rpc = 0;
    }    
    
    public String getRpc() {
        return rpcIlimitado ? "Ilimitado" : String.format("%d", rpc);
    }
    public String getSms() {
        return smsIlimitado ? "Ilimitado" : String.format("%d", sms);
    }    

    public void setSms(int sms) {
        this.sms = sms;
    }
    
    public void setSmsIlimitado(boolean smsIlimitado) {
        this.smsIlimitado = smsIlimitado;
    }

    public String getInternet() {
        return internetIlimitado ? "Ilimitado" : String.format("%dMB", internet);
    }

    public void setInternet(int internet) {
        this.internet = internet;
    }
    
    public void setInternetIlimitado(boolean internetIlimitado) {
        this.internetIlimitado = internetIlimitado;
    }    
    
}
