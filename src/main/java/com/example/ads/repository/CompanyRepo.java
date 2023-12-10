package com.example.ads.repository;

import com.example.ads.Entity.Company;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyRepo extends CrudRepository<Company,String>{
}
