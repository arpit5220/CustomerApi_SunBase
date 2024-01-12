package com.restapi.customer.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="cust")
@NoArgsConstructor  
@Getter
@Setter
public class Customer {
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    
	    @NotEmpty
	    @Size(min=1,message="firstName is missing")
	    private String firstName;
	    
	    @NotEmpty
	    @Size(min=1,message="LastName is missing")
	    private String lastName;
	    private String street;
	    private String address;
	    private String city;
	    private String state;
	    private String email;
	    private String phone;
	
	
	
	
	
	

}