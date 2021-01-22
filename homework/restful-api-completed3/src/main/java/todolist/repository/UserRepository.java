package todolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import todolist.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
