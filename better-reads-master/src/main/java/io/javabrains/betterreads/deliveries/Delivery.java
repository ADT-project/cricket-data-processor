package io.javabrains.betterreads.deliveries;

import org.springframework.data.annotation.Id;
import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.CassandraType;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.core.mapping.Table;
import org.springframework.data.cassandra.core.mapping.CassandraType.Name;

@Table(value = "deliveries_by_matchid")
public class Delivery {
	
	@Id @PrimaryKeyColumn(name = "delivery_id", ordinal = 0, type = PrimaryKeyType.PARTITIONED)
    private Integer delivery_id;
    
    @Column("ball")
    @CassandraType(type = Name.INT)
    private int ball;
    
    @Column("batsman")
    @CassandraType(type = Name.TEXT)
    private String batsman;
    
    @Column("batsman_runs")
    @CassandraType(type = Name.TEXT)
    private String batsmanRuns;
    
    @Column("batting_team")
    @CassandraType(type = Name.TEXT)
    private String battingTeam;
    
    @Column("bowler")
    @CassandraType(type = Name.TEXT)
    private String bowler;
    
    @Column("bowling_team")
    @CassandraType(type = Name.TEXT)
    private String bowlingTeam;
    
    @Column("dismissal_kind")
    @CassandraType(type = Name.TEXT)
    private String dismissalKind;
    
    @Column("extra_runs")
    @CassandraType(type = Name.INT)
    private int extraRuns;
    
    @Column("extras_type")
    @CassandraType(type = Name.TEXT)
    private String extrasTyppe;
    
    @Column("fielder")
    @CassandraType(type = Name.TEXT)
    private String fielder;
    
    @Column("inning")
    @CassandraType(type = Name.INT)
    private int inning;
    
    @Column("is_wicket")
    @CassandraType(type = Name.INT)
    private int isWicket;
    
    @Column("match_id")
    @CassandraType(type = Name.INT)
    private Integer match_id;
    
    @Column("non_boundary")
    @CassandraType(type = Name.INT)
    private int nonBoundary;
    
    @Column("non_striker")
    @CassandraType(type = Name.TEXT)
    private String nonStriker;
    
    @Column("over")
    @CassandraType(type = Name.INT)
    private int over;
    
    @Column("player_dismissed")
    @CassandraType(type = Name.TEXT)
    private String playerDismissed;
    
    @Column("total_runs")
    @CassandraType(type = Name.INT)
    private int totalRuns;

	public Integer getDelivery_id() {
		return delivery_id;
	}

	public void setDelivery_id(Integer delivery_id) {
		this.delivery_id = delivery_id;
	}

	public int getBall() {
		return ball;
	}

	public void setBall(int ball) {
		this.ball = ball;
	}

	public String getBatsman() {
		return batsman;
	}

	public void setBatsman(String batsman) {
		this.batsman = batsman;
	}

	public String getBatsmanRuns() {
		return batsmanRuns;
	}

	public void setBatsmanRuns(String batsmanRuns) {
		this.batsmanRuns = batsmanRuns;
	}

	public String getBattingTeam() {
		return battingTeam;
	}

	public void setBattingTeam(String battingTeam) {
		this.battingTeam = battingTeam;
	}

	public String getBowler() {
		return bowler;
	}

	public void setBowler(String bowler) {
		this.bowler = bowler;
	}

	public String getBowlingTeam() {
		return bowlingTeam;
	}

	public void setBowlingTeam(String bowlingTeam) {
		this.bowlingTeam = bowlingTeam;
	}

	public String getDismissalKind() {
		return dismissalKind;
	}

	public void setDismissalKind(String dismissalKind) {
		this.dismissalKind = dismissalKind;
	}

	public int getExtraRuns() {
		return extraRuns;
	}

	public void setExtraRuns(int extraRuns) {
		this.extraRuns = extraRuns;
	}

	public String getExtrasTyppe() {
		return extrasTyppe;
	}

	public void setExtrasTyppe(String extrasTyppe) {
		this.extrasTyppe = extrasTyppe;
	}

	public String getFielder() {
		return fielder;
	}

	public void setFielder(String fielder) {
		this.fielder = fielder;
	}

	public int getInning() {
		return inning;
	}

	public void setInning(int inning) {
		this.inning = inning;
	}

	public int isWicket() {
		return isWicket;
	}

	public void setWicket(int isWicket) {
		this.isWicket = isWicket;
	}

	public Integer getMatch_id() {
		return match_id;
	}

	public void setMatch_id(Integer match_id) {
		this.match_id = match_id;
	}

	public int getNonBoundary() {
		return nonBoundary;
	}

	public void setNonBoundary(int nonBoundary) {
		this.nonBoundary = nonBoundary;
	}

	public String getNonStriker() {
		return nonStriker;
	}

	public void setNonStriker(String nonStriker) {
		this.nonStriker = nonStriker;
	}

	public int getOver() {
		return over;
	}

	public void setOver(int over) {
		this.over = over;
	}

	public String getPlayerDismissed() {
		return playerDismissed;
	}

	public void setPlayerDismissed(String playerDismissed) {
		this.playerDismissed = playerDismissed;
	}

	public int getTotalRuns() {
		return totalRuns;
	}

	public void setTotalRuns(int totalRuns) {
		this.totalRuns = totalRuns;
	}
    
    

}
