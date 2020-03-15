package br.com.fdrtec.votingsessionapi.document;

import lombok.Builder;
import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;


@Getter
@Document
public class Vote {
    @Id
    private String id;
    private String objectType;
    private String associateId;
    private Date dtVote;
    private Boolean voteChoice;

    public Vote(String associateId, Boolean voteChoice){
        this.objectType = "Vote";
        this.associateId = associateId;
        this.dtVote = new Date();
        this.voteChoice = voteChoice;
    }

}
