package co.edu.uniquindio.parcial_1.model;

public class Curso {

    private String nombre;
    private int semestre;
    private String grupo;
    private int creditos;
    private String jornada;
    private String programa;
    private String facultad;
    private Estudiante estudiante1;
    private Estudiante estudiante2;
    private Estudiante estudiante3;
    private Docente docente;
    private Docente docenteAuxiliar;


    public Curso(String nombre, int semestre, String grupo, int creditos, String jornada, String programa,
                 String facultad, Estudiante estudiante1, Estudiante estudiante2, Estudiante estudiante3,
                 Docente docente, Docente docenteAuxiliar) {
        this.nombre = nombre;
        this.semestre = semestre;
        this.grupo = grupo;
        this.creditos = creditos;
        this.jornada = jornada;
        this.programa = programa;
        this.facultad = facultad;
        this.estudiante1 = estudiante1;
        this.estudiante2 = estudiante2;
        this.estudiante3 = estudiante3;
        this.docente = docente;
        this.docenteAuxiliar = docenteAuxiliar;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public String getJornada() {
        return jornada;
    }

    public void setJornada(String jornada) {
        this.jornada = jornada;
    }

    public String getPrograma() {
        return programa;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    public Estudiante getEstudiante1() {
        return estudiante1;
    }

    public void setEstudiante1(Estudiante estudiante1) {
        this.estudiante1 = estudiante1;
    }

    public Estudiante getEstudiante2() {
        return estudiante2;
    }

    public void setEstudiante2(Estudiante estudiante2) {
        this.estudiante2 = estudiante2;
    }

    public Estudiante getEstudiante3() {
        return estudiante3;
    }

    public void setEstudiante3(Estudiante estudiante3) {
        this.estudiante3 = estudiante3;
    }

    public Docente getDocente() {
        return docente;
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }

    public Docente getDocenteAuxiliar() {
        return docenteAuxiliar;
    }

    public void setDocenteAuxiliar(Docente docenteAuxiliar) {
        this.docenteAuxiliar = docenteAuxiliar;
    }

    public void mostrarInformacionEstudianteMayorEstatura() {
        String informacionEstudiante1 = getEstudiante1().getEstatura();
        String informacionEstudiante2 = getEstudiante2().getEstatura();
        String informacionEstudiante3 = getEstudiante3().getEstatura();
        System.out.println("Informacion del estudiante 1: "+ informacionEstudiante1);
        System.out.println("Informacion del estudiante 2: "+ informacionEstudiante2);
        System.out.println("Informacion del estudiante 3: "+ informacionEstudiante3);

    }

    public double calcularNotaDefinitivaCadaEstudiante(){
        double promedioEstudiante1 = 0.0;
        double promedioEstudiante2 = 0.0;
        double promedioEstudiante3 = 0.0;
        double notaDefinitiva = 0.0;
        promedioEstudiante1 = getEstudiante1().calcularPromedio();
        promedioEstudiante2 = getEstudiante2().calcularPromedio();
        promedioEstudiante3 = getEstudiante3().calcularPromedio();
        System.out.println("La nota definitiva del estudiante" + getNombre() + getApellido(), "es:"
            + notaDefinitiva);
        return notaDefinitiva;
    }


    public String obtenerEstudianteNota5Mayor4(){
        double nota5Mayor4Estudiante1 = 0.0;
        double nota5Mayor4Estudiante2 = 0.0;
        double nota5Mayor4Estudiante3 = 0.0;
        String obtenerInformacion = "";
        nota5Mayor4Estudiante1 = getEstudiante1().mostrarNota5();
        nota5Mayor4Estudiante2 = getEstudiante2().mostrarNota5();
        nota5Mayor4Estudiante3 = getEstudiante3().mostrarNota5();

       System.out.println("Los estudiantes con la nota 5 mayor a 4, son :" + getNombre() + getApellido());
        return obtenerInformacion;
    }
}