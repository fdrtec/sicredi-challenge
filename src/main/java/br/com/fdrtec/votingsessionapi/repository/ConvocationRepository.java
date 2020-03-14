package br.com.fdrtec.votingsessionapi.repository;

import br.com.fdrtec.votingsessionapi.document.Convocation;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface ConvocationRepository extends ReactiveMongoRepository<Convocation, String> {
}
