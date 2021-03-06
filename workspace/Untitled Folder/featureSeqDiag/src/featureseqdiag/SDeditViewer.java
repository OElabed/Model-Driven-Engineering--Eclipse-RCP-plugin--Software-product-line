/**
 * 
 */
package featureseqdiag;

import java.io.IOException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IPath;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

/**
 * @author O. EL ABED 
 * @author R. AHMAD
 *
 */
public class SDeditViewer implements IObjectActionDelegate {

	 private Shell shell;
     
     private ISelection selection;
     
     
	/**
	 * 
	 */
	public SDeditViewer() {
		super();
	}



	/* (non-Javadoc)
	 * @see org.eclipse.ui.IActionDelegate#run(org.eclipse.jface.action.IAction)
	 */
	@Override
	public void run(IAction action) {
		

		
		  IFile file = getFile();
          IPath osPath = file.getLocation();
          
          if(osPath.toFile().getAbsolutePath().contains(".sdel")){
        	//ouvrir  le sdedit.jar
        	  
              String[] args = {"java" ,"-jar","/media/EL_ABED/psar/workspace/Tools/sdedit-4.01.jar" };
                   try {
                	   Process p = Runtime.getRuntime().exec(args);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            

               
          
        	  
        	//  
        	  
        	  
          }else{
        	  
        	  MessageDialog.openInformation(
                      shell,
                      "FeatureSequenceDiagramme",
                      file.getName()+" is Not a SDedit File !!");
          }
          
		
	}





	/**
	 * @return
	 */
	private IFile getFile() {
		
		return (IFile)((IStructuredSelection) selection).getFirstElement();
		
	}



	/* (non-Javadoc)
	 * @see org.eclipse.ui.IActionDelegate#selectionChanged(org.eclipse.jface.action.IAction, org.eclipse.jface.viewers.ISelection)
	 */
	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		this.selection = selection;
		
	}





	/* (non-Javadoc)
	 * @see org.eclipse.ui.IObjectActionDelegate#setActivePart(org.eclipse.jface.action.IAction, org.eclipse.ui.IWorkbenchPart)
	 */
	@Override
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		 shell = targetPart.getSite().getShell();
		 
	}
	
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}


}
