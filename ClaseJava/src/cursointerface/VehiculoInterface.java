package cursointerface;

public interface VehiculoInterface {

	public static final float g = 9.8f;
	
	public abstract void parar();
	public abstract void acelerar();
	public abstract void desacelerar();
	public abstract void girarIzquiera();
	public abstract void girarDerecha();

	
}
