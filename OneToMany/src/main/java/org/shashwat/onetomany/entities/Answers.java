package org.shashwat.onetomany.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Answers {
	
	@Id
	private  int aId;
	private String answers;
	
	@ManyToOne
	private Question question;
	public Answers() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Answers(int aId, String answers, Question question) {
		super();
		this.aId = aId;
		this.answers = answers;
		this.question = question;
	}
	public int getaId() {
		return aId;
	}
	public void setaId(int aId) {
		this.aId = aId;
	}
	public String getAnswers() {
		return answers;
	}
	public void setAnswers(String answers) {
		this.answers = answers;
	}
	public Question getQuestion() {
		return question;
	}
	public void setQuestion(Question question) {
		this.question = question;
	}
	
	
	
}
