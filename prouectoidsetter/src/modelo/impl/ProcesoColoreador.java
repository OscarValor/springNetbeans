/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.impl;

import modelo.Proceso;

/**
 *
 * @author MAVAMUOS
 */
public class ProcesoColoreador implements Proceso{
    @Override
    public Object ejecuta(){
    int numero = (int)(Math.random()*100);
    
    if(numero<30)
        return "PROCESO EN ROJO";
    else if(numero<60){
        return "PROCESO EN VERDE";
    }else{
            return "PROCESO EN AZUL";
    }
    }
    
}
