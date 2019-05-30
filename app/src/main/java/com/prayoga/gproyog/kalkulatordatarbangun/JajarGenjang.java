package com.prayoga.gproyog.kalkulatordatarbangun;

public class JajarGenjang {
    private Double alas;
    private Double tinggi;
    private Double luas;

    public void setAlas(Double alas) {
        this.alas = alas;
    }

    public Double getAlas() {
        return alas;

    }

    public void setTinggi(Double tinggi) {
        this.tinggi = tinggi;
    }

    public Double getTinggi() {
        return tinggi;
    }

    public Double luas() {
        return   alas * tinggi;
    }
}
