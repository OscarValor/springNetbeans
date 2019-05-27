
package controlador;

import modelo.Proceso;

public class ServicioDistribuido {
    
    //aquí definimos la dependencia, donde decimos al servicio que tiene que
    //ejecutar
    
    private Proceso proceso;
    
    public Object procesarResultado(){
        return proceso.ejecuta();
    }
    
        
    //definimos los getter y setters
    public Proceso getProceso() {
        return proceso;
    }

    public void setProceso(Proceso proceso) {
        this.proceso = proceso;
    }
    
    
    
}
