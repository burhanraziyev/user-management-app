package az.burhan.user.management.app.api.controller;

import az.burhan.user.management.app.api.model.response.PermissionDto;
import az.burhan.user.management.app.api.model.response.RestDataResponse;
import az.burhan.user.management.app.service.PermissionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotNull;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/permissions")
public class PermissionController {

    private final PermissionService service;

    @GetMapping
    public ResponseEntity<RestDataResponse<List<PermissionDto>>> getAllPermissions() {
        return ResponseEntity.ok(new RestDataResponse<>(service.getAllPermissions()));
    }

    @GetMapping("/{id}")
    public ResponseEntity<PermissionDto> getPermissionById(@NotNull @PathVariable Long id) {
        return ResponseEntity.ok(service.getPermissionById(id));
    }
}
