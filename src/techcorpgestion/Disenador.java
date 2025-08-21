
package techcorpgestion;


public class Disenador extends Empleado {
    private String herramientaFavorita;
    
    public Disenador(String nombre, String idEmpleado, double salario, String herramientaFavorita){
        super(nombre, idEmpleado,salario);
        this.herramientaFavorita = herramientaFavorita;
    }
    public String getHerramientaFavorita(){
        return herramientaFavorita;
    }
    public void setHerramientaFavorita(String herramientaFavorita){
        this.herramientaFavorita = herramientaFavorita;
    }
    @Override
    public void trabajar(){
        System.out.println("Diseñador "+ nombre + "esta trabajando en  " + herramientaFavorita + ".");
    }
    @Override
    public void mostrarinfo(){
        super.mostrarInfo();
        System.out.println(" Rol: Diseñador │ Herramienta: " + herramientaFavorita );
    }
}
