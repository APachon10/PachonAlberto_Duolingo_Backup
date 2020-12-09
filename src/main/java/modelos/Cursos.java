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
@Table(name="cursos")
public class Cursos {
	//Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="curso_id")
	private int curso_id;
	@Column(name="nombre_curso")
	private String nombre_curso;
	
	//Relaciones
	@ManyToOne()
	private Idiomas L_Origen;
	@ManyToOne()
	private Idiomas L_Destino;
	@OneToMany()
	@JoinColumn(name = "categoria_id")
	private List<Categorias> c2;
	
	//Constructores
	public Cursos() {
		super();
	}
	public Cursos(String nombre_curso, Idiomas l_Origen, Idiomas l_Destino, List<Categorias> c2) {
		super();
		this.nombre_curso = nombre_curso;
		L_Origen = l_Origen;
		L_Destino = l_Destino;
		this.c2 = c2;
	}
	
	//Getters && Setters 
	public int getCurso_id() {
		return curso_id;
	}
	public String getNombre_curso() {
		return nombre_curso;
	}
	public Idiomas getL_Origen() {
		return L_Origen;
	}
	public Idiomas getL_Destino() {
		return L_Destino;
	}
	public void setCurso_id(int curso_id) {
		this.curso_id = curso_id;
	}
	public void setNombre_curso(String nombre_curso) {
		this.nombre_curso = nombre_curso;
	}
	public void setL_Origen(Idiomas l_Origen) {
		L_Origen = l_Origen;
	}
	public void setL_Destino(Idiomas l_Destino) {
		L_Destino = l_Destino;
	}
	public List<Categorias> getC2() {
		return c2;
	}
	public void setC2(List<Categorias> c2) {
		this.c2 = c2;
	}
	@Override
	public String toString() {
		return "Cursos [curso_id=" + curso_id + ", nombre_curso=" + nombre_curso + ", L_Origen=" + L_Origen
				+ ", L_Destino=" + L_Destino + ", c2=" + c2 + "]";
	}
	
}
