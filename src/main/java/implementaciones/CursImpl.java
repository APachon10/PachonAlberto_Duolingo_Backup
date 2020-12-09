package implementaciones;

import java.util.ArrayList;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.Transaction;

import hibernateUtils.HibernateUtils;
import interfaces.ICursos;
import modelos.Cursos;
import modelos.Idiomas;

public class CursImpl implements ICursos{
	@Override
	public ArrayList<Cursos> obtenerCursos(ArrayList<Cursos> cursos) {
		Transaction t = null;
		try(Session session = HibernateUtils.getSessionFactory().openSession()){
			t = session.beginTransaction();
			Query query = session.createQuery("From Cursos");
			for (int i = 0; i < cursos.size(); i++) {
				System.out.println(cursos.get(i).toString());
			}	
			t.commit();
			return cursos;
			
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	@Override
	public void crearnuevoCurso(Idiomas l_Origen, Idiomas l_Destino) {
		Transaction t = null;
		Cursos c= new Cursos();
		try(Session session = HibernateUtils.getSessionFactory().openSession()){
			t = session.beginTransaction();
			c.setL_Origen(l_Origen);
			c.setL_Destino(l_Destino);
			session.save(c);
			t.commit();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	@Override
	public void insertarnuevaCategoria(int id) {
		
	}
}
