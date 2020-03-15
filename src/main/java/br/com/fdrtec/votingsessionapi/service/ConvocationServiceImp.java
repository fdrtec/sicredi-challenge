package br.com.fdrtec.votingsessionapi.service;

import br.com.fdrtec.votingsessionapi.document.Convocation;
import br.com.fdrtec.votingsessionapi.repository.ConvocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ConvocationServiceImp implements ConvocationService{
    @Autowired
    ConvocationRepository convocationRepository;

    @Override
    public Flux<Convocation> findAll() {
        return convocationRepository.findAll();
    }

    @Override
    public Mono<Convocation> findById(String id) {
        return convocationRepository.findById(id);
    }

    @Override
    public Mono<Convocation> save(Convocation convocation) {
        return convocationRepository.save(convocation);
    }
}
