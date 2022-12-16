package com.demo.hotelaria.repository;

import com.demo.hotelaria.domain.Roles;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolesRepository extends CrudRepository<Roles, Long> {

}
