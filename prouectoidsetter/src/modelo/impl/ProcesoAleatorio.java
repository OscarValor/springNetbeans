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
public class ProcesoAleatorio implements Proceso {
    
    @Override
    public Object ejecuta(){
        return (int)(Math.random()*100);
    }
    
}
