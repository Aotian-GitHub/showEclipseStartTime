package com.aotian.practise.eclipse.plugin.countstarttime.handlers;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IStartup;

public class ShowTime implements IStartup{

	@Override
	public void earlyStartup() {
		Display.getDefault().syncExec(new Runnable() {
			
			@Override
			public void run() {
				long startTime = Long.parseLong(System.getProperty("eclipse.startTime"));
				long costTime = System.currentTimeMillis() - startTime;
				Shell shell = Display.getDefault().getActiveShell();
				String message = "Eclipse Æô¶¯ºÄÊ±£º" + costTime + "ms";
				MessageDialog.openInformation(shell, "Information", message);
			}
		});
	}

}
