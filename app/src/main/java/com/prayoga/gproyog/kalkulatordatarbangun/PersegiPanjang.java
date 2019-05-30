package com.prayoga.gproyog.kalkulatordatarbangun;

public class PersegiPanjang {

    private Double panjang;
    private Double lebar;
    private Double luas;

    public void setPanjang(Double panjang) {
        this.panjang = panjang;
    }

    public Double getPanjang() {
        return panjang;

    }

    public void setLebar(Double lebar) {
        this.lebar = lebar;
    }

    public Double getLebar() {
        return lebar;
    }

    public Double luas() {
        return panjang * lebar;
    }
}
