package az.burhan.user.management.app.service;

import az.burhan.user.management.app.api.model.response.RoleDto;

import java.util.List;

public interface RoleService {

    RoleDto getRoleById(Long id);

    List<RoleDto> getAllRoles();
}
