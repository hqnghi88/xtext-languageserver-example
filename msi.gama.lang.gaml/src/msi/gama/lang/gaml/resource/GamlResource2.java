/*******************************************************************************************************
 *
 * GamlResource.java, in msi.gama.lang.gaml, is part of the source code of the GAMA modeling and simulation platform
 * (v.1.9.2).
 *
 * (c) 2007-2023 UMI 209 UMMISCO IRD/SU & Partners (IRIT, MIAT, TLU, CTU)
 *
 * Visit https://github.com/gama-platform/gama for license information and contacts.
 *
 ********************************************************************************************************/
package msi.gama.lang.gaml.resource;

import static com.google.common.collect.Iterables.concat;
import static com.google.common.collect.Iterables.transform;
import static java.util.Collections.singleton;
import static msi.gama.common.interfaces.IGamlIssue.GENERAL;
import static msi.gama.common.interfaces.IGamlIssue.IMPORT_ERROR;
import static msi.gama.lang.gaml.indexer.GamlResourceIndexer.collectMultipleImportsOf;
import static msi.gama.lang.gaml.indexer.GamlResourceIndexer.getImportObject;
import static msi.gama.lang.gaml.indexer.GamlResourceIndexer.updateImports;
import static msi.gama.lang.gaml.resource.GamlResourceServices.properlyEncodedURI;
import static msi.gama.lang.gaml.resource.GamlResourceServices.updateState;
import static msi.gaml.compilation.GAML.getModelFactory;
import static org.eclipse.emf.ecore.util.EcoreUtil.resolveAll;
import static org.eclipse.xtext.diagnostics.Severity.ERROR;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.linking.lazy.LazyLinkingResource;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.util.OnChangeEvictingCache;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;
import org.eclipse.xtext.validation.EObjectDiagnosticImpl;

import com.google.common.base.Function;
import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.ListMultimap;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;

import msi.gama.lang.gaml.gaml.GamlPackage;
import msi.gama.lang.gaml.gaml.Model;
import msi.gama.lang.gaml.indexer.GamlResourceIndexer;
import msi.gama.runtime.IExecutionContext;
import msi.gaml.compilation.GAML;
import msi.gaml.compilation.GamlCompilationError;
import msi.gaml.compilation.ast.ISyntacticElement;
import msi.gaml.descriptions.ModelDescription;
import msi.gaml.descriptions.ValidationContext;

/**
 * The Class GamlResource.
 */
/*
 *
 * The class GamlResource.
 *
 * @author drogoul
 *
 * @since 24 avr. 2012
 */
public class GamlResource2 extends LazyLinkingResource {


}
