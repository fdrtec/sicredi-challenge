package br.com.fdrtec.votingsessionapi.document;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Getter
@Document
public class Associate {
    @Id
    private String id;
    private String objectType;
    @Setter
    private String cpf;
    @Setter
    private Boolean voteQualification;

    public Associate(String cpf, Boolean voteQualification){
        this.objectType = "Associate";
        this.cpf = cpf;
        this.voteQualification = voteQualification;
    }
}
