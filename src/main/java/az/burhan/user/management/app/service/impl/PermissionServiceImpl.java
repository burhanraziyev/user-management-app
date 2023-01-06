package az.burhan.user.management.app.service.impl;

import az.burhan.user.management.app.api.model.response.PermissionDto;
import az.burhan.user.management.app.domain.Permission;
import az.burhan.user.management.app.exception.ResourceNotFoundException;
import az.burhan.user.management.app.mapper.PermissionMapper;
import az.burhan.user.management.app.repository.PermissionRepository;
import az.burhan.user.management.app.service.PermissionService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class PermissionServiceImpl implements PermissionService {

    private final PermissionMapper mapper;
    private final PermissionRepository repository;

    @Override
    public List<PermissionDto> getAllPermissions() {
        return mapper.toDto(repository.findAll());
    }

    @Override
    public PermissionDto getPermissionById(Long id) {
        return mapper.toDto(findById(id));
    }

    private Permission findById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Permission", "id", id));
    }
}
