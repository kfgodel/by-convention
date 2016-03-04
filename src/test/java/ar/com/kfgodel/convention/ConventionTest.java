package ar.com.kfgodel.convention;

import ar.com.dgarcia.javaspec.api.JavaSpec;
import ar.com.dgarcia.javaspec.api.JavaSpecRunner;
import ar.com.kfgodel.convention.api.Convention;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * This type tests the convention defautls
 *
 * Created by kfgodel on 04/03/16.
 */
@RunWith(JavaSpecRunner.class)
public class ConventionTest extends JavaSpec<ConventionTestContext> {
  @Override
  public void define() {
    describe("a convention", () -> {
      context().convention(Convention::create);
      
      it("knows the default package name for persistent classes",()->{
        String packageName = context().convention().getPersistentPackageName();
        assertThat(packageName).isEqualTo("convention.persistent");
      });   
    });
  }
}