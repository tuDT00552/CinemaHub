package vn.cinemahub.cinemahub.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.cinemahub.cinemahub.entities.User;
import vn.cinemahub.cinemahub.repository.UserRepository;
import vn.cinemahub.cinemahub.service.UserService;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> findAll() { return userRepository.findAll();
    }

    @Override
    public  User save(User user) {
       return userRepository.save(user);
    }

    public Optional<User> findByID(Long id) {

        return userRepository.findById(id);
    }


    @Override
    public User update(User user) {
        return userRepository.save(user);
    }

    @Override
    public void delete(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    public Optional<User> findOne(Long id) {
        return userRepository.findById(id);
    }
    ;

}
