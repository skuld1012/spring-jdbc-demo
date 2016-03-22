package me.tedzhang.demo.spring.database.model;

public class Offer {

	private int Id;
	
	private String name;
	
	private String text;
	
	private String email;
	
	public Offer(){}

	public Offer(String name, String text, String email) {
		this.name = name;
		this.text = text;
		this.email = email;
	}
	
	public Offer(int id, String name, String text, String email) {
		Id = id;
		this.name = name;
		this.text = text;
		this.email = email;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "Offer [Id=" + Id + ", name=" + name + ", text=" + text + ", email=" + email + "]";
	}
}
