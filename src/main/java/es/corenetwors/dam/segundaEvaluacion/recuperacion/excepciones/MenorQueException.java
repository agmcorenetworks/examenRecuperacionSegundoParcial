package es.corenetwors.dam.segundaEvaluacion.recuperacion.excepciones;

public class MenorQueException extends Exception {
	public String msj;

	public MenorQueException(String msj) {
		super(msj);
	}
}