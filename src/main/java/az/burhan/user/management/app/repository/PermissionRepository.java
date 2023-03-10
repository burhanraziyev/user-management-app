package az.burhan.user.management.app.repository;

import az.burhan.user.management.app.domain.Permission;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PermissionRepository extends JpaRepository<Permission, Long> {
}