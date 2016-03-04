package ar.com.kfgodel.convention;

import ar.com.dgarcia.javaspec.api.JavaSpec;
import ar.com.dgarcia.javaspec.api.JavaSpecRunner;
import ar.com.kfgodel.convention.api.Convention;
import com.google.common.collect.Lists;
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

      it("knows the default port for a http server app",()->{
        int port =context().convention().getHttpPort();
        assertThat(port).isEqualTo(80);
      });
      
      it("knows where on the classpath are the static web content located",()->{
          assertThat(context().convention().getWebFolderInClasspath()).isEqualTo("/web");
      });
      
      it("knwows where the web content is during development",()->{
        assertThat(context().convention().getWebFoldersInSources())
          .isEqualTo(Lists.newArrayList("src/main/html/web","src/main/javascript/web"));
      });

      it("knows where the rest api root url is",()->{
          assertThat(context().convention().getRestApiRootUrl()).isEqualTo("/api");
      });

      it("knows where the rest api resource types are",()->{
        assertThat(context().convention().getRestApiRootPackageName()).isEqualTo("convention.rest.api");
      });

    });
  }
}