package com.prayoga.gproyog.kalkulatordatarbangun;

public class LayangLayang {
    private Double diagonal1;
    private Double diagonal2;
    private Double luas;

    public void setDiagonal1(Double diaoganal1) {
        this.diagonal1 = diaoganal1;
    }

    public Double getDiaoganal1(){
        return diagonal1;

    }

    public void setDiagonal2(Double diagonal2) {
        this.diagonal2 = diagonal2;
    }
    public Double getDiagonal2(){
        return diagonal2;
    }
    public Double luas(){
        return 0.5 * diagonal1 * diagonal2;
    }
}
