package demo;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.Transaction;

import hibernateUtils.HibernateUtils;
import modelos.Categorias;
import modelos.Cursos;
import modelos.Idiomas;


public class Prueba {
	public static void main(String[] args) {
		ArrayList<Cursos> c4 = new ArrayList<Cursos>();
		ArrayList<Categorias> categories = new ArrayList<Categorias>();
		//Idiomas
		Idiomas d= new Idiomas();
		d.setNombre_idioma("Catalan");
		d.setSiglas("CAT");
		Idiomas d2 = new Idiomas();
		d2.setNombre_idioma("Castellano");
		d2.setSiglas("ESP");
		Idiomas d3 = new Idiomas();
		d3.setNombre_idioma("Ingles");
		d3.setSiglas("ING");
		//Cursos
		Cursos c = new Cursos();
		c.setNombre_curso("Hola");
		c.setL_Origen(d);
		c.setL_Destino(d2);
		Cursos c3 = new Cursos(); 
		c3.setNombre_curso("Adios");
		c3.setL_Origen(d2);
		c3.setL_Destino(d3);
		//Categorias
		Categorias cat1 = new Categorias();
		cat1.setNombre_categoria("Hola categoria");
		cat1.setC(c);
		
		//Metemos las categorias dentro del curso 
		c.setC2(categories);
		//Metemos el Curso
		c4.add(c);
		d.setCursos(c4);
		Transaction t = null;
		try(Session session =HibernateUtils.getSessionFactory().openSession()){
			t = session.beginTransaction();

			session.save(d);
			session.save(d2);
			session.save(d3);
			session.save(c);
			session.save(c3);
			session.save(cat1);
			t.commit();
		}catch(Exception e){
			e.printStackTrace();
		}		

	}
}