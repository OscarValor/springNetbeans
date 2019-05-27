
package proyectoidsetter;

import controlador.ServicioDistribuido;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProyectoIDsetter {

    public static void main(String[] args) {
       
        // con esto cargamos el contexto con los beans
        //que vamos a usar
        ClassPathXmlApplicationContext applicationContext= 
              new ClassPathXmlApplicationContext("conf/applicationContext.xml");
        
        //inyectamos una
        ServicioDistribuido servicio=(ServicioDistribuido) applicationContext.getBean("servicio");
        System.out.println("proyectoidsetter.ProyectoIDsetter.main()-->"+servicio.procesarResultado());
    
        applicationContext.close();
    }
    
}
