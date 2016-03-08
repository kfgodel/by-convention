package ar.com.kfgodel.convention.api;

import ar.com.kfgodel.convention.impl.DefaultConvention;

import java.util.List;

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

  /**
   * @return The port for listening to incoming http connections
   */
  int getHttpPort();

  /**
   * @return The path inside the classpath that may allocate static web content to be served
   */
  String getWebFolderInClasspath();

  /**
   * @return The list of folders under source workspace that contain web content<br>
   *   This content is to be refreshed when modified under development
   */
  List<String> getWebFoldersInSources();

  /**
   * @return The root url that serves api resources in a web application.<br> This url hosts
   * all the application rest api
   */
  List<String> getRestApiRootUrl();

  /**
   * @return The name of the root package that contains types annotated as rest resources
   */
  List<String> getRestApiRootPackageName();

}
