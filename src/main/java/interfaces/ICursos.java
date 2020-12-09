package interfaces;

import java.util.ArrayList;

import modelos.Cursos;
import modelos.Idiomas;

public interface ICursos {
	public ArrayList<Cursos> obtenerCursos(ArrayList<Cursos> cursos);
	public void crearnuevoCurso(Idiomas l_Origen, Idiomas l_Destino);
	public void insertarnuevaCategoria(int id);
}
