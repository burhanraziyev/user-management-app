package az.burhan.user.management.app.api.controller;

import az.burhan.user.management.app.service.RoleService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/roles")
public class RoleController {

    private final RoleService service;
}
