package br.com.fdrtec.votingsessionapi.controller;

import br.com.fdrtec.votingsessionapi.document.Vote;
import br.com.fdrtec.votingsessionapi.service.VoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class VoteController {
    @Autowired
    private VoteService vtService;

    @GetMapping(value = "/vote")
    public Flux<Vote> getVotes() {
        return vtService.findAll();
    }

    @GetMapping(value = "/vote/{id}")
    public Mono<Vote> getVoteById(@PathVariable String id){
        return vtService.findById(id);
    }

    @PostMapping(value = "/vote")
    public Mono<Vote> save(@RequestBody Vote vote) {
        return vtService.save(vote);
    }

}
