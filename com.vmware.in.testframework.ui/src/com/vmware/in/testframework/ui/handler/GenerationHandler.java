package com.vmware.in.testframework.ui.handler;

import java.io.File;
import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.xtext.builder.EclipseResourceFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.ui.resource.IResourceSetProvider;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.vmware.in.testframework.wrapper.ServerManager;
import com.vmware.in.vmware.constants.ApplicationInstances;

public class GenerationHandler extends AbstractHandler implements IHandler {

	@Inject
	private IGenerator generator;

	@Inject
	private Provider<EclipseResourceFileSystemAccess> fileAccessProvider;

	@Inject
	IResourceDescriptions resourceDescriptions;

	@Inject
	IResourceSetProvider resourceSetProvider;

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {

		ISelection selection = HandlerUtil.getCurrentSelection(event);


		if (selection instanceof IStructuredSelection) {
			IStructuredSelection structuredSelection = (IStructuredSelection) selection;
			List testcaseList = structuredSelection.toList();
			ServerManager server = new ServerManager();
			for (Object firstElement : testcaseList) {

				ApplicationInstances.setTestcasesCount(ApplicationInstances.getTestcasesCount()+1);
				if (firstElement instanceof IFile) {

					IFile file = (IFile) firstElement;

					String filepath = file.getLocation().toString();
					String filename = filepath.substring(filepath.lastIndexOf("/")+1); 
					filepath = filepath.substring(0,filepath.lastIndexOf("/")+1);

					File files = new File(filepath);
					File[] listOfFiles = files.listFiles();
					for (int j = 0; j < listOfFiles.length; j++) {
						if (listOfFiles[j].isFile() && listOfFiles[j].getName().contains(("proper"))) {
							ApplicationInstances.setPropertyFileName(listOfFiles[j].getName());
							
						}
					}

					ApplicationInstances.setTestcaseFilePath(filepath);
					ApplicationInstances.setTestcaseFileName(filename);
					
					if(ApplicationInstances.getTestcasesCount() == 1) {
						
						server.startServer();
						server.loadURL();
					}


					IProject project = file.getProject();


					final EclipseResourceFileSystemAccess fsa = fileAccessProvider.get();


					URI uri = URI.createPlatformResourceURI(file.getFullPath().toString(), true);
					ResourceSet rs = resourceSetProvider.get(project);
					Resource r = rs.getResource(uri, true);
					generator.doGenerate(r, fsa);

				}
			}
			server.destroyServer();
		}
		return null;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

}