package modelos;

import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
	
	@OneToOne()
	@JoinColumn(name = "idioma_id")
    private Idiomas idiomas;
	
	public Cursos(String nombre_curso) {
		super();
		this.nombre_curso = nombre_curso;
	}

	public int getCurso_id() {
		return curso_id;
	}

	public String getNombre_curso() {
		return nombre_curso;
	}

	public Idiomas getIdiomas() {
		return idiomas;
	}

	public void setCurso_id(int curso_id) {
		this.curso_id = curso_id;
	}

	public void setNombre_curso(String nombre_curso) {
		this.nombre_curso = nombre_curso;
	}

	public void setIdiomas(Idiomas idiomas) {
		this.idiomas = idiomas;
	}
	
	
}
