package interfaces;

import java.util.ArrayList;

import modelos.Idiomas;

public interface IIdiomas {
	public ArrayList<Idiomas> obtenerIdiomas();
	public void mostrarIdiomas(ArrayList<Idiomas> idiomas);
	public boolean existeIdioma(String nombre_idiomas);
	public Idiomas obtenerIdiomasPorId(int id);
	public Idiomas obtenerIdiomasPorNombre(String nombre);
	public Idiomas obtenerIdiomasPorSigla(String siglas);
	public void insertarIdioma();
	public void actualizarIdioma();
	public void borrarIdioma();
}
