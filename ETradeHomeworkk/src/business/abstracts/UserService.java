package business.abstracts;

import java.util.List;

import entities.concretes.User;

public interface UserService {
	void add(User user);
	void sigin(User user);
	List<User> getAll();
}
