package modelos;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="niveles")
public class Niveles {
	//Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="nivel_id")
	private int id;
	@Column(name="nombre_nivel")
	private String n_Nivel;
	//Relaciones
	@ManyToOne()
	private Categorias c;
	/*@OneToMany()
	@JoinColumn(name="exercici_id")
	private List<Exercicis> ejercicios;*/
	
	//Constructores
	public Niveles() {
		super();
	}
	public Niveles(String n_Nivel, Categorias c, List<Exercicis> ejercicios) {
		super();
		this.n_Nivel = n_Nivel;
		this.c = c;
		//this.ejercicios = ejercicios;
	}
	
	//Getters && Setters 
	public int getId() {
		return id;
	}
	public String getN_Nivel() {
		return n_Nivel;
	}
	public Categorias getC() {
		return c;
	}
	/*public List<Exercicis> getEjercicios() {
		return ejercicios;
	}*/
	public void setId(int id) {
		this.id = id;
	}
	public void setN_Nivel(String n_Nivel) {
		this.n_Nivel = n_Nivel;
	}
	public void setC(Categorias c) {
		this.c = c;
	}
	/*public void setEjercicios(List<Exercicis> ejercicios) {
		this.ejercicios = ejercicios;
	}*/
}
