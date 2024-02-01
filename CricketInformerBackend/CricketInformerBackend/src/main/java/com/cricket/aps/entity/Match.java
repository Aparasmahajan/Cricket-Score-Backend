package com.cricket.aps.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.Date;
@Entity
@Table(name = "cricket_match")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Match {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int matchId;
    String teamHeading;
    String matchNumberVenue;
    String battingTeam;
    String battingTeamScore;
    String bowlTeam;
    String bowlTeamScore;
    String liveText;
    String matchLink;
    String textComplete;
    @Enumerated
    MatchStatus status;
    Date date=new Date();

    public void setMatchStatus(){
        if(textComplete.isBlank()){
            this.status=MatchStatus.LIVE;
        }
        else{
            this.status=MatchStatus.COMPLETED;
        }
    }
}
