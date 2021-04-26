package com.victorrmrz.prueba.dto;

import javax.validation.constraints.NotBlank;

public class PaisDto {
    @NotBlank
    private String nombre;
    @NotBlank
    private String capital;
    @NotBlank
    private String urlImg;
    @NotBlank
    private String zonas;

    public PaisDto() {
    }

    public PaisDto(String nombre, String capital, String urlImg, @NotBlank String zonas) {
        this.nombre = nombre;
        this.capital = capital;
        this.urlImg = urlImg;
        this.zonas = zonas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUrlImg() {
        return urlImg;
    }

    public void setUrlImg(String urlImg) {
        this.urlImg = urlImg;
    }

    public String getZonas() {
        return zonas;
    }

    public void setZonas(String zonas) {
        this.zonas = zonas;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }
}
