package org.hausmeisterfixbe.service;

import org.hausmeisterfixbe.model.dto.request.UserLoginRequest;
import org.hausmeisterfixbe.model.dto.request.UserRegisterRequest;
import org.hausmeisterfixbe.model.dto.response.UserRegisterResponse;
import org.hausmeisterfixbe.model.dto.response.UserViewResponse;

import java.util.List;
import java.util.UUID;

public interface UserService {

    UserRegisterResponse registerUser(UserRegisterRequest userRegisterRequest);

    void loginUser(UserLoginRequest userLoginRequest);

    UserViewResponse viewUser();

    List<UserViewResponse> viewAllUsers();

    UserViewResponse viewUserById(UUID id);

    UserViewResponse editUser();
}
