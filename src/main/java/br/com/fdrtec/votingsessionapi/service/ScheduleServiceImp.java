package br.com.fdrtec.votingsessionapi.service;

import br.com.fdrtec.votingsessionapi.document.Schedule;
import br.com.fdrtec.votingsessionapi.repository.ScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ScheduleServiceImp implements ScheduleService {
    @Autowired
    private ScheduleRepository scRepository;

    @Override
    public Flux<Schedule> findAll() {
        return scRepository.findAll();
    }

    @Override
    public Mono<Schedule> findById(String id) {
        return scRepository.findById(id);
    }

    @Override
    public Mono<Schedule> save(Schedule schedule) {
        return scRepository.save(schedule);
    }
}
