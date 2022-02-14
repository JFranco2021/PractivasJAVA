
public class Rombo implements FiguraGeometrica {
	private float lado;
	private float diagonalMenor;
	private float diagonalMayor;
	private String nombre;
	
	public Rombo(float lado, float diagonalMenor, float diagonalMayor, String nombre) {
		super();
		this.lado = lado;
		this.diagonalMenor = diagonalMenor;
		this.diagonalMayor = diagonalMayor;
		this.nombre = nombre;
	}
	
	

	public float getLado() {
		return lado;
	}



	public void setLado(float lado) {
		this.lado = lado;
	}



	public float getDiagonalMenor() {
		return diagonalMenor;
	}



	public void setDiagonalMenor(float diagonalMenor) {
		this.diagonalMenor = diagonalMenor;
	}



	public float getDiagonalMayor() {
		return diagonalMayor;
	}



	public void setDiagonalMayor(float diagonalMayor) {
		this.diagonalMayor = diagonalMayor;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	@Override
	public float area() {
		return (getDiagonalMayor()*getDiagonalMenor())/2;
	}

	@Override
	public float perimetro() {
		return 4*getLado();
	}

	@Override
	public String getNombre() {
		return nombre;

	}
	
	
	

}
