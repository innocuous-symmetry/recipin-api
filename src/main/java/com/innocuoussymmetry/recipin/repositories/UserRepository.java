package com.innocuoussymmetry.recipin.repositories;

import com.innocuoussymmetry.recipin.models.*;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.RequestBody;

public interface UserRepository extends CrudRepository<User, Integer> { }
