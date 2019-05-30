package com.prayoga.gproyog.kalkulatordatarbangun;

public class Trapesium {
    private Double jmrusuksejajar;
    private Double tinggi;
    private Double luas;

    public void setJmrusuksejajar(Double jmrusuksejajar) {
        this.jmrusuksejajar = jmrusuksejajar;
    }

    public Double getJmrusuksejajar(){
        return jmrusuksejajar;

    }

    public void setTinggi(Double tinggi) {
        this.tinggi = tinggi;
    }
    public Double getTinggi(){
        return tinggi;
    }
    public Double luas() {
        return 0.5 * jmrusuksejajar * tinggi;
    }
}
