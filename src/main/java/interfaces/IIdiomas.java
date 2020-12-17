package interfaces;

import java.util.ArrayList;

import modelos.Idiomas;

public interface IIdiomas {
	public ArrayList<Idiomas> obtenerIdiomas();
	public void mostrarIdiomas(ArrayList<Idiomas> idiomas);
	public void obtenerIdiomasPorId();
	public void obtenerIdiomasPorNombre();
	public void obtenerIdiomasPorSigla();
	public void insertarIdioma();
	public void actualizarIdioma();
	public void borrarIdioma();
}
