package br.com.fdrtec.votingsessionapi.service;

import br.com.fdrtec.votingsessionapi.document.Schedule;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ScheduleService {
    Flux<Schedule> findAll();
    Mono<Schedule> findById(String id);
    Mono<Schedule> save(Schedule schedule);
}
