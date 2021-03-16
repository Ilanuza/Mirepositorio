/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ni.edu.uni.programacion.controllers;

import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import ni.edu.uni.programacion.views.panels.PnlConversionTemplete;

/**
 *
 * @author JADPA26
 */
public class PnlTemperaturaController {
    private PnlConversionTemplete pnlConversionTemplate;
    private DefaultComboBoxModel<String> fromCmModel;
    private DefaultComboBoxModel<String> toCmModel;

    private final String TEMPERATURE []= new String []{"Celsuis","Farenheit"}; 
        
    public PnlTemperaturaController(PnlConversionTemplete pnlConversionTemplate) {
        this.pnlConversionTemplate = pnlConversionTemplate;
    }
    private void initComponent(){
        fromCmModel = new DefaultComboBoxModel<> (TEMPERATURE);
        toCmModel = new DefaultComboBoxModel<> (TEMPERATURE);
    
    pnlConversionTemplate.getCmtFrom().setModel(fromCmModel);
       pnlConversionTemplate.getCmbTo().setModel(toCmModel);
       
       pnlConversionTemplate.getConvertir().addActionListener((ActionEvent e) -> {
          btnConActionPerformed(e);
        });
    }
    
    private  void btnConActionPerformed( ActionEvent e){
        int indexFrom = pnlConversionTemplate.getCmtFrom().getSelectedIndex();
        int indexTo = pnlConversionTemplate.getCmbTo().getSelectedIndex();
        double value = Double.parseDouble(pnlConversionTemplate.getTxtxValue().getSelectedText());
      double result =  ConvertirTemperature (value,indexFrom, indexTo);
      pnlConversionTemplate.getLblResult().setText("Resultado:"+result);
    
    }
    private double  celsuisToFarenheit (double value){
        return (((double) 9/5 * value) +32);
    }
    private double farenheittocelsuis (double value){
        return (((double)5/9 *(value-32)));
    }
    
    private double ConvertirTemperature (double value, int from, int to){
        switch(from){
            case 0:
                switch (to){
                    case 0: 
                        return value;
                    case 1: 
                        return celsuisToFarenheit(value);
                }
            case 1: 
                switch (to){
                    case 0:
                        return farenheittocelsuis (value);
                }
        } 
        return value;
    }
}