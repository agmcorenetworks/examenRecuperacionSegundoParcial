package es.corenetwors.dam.segundaEvaluacion.recuperacion.excepciones;

public class MayorQueException extends Exception{
	public String mens;
	public MayorQueException(String mens) {
		super(mens);
}
}
