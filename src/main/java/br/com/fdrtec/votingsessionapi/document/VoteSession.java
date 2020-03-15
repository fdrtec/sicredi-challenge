package br.com.fdrtec.votingsessionapi.document;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Getter
@Document
public class VoteSession {
    @Id
    private String id;
    private String objectType;
    @Setter
    private long sessionDurantion;
    private Date dtStart;
    @Setter
    private String dtEnd;
    @Setter
    private List<Vote> votes;

    public VoteSession(String dtEnd, List votes) {
        this.objectType = "VoteSession";
        this.dtStart = new Date();
        this.dtEnd = dtEnd;
        //this.sessionDurantion = getSessionDuration();
        this.sessionDurantion = 60000;
        this.votes = votes;
    }

//    private Long getSessionDuration(){
//        long startTime = dtStart.getTime();
//        long endTime = dtEnd.getTime();
//        return endTime - startTime;
//    }
}