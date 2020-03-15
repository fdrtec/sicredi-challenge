package br.com.fdrtec.votingsessionapi.service;

import br.com.fdrtec.votingsessionapi.document.Vote;
import br.com.fdrtec.votingsessionapi.repository.VoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class VoteServiceImp implements VoteService{
    @Autowired
    private VoteRepository vtRepository;

    @Override
    public Flux<Vote> findAll() {
        return vtRepository.findAll();
    }

    @Override
    public Mono<Vote> findById(String id) {
        return vtRepository.findById(id);
    }

    @Override
    public Mono<Vote> save(Vote vote) {
        try {
            return vtRepository.save(vote);
        } catch (Exception e) {
            return null;
        }
    }

}
