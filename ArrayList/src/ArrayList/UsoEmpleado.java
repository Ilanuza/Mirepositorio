
package ArrayList;

import java.util.*;

/**
 *
 * @author chava
 */
public class UsoEmpleado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        
        /*Empleado listaEmpleado [] = new Empleado [4];
      
      listaEmpleado [0] = new Empleado ("Ana", 45, 2500);
      
       listaEmpleado [1] = new Empleado ("Antonio", 55, 2000);
       
        listaEmpleado [2] = new Empleado ("Maria", 25, 2600);
        
         listaEmpleado [3] = new Empleado ("Maria", 25, 2600);
        */
        
        ArrayList<Empleado> listaEmpleado = new ArrayList<Empleado>() ;
        
       //listaEmpleado.ensureCapacity(11);
        
        listaEmpleado.add(new Empleado ("Ana", 45, 2500));
        
        listaEmpleado.add(new Empleado ("Antonio", 55, 2000));
        
        listaEmpleado.add(new Empleado ("Maria", 25, 2600));
        
        listaEmpleado.add(new Empleado ("jose", 35, 2200));
         
        listaEmpleado.add(new Empleado ("Ana", 45, 2500));
        
        listaEmpleado.add(new Empleado ("Antonio", 55, 2000));
        
        listaEmpleado.add(new Empleado ("Maria", 25, 2600));
        
        listaEmpleado.add(new Empleado ("jose", 35, 2200));
         
        listaEmpleado.add(new Empleado ("pedro", 22 , 2200));
         
        listaEmpleado.add(new Empleado ("Ana", 45, 2500));
        
        listaEmpleado.add(new Empleado ("Antonio", 55, 2000));
        
        listaEmpleado.add(new Empleado ("Maria", 25, 2600));
        
        listaEmpleado.add(new Empleado ("jose", 35, 2200));
         
         listaEmpleado.add(new Empleado ("pedro", 22 , 2200));
         
        // listaEmpleado.trimToSize();
         
       //  listaEmpleado.add( new Empleado ("olga", 22 , 2200));
         
       listaEmpleado.set(1, new Empleado ("olga", 22 , 2200));
        
    /*   System.out.println(listaEmpleado.get(1).Mostrardatos());
       
         System.out.println(listaEmpleado.size());
        
        
         
        
     /*   for (Empleado e: listaEmpleado){
            System.out.println(e.Mostrardatos());
        }
     
     
     for (int i=0; i<listaEmpleado.size();i++){
       Empleado e= listaEmpleado.get(i);
       System.out.println(e.Mostrardatos());
     }
    */
    
     Empleado arrayEmpleado [] = new Empleado [listaEmpleado.size()];
     
     listaEmpleado.toArray(arrayEmpleado );
     
     for (int i=0;i < arrayEmpleado.length;i++){
         System.out.println();
     }
    }
    
}
