package captemplate.impl;

import captemplate.data.model.User;
import captemplate.data.repository.UserRepository;
import captemplate.service.UserDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserDataServiceImp implements UserDataService {
    @Autowired
    private UserRepository userRepository;
    @Override
    public List<User> getUserdata() {
        //
        return userRepository.findAll();
    }
}
