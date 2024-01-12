package com.restapi.customer.entity;

import lombok.Data;

@Data
public class JwtAuthResponse {

	private String token;
    private String tokenUser;
}
