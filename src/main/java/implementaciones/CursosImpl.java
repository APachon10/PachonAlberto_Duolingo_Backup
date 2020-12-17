package implementaciones;

import java.util.ArrayList;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import hibernateUtils.HibernateUtils;
import interfaces.ICursos;
import modelos.Cursos;

public class CursosImpl implements ICursos{

	@Override
	public ArrayList<Cursos> obtenerCursos() {
		Transaction t = null;
		ArrayList<Cursos> cursos = new ArrayList<Cursos>();
		try(Session session = HibernateUtils.getSessionFactory().openSession()){
			Query query = session.createQuery("from Cursos");
			cursos= (ArrayList<Cursos>) query.list();
			return cursos;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
	@Override
	public void obtenerCursoPorId() {

	}
	@Override
	public void insertarCurso() {
	}
	@Override
	public void actualizarCurso() {

	}
	@Override
	public void borrarCurso() {

	}
	@Override
	public void mostrarCursos(ArrayList<Cursos> cursos) {
		for (int i = 0; i < cursos.size(); i++) {
			System.out.println("Hola : "+ cursos.get(i).toString());
		}
	}
}
