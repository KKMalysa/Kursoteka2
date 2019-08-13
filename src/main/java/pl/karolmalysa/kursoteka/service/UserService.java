package pl.karolmalysa.kursoteka.service;

import pl.karolmalysa.kursoteka.model.UserDTO;
import pl.karolmalysa.kursoteka.persistance.model.User;
import pl.karolmalysa.kursoteka.persistance.repository.UserRepo;

public interface UserService extends BaseService<User, Long, UserRepo> {

    public UserDTO createUser(UserDTO userDTO);

    public UserDTO editUser(UserDTO userDTO);
}
