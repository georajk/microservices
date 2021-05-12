package com.codergk.user.service;

import com.codergk.user.entity.User;
import com.codergk.user.repository.UserRepository;
import com.codergk.user.vo.Department;
import com.codergk.user.vo.UserResponseVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserService {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private UserRepository userRepository;


    public User saveUser(User user) {

        return userRepository.save(user);
    }

    public UserResponseVO findUser(Long id) {

        UserResponseVO userResponseVO = new UserResponseVO();
        userResponseVO.setUser(userRepository.findUserById(id));

        userResponseVO.setDepartment(restTemplate.getForObject(
                "http://DEPARTMENT-SERVICE/departments/"+ userResponseVO.getUser().getDepartmentId(),
                Department.class));
        return userResponseVO;
    }
}
