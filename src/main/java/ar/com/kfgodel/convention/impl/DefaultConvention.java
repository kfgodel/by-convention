package ar.com.kfgodel.convention.impl;

import ar.com.kfgodel.convention.api.Convention;
import com.google.common.collect.Lists;

import java.util.List;

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

  @Override
  public int getHttpPort() {
    return 80;
  }

  @Override
  public String getWebFolderInClasspath() {
    return "/web";
  }

  @Override
  public List<String> getWebFoldersInSources() {
    return Lists.newArrayList("src/main/html/web","src/main/javascript/web");
  }

  @Override
  public String getRestApiRootUrl() {
    return "/api";
  }

  @Override
  public String getRestApiRootPackageName() {
    return "web.api.resources";
  }

}
