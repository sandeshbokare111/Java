package com.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="QueTable1")
public class Question1 {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int q_id;
	private String question;
	private String opt1;
	private String opt2;
	private String opt3;
	private String correct_ans;
	public int getQ_id() {
		return q_id;
	}
	public void setQ_id(int q_id) {
		this.q_id = q_id;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getOpt1() {
		return opt1;
	}
	public void setOpt1(String opt1) {
		this.opt1 = opt1;
	}
	public String getOpt2() {
		return opt2;
	}
	public void setOpt2(String opt2) {
		this.opt2 = opt2;
	}
	public String getOpt3() {
		return opt3;
	}
	public void setOpt3(String opt3) {
		this.opt3 = opt3;
	}
	public String getCorrect_ans() {
		return correct_ans;
	}
	public void setCorrect_ans(String correct_ans) {
		this.correct_ans = correct_ans;
	}
	public Question1( int q_id) {
		super();
		this.q_id = q_id;
	}
	public Question1(int q_id, String question, String opt1, String opt2, String opt3, String correct_ans) {
		super();
		this.q_id = q_id;
		this.question = question;
		this.opt1 = opt1;
		this.opt2 = opt2;
		this.opt3 = opt3;
		this.correct_ans = correct_ans;
		
	}
	public Question1() {
		super();
	}
	@Override
	public String toString() {
		return "Question1 [q_id=" + q_id + ", question=" + question + ", opt1=" + opt1 + ", opt2=" + opt2 + ", opt3="
				+ opt3 + ", correct_ans=" + correct_ans + "]";
	}
	
}
