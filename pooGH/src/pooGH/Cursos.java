package pooGH;

import java.util.HashMap;

public class Cursos {

    String nombreCurso;
    String nombreProfesor;
    int year;

public String getNombreCurso() {
	return nombreCurso;
}
public String getNombreProfesor() {
	return nombreProfesor;
}
public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}

 public Cursos() {
	 this.nombreCurso="";
	 this.nombreProfesor="";
	 this.year=0;
 }

 public Cursos(String nombreCurso , String nombreProfesor, int year) {
	 this.nombreCurso=nombreCurso;
	 this.nombreProfesor=nombreProfesor;
	 this.year=year;
 }

 
public static void main(String[] args) {

	Cursos curso1 = new Cursos ("Matematicas","Leonardo",1);
	Cursos curso2 = new Cursos ("Fisica","Jose Luis",2);;
	HashMap<String,String> estudiantess = new HashMap<>();

	
	// TODO agregar el estudiante a la colección 
	
	
	estudiantess.put("001","Salvador");	
	estudiantess.put("002","Pedro");
	estudiantess.put("003","Alonso");
	System.out.println(estudiantess);
	System.out.println(estudiantess.get("001")+"\n");
	
	
	// TODO eliminar a este estudiante de la colección 
	estudiantess.remove("002");
	System.out.println(estudiantess);
	
	// TODO implementar agregar al curso
	System.out.println("\nEl alumno "+estudiantess.get("001")+" se aunio al curso de "+curso1.getNombreCurso()+" impartido por el profesor "+curso1.getNombreProfesor());
	
	// TODO implementar agregar al curso
		System.out.println("El alumno "+estudiantess.get("003")+" se aunio al curso de "+curso2.getNombreCurso()+" impartido por el profesor "+curso2.getNombreProfesor());
	

}
}