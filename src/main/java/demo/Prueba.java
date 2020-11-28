package demo;

import org.hibernate.Session;
import org.hibernate.Transaction;

import hibernateUtils.HibernateUtils;
import modelos.Idiomas;


public class Prueba {
	public static void main(String[] args) {
		Idiomas d= new Idiomas();
		d.setNombre_idioma("Castellano");
		d.setSiglas("ESP");
		Transaction t = null;

		try(Session session =HibernateUtils.getSessionFactory().openSession()){
			t = session.beginTransaction();
			session.save(d);
			t.commit();

		}catch(Exception e){
			e.printStackTrace();
		}		

	}
}