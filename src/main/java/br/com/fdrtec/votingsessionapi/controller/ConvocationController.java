package br.com.fdrtec.votingsessionapi.controller;

import br.com.fdrtec.votingsessionapi.document.Convocation;
import br.com.fdrtec.votingsessionapi.service.ConvocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class ConvocationController {
    @Autowired
    private ConvocationService service;

    @GetMapping(value="/convocation")
    public Flux<Convocation>getConvocation() {
        return service.findAll();
    }

    @GetMapping(value="/convocation/{id}")
    public Mono<Convocation>getConvocationById(@PathVariable String id) {
        return service.findById(id);
    }

    @PostMapping(value="/convocation")
    public Mono<Convocation>save(@RequestBody Convocation convocation) {
        return service.save(convocation);
    }
}
