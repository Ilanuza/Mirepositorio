
package ArrayList;

/**
 *
 * @author chava
 */
public class Empleado {
    private String Nombre;
    private int edad;
    private double salario;

    public Empleado(String Nombre, int edad, double salario) {
        this.Nombre = Nombre;
        this.edad = edad;
        this.salario = salario;
    }
public String Mostrardatos (){
    return "Nombre: "+Nombre+", Edad: "+edad +", salario: "+ salario ;
}
    
    
}
