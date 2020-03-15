package br.com.fdrtec.votingsessionapi.service;

import br.com.fdrtec.votingsessionapi.document.Associate;
import br.com.fdrtec.votingsessionapi.repository.AssociateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class AssociateServiceImp implements AssociateService {
    @Autowired
    AssociateRepository associateRepository;

    @Override
    public Flux<Associate> findAll() {
        return associateRepository.findAll();
    }

    @Override
    public Mono<Associate> findById(String id) {
        return associateRepository.findById(id);
    }

    @Override
    public Mono<Associate> save(Associate associate) {
        return associateRepository.save(associate);
    }
}
