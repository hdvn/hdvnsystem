
import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public abstract class AbstractDataAccess<T> {

	private Session session = null;

	private SessionFactory sessionFactory = null;

	private static final String HIBERNATE_CONFIG = "hibernate.cfg.xml";

	private static final Logger log = log.getLogger(AbstractDataAccess.class);

	private void initDatabase() {

		log.info("####### Open configuration for connection to SQL");
		Configuration configuration = new Configuration();

		configuration.configure(HIBERNATE_CONFIG);

		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties()).build();

		sessionFactory = configuration.buildSessionFactory(serviceRegistry);

	}

	/**
	 * Create
	 * 
	 * @param entity
	 */
	protected void create(T entity) {
		init();

		session = sessionFactory.getCurrentSession();
		session.beginTransaction();
		try {
			session.saveOrUpdate(T);
			session.getTransaction().commit();
		} catch (HibernateException he) {
			session.getTransaction().rollback();
			log.error("Error", he);
		} finally {
			if (session != null) {
				session.close();
			}

			if (sessionFactory != null) {
				session.close();
			}
		}
	}

	
}
