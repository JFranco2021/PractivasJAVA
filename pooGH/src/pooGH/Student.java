package pooGH;

public class Student {
    String firstName;
    String lastName;
    int registration;
    int grade;
    int year;

public String getFirstName() {
	return firstName;
}
public String getLastName() {
	return lastName;
}
public int getRegistration() {
	return registration;
}
public int getGrade() {
	return grade;
}
public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}

 public Student() {
	 this.firstName="";
	 this.lastName="";
	 this.registration=0;
	 this.grade=0;
	 this.year=0;
 }

 public Student(String firstName , String lastName , int registration , int grade, int year) {
	 this.firstName=firstName;
	 this.lastName=lastName;
	 this.registration=registration;
	 this.grade=grade;
	 this.year=year;
 }

 
public static void main(String[] args) {
	Student estudiante1 = new Student ("Salvador","Franco", 0003, 60, 2);
	Student estudiante2 = new Student ("Pedro","Perez", 0015, 55, 2);
			
	// TODO implementar nombre completo
	
	             System.out.println("El nombre completo de estudiente 1 es: "+estudiante1.getFirstName()+" "+estudiante1.getLastName()+"\n");
	             //El nombre completo de estudiente 1 es: Salvador Franco
			
	             
	// TODO implementar: debe devolver verdadero si la calificación es >= 60
	             System.out.println("Aprobaste?");
	             if(estudiante1.getGrade() >= 60) {
					 System.out.println(true);
				 }else {
					 System.out.println(false);
				 }//Aprobaste?
	              //true		
			
			
	// TODO implementar: el estudiante debe avanzar al próximo año
				
				if(estudiante1.getGrade() >=60) {
					estudiante1.setYear(estudiante1.getYear()+1);
					System.out.println("\nFelicidades, pasaste a "+estudiante1.getYear()+" año.");
				}else {
					System.out.println("\nNo aprobaste, te quedas en "+estudiante1.getYear()+" año.");
				}//Felicidades, pasaste a 3 año.
			
			

System.out.println("\nEste es el nombre del estudiante 2 : "+estudiante2.getFirstName());
}
}

