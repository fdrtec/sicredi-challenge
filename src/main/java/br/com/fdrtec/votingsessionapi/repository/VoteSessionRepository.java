package br.com.fdrtec.votingsessionapi.repository;

import br.com.fdrtec.votingsessionapi.document.VoteSession;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface VoteSessionRepository extends ReactiveMongoRepository<VoteSession, String> {
}
