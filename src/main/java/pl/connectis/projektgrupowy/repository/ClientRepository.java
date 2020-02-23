package pl.connectis.projektgrupowy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.connectis.projektgrupowy.domain.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client,Long> {

}
