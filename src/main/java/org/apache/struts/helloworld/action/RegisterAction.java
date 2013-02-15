package org.apache.struts.helloworld.action;

import org.apache.struts.helloworld.model.Person;

import com.opensymphony.xwork2.ActionSupport;

public class RegisterAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

	private Person person;

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	@Override
	public String execute() throws Exception {
		if (person != null)
			System.out.println(person.getFirstName());
		return SUCCESS;

	}

	@Override
	public void validate() {
		if (person.getFirstName().length() == 0) {
			addFieldError("person.firstName", "First name is required.");
		}

		if (person.getEmail().length() == 0) {
			addFieldError("person.email", "Email is required.");
		}

		if (person.getAge() < 18) {
			addFieldError("person.age",
					"Age is required and must be 18 or older");
		}
	}
}