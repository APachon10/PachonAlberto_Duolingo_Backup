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
	
	//Constructores
	public Niveles() {
		super();
	}
	public Niveles(String n_Nivel, Categorias c) {
		super();
		this.n_Nivel = n_Nivel;
		this.c = c;
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
	public void setId(int id) {
		this.id = id;
	}
	public void setN_Nivel(String n_Nivel) {
		this.n_Nivel = n_Nivel;
	}
	public void setC(Categorias c) {
		this.c = c;
	}
	
}
