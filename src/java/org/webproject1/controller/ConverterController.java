/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.webproject1.controller;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.component.UIInput;
import javax.faces.component.UIPanel;
import javax.faces.context.FacesContext;
import org.webproject1.model.Converter;

/**
 *
 * @author NB_VAIO
 */
@ManagedBean(name = "converterController")
public class ConverterController {

    private Converter converter = new Converter();
    private UIPanel resultPanel;
    private UIInput numberInput;
    private UIInput number2Input;
    private UIInput signInput;
    private String result;
    private int number;
    private int number2;
    private String sign;

    public Converter getConverter() {
        return converter;
    }

    public void setConverter(Converter converter) {
        this.converter = converter;
    }

    public UIInput getSignInput() {
        return signInput;
    }

    public void setSignInput(UIInput signInput) {
        this.signInput = signInput;
    }

    

    public UIPanel getResultPanel() {
        return resultPanel;
    }

    public void setResultPanel(UIPanel resultPanel) {
        this.resultPanel = resultPanel;
    }

    public UIInput getNumberInput() {
        return numberInput;
    }

    public void setNumberInput(UIInput numberInput) {
        this.numberInput = numberInput;
    }

    public UIInput getNumber2Input() {
        return number2Input;
    }

    public void setNumber2Input(UIInput number2Input) {
        this.number2Input = number2Input;
    }

    public String Result() {
        FacesContext ctx = FacesContext.getCurrentInstance();
        try {

            converter.toResult();
            resultPanel.setRendered(true);
            ctx.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,
                    "Result", null));
        } catch (Exception ex) {
            resultPanel.setRendered(false);
            ctx.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,
                    ex.getMessage(), null));
        }
        return null;
    }

    

}
