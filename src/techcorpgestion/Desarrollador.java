/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package techcorpgestion;

/**
 *
 * @author PC16
 */
public class Desarrollador extends Empleado {
    private String lenguajePrincipal;
    public Desarrollador(String nombre, String idEmpleado,double salario,String lenguajePrincipal){
        super(nombre,idEmpleado,salario);
        this.lenguajePrincipal = lenguajePrincipal;
    }
    public String getlenguajePrincipal(){
        return lenguajePrincipal;
    }
    public void setlenguajePrincipal(String lenguajePrincipal){
        this.lenguajePrincipal = lenguajePrincipal;
    }
     
    @Override//reescribir lo que tiene su clase madre
    public void trabajar(){
        System.out.println("Desarrollador "+ nombre + "esta programando en "+lenguajePrincipal + ".");
} 
    @Override
    public void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.println(" Rol: Desarrollador | lenguaje " + lenguajePrincipal);
    }
}
   