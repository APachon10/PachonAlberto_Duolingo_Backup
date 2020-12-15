package modelos;

import java.util.ArrayList;

public class Plantilla_Ejercicio {
	//Atributos del Ejercicio
	private int tipo_ejercicio;
	private String enunciado;
	private String respuesta_correcta;
	
	public Plantilla_Ejercicio() {
		super();
	}
	public Plantilla_Ejercicio(int tipo_ejercicio, String enunciat,String respuesta_correcta) {
		this.tipo_ejercicio= tipo_ejercicio;
		this.enunciado = enunciat;
		this.respuesta_correcta = respuesta_correcta;
	}
	public ArrayList<String> tipoTest(String enunciado,String res1,String res2,String res3, ArrayList<String> posibles_respuestas) {
		posibles_respuestas.add(res1);
		posibles_respuestas.add(res2);
		posibles_respuestas.add(res3);
		return posibles_respuestas;
	}
	public ArrayList<Ejercicios> crearListadeEjercicios(ArrayList<Ejercicios> ex){
		
		return ex;
	}
}
