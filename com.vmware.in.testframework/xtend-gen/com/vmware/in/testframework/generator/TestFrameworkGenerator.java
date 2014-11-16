/**
 * generated by Xtext
 */
package com.vmware.in.testframework.generator;

import com.vmware.in.testframework.testFramework.Greeting;
import com.vmware.in.testframework.testFramework.Model;
import com.vmware.in.testframework.wrapper.ModelReader;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;

/**
 * Generates code from your model files on save.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#TutorialCodeGeneration
 */
@SuppressWarnings("all")
public class TestFrameworkGenerator implements IGenerator {
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    ModelReader _modelReader = new ModelReader();
    ModelReader testcaseReader = _modelReader;
    EList<EObject> _contents = resource.getContents();
    EObject _get = _contents.get(0);
    EList<Greeting> _greetings = ((Model) _get).getGreetings();
    for (final Greeting data : _greetings) {
      testcaseReader.testcaseContents(data);
    }
  }
}
