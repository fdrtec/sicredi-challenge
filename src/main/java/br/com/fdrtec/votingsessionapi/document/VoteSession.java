package br.com.fdrtec.votingsessionapi.document;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Getter
@Document
public class VoteSession {
    @Id
    private String id;
    private String objectType = "VoteSession";
    @Setter
    private long duration = 600000;
    private Date dtStart = new Date();
    @Setter
    private Date dtEnd;
    @Setter
    private List<Vote> votes;

    VoteSession(){
        this.votes = new ArrayList<Vote>();
    }

}
