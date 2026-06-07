public class Empleado {
    private String Nombre;
    private int Edad;
    private String Correo;
    private double Salario;

    public Empleado(String n, int edad, String correo, double salario){
        setNombre(n);
        setEdad(edad);
        setCorreo(correo);
        setSalario(salario);

    }
    public void setNombre(String nombre){Nombre = nombre;}
    public void setEdad(int edad){Edad = edad;}
    public void setCorreo(String correo){Correo = correo;}
    public void setSalario(double salario){Salario = salario;}
    public String getNombre(){return Nombre;}
    public int getEdad(){return Edad;}
    public String getCorreo(){return Correo;}
    public double getSalario(){return Salario;}
}
