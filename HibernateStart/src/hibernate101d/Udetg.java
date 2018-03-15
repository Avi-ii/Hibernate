package hibernate101d;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import hibernate101.Address;
import hibernate101.Udet;

public class Udetg {

	public static void main(String[] args) {
		Udet ud=new Udet();
		ud.setName("avi");
		Udet ud1=new Udet();
		ud.setName("ajay");
		Address addr=new Address();
		
		addr.setStreet("select Street");
		addr.setCity("Select city");
		addr.setState("select State");
		ud.setAddress(addr);
		
		
		
		SessionFactory sesfac=new Configuration().configure().buildSessionFactory();
		
		Session session=sesfac.openSession();
		session.beginTransaction();
		session.save(ud);
		session.save(ud1);
		
		session.getTransaction().commit();
		session.close();
		
		ud=null;
		session=sesfac.openSession();
		session.beginTransaction();
		ud=(Udet)session.get(Udet.class, 1);
		System.out.println(ud.getName());
		
		

	}

}
