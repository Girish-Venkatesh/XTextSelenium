package com.vmware.in.testframework.ui.contentassist;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.vmware.in.testframework.jsonstrucure.FieldAttributes;
import com.vmware.in.testframework.util.UtilFactory;
import com.vmware.in.vmware.constants.Constants;

public class TestFrameworkProposalProvider extends AbstractTestFrameworkProposalProvider  {
	
	@Override
	public void completeLABEL_Labelvalue(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		
		
		Gson gson = new Gson();
		
		UtilFactory reader = new UtilFactory();
		
		try {
			String json = reader.readFile(Constants.JSON_FILE);
			Type type = new TypeToken<List<Map<String, FieldAttributes>>>(){}.getType();
			List<Map<String, FieldAttributes>> jsonList = gson.fromJson(json, type);
			
			for (Map<String, FieldAttributes> map : jsonList) {
				
				Set<String> keys = map.keySet();
				
				for (String key : keys) {
					acceptor.accept(createCompletionProposal(key, context));
					
				}
				
				
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
