package co.edu.uniquindio.parcial_1.model;

public class Docente {
    private String nombre;
    private String apellido;
    private int edad;
    private String correo;


    public Docente(String nombre, String apellido, int edad, String correo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public class DocenteAuxiliar{
        private String nombre;
        private String apellido;
        private int edad;
        private String correo;


        public DocenteAuxiliar(String nombre, String apellido, int edad, String correo) {
            this.nombre = nombre;
            this.apellido = apellido;
            this.edad = edad;
            this.correo = correo;
        }
        public static double obtenerPromedioNotaMayorCurso = 0.0;
    public static String mostrarInformacionEstudianteMayorEstatura = "";
    public static double obtenerEstudianteNota5Mayor4 = 0;

    public double calcularDefinitivaEstudiante(double nota1, double nota2, double nota3, double nota4, double nota5){

        double notaDefinitiva = (nota1+nota2+nota3+nota4+nota5)/5;
        return notaDefinitiva;
    }
    public void calcularPromedioNotaMayor( double definitivaEstudiante1, double definitivaEstudiante2,
                                        double definitivaEstudiante3){

        double promedioNotaMayor = 0;

        promedioNotaMayor = (definitivaEstudiante1 + definitivaEstudiante2 + definitivaEstudiante3) / 3;

        System.out.println("El promedio de la nota mayor es : " + promedioNotaMayor);
    }

    }
    public void calcularPromedioNotaMayor(Estudiante estudiante1, Estudiante estudiante2,
                                      Estudiante estudiante3) {

        double promNotaMayor = 0;

        promNotaMayor = (estudiante1.getNota1() + estudiante2.getNota1() + estudiante3.getNota1()) / 3;

        System.out.println("El Promedio de la nota mayor de los estudiantes en el curso es: " + promNotaMayor);

    }
    public double calcularNotaMaxEst(double nota1, double nota2, double nota3, double nota4, double nota5) {

        double notaMaxEst = nota1;

        if (nota2 > notaMaxEst) {
            notaMaxEst = nota2;
        }

        if(nota3 > notaMaxEst) {
            notaMaxEst = nota3;

            if(nota4 > notaMaxEst) {
                notaMaxEst = nota4;

                if(nota5 > notaMaxEst) {
                    notaMaxEst = nota5;
        }
        return notaMaxEst;
    }

    public void obtenerNotaMayorDelCurso(Estudiante estudiante1, Estudiante estudiante2,
                                          Estudiante estudiante3); {

        double notaMaxEst1 = calcularNotaMaxEst(estudiante1.getNota1(),estudiante1.getNota2(), estudiante1.getNota3());
        double notaMaxEst2 = calcularNotaMaxEst(estudiante2.getNota1(), estudiante2.getNota2(), estudiante2.getNota3());
        double notaMaxEst3 = calcularNotaMaxEst(estudiante3.getNota1(), estudiante3.getNota2(), estudiante3.getNota3());
        double notaMayorCurso = notaMaxEst1;

        if (notaMaxEst2 > notaMayorCurso) {
            notaMayorCurso = notaMaxEst2;
        }
        if(notaMaxEst3 > notaMayorCurso){
            notaMayorCurso = notaMaxEst3;
        }
        System.out.println("La nota mayor del curso es : " + notaMayorCurso);
    }

    }
    public String obtenerEstudianteNotaMayor4(String nombre, double nota1,double nota2, double nota3){
        if (nota1 >=4 && nota2 >=4 && nota3 >=4){
            CantidadEstudiantesNota5ayor4 = CantidadEstudiantesNota5Mayor4+1;
            System.out.println( "Los estudiantes "+nombre + apellido "tienen la nota 5 mayor a 4"

        return null;

        }



    }
