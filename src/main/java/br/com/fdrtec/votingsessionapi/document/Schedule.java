package br.com.fdrtec.votingsessionapi.document;

import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Getter
@Document
public class Schedule {
    @Id
    private String id;
    private String objectType;
    private String title;
    private List<VoteSession> voteSessions;

    Schedule(String title, List voteSessions){
        this.objectType = "Schedule";
        this.title = title;
        this.voteSessions = voteSessions;
    }


}
