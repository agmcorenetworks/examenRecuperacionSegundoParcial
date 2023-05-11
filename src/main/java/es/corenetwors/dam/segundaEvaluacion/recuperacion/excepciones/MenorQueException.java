package es.corenetwors.dam.segundaEvaluacion.recuperacion.excepciones;

public class MenorQueException extends Exception{
	public String mens;
	public MenorQueException(String mens) {
		super(mens);
}
}
