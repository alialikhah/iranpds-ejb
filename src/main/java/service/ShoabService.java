package service;

import javax.ejb.Stateless;
import javax.inject.Inject;

import dao.ShoabDaoLocal;
import entity.ShoabEntity;

/**
 * Session Bean implementation class ShoabService
 */
@Stateless
public class ShoabService implements ShoabServiceLocal {

    /**
     * Default constructor. 
     */
    public ShoabService() {
        // TODO Auto-generated constructor stub
    }
    @Inject
    private ShoabDaoLocal shoabDaoLocal;
    
    @Override
    public void inserToShoab(ShoabEntity shoabEntity){
    	shoabDaoLocal.inserToShoab(shoabEntity);
    }

}
