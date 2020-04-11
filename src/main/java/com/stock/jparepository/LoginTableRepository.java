package com.stock.jparepository;

import org.springframework.data.repository.CrudRepository;

import com.stock.jpamodels.LoginModel;

public interface LoginTableRepository extends CrudRepository<LoginModel, String> {

}
