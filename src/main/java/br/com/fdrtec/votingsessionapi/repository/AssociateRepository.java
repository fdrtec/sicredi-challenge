package br.com.fdrtec.votingsessionapi.repository;

import br.com.fdrtec.votingsessionapi.document.Associate;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface AssociateRepository extends ReactiveMongoRepository<Associate, String> {
}
