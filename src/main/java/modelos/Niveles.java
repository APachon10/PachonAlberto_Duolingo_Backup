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
	
	//Relaciones
	@ManyToOne()
	private Categorias cat;
	@OneToMany()
	@JoinColumn(name="ejercicio_id")
	private List<Ejercicios> ex;
	
	//Constructores
	public Niveles() {
		super();
	}
	public Niveles(Categorias cat, List<Ejercicios> ex) {
		super();
		this.cat = cat;
		this.ex = ex;
	}
	
	//Getters && Setters
	public int getId() {
		return id;
	}
	public Categorias getCat() {
		return cat;
	}
	public List<Ejercicios> getEx() {
		return ex;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setCat(Categorias cat) {
		this.cat = cat;
	}
	public void setEx(List<Ejercicios> ex) {
		this.ex = ex;
	}
	
	//To String
	@Override
	public String toString() {
		return "Niveles [id=" + id + ", cat=" + cat + ", ex=" + ex + "]";
	}
}
