package az.burhan.user.management.app.repository;

import az.burhan.user.management.app.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
}