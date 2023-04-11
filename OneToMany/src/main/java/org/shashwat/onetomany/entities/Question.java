package org.shashwat.onetomany.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Question {
	
	@Id
	private int qId;
	private String question;
	
	@OneToMany(mappedBy="question")
	private List<Answers> answers;
	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Question(int qId, String question, List<Answers> answers) {
		super();
		this.qId = qId;
		this.question = question;
		this.answers = answers;
	}
	public int getqId() {
		return qId;
	}
	public void setqId(int qId) {
		this.qId = qId;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public List<Answers> getAnswers() {
		return answers;
	}
	public void setAnswers(List<Answers> answers) {
		this.answers = answers;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.question;
	}
	
	
}
