package com.eason;

import org.springframework.data.repository.CrudRepository;

import com.eason.Store;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface StoreRepository extends CrudRepository<Store, Long> {

}