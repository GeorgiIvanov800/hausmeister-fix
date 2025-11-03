package org.hausmeisterfixbe.service.impl;

import lombok.AllArgsConstructor;
import org.hausmeisterfixbe.model.dto.request.UserLoginRequest;
import org.hausmeisterfixbe.model.dto.request.UserRegisterRequest;
import org.hausmeisterfixbe.model.dto.response.UserRegisterResponse;
import org.hausmeisterfixbe.model.dto.response.UserViewResponse;
import org.hausmeisterfixbe.repository.UserRepository;
import org.hausmeisterfixbe.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;


    @Override
    public UserRegisterResponse registerUser(UserRegisterRequest userRegisterRequest) {
        return null;
    }

    @Override
    public void loginUser(UserLoginRequest userLoginRequest) {

    }

    @Override
    public UserViewResponse viewUser() {
        return null;
    }

    @Override
    public List<UserViewResponse> viewAllUsers() {
        return List.of();
    }

    @Override
    public UserViewResponse viewUserById(UUID id) {
        return null;
    }

    @Override
    public UserViewResponse editUser() {
        return null;
    }
}
