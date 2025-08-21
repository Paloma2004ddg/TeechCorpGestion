
package techcorpgestion;

public class Main {
    private static java.util.ArrayList<Empleado> empleados = new java.util.ArrayList<>();//acceso mas rapido arraylist 
    private static java.util.Scanner sc  = new java.util.Scanner(System.in);

    public static void main(String [] arg){
        inicializarDatos();
        mostrarMenu();
    }
    //datos de prueba
    public static void inicializarDatos(){
        empleados.add(new Desarrollador ("Ana Lopez", "DEV001",4500,"Java"));
        empleados.add(new Gerente ("Carlos Ruiz", "MGR001",700,"Tecnologia"));
        empleados.add(new Disenador ("Lucia Mendez ", "DES001",4000,"Figma"));
    }
    public static void mostrarMenu(){
        int opcion;
        do{
            System.out.println("\n=== TECHCORP S.A. - Gestion de Empleado === ");
            System.out.println("1. Mostrar todos los empleados");
            System.out.println("2. Buscar empleado por ID");
            System.out.println("3. Agregar nuevo empleado");
            System.out.println("4. Simular trabajo (polimorfismo) ");
            System.out.println("5. Salir");
            System.out.println("Seleccione una opción: ");
            opcion = sc.nextInt();
           sc.nextLine(); //limpiar buffer
           switch (opcion){
               case 1:
                   mostrarEmpleados();
                   break;
               case 2:
                   buscarEmpleado();
                   break;
               case 3:
                   agregarEmpleado();
                   break;
               case 4:
                   simularTrabajo();
                   break;
               case 5:
                   System.out.println("Gracias por usar  el sistema.");
                   break;
               default:
                   System.out.println("Opcion no valida.");
           }
    }while (opcion != 5);
        
}
    public static void mostrarEmpleados(){
        System.out.println("\nLista de Empleados: ");
        if(empleados.isEmpty()){
            System.out.println("No hay empleados registrados.");
        }
        else{
            for(Empleado  e : empleados){
                e.mostrarInformacion();
                System.out.println("--------------------------------");
            }
        }
    }
    public static void buscarEmpleado(){
        System.out.print("Ingrese  el ID del empleado: ");
        String id = sc.nextLine();
        boolean encontrado = false;
        for(Empleado e: empleados){
            if(e.getIdEmpleado().equalsIgnoreCase(id));
                System.out.println("Empleado encontrado:");
                e.mostrarInformacion();
                encontrado = true;
                break;
                
        }
        if (!encontrado){
             System.out.println("No se encontro un empleado con ID " + id);
        }
    }

    public static void agregarEmpleado(){
        System.out.println("¿Que tipo de empleado desea agregar?");
        System.out.println("1. Desarrollador 2. Gerente 3. Diseñador");
        int tipo = sc.nextInt();
        sc.nextLine();

        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        System.out.print("ID: ");
        String id = sc.nextLine();
        System.out.print("Salario: ");
        double salario = sc.nextDouble();
        sc.nextLine();
        
        switch (tipo){
            case 1: 
                System.out.print("Lenguaje principal: ");
                String lenguaje = sc.nextLine();
                empleados.add(new Desarrollador(nombre, id,salario, lenguaje));
                System.out.println("Desarrollador agregado.");
                break;
            case 2: 
                System.out.print("Departamento: ");
                String departamento = sc.nextLine();
                empleados.add(new Gerente(nombre, id,salario, departamento));
                System.out.println("Gerente agregado.");
                break;
           case 3: 
                System.out.print("Herramienta Favorita: ");
                String herramienta = sc.nextLine();
                empleados.add(new Disenador(nombre, id,salario, herramienta));
                System.out.println("Diseñador agregado.");
                break;  
           default:
               System.out.println("Tipo no valido.");
                  
        }
    }
    public static void simularTrabajo(){
        System.out.println("\nSimulado trabajo de empleadoa...");
        for (Empleado e : empleados){
            e.trabajar();//aqui se aplica el polimorfismo
        }
    }


}

    
