package com.datagardens.nq.sdb.server;

import org.eclipse.jface.action.IMenuManager;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.application.ActionBarAdvisor;
import org.eclipse.ui.application.IActionBarConfigurer;

import com.datagardens.nq.sdb.commons.NQCommons;

public class ServerActionBarAdvisor extends ActionBarAdvisor {

    public ServerActionBarAdvisor(IActionBarConfigurer configurer) {
        super(configurer);
    }

    protected void makeActions(IWorkbenchWindow window)
    {
    	System.out.println("Commons from server== " + new NQCommons());
    }

    protected void fillMenuBar(IMenuManager menuBar) {
    }
    
}
