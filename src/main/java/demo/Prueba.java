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
		
		Transaction t = null;
		try(Session session = HibernateUtils.getSessionFactory().openSession()){     
			t = session.beginTransaction();
			Idiomas i = new Idiomas();
			i.setNombre_idioma("Castellano");
			i.setSiglas("ESP");
			i.setCursos(cursos);
			
			for (int j = 0; j < idiomas.size(); j++) {
				if(idiomas.get(j).getNombre_idioma().equals(i.getNombre_idioma())) {
					System.out.println("Valor repetido");
				}else {
					session.save(i);
					t.commit();
				}
			}
			i2.obtenerIdiomas();
		}catch(Exception e2) {
			e2.printStackTrace();
		}
		
	}
}