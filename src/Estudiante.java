

class Persona{
    private int edad;
    protected String nombre;
    private int altura;
    String sexo;
    protected  String nivelEducacion;

    
    // Constructor
    public Persona(int edad, String nombre, int altura, String sexo, String nivelEducacion) {
        this.edad = edad;
        this.nombre = nombre;
        this.altura = altura;
        this.sexo = sexo;
        this.nivelEducacion = nivelEducacion;
    }

    // Getters
    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getAltura() {
        return altura;
    }

    public String getSexo() {
        return sexo;
    }

    public String getNivelEducacion() {
        return nivelEducacion;
    }

    // Setters
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setNivelEducacion(String nivelEducacion) {
        this.nivelEducacion = nivelEducacion;
    }

    protected String dormir(boolean durmiendo){
        if(durmiendo)
            return "Estoy durmiendo";
        else
            return "No estoy durmiendo";
    }

    private String comer(boolean comiendo){
        if(comiendo)
            return "Estoy Comiendo";
        else
        return "No estoy Comiendo";
    }

    String tomarShower(boolean shower){
        if(shower)
            return "Estoy bañando";
        else
            return "No me estoy bañando";
    }

}

public class Estudiante extends Persona{
    private int matricula;
    private String carrera;

    // Constructor
    public Estudiante(int edad, String nombre, int altura, String sexo, String nivelEducacion, int matricula, String carrera){
        super(edad,nombre,altura,sexo, nivelEducacion);
        this.matricula = matricula;
        this.carrera = carrera;
    }
    
    protected String clase(boolean irClases){
        if(irClases)
            return "Fui a clases";
        else
            return "No fui a clases";
    }

    private String estudiar(boolean estudiando){
        if(estudiando)
            return "Estoy estudiando";
        else
            return "No estoy estudiando";
    }

    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante(25, "Alan Torres", 178, "Hombre", "Universidad", 2201636,"ISTE");
        // Ver si esta durmiendo
        System.out.println("Metodo de la clase Persona[Protected], Durmiendo: "+estudiante.dormir(false));
        // Ver si se baño
        System.out.println("Metood de la clase Persona[Defatult], Shower: " + estudiante.tomarShower(true));
        
        // Ver si estoy comiendo. (Marca error, porque no es visible para la clase Estudiante) 
        //System.out.println("Metood de la clase Persona[Private], Comer: " + estudiante.comer(true)); 

        // Ver si fui a clases
        System.out.println("Metodo de la clase Estudiante[Protected], Clase: " + estudiante.clase(true));
        // Ver si estoy estudiando
        System.out.println("Metodo de la clase Estudiante[Private], Estudiar: " + estudiante.estudiar(false));
    }
}