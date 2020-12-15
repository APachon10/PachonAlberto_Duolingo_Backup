package modelos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="categorias")
public class Categorias {
	//Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="categoria_id")
	private int id;
	@Column(name="categoria_nombre")
	private String categoria_nombre;
	@Column(name="curso_id")
	
	//Relaciones
	@ManyToOne()
	private Cursos c;
	@OneToMany()
	@JoinColumn(name="nivel_id")
	private List<Niveles> n2;
	
	//Contructores
	public Categorias() {
		super();
	}
	public Categorias(String categoria_nombre, Cursos c, List<Niveles> n2) {
		super();
		this.categoria_nombre = categoria_nombre;
		this.c = c;
		this.n2 = n2;
	}
	
	//Getters && Setters
	public int getId() {
		return id;
	}
	public String getCategoria_nombre() {
		return categoria_nombre;
	}
	public Cursos getC() {
		return c;
	}
	public List<Niveles> getN2() {
		return n2;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setCategoria_nombre(String categoria_nombre) {
		this.categoria_nombre = categoria_nombre;
	}
	public void setC(Cursos c) {
		this.c = c;
	}
	public void setN2(List<Niveles> n2) {
		this.n2 = n2;
	}
	//To String
	@Override
	public String toString() {
		return "Categorias [id=" + id + ", categoria_nombre=" + categoria_nombre + ", c=" + c + ", n2=" + n2 + "]";
	}
}
