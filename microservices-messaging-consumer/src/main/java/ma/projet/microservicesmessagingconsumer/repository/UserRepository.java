package ma.projet.microservicesmessagingconsumer.repository;

import ma.projet.microservicesmessagingconsumer.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}