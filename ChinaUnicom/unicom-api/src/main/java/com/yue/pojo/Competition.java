package com.yue.pojo;


/**
 * Competition entity. @author MyEclipse Persistence Tools
 */

public class Competition implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// Fields

	private Integer competitionId;
	private String competitionProduct;
	private String competitionMarketing;
	private Integer competitionShare;
	private String competitionSuperiority;
	private String competitionInferior;
	private String compettitionChannel;
	private String competitionSubscribers;
	private String competitionPeretration;
	private String competitionPolicy;
	private String competitionPublicity;
	private String competitionActivity;
	private String competitionMarket;
	private String competitonPropaganda;
	private String competitionSell;
	private String compeptitionMeasure;
	private String compeptitionStructure;

	// Constructors

	/** default constructor */
	public Competition() {
	}

	/** full constructor */
	public Competition(String competitionProduct, String competitionMarketing,
			Integer competitionShare, String competitionSuperiority,
			String competitionInferior, String compettitionChannel,
			String competitionSubscribers, String competitionPeretration,
			String competitionPolicy, String competitionPublicity,
			String competitionActivity, String competitionMarket,
			String competitonPropaganda, String competitionSell,
			String compeptitionMeasure, String compeptitionStructure) {
		this.competitionProduct = competitionProduct;
		this.competitionMarketing = competitionMarketing;
		this.competitionShare = competitionShare;
		this.competitionSuperiority = competitionSuperiority;
		this.competitionInferior = competitionInferior;
		this.compettitionChannel = compettitionChannel;
		this.competitionSubscribers = competitionSubscribers;
		this.competitionPeretration = competitionPeretration;
		this.competitionPolicy = competitionPolicy;
		this.competitionPublicity = competitionPublicity;
		this.competitionActivity = competitionActivity;
		this.competitionMarket = competitionMarket;
		this.competitonPropaganda = competitonPropaganda;
		this.competitionSell = competitionSell;
		this.compeptitionMeasure = compeptitionMeasure;
		this.compeptitionStructure = compeptitionStructure;
	}

	// Property accessors

	public Integer getCompetitionId() {
		return this.competitionId;
	}

	public void setCompetitionId(Integer competitionId) {
		this.competitionId = competitionId;
	}

	public String getCompetitionProduct() {
		return this.competitionProduct;
	}

	public void setCompetitionProduct(String competitionProduct) {
		this.competitionProduct = competitionProduct;
	}

	public String getCompetitionMarketing() {
		return this.competitionMarketing;
	}

	public void setCompetitionMarketing(String competitionMarketing) {
		this.competitionMarketing = competitionMarketing;
	}

	public Integer getCompetitionShare() {
		return this.competitionShare;
	}

	public void setCompetitionShare(Integer competitionShare) {
		this.competitionShare = competitionShare;
	}

	public String getCompetitionSuperiority() {
		return this.competitionSuperiority;
	}

	public void setCompetitionSuperiority(String competitionSuperiority) {
		this.competitionSuperiority = competitionSuperiority;
	}

	public String getCompetitionInferior() {
		return this.competitionInferior;
	}

	public void setCompetitionInferior(String competitionInferior) {
		this.competitionInferior = competitionInferior;
	}

	public String getCompettitionChannel() {
		return this.compettitionChannel;
	}

	public void setCompettitionChannel(String compettitionChannel) {
		this.compettitionChannel = compettitionChannel;
	}

	public String getCompetitionSubscribers() {
		return this.competitionSubscribers;
	}

	public void setCompetitionSubscribers(String competitionSubscribers) {
		this.competitionSubscribers = competitionSubscribers;
	}

	public String getCompetitionPeretration() {
		return this.competitionPeretration;
	}

	public void setCompetitionPeretration(String competitionPeretration) {
		this.competitionPeretration = competitionPeretration;
	}

	public String getCompetitionPolicy() {
		return this.competitionPolicy;
	}

	public void setCompetitionPolicy(String competitionPolicy) {
		this.competitionPolicy = competitionPolicy;
	}

	public String getCompetitionPublicity() {
		return this.competitionPublicity;
	}

	public void setCompetitionPublicity(String competitionPublicity) {
		this.competitionPublicity = competitionPublicity;
	}

	public String getCompetitionActivity() {
		return this.competitionActivity;
	}

	public void setCompetitionActivity(String competitionActivity) {
		this.competitionActivity = competitionActivity;
	}

	public String getCompetitionMarket() {
		return this.competitionMarket;
	}

	public void setCompetitionMarket(String competitionMarket) {
		this.competitionMarket = competitionMarket;
	}

	public String getCompetitonPropaganda() {
		return this.competitonPropaganda;
	}

	public void setCompetitonPropaganda(String competitonPropaganda) {
		this.competitonPropaganda = competitonPropaganda;
	}

	public String getCompetitionSell() {
		return this.competitionSell;
	}

	public void setCompetitionSell(String competitionSell) {
		this.competitionSell = competitionSell;
	}

	public String getCompeptitionMeasure() {
		return this.compeptitionMeasure;
	}

	public void setCompeptitionMeasure(String compeptitionMeasure) {
		this.compeptitionMeasure = compeptitionMeasure;
	}

	public String getCompeptitionStructure() {
		return this.compeptitionStructure;
	}

	public void setCompeptitionStructure(String compeptitionStructure) {
		this.compeptitionStructure = compeptitionStructure;
	}

}