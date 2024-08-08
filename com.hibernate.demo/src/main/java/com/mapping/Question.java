package com.mapping;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Question {
	
	@Id
	private int questionId;
	private String qusetion ;
	
	@OneToOne
	private Answer answer ;

	public int getQuestionId() {
		return questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public String getQusetion() {
		return qusetion;
	}

	public void setQusetion(String qusetion) {
		this.qusetion = qusetion;
	}

	public Answer getAnswer() {
		return answer;
	}

	public void setAnswer(Answer answer) {
		this.answer = answer;
	}

	public Question(int questionId, String qusetion, Answer answer) {
		super();
		this.questionId = questionId;
		this.qusetion = qusetion;
		this.answer = answer;
	}

	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}

}
