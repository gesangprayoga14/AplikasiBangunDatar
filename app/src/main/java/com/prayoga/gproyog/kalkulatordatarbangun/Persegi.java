package com.prayoga.gproyog.kalkulatordatarbangun;

public class Persegi {
    private Double sisi;
    private Double luas;


    public void setSisi(Double sisi) {
        this.sisi = sisi;
    }

    public Double getSisi(){
        return sisi;

    }
    public Double luas() {
        return  sisi * sisi * sisi * sisi;

    }
}
