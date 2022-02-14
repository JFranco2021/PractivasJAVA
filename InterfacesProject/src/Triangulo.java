
public class Triangulo implements FiguraGeometrica {
	private float base;
	private float altura;
	private float lado1;
	private float lado2;
	private float lado3;
	private String nombre;
	private int id;
	private static int total=0;
	
	public Triangulo(String nombre, float base, float altura, float lado1, float lado2, float lado3) {
		super();
		total++;
		this.id=total;
		this.nombre = nombre; 
		this.base = base;
		this.altura = altura;
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
	}

	public float getBase() {
		return base;
	}

	public void setBase(float base) {
		this.base = base;
	}


	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public float area() {
		return (getBase() * getAltura()) /2;
	}//area
	public float perimetro() {
		return lado1 + lado2+ lado3;
	} //perimetro

	public String getNombre() {
		return nombre + " " + this.id;
	}

	
	
}//class Triangulo