package com.restapi.customer.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;


import com.restapi.customer.entity.UserInfo;


public interface UserInfoRepository extends JpaRepository<UserInfo,Integer> {

    Optional<UserInfo> findByEmail(String email);


}
