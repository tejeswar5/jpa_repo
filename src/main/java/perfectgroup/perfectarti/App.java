package perfectgroup.perfectarti;

import java.util.Arrays;
import java.util.List;



import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPersistenceUnit");
		EntityManager em = emf.createEntityManager();
		Countries countries = em.find(Countries.class, 1);
		System.out.println(countries.getCapital());
    }
    
//    @GetMapping("/")
//	public List<Country> getList(){
//		CountriesController cc = new CountriesController();
//		return cc.countriesList();
//	}
    
}
