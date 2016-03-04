package ar.com.kfgodel.convention.impl;

import ar.com.kfgodel.convention.api.Convention;

/**
 * Implementation with default values
 * Created by kfgodel on 04/03/16.
 */
public class DefaultConvention implements Convention {

  public static DefaultConvention create() {
    DefaultConvention defaultConvention = new DefaultConvention();
    return defaultConvention;
  }

  @Override
  public String getPersistentPackageName() {
    return "convention.persistent";
  }

}
