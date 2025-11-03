package org.hausmeisterfixbe.service.impl;

import lombok.AllArgsConstructor;
import org.hausmeisterfixbe.exception.NotFoundException;
import org.hausmeisterfixbe.mapper.UserMapper;
import org.hausmeisterfixbe.model.dto.request.UserLoginRequest;
import org.hausmeisterfixbe.model.dto.request.UserRegisterRequest;
import org.hausmeisterfixbe.model.dto.response.UserRegisterResponse;
import org.hausmeisterfixbe.model.dto.response.UserViewResponse;
import org.hausmeisterfixbe.model.entity.User;
import org.hausmeisterfixbe.repository.UserRepository;
import org.hausmeisterfixbe.service.UserService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    private final UserMapper userMapper;


    @Override
    public UserRegisterResponse registerUser(UserRegisterRequest userRegisterRequest) {

        if (registerUserInKeycloak()) {
            return null;
        }

        User user = userMapper.toEntity(userRegisterRequest);
//        user.setKeycloakUserId();
        user.setActive(true);
//        user.setRole();

        userRepository.save(user);
        return userMapper.toRegisterResponse(user);
    }

    @Override
    public UserRegisterResponse registerEmployeeUser(UserRegisterRequest userRegisterRequest) {

        if (registerUserInKeycloak()) {
            return null;
        }

        User user = userMapper.toEntity(userRegisterRequest);
//        user.setKeycloakUserId();
        user.setActive(true);
//        user.setRole();

        userRepository.save(user);
        return userMapper.toRegisterResponse(user);

    }

    @Override
    public void loginUser(UserLoginRequest userLoginRequest) throws Exception {

        if (loginUserInKeycloak(userLoginRequest.email(), userLoginRequest.password())){
            return;
        } else {
            throw new Exception("Something went wrong.");
        }

    }



    @Override
    public UserViewResponse viewUser(UUID uuid) {
        User user = userRepository.findById(uuid).orElseThrow(() -> new NotFoundException(uuid));

        return userMapper.toViewResponse(user);
    }

    @Override
    public Page<UserViewResponse> viewAllUsers(Pageable pageable) {
        return userRepository.findAll(pageable)
                .map(userMapper::toViewResponse);
    }


    @Override
    public UserViewResponse editUser() {
        return null;
    }


    private boolean registerUserInKeycloak() {
        //TODO Keycloak Register

        return false;
    }

    private boolean loginUserInKeycloak(String email, String password) {
        return false;
    }
}
