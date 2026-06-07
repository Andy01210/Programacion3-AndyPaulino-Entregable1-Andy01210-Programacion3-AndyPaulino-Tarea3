import java.util.Scanner;
public class Main{

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ListaEmpleado lista = new ListaEmpleado();
    int op;
    do{
       System.out.println("=========================");
       System.out.println("REGISTRO DE USUARIOS");
       System.out.println("=========================");
        System.out.println("1. Registrar usuari");
        System.out.println("2.Listar Empleados");
         System.out.println("3. Salir");
         op = leer.nextInt();
         leer.nextLine();
         switch(op){
            case 1:
                lista.Agregar();
                break;

            case 2:
                lista.listar();
                break;

            case 3:
                System.out.println("Gracias por participar");
                break;
         }


    }while(op != 3);
    
}
}
