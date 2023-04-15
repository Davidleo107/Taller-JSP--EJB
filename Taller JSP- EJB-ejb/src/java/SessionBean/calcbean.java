/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SessionBean;

import javax.ejb.Stateless;

/**
 *
 * @author david
 */
@Stateless
public class calcbean implements calcbeanLocal {
    
    
    @Override
    public Integer suma(int num1, int num2) {
        return num1+num2;
    }
    
    @Override
    public Integer resta(int num1, int num2) {
        return num1-num2;
    }
    
    @Override
    public Integer multiplicacion(int num1, int num2) {
        return num1*num2;
    }
    
    @Override
    public Integer division(int num1, int num2) {
        return num1/num2;
    }

    @Override
    public Integer modulo(int num1, int num2) {
        return null;
    }
    
    @Override
    public Integer potencia(int num1) {
        return num1*num1;
    }
    
    
}
