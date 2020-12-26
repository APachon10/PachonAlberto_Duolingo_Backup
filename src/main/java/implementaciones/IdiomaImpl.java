package implementaciones;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import hibernateUtils.HibernateUtils;
import interfaces.IIdiomas;
import modelos.Idiomas;

public class IdiomaImpl implements IIdiomas{
	@Override
	public ArrayList<Idiomas> obtenerIdiomas() {
		Transaction t = null;
		ArrayList<Idiomas> idiomas = new ArrayList<Idiomas>();
		try(Session session = HibernateUtils.getSessionFactory().openSession()){
			Query query = session.createQuery("from Idiomas");
			idiomas= (ArrayList<Idiomas>) query.list();
			return idiomas;
		}catch(Exception e){
			e.printStackTrace();
			return null;
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
	@Override
	public void mostrarIdiomas(ArrayList<Idiomas> idiomas) {
		for (int i = 0; i < idiomas.size(); i++) {
			System.out.println("Hola:" +idiomas.get(i).toString());
		}
	}
	@Override
	public boolean existeIdioma(String nombre_idiomas) {
		Transaction t = null;
		boolean existe=true;
		try(Session session = HibernateUtils.getSessionFactory().openSession()){
			Query nombre_idioma_db =session.createQuery("Select nombre_idioma from Idiomas where nombre_idioma =:nombre_idiomas");
			nombre_idioma_db.setParameter("nombre_idiomas",nombre_idiomas);
			List result = nombre_idioma_db.getResultList();
			
			if(result.isEmpty()) {
				existe=false;
			}else {
				existe=true;
			}
		}catch(Exception e){
			e.printStackTrace();
			
		}
		return existe;
	}
	
	
}
