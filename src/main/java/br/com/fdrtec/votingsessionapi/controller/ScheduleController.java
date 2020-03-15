package br.com.fdrtec.votingsessionapi.controller;

import br.com.fdrtec.votingsessionapi.document.Schedule;
import br.com.fdrtec.votingsessionapi.service.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class ScheduleController {
    @Autowired
    private ScheduleService scService;

    @GetMapping(value = "/schedule")
    public Flux<Schedule> getSchedules(){
        return scService.findAll();
    }

    @GetMapping(value = "/schedule/{id}")
    public Mono<Schedule> getScheduleById(@PathVariable String id){
        return scService.findById(id);
    }

    @PostMapping(value = "/schedule")
    public Mono<Schedule> save(@RequestBody Schedule schedule){
        return scService.save(schedule);
    }
}
