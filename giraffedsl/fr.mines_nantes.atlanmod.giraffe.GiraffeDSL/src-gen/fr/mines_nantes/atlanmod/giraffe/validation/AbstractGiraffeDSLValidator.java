/*
 * generated by Xtext
 */
package fr.mines_nantes.atlanmod.giraffe.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;

public class AbstractGiraffeDSLValidator extends org.eclipse.xtext.validation.AbstractDeclarativeValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(fr.mines_nantes.atlanmod.giraffe.giraffeDSL.GiraffeDSLPackage.eINSTANCE);
		return result;
	}
}