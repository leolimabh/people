package application.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
public @Data @Builder @NoArgsConstructor @AllArgsConstructor class Person {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String name;

	private String street;

	private int number;

	private String neighborhood;

	private String city;

	private String state;

	private String cellphone;

	private String phone;

}
