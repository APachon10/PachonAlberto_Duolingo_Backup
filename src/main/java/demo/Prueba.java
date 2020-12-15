package demo;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.Transaction;

import hibernateUtils.HibernateUtils;
import implementaciones.IdiomaImpl;
import interfaces.IIdiomas;
import modelos.Categorias;
import modelos.Cursos;
import modelos.Idiomas;

public class Prueba {
	public static void main(String[] args) {
		ArrayList<Cursos> cursos = new ArrayList<Cursos>();
		ArrayList<Categorias> categorias = new ArrayList<Categorias>();
		
		Transaction t = null;
		try(Session session = HibernateUtils.getSessionFactory().openSession()){     
			t = session.beginTransaction();
			Idiomas i = new Idiomas();
			i.setNombre_idioma("Castellano");
			i.setSiglas("ESP");
			i.setCursos(cursos);
			
			session.save(i);
			
			t.commit();
			
			IIdiomas i2 =  new IdiomaImpl();
			i2.obtenerIdiomas();
		}catch(Exception e2) {
			e2.printStackTrace();
		}
		
	}
}