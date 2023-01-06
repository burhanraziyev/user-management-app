package az.burhan.user.management.app.service.impl;

import az.burhan.user.management.app.api.model.response.RoleDto;
import az.burhan.user.management.app.domain.Permission;
import az.burhan.user.management.app.domain.Role;
import az.burhan.user.management.app.exception.ResourceNotFoundException;
import az.burhan.user.management.app.mapper.RoleMapper;
import az.burhan.user.management.app.repository.RoleRepository;
import az.burhan.user.management.app.service.RoleService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class RoleServiceImpl implements RoleService {

    private final RoleMapper mapper;
    private final RoleRepository repository;


    @Override
    public RoleDto getRoleById(Long id) {
        return mapper.toDto(findById(id));
    }

    @Override
    public List<RoleDto> getAllRoles() {
        return mapper.toDto(repository.findAll());
    }

    private Role findById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Role", "id", id));
    }
}
