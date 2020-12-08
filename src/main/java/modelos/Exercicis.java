package modelos;

import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="ejercicios")
public class Exercicis {
	//Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="exercici_id")
	private int id;
	@Column(name="num_exercicis")
	private int num_ejercicios;
	//Relaciones
	@ManyToOne()
	private Niveles nivel;
	@OneToOne()
	private TiposdeEjercicio tipos_ejercicio;
	@OneToOne()
	private EjerciciosResueltos ejercicio_resuelto;
	
	//Constructores
	public Exercicis() {
		super();
	}
	public Exercicis(int num_ejercicios, Niveles nivel, TiposdeEjercicio tipos_ejercicio,
			EjerciciosResueltos ejercicio_resuelto) {
		super();
		this.num_ejercicios = num_ejercicios;
		this.nivel = nivel;
		this.tipos_ejercicio = tipos_ejercicio;
		this.ejercicio_resuelto = ejercicio_resuelto;
	}


	//Getters && Setters 
	public int getId() {
		return id;
	}
	public int getnum_ejercicios() {
		return num_ejercicios;
	}
	public TiposdeEjercicio getTipos_ejercicio() {
		return tipos_ejercicio;
	}
	public EjerciciosResueltos getEjercicio_resuelto() {
		return ejercicio_resuelto;
	}
	public void setId(int 
			id) {
		this.id = id;
	}
	public void setLista_ejercicios(int num_ejercicios) {
		this.num_ejercicios = num_ejercicios;
	}
	public void setTipos_ejercicio(TiposdeEjercicio tipos_ejercicio) {
		this.tipos_ejercicio = tipos_ejercicio;
	}
	public void setEjercicio_resuelto(EjerciciosResueltos ejercicio_resuelto) {
		this.ejercicio_resuelto = ejercicio_resuelto;
	}
	public Niveles getNivel() {
		return nivel;
	}
	public void setNivel(Niveles nivel) {
		this.nivel = nivel;
	}
	
}
