package com.jobiak.imd.repository;
import com.jobiak.imd.model.Customer;
import org.springframework.data.jpa.repository.support.JpaRepositoryFactory;
import org.springframework.stereotype.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface CustomerRepo extends JpaRepository<Customer,Long>{

}
