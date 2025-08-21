/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package techcorpgestion;

public  abstract class Empleado {
    protected String nombre;
    protected String idEmpleado;
    protected double salario;
    //constructor
    
   public Empleado(String nombre, String idEmpleado, double salario){
       this.nombre = nombre;
       this.idEmpleado = idEmpleado;
       this.salario = salario;
   }
    //getters y setters
   public String getnombre(){
       return nombre;
   }
   public void setnombre(String nombre){
       this.nombre = nombre;
   }
   public String getIdEmpleado(){
       return idEmpleado;
   }
   public void setIdEmpleado(String idEmpleado){
       this.idEmpleado = idEmpleado;
   }
   public double getsalario(){
       return salario;
   }
   public void setsalario(double salario){
       this.salario = salario;
   }
   //metodo abstracto(polimorfismo)
   public abstract void trabajar();
    
   //metodo comun
   public void mostrarInformacion(){
       System.out.println("ID: "+ idEmpleado + " | Nombre: "+ nombre + "| Salario: $" + salario);
   }
}
