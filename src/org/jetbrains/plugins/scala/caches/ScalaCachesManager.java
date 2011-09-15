package org.jetbrains.plugins.scala.caches;

import com.intellij.openapi.components.ProjectComponent;
import com.intellij.openapi.project.Project;
import org.jetbrains.annotations.NotNull;

/**
 * @author ilyas
 */
public class ScalaCachesManager implements ProjectComponent{

  private Project myProject;
  private ScalaShortNamesCache myCache;

  public static ScalaCachesManager getInstance(Project project) {
    return project.getComponent(ScalaCachesManager.class);
  }

  public ScalaCachesManager(Project project) {
    myProject = project;
  }

  public void projectOpened() {

  }

  public void projectClosed() {

  }

  @NotNull
  public String getComponentName() {
    return "Scala caches manager";
  }

  public void initComponent() {
    myCache = new ScalaShortNamesCache(myProject);
  }

  public void disposeComponent() {

  }

  public ScalaShortNamesCache getNamesCache() {
    return myCache;
  }
}
