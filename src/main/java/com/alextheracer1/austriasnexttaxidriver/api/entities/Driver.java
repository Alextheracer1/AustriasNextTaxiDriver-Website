package com.alextheracer1.austriasnexttaxidriver.api.entities;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Driver {

  private boolean isAIDriver;
  private String deathCause;
}
