package com.ipl.cricketprocessor.match;

import java.time.LocalDate;
import java.util.List;

import javax.annotation.Generated;

import org.springframework.data.annotation.Id;
import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.CassandraType;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.core.mapping.Table;
import org.springframework.data.cassandra.core.mapping.CassandraType.Name;

/**
 * Model that represents the books_by_id table in Cassandra.
 * Stores the book information retrievable by the book ID
 */

@Table(value = "match_by_id")
public class Match {
    
    @Id @PrimaryKeyColumn(name = "match_id", ordinal = 0, type = PrimaryKeyType.PARTITIONED)
    private Integer match_id;
    
    @Column("date")
    @CassandraType(type = Name.TEXT)
    private String date;
    
    @Column("city")
    @CassandraType(type = Name.TEXT)
    private String city;
    
    @Column("eliminator")
    @CassandraType(type = Name.TEXT)
    private String eliminator;
    
    @Column("method")
    @CassandraType(type = Name.TEXT)
    private String method;
    
    @Column("neutral_venue")
    @CassandraType(type = Name.TEXT)
    private String neutralVenue;
    
    @Column("player_of_match")
    @CassandraType(type = Name.TEXT)
    private String playerOfMatch;
    
    @Column("result")
    @CassandraType(type = Name.TEXT)
    private String result;
    
    @Column("result_margin")
    @CassandraType(type = Name.INT)
    private int resultMargin;
    
    @Column("team1")
    @CassandraType(type = Name.TEXT)
    private String team1;
    
    @Column("team2")
    @CassandraType(type = Name.TEXT)
    private String team2;
    
    @Column("toss_decision")
    @CassandraType(type = Name.TEXT)
    private String tossDecision;

    @Column("toss_winner")
    @CassandraType(type = Name.TEXT)
    private String tossWinner;

    @Column("umpire1")
    @CassandraType(type = Name.TEXT)
    private String umpire1;
    
    @Column("umpire2")
    @CassandraType(type = Name.TEXT)
    private String umpire2;
    
    @Column("venue")
    @CassandraType(type = Name.TEXT)
    private String venue;
    
    @Column("winner")
    @CassandraType(type = Name.TEXT)
    private String winner;

//	public Double getId() {
//		return match_id;
//	}
//
//	public void setId(Double match_id) {
//		this.match_id = match_id;
//	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getEliminator() {
		return eliminator;
	}

	public void setEliminator(String eliminator) {
		this.eliminator = eliminator;
	}

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public String getNeutralVenue() {
		return neutralVenue;
	}

	public void setNeutralVenue(String neutralVenue) {
		this.neutralVenue = neutralVenue;
	}

	public String getPlayerOfMatch() {
		return playerOfMatch;
	}

	public void setPlayerOfMatch(String playerOfMatch) {
		this.playerOfMatch = playerOfMatch;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public int getResultMargin() {
		return resultMargin;
	}

	public void setResultMargin(int resultMargin) {
		this.resultMargin = resultMargin;
	}

	public String getTeam1() {
		return team1;
	}

	public void setTeam1(String team1) {
		this.team1 = team1;
	}

	public String getTeam2() {
		return team2;
	}

	public void setTeam2(String team2) {
		this.team2 = team2;
	}

	public String getTossDecision() {
		return tossDecision;
	}

	public void setTossDecision(String tossDecision) {
		this.tossDecision = tossDecision;
	}

	public String getTossWinner() {
		return tossWinner;
	}

	public void setTossWinner(String tossWinner) {
		this.tossWinner = tossWinner;
	}

	public String getUmpire1() {
		return umpire1;
	}

	public void setUmpire1(String umpire1) {
		this.umpire1 = umpire1;
	}

	public String getUmpire2() {
		return umpire2;
	}

	public void setUmpire2(String umpire2) {
		this.umpire2 = umpire2;
	}

	public String getVenue() {
		return venue;
	}

	public void setVenue(String venue) {
		this.venue = venue;
	}

	public String getWinner() {
		return winner;
	}

	public void setWinner(String winner) {
		this.winner = winner;
	}

	public Integer getMatch_id() {
		return match_id;
	}

	public void setMatch_id(Integer match_id) {
		this.match_id = match_id;
	}

//	public Double getMatch_id() {
//		return match_id;
//	}
//
//	public void setMatch_id(Double match_id) {
//		this.match_id = match_id;
//	}
       
    

}
