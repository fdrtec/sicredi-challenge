package br.com.fdrtec.votingsessionapi.service;

import br.com.fdrtec.votingsessionapi.document.VoteSession;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface VoteSessionService {
    Flux<VoteSession> findAll();
    Mono<VoteSession> findById(String id);
    Mono<VoteSession> save(VoteSession voteSession);
}
