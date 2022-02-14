
public class Cuadrado implements FiguraGeometrica {
	private float lado;
	private String nombre;
	
	public Cuadrado(String nombre, float lado) {
		super();
		this.nombre = nombre;
		this.lado = lado;
	}//constructor

	public float getLado() {
		return lado;
	}

	public void setLado(float lado) {
		this.lado = lado;
	}
	
	public float area() {
		return getLado() * getLado();
	}// area
	
	
	public float perimetro() {
		return getLado() * 4;
	} // perimetro

	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return nombre;
	}
}//class Cuadrado