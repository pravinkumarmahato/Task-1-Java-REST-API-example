package com.kaiburrtask.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.kaiburrtask.model.Server;
import com.kaiburrtask.repository.ServerRepository;

@Service
public class ServerService {
	
	@Autowired
	private ServerRepository repository;
	
	public Server addServer(Server server) {
		return repository.insert(server);
	}
	
	public List<Server> getAllServers(){
		return repository.findAll();
	}
	
	public Server getServerByServerId(String serverId){
		return repository.findById(serverId).get();
	}
	
	public List<Server> getServerByServerName(String name){
		return repository.findByName(name);
	}
	
	public Server updateServer(Server serverRequest) {
		Server existingServer = repository.findById(serverRequest.getId()).get();
		existingServer.setName(serverRequest.getName());
		existingServer.setLanguage(serverRequest.getLanguage());
		existingServer.setFramework(serverRequest.getFramework());
		return repository.save(existingServer);
	}
	
	public String deleteServer(String serverId){
		repository.deleteById(serverId);
		return "Server " + serverId + " deleted successfully";
	}
		
}
