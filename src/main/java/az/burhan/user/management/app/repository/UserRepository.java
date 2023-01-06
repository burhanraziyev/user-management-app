package az.burhan.user.management.app.repository;

import az.burhan.user.management.app.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}