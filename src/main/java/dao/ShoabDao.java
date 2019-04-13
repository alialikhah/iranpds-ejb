package dao;

import java.io.Serializable;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import entity.ShoabEntity;

/**
 * Session Bean implementation class ShoabDao
 */
@Stateless
public class ShoabDao implements ShoabDaoLocal ,Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = -9073440080228879777L;

	/**
     * Default constructor. 
     */
    public ShoabDao() {
        // TODO Auto-generated constructor stub
    }
    
    @PersistenceContext(unitName="aliUnit")
    private EntityManager entityManager;
    
    
    @Override
    public void inserToShoab(ShoabEntity shoabEntity){
    	entityManager.persist(shoabEntity);
    }

}
