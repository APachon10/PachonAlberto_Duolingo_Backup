package modelos;

import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

public class Exercicis {
	//Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="exercici_id")
	private int id;
	@Column(name="llista_exercicis")
	private ArrayList<Integer> lista_ejercicios;
	//Relaciones
	@OneToOne()
	private TiposdeEjercicio tipos_ejercicio;
	@OneToOne()
	private EjerciciosResueltos ejercicio_resuelto;
	
	//Constructores
	public Exercicis() {
		super();
	}
	public Exercicis(ArrayList<Integer> lista_ejercicios, TiposdeEjercicio tipos_ejercicio,
			EjerciciosResueltos ejercicio_resuelto) {
		super();
		this.lista_ejercicios = lista_ejercicios;
		this.tipos_ejercicio = tipos_ejercicio;
		this.ejercicio_resuelto = ejercicio_resuelto;
	}
	
	//Getters && Setters 
	public int getId() {
		return id;
	}
	public ArrayList<Integer> getLista_ejercicios() {
		return lista_ejercicios;
	}
	public TiposdeEjercicio getTipos_ejercicio() {
		return tipos_ejercicio;
	}
	public EjerciciosResueltos getEjercicio_resuelto() {
		return ejercicio_resuelto;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setLista_ejercicios(ArrayList<Integer> lista_ejercicios) {
		this.lista_ejercicios = lista_ejercicios;
	}
	public void setTipos_ejercicio(TiposdeEjercicio tipos_ejercicio) {
		this.tipos_ejercicio = tipos_ejercicio;
	}
	public void setEjercicio_resuelto(EjerciciosResueltos ejercicio_resuelto) {
		this.ejercicio_resuelto = ejercicio_resuelto;
	}
}
