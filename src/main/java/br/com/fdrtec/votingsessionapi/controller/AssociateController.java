package br.com.fdrtec.votingsessionapi.controller;

import br.com.fdrtec.votingsessionapi.document.Associate;
import br.com.fdrtec.votingsessionapi.service.AssociateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class AssociateController {
    @Autowired
    AssociateService service;

    @GetMapping(value = "/associate")
    public Flux<Associate> getAssociates() {
        return service.findAll();
    }

    @GetMapping(value = "/associate/{id}")
    public Mono<Associate> getAssociateById(@PathVariable String id) {
        return service.findById(id);
    }

    @PostMapping(value = "/associate")
    public Mono<Associate> save(@RequestBody Associate associate) {
        return service.save(associate);
    }


}
