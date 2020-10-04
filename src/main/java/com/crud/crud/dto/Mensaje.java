package com.crud.crud.dto;

public class Mensaje {
    public String mensaje;

    public Mensaje(String mensaje){
        this.mensaje= mensaje;
    }

    public String getMensaje(){
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}
