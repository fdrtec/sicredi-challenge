package br.com.fdrtec.votingsessionapi.repository;

import br.com.fdrtec.votingsessionapi.document.Schedule;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface ScheduleRepository extends ReactiveMongoRepository<Schedule, String> {
}
