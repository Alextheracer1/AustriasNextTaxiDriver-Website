package com.alextheracer1.austriasnexttaxidriver.api.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@Document(collection = "TaxiRun")
public class TaxiRun {

  @Id private int runId;

  private Driver driver;

  private String videoURL;

  private char direction;
  private String reasonForElimination;
  private String reasonForEliminationDetails;
  private boolean madeItAcross;
  private boolean madeItBack;
  private boolean madeItInBothDirections;
  private String weatherCondition;
  private String timeOfDay;
}
