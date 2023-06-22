package com.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.entity.Cricketer;

@Repository
public interface CricRepository extends CrudRepository<Cricketer,Integer>{
	public Cricketer findByJersyNo(int jersyNo);	
	@Query(value="select * from cricketer where domestic_runs>?",nativeQuery=true)
	public List<Cricketer> findByDomesticRuns(int domestic_runs);
	public Cricketer findByNameAndJersyNo(String name,int jersyNo);
	public Cricketer findByName(String name);
	public Cricketer findByJersyNo(String name);
}