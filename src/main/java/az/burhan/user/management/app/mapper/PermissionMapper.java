package az.burhan.user.management.app.mapper;

import az.burhan.user.management.app.api.model.response.PermissionDto;
import az.burhan.user.management.app.domain.Permission;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PermissionMapper {

    PermissionDto toDto(Permission entity);

    List<PermissionDto> toDto(List<Permission> entityList);
}
