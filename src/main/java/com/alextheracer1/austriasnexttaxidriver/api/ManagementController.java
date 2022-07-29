package com.alextheracer1.austriasnexttaxidriver.api;

import com.alextheracer1.austriasnexttaxidriver.api.db.TaxiRunDatabase;
import com.alextheracer1.austriasnexttaxidriver.api.entities.TaxiRun;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api")
@RestController
public class ManagementController {

  private final TaxiRunDatabase taxiRunDatabase;

  public ManagementController(TaxiRunDatabase taxiRunDatabase) {
    this.taxiRunDatabase = taxiRunDatabase;
  }

  @PostMapping("/addTaxiRun")
  public ResponseEntity<String> addTaxiRun(@RequestBody TaxiRun taxiRun) {

    if (taxiRunDatabase.existsByRunId(taxiRun.getRunId())) {
      return ResponseEntity.badRequest()
          .body("TaxiRun with runId " + taxiRun.getRunId() + " already exists");
    } else {
      taxiRunDatabase.save(taxiRun);
      return ResponseEntity.ok("TaxiRun with runId " + taxiRun.getRunId() + " added");
    }
  }

  @GetMapping("/getAllTaxiRuns")
  public List<TaxiRun> readTest() {
    return taxiRunDatabase.findAll();
  }
}
