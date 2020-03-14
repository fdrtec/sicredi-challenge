package br.com.fdrtec.votingsessionapi.service;

import br.com.fdrtec.votingsessionapi.document.Associate;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface AssociateService {

    Flux<Associate> findAll();
    Mono<Associate> findById(String id);
    Mono<Associate> save(Associate associate);

}
