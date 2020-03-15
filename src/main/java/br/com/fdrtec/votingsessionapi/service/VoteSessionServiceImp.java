package br.com.fdrtec.votingsessionapi.service;

import br.com.fdrtec.votingsessionapi.document.VoteSession;
import br.com.fdrtec.votingsessionapi.repository.VoteSessionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class VoteSessionServiceImp implements VoteSessionService {
    @Autowired
    private VoteSessionRepository vsRepository;

    @Override
    public Flux<VoteSession> findAll() {
        return vsRepository.findAll();
    }

    @Override
    public Mono<VoteSession> findById(String id) {
        return vsRepository.findById(id);
    }

    @Override
    public Mono<VoteSession> save(VoteSession voteSession) {
        try { return vsRepository.save(voteSession); }            
        catch (Exception e){ return null;}
    }
}
