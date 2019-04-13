package dao;

import javax.ejb.Local;

import entity.ShoabEntity;

@Local
public interface ShoabDaoLocal {

	void inserToShoab(ShoabEntity shoabEntity);

}
