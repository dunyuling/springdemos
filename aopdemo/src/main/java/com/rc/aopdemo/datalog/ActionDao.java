package com.rc.aopdemo.datalog;

import com.rc.aopdemo.domain.Action;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ActionDao extends MongoRepository<Action,String> {
}
