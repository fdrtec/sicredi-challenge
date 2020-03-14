package br.com.fdrtec.votingsessionapi.document;

import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Getter
@Document
public class Schedule {
    @Id
    private String id;
    private String objectType = "Schedule";
    private String title;
    private List<String> sessions;

    Schedule(String title){
        this.title = title;
        this.sessions = new ArrayList<>();
    }


}
