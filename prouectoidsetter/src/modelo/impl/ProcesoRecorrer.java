/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.impl;

import java.util.ArrayList;
import modelo.Proceso;

/**
 *
 * @author MAVAMUOS
 */
public class ProcesoRecorrer implements Proceso {
    @Override
    public Object ejecuta(){
        StringBuilder respuesta=new StringBuilder();
        ArrayList lista=new ArrayList();
        lista.add("uno");
        lista.add("dos");
        lista.add(3.13);
        for(Object tmp:lista){
            respuesta.append(tmp);
        }
        
        return respuesta.toString();
    }
    
}
