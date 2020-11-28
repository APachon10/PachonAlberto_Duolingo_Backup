package modelos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="idiomas")
public class Idiomas {
	//Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int idioma_id;
	@Column(name="siglas")
	private String siglas;
	@Column(name="nombre_idioma")
	private String nombre_idioma;
	
	/*@OneToOne(mappedBy = "idiomas")
	@Column(name="cursos")
	private Cursos c;*/
	
	//Constructores
	public Idiomas(String siglas, String nombre_idioma) {
		super();
		this.siglas = siglas;
		this.nombre_idioma = nombre_idioma;
		/*this.c = c;*/
	}
	public Idiomas() {
		super();
	}
	
	//Getters && Setters 
	public int getIdioma_id() {
		return idioma_id;
	}
	public String getSiglas() {
		return siglas;
	}
	public String getNombre_idioma() {
		return nombre_idioma;
	}
	public void setIdioma_id(int idioma_id) {
		this.idioma_id = idioma_id;
	}
	public void setSiglas(String siglas) {
		this.siglas = siglas;
	}
	public void setNombre_idioma(String nombre_idioma) {
		this.nombre_idioma = nombre_idioma;
	}
	
	//To String
	@Override
	public String toString() {
		return "Idiomas [idioma_id=" + idioma_id + ", siglas=" + siglas + ", nombre_idioma=" + nombre_idioma + ", c=";
	}
}
