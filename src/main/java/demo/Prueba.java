package demo;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.Transaction;

import hibernateUtils.HibernateUtils;
import implementaciones.CursosImpl;
import implementaciones.IdiomaImpl;
import interfaces.ICursos;
import interfaces.IIdiomas;
import modelos.Categorias;
import modelos.Cursos;
import modelos.Idiomas;

public class Prueba {
	public static void main(String[] args) {
		ArrayList<Idiomas> idiomas = new ArrayList<Idiomas>();
		ArrayList<Cursos> cursos = new ArrayList<Cursos>();
		ArrayList<Categorias> categorias = new ArrayList<Categorias>();
		
		IIdiomas i2 =  new IdiomaImpl();
		idiomas = i2.obtenerIdiomas();
		ICursos c2 = new CursosImpl();
		cursos= c2.obtenerCursos();
		
		Transaction t = null;
		try(Session session = HibernateUtils.getSessionFactory().openSession()){     
			t = session.beginTransaction();
			Idiomas i = new Idiomas();
			i.setNombre_idioma("Castellano");
			i.setSiglas("ESP");
			i.setCursos(cursos);
			
			Idiomas i3 = new Idiomas();
			i3.setNombre_idioma("Catalan");
			i3.setSiglas("caT");
			i3.setCursos(cursos);
			
			Cursos c = new Cursos();
			c.setNombre_curso("Catalan-Castellano");
			c.setL_Destino(i);
			c.setL_Origen(i3);
			
			
			t.commit();
			
			System.out.println(i2.existeIdioma("Africano"));
		}catch(Exception e2) {
			e2.printStackTrace();
		}
		
	}
}