package org.hausmeisterfixbe.mapper;

import org.hausmeisterfixbe.model.dto.request.UserRegisterRequest;
import org.hausmeisterfixbe.model.dto.response.UserRegisterResponse;
import org.hausmeisterfixbe.model.dto.response.UserViewResponse;
import org.hausmeisterfixbe.model.entity.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    User toEntity(UserRegisterRequest userRegisterRequest);
    UserViewResponse toViewResponse(User user);
    UserRegisterResponse toRegisterResponse(User user);
}
