package app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.fasterxml.jackson.databind.ObjectMapper;

import app.model.User;
import app.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepository;
	
	ObjectMapper mapper = new ObjectMapper();

	public String create(User user) {
		return "";
	}
	
	public String getAll() {
		return "";
	}
	
	public String get(int id) {
		return "";
	}
	
	public String update(int id, User user) {
		return "";
	}
	
	public String delete(int id) {
		return "";
	}
	
}
