
public class Trapecio implements FiguraGeometrica {
	private float lado1;
	private float lado2;
	private float lado3;
	private float lado4;
	private float baseMenor;
	private float baseMayor;
	private float altura;
	private String nombre;
	
	
	
	public Trapecio(float lado1, float lado2, float lado3, float lado4, float baseMenor, float baseMayor, float altura, String nombre) {
		super();
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
		this.lado4 = lado4;
		this.baseMenor = baseMenor;
		this.baseMayor = baseMayor;
		this.altura = altura;
		this.nombre = nombre;
	}
	
	
	
	public float getLado1() {
		return lado1;
	}



	public void setLado1(float lado1) {
		this.lado1 = lado1;
	}



	public float getLado2() {
		return lado2;
	}



	public void setLado2(float lado2) {
		this.lado2 = lado2;
	}



	public float getLado3() {
		return lado3;
	}



	public void setLado3(float lado3) {
		this.lado3 = lado3;
	}



	public float getLado4() {
		return lado4;
	}



	public void setLado4(float lado4) {
		this.lado4 = lado4;
	}



	public float getBaseMenor() {
		return baseMenor;
	}



	public void setBaseMenor(float baseMenor) {
		this.baseMenor = baseMenor;
	}



	public float getBaseMayor() {
		return baseMayor;
	}



	public void setBaseMayor(float baseMayor) {
		this.baseMayor = baseMayor;
	}

    

	public float getAltura() {
		return altura;
	}



	public void setAltura(float altura) {
		this.altura = altura;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	@Override
	public float area() {
		return (getAltura()*(getBaseMayor()+getBaseMenor()))/2;
	}
	@Override
	public float perimetro() {
		return getLado1() +getLado2() + getLado3() + getLado4();
	}
	@Override
	public String getNombre() {
		return nombre;
	}
	
	

}
