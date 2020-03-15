package br.com.fdrtec.votingsessionapi.service;

import br.com.fdrtec.votingsessionapi.document.Convocation;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ConvocationService {
    Flux<Convocation> findAll();
    Mono<Convocation> findById(String id);
    Mono<Convocation> save(Convocation convocation);
}
