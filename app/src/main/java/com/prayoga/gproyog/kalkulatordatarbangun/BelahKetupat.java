package com.prayoga.gproyog.kalkulatordatarbangun;

public class BelahKetupat {
    private Double diaoganal1;
    private Double diagonal2;
    private Double luas;

    public void setDiaoganal1(Double diaoganal1) {
        this.diaoganal1 = diaoganal1;
    }

    public Double getDiaoganal1(){
        return diaoganal1;

    }

    public void setDiagonal2(Double diagonal2) {
        this.diagonal2 = diagonal2;
    }
    public Double getDiagonal2(){
        return diagonal2;
    }
    public Double luas(){
        return 0.5 * diaoganal1 * diagonal2;
    }
}
