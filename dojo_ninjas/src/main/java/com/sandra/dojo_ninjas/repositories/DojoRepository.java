package com.sandra.dojo_ninjas.repositories;

import org.springframework.data.repository.CrudRepository;

import com.sandra.dojo_ninjas.models.Dojo;


public interface DojoRepository extends CrudRepository<Dojo, Long>  {

}
