package az.burhan.user.management.app.service;

import az.burhan.user.management.app.api.model.response.PermissionDto;

import java.util.List;

public interface PermissionService {
    List<PermissionDto> getAllPermissions();

    PermissionDto getPermissionById(Long id);
}
