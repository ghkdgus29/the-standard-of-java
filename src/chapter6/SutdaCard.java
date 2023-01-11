package chapter6;

import chapter3.Ex3_2;

public class SutdaCard {

    private int num;
    private boolean isKwang;

    public SutdaCard() {
        this(1, true);
    }

    public SutdaCard(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }

    public String info() {
        return num + (isKwang ? "K" : "");
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public boolean isKwang() {
        return isKwang;
    }

    public void setKwang(boolean kwang) {
        isKwang = kwang;
    }
}
