package org.hausmeisterfixbe.service;

import org.hausmeisterfixbe.model.dto.request.UserLoginRequest;
import org.hausmeisterfixbe.model.dto.request.UserRegisterRequest;
import org.hausmeisterfixbe.model.dto.response.UserRegisterResponse;
import org.hausmeisterfixbe.model.dto.response.UserViewResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.UUID;

public interface UserService {

    UserRegisterResponse registerUser(UserRegisterRequest userRegisterRequest);
    UserRegisterResponse registerEmployeeUser(UserRegisterRequest userRegisterRequest);

    void loginUser(UserLoginRequest userLoginRequest) throws Exception;

    UserViewResponse viewUser(UUID uuid);

    Page<UserViewResponse> viewAllUsers(Pageable pageable);

    UserViewResponse editUser();
}
