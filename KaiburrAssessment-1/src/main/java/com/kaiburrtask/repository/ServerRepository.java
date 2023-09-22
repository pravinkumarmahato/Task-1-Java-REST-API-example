package com.kaiburrtask.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.kaiburrtask.model.Server;

public interface ServerRepository  extends MongoRepository<Server,String>{
	
	List<Server> findByName(String name);;
}
