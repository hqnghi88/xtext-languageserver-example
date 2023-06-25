/**
 * generated by Xtext 2.31.0
 */
package org.xtext.example.mydsl.myDsl.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.example.mydsl.myDsl.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MyDslFactoryImpl extends EFactoryImpl implements MyDslFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static MyDslFactory init()
  {
    try
    {
      MyDslFactory theMyDslFactory = (MyDslFactory)EPackage.Registry.INSTANCE.getEFactory(MyDslPackage.eNS_URI);
      if (theMyDslFactory != null)
      {
        return theMyDslFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new MyDslFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MyDslFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case MyDslPackage.ENTRY: return createEntry();
      case MyDslPackage.STANDALONE_BLOCK: return createStandaloneBlock();
      case MyDslPackage.STRING_EVALUATOR: return createStringEvaluator();
      case MyDslPackage.MODEL: return createModel();
      case MyDslPackage.BLOCK: return createBlock();
      case MyDslPackage.GREETING: return createGreeting();
      case MyDslPackage.IMPORT: return createImport();
      case MyDslPackage.PRAGMA: return createPragma();
      case MyDslPackage.EXPERIMENT_FILE_STRUCTURE: return createExperimentFileStructure();
      case MyDslPackage.HEADLESS_EXPERIMENT: return createHeadlessExperiment();
      case MyDslPackage.STATEMENT: return createStatement();
      case MyDslPackage.SGLOBAL: return createS_Global();
      case MyDslPackage.SSPECIES: return createS_Species();
      case MyDslPackage.SEXPERIMENT: return createS_Experiment();
      case MyDslPackage.SDO: return createS_Do();
      case MyDslPackage.SLOOP: return createS_Loop();
      case MyDslPackage.SIF: return createS_If();
      case MyDslPackage.STRY: return createS_Try();
      case MyDslPackage.SOTHER: return createS_Other();
      case MyDslPackage.SRETURN: return createS_Return();
      case MyDslPackage.SDECLARATION: return createS_Declaration();
      case MyDslPackage.SREFLEX: return createS_Reflex();
      case MyDslPackage.SDEFINITION: return createS_Definition();
      case MyDslPackage.SASSIGNMENT: return createS_Assignment();
      case MyDslPackage.SDIRECT_ASSIGNMENT: return createS_DirectAssignment();
      case MyDslPackage.SSET: return createS_Set();
      case MyDslPackage.SEQUATIONS: return createS_Equations();
      case MyDslPackage.SSOLVE: return createS_Solve();
      case MyDslPackage.SDISPLAY: return createS_Display();
      case MyDslPackage.SPECIES_OR_GRID_DISPLAY_STATEMENT: return createspeciesOrGridDisplayStatement();
      case MyDslPackage.IMAGE_DISPLAY_STATEMENT: return createimageDisplayStatement();
      case MyDslPackage.ACTION_ARGUMENTS: return createActionArguments();
      case MyDslPackage.ARGUMENT_DEFINITION: return createArgumentDefinition();
      case MyDslPackage.FACET: return createFacet();
      case MyDslPackage.EXPRESSION: return createExpression();
      case MyDslPackage.ARGUMENT_PAIR: return createArgumentPair();
      case MyDslPackage.EXPRESSION_LIST: return createExpressionList();
      case MyDslPackage.VARIABLE_REF: return createVariableRef();
      case MyDslPackage.TYPE_INFO: return createTypeInfo();
      case MyDslPackage.GAML_DEFINITION: return createGamlDefinition();
      case MyDslPackage.EQUATION_DEFINITION: return createEquationDefinition();
      case MyDslPackage.TYPE_DEFINITION: return createTypeDefinition();
      case MyDslPackage.VAR_DEFINITION: return createVarDefinition();
      case MyDslPackage.ACTION_DEFINITION: return createActionDefinition();
      case MyDslPackage.UNIT_FAKE_DEFINITION: return createUnitFakeDefinition();
      case MyDslPackage.TYPE_FAKE_DEFINITION: return createTypeFakeDefinition();
      case MyDslPackage.ACTION_FAKE_DEFINITION: return createActionFakeDefinition();
      case MyDslPackage.SKILL_FAKE_DEFINITION: return createSkillFakeDefinition();
      case MyDslPackage.VAR_FAKE_DEFINITION: return createVarFakeDefinition();
      case MyDslPackage.EQUATION_FAKE_DEFINITION: return createEquationFakeDefinition();
      case MyDslPackage.TERMINAL_EXPRESSION: return createTerminalExpression();
      case MyDslPackage.STRING_LITERAL: return createStringLiteral();
      case MyDslPackage.SACTION: return createS_Action();
      case MyDslPackage.SVAR: return createS_Var();
      case MyDslPackage.BINARY_OPERATOR: return createBinaryOperator();
      case MyDslPackage.IF: return createIf();
      case MyDslPackage.UNIT: return createUnit();
      case MyDslPackage.UNARY: return createUnary();
      case MyDslPackage.ACCESS: return createAccess();
      case MyDslPackage.ARRAY: return createArray();
      case MyDslPackage.POINT: return createPoint();
      case MyDslPackage.FUNCTION: return createFunction();
      case MyDslPackage.PARAMETER: return createParameter();
      case MyDslPackage.UNIT_NAME: return createUnitName();
      case MyDslPackage.TYPE_REF: return createTypeRef();
      case MyDslPackage.SKILL_REF: return createSkillRef();
      case MyDslPackage.ACTION_REF: return createActionRef();
      case MyDslPackage.EQUATION_REF: return createEquationRef();
      case MyDslPackage.INT_LITERAL: return createIntLiteral();
      case MyDslPackage.DOUBLE_LITERAL: return createDoubleLiteral();
      case MyDslPackage.BOOLEAN_LITERAL: return createBooleanLiteral();
      case MyDslPackage.RESERVED_LITERAL: return createReservedLiteral();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Entry createEntry()
  {
    EntryImpl entry = new EntryImpl();
    return entry;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public StandaloneBlock createStandaloneBlock()
  {
    StandaloneBlockImpl standaloneBlock = new StandaloneBlockImpl();
    return standaloneBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public StringEvaluator createStringEvaluator()
  {
    StringEvaluatorImpl stringEvaluator = new StringEvaluatorImpl();
    return stringEvaluator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Block createBlock()
  {
    BlockImpl block = new BlockImpl();
    return block;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Greeting createGreeting()
  {
    GreetingImpl greeting = new GreetingImpl();
    return greeting;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Import createImport()
  {
    ImportImpl import_ = new ImportImpl();
    return import_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Pragma createPragma()
  {
    PragmaImpl pragma = new PragmaImpl();
    return pragma;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ExperimentFileStructure createExperimentFileStructure()
  {
    ExperimentFileStructureImpl experimentFileStructure = new ExperimentFileStructureImpl();
    return experimentFileStructure;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public HeadlessExperiment createHeadlessExperiment()
  {
    HeadlessExperimentImpl headlessExperiment = new HeadlessExperimentImpl();
    return headlessExperiment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Statement createStatement()
  {
    StatementImpl statement = new StatementImpl();
    return statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public S_Global createS_Global()
  {
    S_GlobalImpl s_Global = new S_GlobalImpl();
    return s_Global;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public S_Species createS_Species()
  {
    S_SpeciesImpl s_Species = new S_SpeciesImpl();
    return s_Species;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public S_Experiment createS_Experiment()
  {
    S_ExperimentImpl s_Experiment = new S_ExperimentImpl();
    return s_Experiment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public S_Do createS_Do()
  {
    S_DoImpl s_Do = new S_DoImpl();
    return s_Do;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public S_Loop createS_Loop()
  {
    S_LoopImpl s_Loop = new S_LoopImpl();
    return s_Loop;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public S_If createS_If()
  {
    S_IfImpl s_If = new S_IfImpl();
    return s_If;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public S_Try createS_Try()
  {
    S_TryImpl s_Try = new S_TryImpl();
    return s_Try;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public S_Other createS_Other()
  {
    S_OtherImpl s_Other = new S_OtherImpl();
    return s_Other;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public S_Return createS_Return()
  {
    S_ReturnImpl s_Return = new S_ReturnImpl();
    return s_Return;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public S_Declaration createS_Declaration()
  {
    S_DeclarationImpl s_Declaration = new S_DeclarationImpl();
    return s_Declaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public S_Reflex createS_Reflex()
  {
    S_ReflexImpl s_Reflex = new S_ReflexImpl();
    return s_Reflex;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public S_Definition createS_Definition()
  {
    S_DefinitionImpl s_Definition = new S_DefinitionImpl();
    return s_Definition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public S_Assignment createS_Assignment()
  {
    S_AssignmentImpl s_Assignment = new S_AssignmentImpl();
    return s_Assignment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public S_DirectAssignment createS_DirectAssignment()
  {
    S_DirectAssignmentImpl s_DirectAssignment = new S_DirectAssignmentImpl();
    return s_DirectAssignment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public S_Set createS_Set()
  {
    S_SetImpl s_Set = new S_SetImpl();
    return s_Set;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public S_Equations createS_Equations()
  {
    S_EquationsImpl s_Equations = new S_EquationsImpl();
    return s_Equations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public S_Solve createS_Solve()
  {
    S_SolveImpl s_Solve = new S_SolveImpl();
    return s_Solve;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public S_Display createS_Display()
  {
    S_DisplayImpl s_Display = new S_DisplayImpl();
    return s_Display;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public speciesOrGridDisplayStatement createspeciesOrGridDisplayStatement()
  {
    speciesOrGridDisplayStatementImpl speciesOrGridDisplayStatement = new speciesOrGridDisplayStatementImpl();
    return speciesOrGridDisplayStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public imageDisplayStatement createimageDisplayStatement()
  {
    imageDisplayStatementImpl imageDisplayStatement = new imageDisplayStatementImpl();
    return imageDisplayStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ActionArguments createActionArguments()
  {
    ActionArgumentsImpl actionArguments = new ActionArgumentsImpl();
    return actionArguments;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ArgumentDefinition createArgumentDefinition()
  {
    ArgumentDefinitionImpl argumentDefinition = new ArgumentDefinitionImpl();
    return argumentDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Facet createFacet()
  {
    FacetImpl facet = new FacetImpl();
    return facet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ArgumentPair createArgumentPair()
  {
    ArgumentPairImpl argumentPair = new ArgumentPairImpl();
    return argumentPair;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ExpressionList createExpressionList()
  {
    ExpressionListImpl expressionList = new ExpressionListImpl();
    return expressionList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public VariableRef createVariableRef()
  {
    VariableRefImpl variableRef = new VariableRefImpl();
    return variableRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TypeInfo createTypeInfo()
  {
    TypeInfoImpl typeInfo = new TypeInfoImpl();
    return typeInfo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public GamlDefinition createGamlDefinition()
  {
    GamlDefinitionImpl gamlDefinition = new GamlDefinitionImpl();
    return gamlDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EquationDefinition createEquationDefinition()
  {
    EquationDefinitionImpl equationDefinition = new EquationDefinitionImpl();
    return equationDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TypeDefinition createTypeDefinition()
  {
    TypeDefinitionImpl typeDefinition = new TypeDefinitionImpl();
    return typeDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public VarDefinition createVarDefinition()
  {
    VarDefinitionImpl varDefinition = new VarDefinitionImpl();
    return varDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ActionDefinition createActionDefinition()
  {
    ActionDefinitionImpl actionDefinition = new ActionDefinitionImpl();
    return actionDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public UnitFakeDefinition createUnitFakeDefinition()
  {
    UnitFakeDefinitionImpl unitFakeDefinition = new UnitFakeDefinitionImpl();
    return unitFakeDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TypeFakeDefinition createTypeFakeDefinition()
  {
    TypeFakeDefinitionImpl typeFakeDefinition = new TypeFakeDefinitionImpl();
    return typeFakeDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ActionFakeDefinition createActionFakeDefinition()
  {
    ActionFakeDefinitionImpl actionFakeDefinition = new ActionFakeDefinitionImpl();
    return actionFakeDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SkillFakeDefinition createSkillFakeDefinition()
  {
    SkillFakeDefinitionImpl skillFakeDefinition = new SkillFakeDefinitionImpl();
    return skillFakeDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public VarFakeDefinition createVarFakeDefinition()
  {
    VarFakeDefinitionImpl varFakeDefinition = new VarFakeDefinitionImpl();
    return varFakeDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EquationFakeDefinition createEquationFakeDefinition()
  {
    EquationFakeDefinitionImpl equationFakeDefinition = new EquationFakeDefinitionImpl();
    return equationFakeDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TerminalExpression createTerminalExpression()
  {
    TerminalExpressionImpl terminalExpression = new TerminalExpressionImpl();
    return terminalExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public StringLiteral createStringLiteral()
  {
    StringLiteralImpl stringLiteral = new StringLiteralImpl();
    return stringLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public S_Action createS_Action()
  {
    S_ActionImpl s_Action = new S_ActionImpl();
    return s_Action;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public S_Var createS_Var()
  {
    S_VarImpl s_Var = new S_VarImpl();
    return s_Var;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public BinaryOperator createBinaryOperator()
  {
    BinaryOperatorImpl binaryOperator = new BinaryOperatorImpl();
    return binaryOperator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public If createIf()
  {
    IfImpl if_ = new IfImpl();
    return if_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Unit createUnit()
  {
    UnitImpl unit = new UnitImpl();
    return unit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Unary createUnary()
  {
    UnaryImpl unary = new UnaryImpl();
    return unary;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Access createAccess()
  {
    AccessImpl access = new AccessImpl();
    return access;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Array createArray()
  {
    ArrayImpl array = new ArrayImpl();
    return array;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Point createPoint()
  {
    PointImpl point = new PointImpl();
    return point;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Function createFunction()
  {
    FunctionImpl function = new FunctionImpl();
    return function;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Parameter createParameter()
  {
    ParameterImpl parameter = new ParameterImpl();
    return parameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public UnitName createUnitName()
  {
    UnitNameImpl unitName = new UnitNameImpl();
    return unitName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TypeRef createTypeRef()
  {
    TypeRefImpl typeRef = new TypeRefImpl();
    return typeRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SkillRef createSkillRef()
  {
    SkillRefImpl skillRef = new SkillRefImpl();
    return skillRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ActionRef createActionRef()
  {
    ActionRefImpl actionRef = new ActionRefImpl();
    return actionRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EquationRef createEquationRef()
  {
    EquationRefImpl equationRef = new EquationRefImpl();
    return equationRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public IntLiteral createIntLiteral()
  {
    IntLiteralImpl intLiteral = new IntLiteralImpl();
    return intLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DoubleLiteral createDoubleLiteral()
  {
    DoubleLiteralImpl doubleLiteral = new DoubleLiteralImpl();
    return doubleLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public BooleanLiteral createBooleanLiteral()
  {
    BooleanLiteralImpl booleanLiteral = new BooleanLiteralImpl();
    return booleanLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ReservedLiteral createReservedLiteral()
  {
    ReservedLiteralImpl reservedLiteral = new ReservedLiteralImpl();
    return reservedLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MyDslPackage getMyDslPackage()
  {
    return (MyDslPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static MyDslPackage getPackage()
  {
    return MyDslPackage.eINSTANCE;
  }

} //MyDslFactoryImpl
