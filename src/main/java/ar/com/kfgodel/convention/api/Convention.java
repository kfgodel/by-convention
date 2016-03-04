package ar.com.kfgodel.convention.api;

import ar.com.kfgodel.convention.impl.DefaultConvention;

/**
 * This type represents the knwoledge about defaults by convention for other code to use
 * and depend on
 * Created by kfgodel on 04/03/16.
 */
public interface Convention {

  /**
   * @return An instance to ask for default values
   */
  static Convention create(){
    return DefaultConvention.create();
  }

  /**
   * @return The name of the package that acts as root for persistent types.<br>
   *   Classes under this package or subpackages are automatically registered as persistent types
   *   with the persistence layer (if noother package is specified)
   */
  String getPersistentPackageName();
}
