package git_practice.user.service;

import java.util.List;

import org.springframework.stereotype.Service;

import git_practice.user.model.User;

@Service
public interface UserService {
	public List<User> getAllUsers();
}
