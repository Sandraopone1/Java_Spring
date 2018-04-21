package com.sandra.dojo_ninjas.repositories;

import org.springframework.data.repository.CrudRepository;

import com.sandra.dojo_ninjas.models.Ninja;



public interface NinjaRepository  extends CrudRepository<Ninja, Long>  {

}
