package com.alextheracer1.austriasnexttaxidriver.api.db;

import com.alextheracer1.austriasnexttaxidriver.api.entities.TaxiRun;
import java.util.List;
import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TaxiRunDatabase extends MongoRepository<TaxiRun, Integer> {

  Optional<TaxiRun> findByRunId(int runId);

  boolean existsByRunId(int runId);

  List<TaxiRun> findAll();
}
