package modelos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ejercicios_resueltos")
public class EjerciciosResueltos {
	//Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Ex_resolt_id")
	private int id;
	
	//Relaciones
	@OneToOne()
	@JoinColumn(name="exercici_id")
	private Exercicis exercicis;
	
	//Constructores 
	public EjerciciosResueltos() {
		super();
	}
	public EjerciciosResueltos(Exercicis exercicis) {
		super();
		this.exercicis = exercicis;
	}
	
	//Getters && Setters 
	public int getId() {
		return id;
	}
	public Exercicis getExercicis() {
		return exercicis;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setExercicis(Exercicis exercicis) {
		this.exercicis = exercicis;
	}
	
	
	
}
