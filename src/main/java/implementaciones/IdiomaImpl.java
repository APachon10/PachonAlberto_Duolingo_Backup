package implementaciones;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import hibernateUtils.HibernateUtils;
import interfaces.IIdiomas;
import modelos.Cursos;
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
	public Idiomas  obtenerIdiomasPorId(int id) {
		Transaction t = null;
		Idiomas i = new Idiomas();
		ArrayList<Idiomas> idiomas = new ArrayList<Idiomas>();
		int j=0;
		try(Session session = HibernateUtils.getSessionFactory().openSession()){
			Query query = session.createQuery("from Idiomas where idioma_id =:id");
			query.setParameter("id", id);
			ArrayList<Idiomas> result = (ArrayList<Idiomas>) query.getResultList();
			if(!result.isEmpty()) {
				for (int k = 0; k < result.size(); k++) {
					i.setIdioma_id(result.get(k).getIdioma_id());
					i.setNombre_idioma(result.get(k).getNombre_idioma());
					i.setSiglas(result.get(k).getSiglas());
					i.setCursos(result.get(k).getCursos());
				}
			}else {
				System.out.println("No hay resultado ");
			}
			
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
		System.out.println(i.toString());
		return i;
	}
	@Override
	public Idiomas obtenerIdiomasPorNombre(String nombre) {
		Transaction t = null;
		Idiomas i = new Idiomas();
		try(Session session = HibernateUtils.getSessionFactory().openSession()){
			Query query = session.createQuery("from Idiomas where nombre_idioma =:nombre");
			query.setParameter("nombre", nombre);
			
			return i;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
	@Override
	public Idiomas  obtenerIdiomasPorSigla(String siglas) {
		Transaction t = null;
		Idiomas i = new Idiomas();
		try(Session session = HibernateUtils.getSessionFactory().openSession()){
			Query query = session.createQuery("from Idiomas where siglas =:siglas");
			return i;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
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
			System.out.println(idiomas.get(i).toString());
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
