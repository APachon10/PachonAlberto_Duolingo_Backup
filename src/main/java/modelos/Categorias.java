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
@Table(name="categorias")
public class Categorias {
	//Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="categoria_id")
	private int categoria_id;
	@Column(name="nombre_categoria")
	private String nombre_categoria;
	
	//Relaciones
	@ManyToOne()
	private Cursos c;
	/*@OneToMany()
	@JoinColumn(name = "nivel_id")
	private List<Niveles> n;*/
	
	//Constructores
	public Categorias() {
		super();
	}
	public Categorias(String nombre_categoria, Cursos c, List<Niveles> n) {
		super();
		this.nombre_categoria = nombre_categoria;
		this.c = c;
		//this.n = n;
	}
	//Getters && Setters
	public int getCategoria_id() {
		return categoria_id;
	}
	public String getNombre_categoria() {
		return nombre_categoria;
	}
	public Cursos getC() {
		return c;
	}

	public void setCategoria_id(int categoria_id) {
		this.categoria_id = categoria_id;
	}
	public void setNombre_categoria(String nombre_categoria) {
		this.nombre_categoria = nombre_categoria;
	}
	public void setC(Cursos c) {
		this.c = c;
	}
	/*public List<Niveles> getN() {
		return n;
	}
	public void setN(List<Niveles> n) {
		this.n = n;
	}*/
	
}