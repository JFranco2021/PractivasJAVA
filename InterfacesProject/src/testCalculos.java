
public class testCalculos {
	public static void main(String[] args) {
			Triangulo t1 = new Triangulo("triángulo", 10, 20, 10, 10, 10);
			Triangulo t2 = new Triangulo("triángulo", 15, 25, 15, 15, 15);
			Cuadrado c1 = new Cuadrado("cuadrado 1", 25);
			Rectangulo r1 = new Rectangulo("rectángulo 1",25, 15);
			Rombo Rombo1 = new Rombo(2, 2, 4, "Rombo1");
			Romboide Romboide1 = new Romboide(6,4,"Romboide1");
			Trapecio Trapecio1 = new Trapecio(3,3,2,6,8,10,3,"Trapecio1"); 
			
			Calculos.calc(t1);
			Calculos.calc(t2);
			
			Calculos.calc(c1);
			
			Calculos.calc(r1);
			Calculos.calc(Rombo1);
			Calculos.calc(Romboide1);
			Calculos.calc(Trapecio1);

	}//main
} // class testCalculos