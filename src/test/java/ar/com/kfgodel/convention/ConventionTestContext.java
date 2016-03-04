package ar.com.kfgodel.convention;

import ar.com.dgarcia.javaspec.api.TestContext;
import ar.com.kfgodel.convention.api.Convention;

import java.util.function.Supplier;

/**
 * Created by kfgodel on 04/03/16.
 */
public interface ConventionTestContext extends TestContext {
  Convention convention();
  void convention(Supplier<Convention> definition);

}
