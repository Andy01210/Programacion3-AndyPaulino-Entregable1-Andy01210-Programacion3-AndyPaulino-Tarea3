public class UsuarioService{
    public static  void ValidarEmpleado(String Nombre, int Edad, String Correo,double Salario)throws EmpleadoValidator{
        int contador = 0;
        for(char n: Nombre.toCharArray()){
            contador++;
        }
        if(Nombre.isEmpty()|| contador < 3){
            throw new EmpleadoValidator("Error: Nombre invalido");
        }else{
            System.out.println("Nombre Validado Correctamente");
        }
        if(Edad > 100 || Edad < 18){
            throw new EmpleadoValidator("Error: Edad invalida");
        }else{
            System.out.println("Edad ingresada correctamente");
        }
        boolean Arroba = Arroba(Correo);
        boolean Punto = Punto(Correo);
        if(Arroba == false || Punto == false){
            throw new EmpleadoValidator("Error: EL Correo debe contener un arrooba(@)");
        } else{
            System.out.println("Correo registrado exitosamente");
        }
        if(Salario < 0){
            throw new EmpleadoValidator("Error: Salario invalido");
        }

    }
    public static boolean Arroba(String correo){
        boolean arroba = false;
        for(char A : correo.toCharArray()){
            if(A ==('@')){
                arroba = true;
            }
        }
        return arroba;
    }
     public static boolean Punto(String correo){
        boolean punto = false;
        for(char A : correo.toCharArray()){
            if(A ==('.')){
                punto = true;
            }
        }
        return punto;
    }
    
}