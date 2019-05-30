package com.prayoga.gproyog.kalkulatordatarbangun;

public class Lingkaran {
    private Double ruas;
    private Double luas;


    public void setRuas(Double ruas) {
        this.ruas = ruas;
    }

    public Double getSisi(){
        return ruas;

    }
    public Double luas() {
        return  Math.PI * Math.pow(ruas, 2);
    }
}
