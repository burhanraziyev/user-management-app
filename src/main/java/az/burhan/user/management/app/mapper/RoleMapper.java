package az.burhan.user.management.app.mapper;

import az.burhan.user.management.app.api.model.response.RoleDto;
import az.burhan.user.management.app.domain.Role;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface RoleMapper {
    RoleDto toDto(Role entity);

    List<RoleDto> toDto(List<Role> entityList);
}
