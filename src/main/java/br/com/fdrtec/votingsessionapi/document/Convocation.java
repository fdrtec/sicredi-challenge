package br.com.fdrtec.votingsessionapi.document;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Getter
@Document
public class Convocation {
    @Id
    private String id;
    private String objectType;
    @Setter
    private String title;
    @Setter
    private List<Schedule>schedules;

    public Convocation(String title, List schedules) {
        this.objectType = "Convocation";
        this.title = title;
        this.schedules = schedules;
    }
}
