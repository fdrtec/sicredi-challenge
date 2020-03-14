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
    private String objectType = "Vote";
    private Associate associate;
    private Date dtVote;
    private Boolean choice;

    Vote(Associate associate, Boolean choice) {
        this.associate = associate;
        this.choice = choice;
        this.dtVote = new Date();
    }
}
