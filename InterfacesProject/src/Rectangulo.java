
public class Rectangulo implements FiguraGeometrica {
	private float base;
	private float altura;
	private String nombre;
	public Rectangulo(String nombre, float base, float altura) {
		super();
		this.nombre = nombre;
		this.base = base;
		this.altura = altura;
	}//Constructor
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
	@Override
	public float area() {
		return getBase() * getAltura();
	}
	@Override
	public float perimetro() {
		return (2*getAltura()) + (2*getBase());
	}
	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return nombre;
	}
	
		
}//class Rectangulo