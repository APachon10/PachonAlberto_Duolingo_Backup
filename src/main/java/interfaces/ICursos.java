package interfaces;

import java.util.ArrayList;

import modelos.Cursos;

public interface ICursos {
	public ArrayList<Cursos> obtenerCursos();
	public void mostrarCursos(ArrayList<Cursos> cursos);
	public void obtenerCursoPorId();
	public void insertarCurso();
	public void actualizarCurso();
	public void borrarCurso();

}
