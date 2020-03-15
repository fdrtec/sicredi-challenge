package br.com.fdrtec.votingsessionapi.service;

import br.com.fdrtec.votingsessionapi.document.Vote;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface VoteService {
    Flux<Vote> findAll();
    Mono<Vote> findById(String id);
    Mono<Vote> save(Vote vote);
}
