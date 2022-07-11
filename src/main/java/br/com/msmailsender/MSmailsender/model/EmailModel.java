package br.com.msmailsender.MSmailsender.model;

import br.com.msmailsender.MSmailsender.enums.StatusEmail;

public class EmailModel {

	private String from = "testesimsen@gmail.com";
	private String to = "rogeriosimsen@outlook.com";

	private String fullName = null;
	private String email = null;
	private String message = null;

	private StatusEmail statusEmail;

	public StatusEmail getStatusEmail() {
		return statusEmail;
	}

	public void setStatusEmail(StatusEmail statusEmail) {
		this.statusEmail = statusEmail;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getFullname() {
		return fullName;
	}

	public void setFullname(String fullname) {
		this.fullName = fullname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
