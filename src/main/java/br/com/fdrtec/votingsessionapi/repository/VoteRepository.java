package br.com.fdrtec.votingsessionapi.repository;

import br.com.fdrtec.votingsessionapi.document.Vote;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface VoteRepository extends ReactiveMongoRepository<Vote, String> {
}
