package service;

import javax.ejb.Local;

import entity.ShoabEntity;

@Local
public interface ShoabServiceLocal {

	void inserToShoab(ShoabEntity shoabEntity);

}
