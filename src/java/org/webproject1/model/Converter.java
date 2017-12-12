/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.webproject1.model;

/**
 *
 * @author NB_VAIO
 */
public class Converter {

    private int number;
    private int number2;
    private String sign;
    private String result;

    public int getNumber2() {
        return number2;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public void toResult() {

        if (sign.equals("+")) {
            int k = number + number2;
            result = String.valueOf(k);
        } else if (sign.equals("-")) {
            int k = number - number2;
            result = String.valueOf(k);
        } else if (sign.equals("*")) {
            int k = number * number2;
            result = String.valueOf(k);
        } else if (sign.equals("/")) {
            int k = number / number2;
            result = String.valueOf(k);
        }
    }

}
