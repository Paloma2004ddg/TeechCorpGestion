
package techcorpgestion;

public class Gerente extends Empleado {
    private String departamento;
    
    public Gerente(String nombre, String idEmpleado, double salario,String departamento){
        super(nombre, idEmpleado,salario);
        this.departamento = departamento;
    }
    public String getDepartamento(){
        return departamento;
    }
    public void setDepartamento(String departamento){
        this.departamento = departamento;
    }

    @Override
    public void trabajar() {
        System.out.println("Gerente "+nombre + "esta supervisando el departamento de " + departamento);
    }

}
