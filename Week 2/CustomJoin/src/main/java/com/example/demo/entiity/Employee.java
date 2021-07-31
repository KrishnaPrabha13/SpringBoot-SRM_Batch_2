package com.example.demo.entiity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@ToString
public class Employee 
{
	@Id
	@GeneratedValue
	private int id;
	
	private String email;
	
	private String name;
	
	
	@OneToMany(targetEntity = EmpDetails.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "email_id" , referencedColumnName= "email")
	private List<EmpDetails> empDetails;
}
