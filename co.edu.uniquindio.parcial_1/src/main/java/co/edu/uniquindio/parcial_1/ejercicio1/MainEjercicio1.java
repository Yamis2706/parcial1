package co.edu.uniquindio.parcial_1.ejercicio1;

import co.edu.uniquindio.parcial_1.model.Curso;
import co.edu.uniquindio.parcial_1.model.Docente;
import co.edu.uniquindio.parcial_1.model.Estudiante;

public class MainEjercicio1 {
    public static void main(String[] args) {
        Curso curso = inicializaDatosPrueba();
        curso.calcularNotaDefinitivaCadaEstudiante();
        curso.mostrarInformacionEstudianteMayorEstatura();
        curso.obtenerEstudianteNota5Mayor4();
        curso.mostrarInformacionDocentes();
        Docente.obtenerPromedioNotaMayorCurso;
    }

    public static Curso inicializaDatosPrueba() {
        Estudiante estudiante1 = new Estudiante("Juan","Jimenez","11 julio 2005",18,
                "@12ds34", 3,"1,70 metros", 3.4, 4.0, 5.0, 2.8, 4.5;
        Estudiante estudiante2 = new Estudiante("pedro","Castro","11 Enero 2007",16,
                "@1er254", 4,"1,80 metros", "2.0", 2.0, 4.0, 2.9, 3.5;
        Estudiante estudiante3 = new Estudiante("Maria","Diaz","26 julio 2005",18,
                "@123564", 3,"1,70 metros", 3.4, 4.0, 5.0, 2.8, 4.5;
        Estudiante estudiante4 = new Estudiante("Diego","Soto","23 Marzo 2005",18,
                "@1256734", 3,"1,70 metros", 3.4, 4.0, 5.0, 2.8, 4.5;
        Estudiante estudiante5 = new Estudiante("Luis","Duran","17 Agosto 2005",18,
                "@122334", 3,"1,70 metros", 3.4, 4.0, 5.0, 2.8, 4.5;
        ;
        ;

        Docente docente = new Docente("Carlos", 30, "sdsd@");
        Curso curso = new Curso("Programacion1",2,"2N",3,"Nocturna",
                estudiante1, estudiante2, estudiante3,docente);
        curso.setEstudiante1(estudiante1);
        curso.setEstudiante2(estudiante2);
        curso.setEstudiante3(estudiante3);

        return curso;
    }


    private static Estudiante crearEstudiantePorConstructor(String nombre, int edad, String correo, int semestre,
                                                            double nota1, double nota2, double nota3){
        Estudiante estudiante = new Estudiante(nombre, edad, correo, semestre, nota1, nota2, nota3);
        return estudiante;
    }
}