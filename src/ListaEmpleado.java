import java.util.*;

public class ListaEmpleado {
    ArrayList<Empleado> Empleados = new ArrayList<Empleado>();
    Scanner leer = new Scanner(System.in);
    public void Agregar(){
         try{
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
       
            UsuarioService.ValidarEmpleado(Nombre, Edad, Correo, Salario);
            Empleados.add(new Empleado(Nombre, Edad, Correo, Salario));
            System.out.println("Empleado agregado exitosamente");
        }catch(EmpleadoValidator a){
            System.out.println(a.getMessage());
        }catch(EdadValidator e){
            System.out.println(e.getMessage());
        }catch(CorreoValidator i){
            System.out.println(i.getMessage());
        }
        catch(SalarioValidator o){
            System.out.println(o.getMessage());
        }catch(InputMismatchException u){
            leer.nextLine(); 
            System.out.println("\"Error: Debe ingresar un numero correcto");
        }catch(Exception b){
            System.out.println("Error fuera de lo comun:"+ b.getMessage());

        }finally{
            System.out.println("Proceso FInalizado");
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
