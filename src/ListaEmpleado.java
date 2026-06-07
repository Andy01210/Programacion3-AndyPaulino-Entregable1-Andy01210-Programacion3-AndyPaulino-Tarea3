import java.util.ArrayList;
import java.util.Scanner;
public class ListaEmpleado {
    ArrayList<Empleado> Empleados = new ArrayList<Empleado>();
    Scanner leer = new Scanner(System.in);
    public void Agregar(){
        System.out.println("Ingrese el nombre del empleado");
        String Nombre = leer.nextLine();
        System.out.println("\nIngrese la edad del empleado");
        int Edad = leer.nextInt();
        leer.nextLine();
        System.out.println("\nIngrese el correo del empleado");
        String Correo = leer.nextLine();
        System.out.println("\nIngrese el salario del empleado");
        double Salario = leer.nextDouble();
        leer.nextLine();
        try{
            UsuarioService.ValidarEmpleado(Nombre, Edad, Correo, Salario);
            Empleados.add(new Empleado(Nombre, Edad, Correo, Salario));
            System.out.println("Proceso FInalizado");
        }catch(EmpleadoValidator e){
            System.out.println(e.getMessage());
        }finally{
            System.out.println("Empleado agregado exitosamente");
        }
    }
    public void listar(){
        for(Empleado e : Empleados){
            System.out.println("Nombre: "+ e.getNombre());
            System.out.println("Edad: "+e.getEdad());
            System.out.println("Correo"+ e.getCorreo());
            System.out.println("Salario: "+ e.getSalario());
            System.out.println("_________________________________\n");
        }
    }
    
}
