package br.com.fdrtec.votingsessionapi.controller;

import br.com.fdrtec.votingsessionapi.document.Associate;
import br.com.fdrtec.votingsessionapi.document.VoteSession;
import br.com.fdrtec.votingsessionapi.service.AssociateService;
import br.com.fdrtec.votingsessionapi.service.VoteSessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class VoteSessionController {
    @Autowired
    private VoteSessionService vsService;

    @GetMapping(value = "/vote-session")
    public Flux<VoteSession> getVoteSessions() {
        return vsService.findAll();
    }

    @GetMapping(value = "/vote-session/{id}")
    public Mono<VoteSession> getVoteSessionById(@PathVariable String id) {
        return vsService.findById(id);
    }

    @PostMapping(value = "/vote-session")
    public Mono<VoteSession> save(@RequestBody VoteSession voteSession) {
        return vsService.save(voteSession);
    }

}
