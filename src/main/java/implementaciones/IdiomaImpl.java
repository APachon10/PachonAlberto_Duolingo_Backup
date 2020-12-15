package implementaciones;

import java.util.ArrayList;



import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.Query;

import hibernateUtils.HibernateUtils;
import interfaces.IIdiomas;
import modelos.Idiomas;

public class IdiomaImpl implements IIdiomas{
	@Override
	public void obtenerIdiomas() {
		Transaction t = null;
		try(Session session = HibernateUtils.getSessionFactory().openSession()){
			Query query = session.createQuery("from Idiomas");
			ArrayList<Idiomas> idiomas = new ArrayList<Idiomas>();
			idiomas= (ArrayList<Idiomas>) query.list();
			for (int i = 0; i < idiomas.size(); i++) {
				System.out.println(idiomas.get(i).toString());
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	@Override
	public void obtenerIdiomasPorId() {

	}
	@Override
	public void obtenerIdiomasPorNombre() {

	}
	@Override
	public void obtenerIdiomasPorSigla() {

	}
	@Override
	public void insertarIdioma() {

	}

	@Override
	public void actualizarIdioma() {

	}
	@Override
	public void borrarIdioma() {

	}
}
