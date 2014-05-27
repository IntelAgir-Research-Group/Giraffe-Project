/**
 */
package fr.mines_nantes.atlanmod.dsl.giraffeDSL;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.GiraffeDSLFactory
 * @model kind="package"
 * @generated
 */
public interface GiraffeDSLPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "giraffeDSL";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.mines_nantes.fr/atlanmod/dsl/GiraffeDSL";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "giraffeDSL";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  GiraffeDSLPackage eINSTANCE = fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.GiraffeDSLPackageImpl.init();

  /**
   * The meta object id for the '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.DomainModelImpl <em>Domain Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.DomainModelImpl
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.GiraffeDSLPackageImpl#getDomainModel()
   * @generated
   */
  int DOMAIN_MODEL = 0;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_MODEL__ELEMENTS = 0;

  /**
   * The number of structural features of the '<em>Domain Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.TypeImpl <em>Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.TypeImpl
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.GiraffeDSLPackageImpl#getType()
   * @generated
   */
  int TYPE = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__NAME = 0;

  /**
   * The number of structural features of the '<em>Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.CreateImpl <em>Create</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.CreateImpl
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.GiraffeDSLPackageImpl#getCreate()
   * @generated
   */
  int CREATE = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE__NAME = TYPE__NAME;

  /**
   * The feature id for the '<em><b>VMachine</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE__VMACHINE = TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Init Machines</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE__INIT_MACHINES = TYPE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Init Increment</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE__INIT_INCREMENT = TYPE_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Create</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.InitMachinesFeatureImpl <em>Init Machines Feature</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.InitMachinesFeatureImpl
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.GiraffeDSLPackageImpl#getInitMachinesFeature()
   * @generated
   */
  int INIT_MACHINES_FEATURE = 3;

  /**
   * The feature id for the '<em><b>Many</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INIT_MACHINES_FEATURE__MANY = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INIT_MACHINES_FEATURE__NAME = 1;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INIT_MACHINES_FEATURE__TYPE = 2;

  /**
   * The number of structural features of the '<em>Init Machines Feature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INIT_MACHINES_FEATURE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.InitIncrementFeatureImpl <em>Init Increment Feature</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.InitIncrementFeatureImpl
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.GiraffeDSLPackageImpl#getInitIncrementFeature()
   * @generated
   */
  int INIT_INCREMENT_FEATURE = 4;

  /**
   * The feature id for the '<em><b>Many</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INIT_INCREMENT_FEATURE__MANY = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INIT_INCREMENT_FEATURE__NAME = 1;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INIT_INCREMENT_FEATURE__TYPE = 2;

  /**
   * The number of structural features of the '<em>Init Increment Feature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INIT_INCREMENT_FEATURE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.VirtualMachineFeatureImpl <em>Virtual Machine Feature</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.VirtualMachineFeatureImpl
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.GiraffeDSLPackageImpl#getVirtualMachineFeature()
   * @generated
   */
  int VIRTUAL_MACHINE_FEATURE = 5;

  /**
   * The feature id for the '<em><b>Many</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIRTUAL_MACHINE_FEATURE__MANY = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIRTUAL_MACHINE_FEATURE__NAME = 1;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIRTUAL_MACHINE_FEATURE__TYPE = 2;

  /**
   * The number of structural features of the '<em>Virtual Machine Feature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIRTUAL_MACHINE_FEATURE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.VirtualMachineImpl <em>Virtual Machine</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.VirtualMachineImpl
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.GiraffeDSLPackageImpl#getVirtualMachine()
   * @generated
   */
  int VIRTUAL_MACHINE = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIRTUAL_MACHINE__NAME = TYPE__NAME;

  /**
   * The feature id for the '<em><b>VM</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIRTUAL_MACHINE__VM = TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Cloud Provider</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIRTUAL_MACHINE__CLOUD_PROVIDER = TYPE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Virtual Machine</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIRTUAL_MACHINE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.VirtualMachineTypeFeatureImpl <em>Virtual Machine Type Feature</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.VirtualMachineTypeFeatureImpl
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.GiraffeDSLPackageImpl#getVirtualMachineTypeFeature()
   * @generated
   */
  int VIRTUAL_MACHINE_TYPE_FEATURE = 7;

  /**
   * The feature id for the '<em><b>Many</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIRTUAL_MACHINE_TYPE_FEATURE__MANY = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIRTUAL_MACHINE_TYPE_FEATURE__NAME = 1;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIRTUAL_MACHINE_TYPE_FEATURE__TYPE = 2;

  /**
   * The number of structural features of the '<em>Virtual Machine Type Feature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIRTUAL_MACHINE_TYPE_FEATURE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.CloudProviderTypeImpl <em>Cloud Provider Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.CloudProviderTypeImpl
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.GiraffeDSLPackageImpl#getCloudProviderType()
   * @generated
   */
  int CLOUD_PROVIDER_TYPE = 8;

  /**
   * The feature id for the '<em><b>Many</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLOUD_PROVIDER_TYPE__MANY = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLOUD_PROVIDER_TYPE__NAME = 1;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLOUD_PROVIDER_TYPE__TYPE = 2;

  /**
   * The number of structural features of the '<em>Cloud Provider Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLOUD_PROVIDER_TYPE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.CloudProviderImpl <em>Cloud Provider</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.CloudProviderImpl
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.GiraffeDSLPackageImpl#getCloudProvider()
   * @generated
   */
  int CLOUD_PROVIDER = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLOUD_PROVIDER__NAME = TYPE__NAME;

  /**
   * The feature id for the '<em><b>Cloud Type</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLOUD_PROVIDER__CLOUD_TYPE = TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Cloud Address</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLOUD_PROVIDER__CLOUD_ADDRESS = TYPE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Cloud Credential</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLOUD_PROVIDER__CLOUD_CREDENTIAL = TYPE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Cloud Optional Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLOUD_PROVIDER__CLOUD_OPTIONAL_TYPES = TYPE_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Cloud Provider</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLOUD_PROVIDER_FEATURE_COUNT = TYPE_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.CloudOptionalTypesImpl <em>Cloud Optional Types</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.CloudOptionalTypesImpl
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.GiraffeDSLPackageImpl#getCloudOptionalTypes()
   * @generated
   */
  int CLOUD_OPTIONAL_TYPES = 10;

  /**
   * The feature id for the '<em><b>Many</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLOUD_OPTIONAL_TYPES__MANY = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLOUD_OPTIONAL_TYPES__NAME = 1;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLOUD_OPTIONAL_TYPES__TYPE = 2;

  /**
   * The number of structural features of the '<em>Cloud Optional Types</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLOUD_OPTIONAL_TYPES_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.CloudTypeImpl <em>Cloud Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.CloudTypeImpl
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.GiraffeDSLPackageImpl#getCloudType()
   * @generated
   */
  int CLOUD_TYPE = 11;

  /**
   * The feature id for the '<em><b>Many</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLOUD_TYPE__MANY = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLOUD_TYPE__NAME = 1;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLOUD_TYPE__TYPE = 2;

  /**
   * The number of structural features of the '<em>Cloud Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLOUD_TYPE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.ScriptTypeImpl <em>Script Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.ScriptTypeImpl
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.GiraffeDSLPackageImpl#getScriptType()
   * @generated
   */
  int SCRIPT_TYPE = 12;

  /**
   * The feature id for the '<em><b>Many</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCRIPT_TYPE__MANY = CLOUD_OPTIONAL_TYPES__MANY;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCRIPT_TYPE__NAME = CLOUD_OPTIONAL_TYPES__NAME;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCRIPT_TYPE__TYPE = CLOUD_OPTIONAL_TYPES__TYPE;

  /**
   * The number of structural features of the '<em>Script Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCRIPT_TYPE_FEATURE_COUNT = CLOUD_OPTIONAL_TYPES_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.GeoZoneTypeImpl <em>Geo Zone Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.GeoZoneTypeImpl
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.GiraffeDSLPackageImpl#getGeoZoneType()
   * @generated
   */
  int GEO_ZONE_TYPE = 13;

  /**
   * The feature id for the '<em><b>Many</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GEO_ZONE_TYPE__MANY = CLOUD_OPTIONAL_TYPES__MANY;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GEO_ZONE_TYPE__NAME = CLOUD_OPTIONAL_TYPES__NAME;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GEO_ZONE_TYPE__TYPE = CLOUD_OPTIONAL_TYPES__TYPE;

  /**
   * The number of structural features of the '<em>Geo Zone Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GEO_ZONE_TYPE_FEATURE_COUNT = CLOUD_OPTIONAL_TYPES_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.MgmAddressTypeImpl <em>Mgm Address Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.MgmAddressTypeImpl
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.GiraffeDSLPackageImpl#getMgmAddressType()
   * @generated
   */
  int MGM_ADDRESS_TYPE = 14;

  /**
   * The feature id for the '<em><b>Many</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MGM_ADDRESS_TYPE__MANY = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MGM_ADDRESS_TYPE__NAME = 1;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MGM_ADDRESS_TYPE__TYPE = 2;

  /**
   * The number of structural features of the '<em>Mgm Address Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MGM_ADDRESS_TYPE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.CloudCredentialTypeImpl <em>Cloud Credential Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.CloudCredentialTypeImpl
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.GiraffeDSLPackageImpl#getCloudCredentialType()
   * @generated
   */
  int CLOUD_CREDENTIAL_TYPE = 15;

  /**
   * The feature id for the '<em><b>Many</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLOUD_CREDENTIAL_TYPE__MANY = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLOUD_CREDENTIAL_TYPE__NAME = 1;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLOUD_CREDENTIAL_TYPE__TYPE = 2;

  /**
   * The number of structural features of the '<em>Cloud Credential Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLOUD_CREDENTIAL_TYPE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.CloudUserTypeImpl <em>Cloud User Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.CloudUserTypeImpl
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.GiraffeDSLPackageImpl#getCloudUserType()
   * @generated
   */
  int CLOUD_USER_TYPE = 16;

  /**
   * The feature id for the '<em><b>Many</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLOUD_USER_TYPE__MANY = CLOUD_OPTIONAL_TYPES__MANY;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLOUD_USER_TYPE__NAME = CLOUD_OPTIONAL_TYPES__NAME;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLOUD_USER_TYPE__TYPE = CLOUD_OPTIONAL_TYPES__TYPE;

  /**
   * The number of structural features of the '<em>Cloud User Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLOUD_USER_TYPE_FEATURE_COUNT = CLOUD_OPTIONAL_TYPES_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.CloudPasswordTypeImpl <em>Cloud Password Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.CloudPasswordTypeImpl
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.GiraffeDSLPackageImpl#getCloudPasswordType()
   * @generated
   */
  int CLOUD_PASSWORD_TYPE = 17;

  /**
   * The feature id for the '<em><b>Many</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLOUD_PASSWORD_TYPE__MANY = CLOUD_OPTIONAL_TYPES__MANY;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLOUD_PASSWORD_TYPE__NAME = CLOUD_OPTIONAL_TYPES__NAME;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLOUD_PASSWORD_TYPE__TYPE = CLOUD_OPTIONAL_TYPES__TYPE;

  /**
   * The number of structural features of the '<em>Cloud Password Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLOUD_PASSWORD_TYPE_FEATURE_COUNT = CLOUD_OPTIONAL_TYPES_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.DeployImpl <em>Deploy</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.DeployImpl
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.GiraffeDSLPackageImpl#getDeploy()
   * @generated
   */
  int DEPLOY = 18;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPLOY__NAME = TYPE__NAME;

  /**
   * The feature id for the '<em><b>Deploy One</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPLOY__DEPLOY_ONE = TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Deploy Two</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPLOY__DEPLOY_TWO = TYPE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Deploy</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPLOY_FEATURE_COUNT = TYPE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.DeployAppFeatureImpl <em>Deploy App Feature</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.DeployAppFeatureImpl
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.GiraffeDSLPackageImpl#getDeployAppFeature()
   * @generated
   */
  int DEPLOY_APP_FEATURE = 19;

  /**
   * The feature id for the '<em><b>Many</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPLOY_APP_FEATURE__MANY = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPLOY_APP_FEATURE__NAME = 1;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPLOY_APP_FEATURE__TYPE = 2;

  /**
   * The number of structural features of the '<em>Deploy App Feature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPLOY_APP_FEATURE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.DeployTypeFeatureImpl <em>Deploy Type Feature</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.DeployTypeFeatureImpl
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.GiraffeDSLPackageImpl#getDeployTypeFeature()
   * @generated
   */
  int DEPLOY_TYPE_FEATURE = 20;

  /**
   * The feature id for the '<em><b>Many</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPLOY_TYPE_FEATURE__MANY = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPLOY_TYPE_FEATURE__NAME = 1;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPLOY_TYPE_FEATURE__TYPE = 2;

  /**
   * The number of structural features of the '<em>Deploy Type Feature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPLOY_TYPE_FEATURE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.DeployTypeImpl <em>Deploy Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.DeployTypeImpl
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.GiraffeDSLPackageImpl#getDeployType()
   * @generated
   */
  int DEPLOY_TYPE = 21;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPLOY_TYPE__NAME = TYPE__NAME;

  /**
   * The feature id for the '<em><b>Range</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPLOY_TYPE__RANGE = TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Deploy Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPLOY_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.DeployRangeTypeImpl <em>Deploy Range Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.DeployRangeTypeImpl
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.GiraffeDSLPackageImpl#getDeployRangeType()
   * @generated
   */
  int DEPLOY_RANGE_TYPE = 22;

  /**
   * The feature id for the '<em><b>Many</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPLOY_RANGE_TYPE__MANY = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPLOY_RANGE_TYPE__NAME = 1;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPLOY_RANGE_TYPE__TYPE = 2;

  /**
   * The number of structural features of the '<em>Deploy Range Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPLOY_RANGE_TYPE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.DeployAppImpl <em>Deploy App</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.DeployAppImpl
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.GiraffeDSLPackageImpl#getDeployApp()
   * @generated
   */
  int DEPLOY_APP = 23;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPLOY_APP__NAME = TYPE__NAME;

  /**
   * The feature id for the '<em><b>Class</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPLOY_APP__CLASS = TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Deploy Master Method</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPLOY_APP__DEPLOY_MASTER_METHOD = TYPE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Deploy Slave Method</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPLOY_APP__DEPLOY_SLAVE_METHOD = TYPE_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Deploy App</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPLOY_APP_FEATURE_COUNT = TYPE_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.DeployAppClassTypeImpl <em>Deploy App Class Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.DeployAppClassTypeImpl
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.GiraffeDSLPackageImpl#getDeployAppClassType()
   * @generated
   */
  int DEPLOY_APP_CLASS_TYPE = 24;

  /**
   * The feature id for the '<em><b>Many</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPLOY_APP_CLASS_TYPE__MANY = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPLOY_APP_CLASS_TYPE__NAME = 1;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPLOY_APP_CLASS_TYPE__TYPE = 2;

  /**
   * The number of structural features of the '<em>Deploy App Class Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPLOY_APP_CLASS_TYPE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.DeployAppMasterMethodTypeImpl <em>Deploy App Master Method Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.DeployAppMasterMethodTypeImpl
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.GiraffeDSLPackageImpl#getDeployAppMasterMethodType()
   * @generated
   */
  int DEPLOY_APP_MASTER_METHOD_TYPE = 25;

  /**
   * The feature id for the '<em><b>Many</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPLOY_APP_MASTER_METHOD_TYPE__MANY = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPLOY_APP_MASTER_METHOD_TYPE__NAME = 1;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPLOY_APP_MASTER_METHOD_TYPE__TYPE = 2;

  /**
   * The number of structural features of the '<em>Deploy App Master Method Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPLOY_APP_MASTER_METHOD_TYPE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.DeployAppSlaveMethodTypeImpl <em>Deploy App Slave Method Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.DeployAppSlaveMethodTypeImpl
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.GiraffeDSLPackageImpl#getDeployAppSlaveMethodType()
   * @generated
   */
  int DEPLOY_APP_SLAVE_METHOD_TYPE = 26;

  /**
   * The feature id for the '<em><b>Many</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPLOY_APP_SLAVE_METHOD_TYPE__MANY = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPLOY_APP_SLAVE_METHOD_TYPE__NAME = 1;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPLOY_APP_SLAVE_METHOD_TYPE__TYPE = 2;

  /**
   * The number of structural features of the '<em>Deploy App Slave Method Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPLOY_APP_SLAVE_METHOD_TYPE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.MonitorImpl <em>Monitor</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.MonitorImpl
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.GiraffeDSLPackageImpl#getMonitor()
   * @generated
   */
  int MONITOR = 27;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONITOR__NAME = TYPE__NAME;

  /**
   * The feature id for the '<em><b>Range</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONITOR__RANGE = TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Monitoring Type</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONITOR__MONITORING_TYPE = TYPE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Monitor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONITOR_FEATURE_COUNT = TYPE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.MonitorRangeTypeImpl <em>Monitor Range Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.MonitorRangeTypeImpl
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.GiraffeDSLPackageImpl#getMonitorRangeType()
   * @generated
   */
  int MONITOR_RANGE_TYPE = 28;

  /**
   * The feature id for the '<em><b>Many</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONITOR_RANGE_TYPE__MANY = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONITOR_RANGE_TYPE__NAME = 1;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONITOR_RANGE_TYPE__TYPE = 2;

  /**
   * The number of structural features of the '<em>Monitor Range Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONITOR_RANGE_TYPE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.MonitoringTypeImpl <em>Monitoring Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.MonitoringTypeImpl
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.GiraffeDSLPackageImpl#getMonitoringType()
   * @generated
   */
  int MONITORING_TYPE = 29;

  /**
   * The feature id for the '<em><b>Many</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONITORING_TYPE__MANY = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONITORING_TYPE__NAME = 1;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONITORING_TYPE__TYPE = 2;

  /**
   * The number of structural features of the '<em>Monitoring Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONITORING_TYPE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.StressImpl <em>Stress</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.StressImpl
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.GiraffeDSLPackageImpl#getStress()
   * @generated
   */
  int STRESS = 30;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRESS__NAME = TYPE__NAME;

  /**
   * The feature id for the '<em><b>Range</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRESS__RANGE = TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Stress Class</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRESS__STRESS_CLASS = TYPE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Stress Method</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRESS__STRESS_METHOD = TYPE_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Stress</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRESS_FEATURE_COUNT = TYPE_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.StressRangeTypeImpl <em>Stress Range Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.StressRangeTypeImpl
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.GiraffeDSLPackageImpl#getStressRangeType()
   * @generated
   */
  int STRESS_RANGE_TYPE = 31;

  /**
   * The feature id for the '<em><b>Many</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRESS_RANGE_TYPE__MANY = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRESS_RANGE_TYPE__NAME = 1;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRESS_RANGE_TYPE__TYPE = 2;

  /**
   * The number of structural features of the '<em>Stress Range Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRESS_RANGE_TYPE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.StressClassTypeImpl <em>Stress Class Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.StressClassTypeImpl
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.GiraffeDSLPackageImpl#getStressClassType()
   * @generated
   */
  int STRESS_CLASS_TYPE = 32;

  /**
   * The feature id for the '<em><b>Many</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRESS_CLASS_TYPE__MANY = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRESS_CLASS_TYPE__NAME = 1;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRESS_CLASS_TYPE__TYPE = 2;

  /**
   * The number of structural features of the '<em>Stress Class Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRESS_CLASS_TYPE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.StressMethodTypeImpl <em>Stress Method Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.StressMethodTypeImpl
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.GiraffeDSLPackageImpl#getStressMethodType()
   * @generated
   */
  int STRESS_METHOD_TYPE = 33;

  /**
   * The feature id for the '<em><b>Many</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRESS_METHOD_TYPE__MANY = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRESS_METHOD_TYPE__NAME = 1;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRESS_METHOD_TYPE__TYPE = 2;

  /**
   * The number of structural features of the '<em>Stress Method Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRESS_METHOD_TYPE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.ActionImpl <em>Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.ActionImpl
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.GiraffeDSLPackageImpl#getAction()
   * @generated
   */
  int ACTION = 34;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION__NAME = TYPE__NAME;

  /**
   * The feature id for the '<em><b>Range</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION__RANGE = TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Class</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION__CLASS = TYPE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Method</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION__METHOD = TYPE_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_FEATURE_COUNT = TYPE_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.ActionRangeTypeImpl <em>Action Range Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.ActionRangeTypeImpl
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.GiraffeDSLPackageImpl#getActionRangeType()
   * @generated
   */
  int ACTION_RANGE_TYPE = 35;

  /**
   * The feature id for the '<em><b>Many</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_RANGE_TYPE__MANY = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_RANGE_TYPE__NAME = 1;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_RANGE_TYPE__TYPE = 2;

  /**
   * The number of structural features of the '<em>Action Range Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_RANGE_TYPE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.ActionClassTypeImpl <em>Action Class Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.ActionClassTypeImpl
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.GiraffeDSLPackageImpl#getActionClassType()
   * @generated
   */
  int ACTION_CLASS_TYPE = 36;

  /**
   * The feature id for the '<em><b>Many</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_CLASS_TYPE__MANY = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_CLASS_TYPE__NAME = 1;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_CLASS_TYPE__TYPE = 2;

  /**
   * The number of structural features of the '<em>Action Class Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_CLASS_TYPE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.ActionMethodTypeImpl <em>Action Method Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.ActionMethodTypeImpl
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.GiraffeDSLPackageImpl#getActionMethodType()
   * @generated
   */
  int ACTION_METHOD_TYPE = 37;

  /**
   * The feature id for the '<em><b>Many</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_METHOD_TYPE__MANY = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_METHOD_TYPE__NAME = 1;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_METHOD_TYPE__TYPE = 2;

  /**
   * The number of structural features of the '<em>Action Method Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_METHOD_TYPE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.FeaturesImpl <em>Features</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.FeaturesImpl
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.GiraffeDSLPackageImpl#getFeatures()
   * @generated
   */
  int FEATURES = 38;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURES__NAME = 0;

  /**
   * The number of structural features of the '<em>Features</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURES_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.IntFeatureImpl <em>Int Feature</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.IntFeatureImpl
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.GiraffeDSLPackageImpl#getIntFeature()
   * @generated
   */
  int INT_FEATURE = 39;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_FEATURE__NAME = 0;

  /**
   * The number of structural features of the '<em>Int Feature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_FEATURE_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.DomainModel <em>Domain Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Domain Model</em>'.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.DomainModel
   * @generated
   */
  EClass getDomainModel();

  /**
   * Returns the meta object for the containment reference list '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.DomainModel#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.DomainModel#getElements()
   * @see #getDomainModel()
   * @generated
   */
  EReference getDomainModel_Elements();

  /**
   * Returns the meta object for class '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type</em>'.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.Type
   * @generated
   */
  EClass getType();

  /**
   * Returns the meta object for the attribute '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.Type#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.Type#getName()
   * @see #getType()
   * @generated
   */
  EAttribute getType_Name();

  /**
   * Returns the meta object for class '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.Create <em>Create</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Create</em>'.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.Create
   * @generated
   */
  EClass getCreate();

  /**
   * Returns the meta object for the containment reference list '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.Create#getVMachine <em>VMachine</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>VMachine</em>'.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.Create#getVMachine()
   * @see #getCreate()
   * @generated
   */
  EReference getCreate_VMachine();

  /**
   * Returns the meta object for the containment reference list '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.Create#getInitMachines <em>Init Machines</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Init Machines</em>'.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.Create#getInitMachines()
   * @see #getCreate()
   * @generated
   */
  EReference getCreate_InitMachines();

  /**
   * Returns the meta object for the containment reference list '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.Create#getInitIncrement <em>Init Increment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Init Increment</em>'.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.Create#getInitIncrement()
   * @see #getCreate()
   * @generated
   */
  EReference getCreate_InitIncrement();

  /**
   * Returns the meta object for class '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.InitMachinesFeature <em>Init Machines Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Init Machines Feature</em>'.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.InitMachinesFeature
   * @generated
   */
  EClass getInitMachinesFeature();

  /**
   * Returns the meta object for the attribute '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.InitMachinesFeature#getMany <em>Many</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Many</em>'.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.InitMachinesFeature#getMany()
   * @see #getInitMachinesFeature()
   * @generated
   */
  EAttribute getInitMachinesFeature_Many();

  /**
   * Returns the meta object for the attribute '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.InitMachinesFeature#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.InitMachinesFeature#getName()
   * @see #getInitMachinesFeature()
   * @generated
   */
  EAttribute getInitMachinesFeature_Name();

  /**
   * Returns the meta object for the attribute '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.InitMachinesFeature#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.InitMachinesFeature#getType()
   * @see #getInitMachinesFeature()
   * @generated
   */
  EAttribute getInitMachinesFeature_Type();

  /**
   * Returns the meta object for class '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.InitIncrementFeature <em>Init Increment Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Init Increment Feature</em>'.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.InitIncrementFeature
   * @generated
   */
  EClass getInitIncrementFeature();

  /**
   * Returns the meta object for the attribute '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.InitIncrementFeature#getMany <em>Many</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Many</em>'.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.InitIncrementFeature#getMany()
   * @see #getInitIncrementFeature()
   * @generated
   */
  EAttribute getInitIncrementFeature_Many();

  /**
   * Returns the meta object for the attribute '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.InitIncrementFeature#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.InitIncrementFeature#getName()
   * @see #getInitIncrementFeature()
   * @generated
   */
  EAttribute getInitIncrementFeature_Name();

  /**
   * Returns the meta object for the attribute '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.InitIncrementFeature#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.InitIncrementFeature#getType()
   * @see #getInitIncrementFeature()
   * @generated
   */
  EAttribute getInitIncrementFeature_Type();

  /**
   * Returns the meta object for class '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.VirtualMachineFeature <em>Virtual Machine Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Virtual Machine Feature</em>'.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.VirtualMachineFeature
   * @generated
   */
  EClass getVirtualMachineFeature();

  /**
   * Returns the meta object for the attribute '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.VirtualMachineFeature#getMany <em>Many</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Many</em>'.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.VirtualMachineFeature#getMany()
   * @see #getVirtualMachineFeature()
   * @generated
   */
  EAttribute getVirtualMachineFeature_Many();

  /**
   * Returns the meta object for the attribute '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.VirtualMachineFeature#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.VirtualMachineFeature#getName()
   * @see #getVirtualMachineFeature()
   * @generated
   */
  EAttribute getVirtualMachineFeature_Name();

  /**
   * Returns the meta object for the reference '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.VirtualMachineFeature#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.VirtualMachineFeature#getType()
   * @see #getVirtualMachineFeature()
   * @generated
   */
  EReference getVirtualMachineFeature_Type();

  /**
   * Returns the meta object for class '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.VirtualMachine <em>Virtual Machine</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Virtual Machine</em>'.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.VirtualMachine
   * @generated
   */
  EClass getVirtualMachine();

  /**
   * Returns the meta object for the containment reference list '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.VirtualMachine#getVM <em>VM</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>VM</em>'.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.VirtualMachine#getVM()
   * @see #getVirtualMachine()
   * @generated
   */
  EReference getVirtualMachine_VM();

  /**
   * Returns the meta object for the containment reference list '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.VirtualMachine#getCloudProvider <em>Cloud Provider</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Cloud Provider</em>'.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.VirtualMachine#getCloudProvider()
   * @see #getVirtualMachine()
   * @generated
   */
  EReference getVirtualMachine_CloudProvider();

  /**
   * Returns the meta object for class '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.VirtualMachineTypeFeature <em>Virtual Machine Type Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Virtual Machine Type Feature</em>'.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.VirtualMachineTypeFeature
   * @generated
   */
  EClass getVirtualMachineTypeFeature();

  /**
   * Returns the meta object for the attribute '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.VirtualMachineTypeFeature#getMany <em>Many</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Many</em>'.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.VirtualMachineTypeFeature#getMany()
   * @see #getVirtualMachineTypeFeature()
   * @generated
   */
  EAttribute getVirtualMachineTypeFeature_Many();

  /**
   * Returns the meta object for the attribute '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.VirtualMachineTypeFeature#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.VirtualMachineTypeFeature#getName()
   * @see #getVirtualMachineTypeFeature()
   * @generated
   */
  EAttribute getVirtualMachineTypeFeature_Name();

  /**
   * Returns the meta object for the attribute '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.VirtualMachineTypeFeature#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.VirtualMachineTypeFeature#getType()
   * @see #getVirtualMachineTypeFeature()
   * @generated
   */
  EAttribute getVirtualMachineTypeFeature_Type();

  /**
   * Returns the meta object for class '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.CloudProviderType <em>Cloud Provider Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Cloud Provider Type</em>'.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.CloudProviderType
   * @generated
   */
  EClass getCloudProviderType();

  /**
   * Returns the meta object for the attribute '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.CloudProviderType#getMany <em>Many</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Many</em>'.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.CloudProviderType#getMany()
   * @see #getCloudProviderType()
   * @generated
   */
  EAttribute getCloudProviderType_Many();

  /**
   * Returns the meta object for the attribute '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.CloudProviderType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.CloudProviderType#getName()
   * @see #getCloudProviderType()
   * @generated
   */
  EAttribute getCloudProviderType_Name();

  /**
   * Returns the meta object for the reference '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.CloudProviderType#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.CloudProviderType#getType()
   * @see #getCloudProviderType()
   * @generated
   */
  EReference getCloudProviderType_Type();

  /**
   * Returns the meta object for class '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.CloudProvider <em>Cloud Provider</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Cloud Provider</em>'.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.CloudProvider
   * @generated
   */
  EClass getCloudProvider();

  /**
   * Returns the meta object for the containment reference list '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.CloudProvider#getCloudType <em>Cloud Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Cloud Type</em>'.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.CloudProvider#getCloudType()
   * @see #getCloudProvider()
   * @generated
   */
  EReference getCloudProvider_CloudType();

  /**
   * Returns the meta object for the containment reference list '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.CloudProvider#getCloudAddress <em>Cloud Address</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Cloud Address</em>'.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.CloudProvider#getCloudAddress()
   * @see #getCloudProvider()
   * @generated
   */
  EReference getCloudProvider_CloudAddress();

  /**
   * Returns the meta object for the containment reference list '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.CloudProvider#getCloudCredential <em>Cloud Credential</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Cloud Credential</em>'.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.CloudProvider#getCloudCredential()
   * @see #getCloudProvider()
   * @generated
   */
  EReference getCloudProvider_CloudCredential();

  /**
   * Returns the meta object for the containment reference list '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.CloudProvider#getCloudOptionalTypes <em>Cloud Optional Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Cloud Optional Types</em>'.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.CloudProvider#getCloudOptionalTypes()
   * @see #getCloudProvider()
   * @generated
   */
  EReference getCloudProvider_CloudOptionalTypes();

  /**
   * Returns the meta object for class '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.CloudOptionalTypes <em>Cloud Optional Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Cloud Optional Types</em>'.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.CloudOptionalTypes
   * @generated
   */
  EClass getCloudOptionalTypes();

  /**
   * Returns the meta object for the attribute '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.CloudOptionalTypes#getMany <em>Many</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Many</em>'.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.CloudOptionalTypes#getMany()
   * @see #getCloudOptionalTypes()
   * @generated
   */
  EAttribute getCloudOptionalTypes_Many();

  /**
   * Returns the meta object for the attribute '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.CloudOptionalTypes#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.CloudOptionalTypes#getName()
   * @see #getCloudOptionalTypes()
   * @generated
   */
  EAttribute getCloudOptionalTypes_Name();

  /**
   * Returns the meta object for the attribute '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.CloudOptionalTypes#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.CloudOptionalTypes#getType()
   * @see #getCloudOptionalTypes()
   * @generated
   */
  EAttribute getCloudOptionalTypes_Type();

  /**
   * Returns the meta object for class '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.CloudType <em>Cloud Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Cloud Type</em>'.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.CloudType
   * @generated
   */
  EClass getCloudType();

  /**
   * Returns the meta object for the attribute '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.CloudType#getMany <em>Many</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Many</em>'.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.CloudType#getMany()
   * @see #getCloudType()
   * @generated
   */
  EAttribute getCloudType_Many();

  /**
   * Returns the meta object for the attribute '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.CloudType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.CloudType#getName()
   * @see #getCloudType()
   * @generated
   */
  EAttribute getCloudType_Name();

  /**
   * Returns the meta object for the attribute '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.CloudType#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.CloudType#getType()
   * @see #getCloudType()
   * @generated
   */
  EAttribute getCloudType_Type();

  /**
   * Returns the meta object for class '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.ScriptType <em>Script Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Script Type</em>'.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.ScriptType
   * @generated
   */
  EClass getScriptType();

  /**
   * Returns the meta object for class '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.GeoZoneType <em>Geo Zone Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Geo Zone Type</em>'.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.GeoZoneType
   * @generated
   */
  EClass getGeoZoneType();

  /**
   * Returns the meta object for class '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.MgmAddressType <em>Mgm Address Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mgm Address Type</em>'.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.MgmAddressType
   * @generated
   */
  EClass getMgmAddressType();

  /**
   * Returns the meta object for the attribute '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.MgmAddressType#getMany <em>Many</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Many</em>'.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.MgmAddressType#getMany()
   * @see #getMgmAddressType()
   * @generated
   */
  EAttribute getMgmAddressType_Many();

  /**
   * Returns the meta object for the attribute '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.MgmAddressType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.MgmAddressType#getName()
   * @see #getMgmAddressType()
   * @generated
   */
  EAttribute getMgmAddressType_Name();

  /**
   * Returns the meta object for the attribute '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.MgmAddressType#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.MgmAddressType#getType()
   * @see #getMgmAddressType()
   * @generated
   */
  EAttribute getMgmAddressType_Type();

  /**
   * Returns the meta object for class '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.CloudCredentialType <em>Cloud Credential Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Cloud Credential Type</em>'.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.CloudCredentialType
   * @generated
   */
  EClass getCloudCredentialType();

  /**
   * Returns the meta object for the attribute '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.CloudCredentialType#getMany <em>Many</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Many</em>'.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.CloudCredentialType#getMany()
   * @see #getCloudCredentialType()
   * @generated
   */
  EAttribute getCloudCredentialType_Many();

  /**
   * Returns the meta object for the attribute '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.CloudCredentialType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.CloudCredentialType#getName()
   * @see #getCloudCredentialType()
   * @generated
   */
  EAttribute getCloudCredentialType_Name();

  /**
   * Returns the meta object for the attribute '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.CloudCredentialType#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.CloudCredentialType#getType()
   * @see #getCloudCredentialType()
   * @generated
   */
  EAttribute getCloudCredentialType_Type();

  /**
   * Returns the meta object for class '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.CloudUserType <em>Cloud User Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Cloud User Type</em>'.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.CloudUserType
   * @generated
   */
  EClass getCloudUserType();

  /**
   * Returns the meta object for class '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.CloudPasswordType <em>Cloud Password Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Cloud Password Type</em>'.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.CloudPasswordType
   * @generated
   */
  EClass getCloudPasswordType();

  /**
   * Returns the meta object for class '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.Deploy <em>Deploy</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Deploy</em>'.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.Deploy
   * @generated
   */
  EClass getDeploy();

  /**
   * Returns the meta object for the containment reference list '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.Deploy#getDeployOne <em>Deploy One</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Deploy One</em>'.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.Deploy#getDeployOne()
   * @see #getDeploy()
   * @generated
   */
  EReference getDeploy_DeployOne();

  /**
   * Returns the meta object for the containment reference list '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.Deploy#getDeployTwo <em>Deploy Two</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Deploy Two</em>'.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.Deploy#getDeployTwo()
   * @see #getDeploy()
   * @generated
   */
  EReference getDeploy_DeployTwo();

  /**
   * Returns the meta object for class '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.DeployAppFeature <em>Deploy App Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Deploy App Feature</em>'.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.DeployAppFeature
   * @generated
   */
  EClass getDeployAppFeature();

  /**
   * Returns the meta object for the attribute '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.DeployAppFeature#getMany <em>Many</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Many</em>'.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.DeployAppFeature#getMany()
   * @see #getDeployAppFeature()
   * @generated
   */
  EAttribute getDeployAppFeature_Many();

  /**
   * Returns the meta object for the attribute '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.DeployAppFeature#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.DeployAppFeature#getName()
   * @see #getDeployAppFeature()
   * @generated
   */
  EAttribute getDeployAppFeature_Name();

  /**
   * Returns the meta object for the reference '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.DeployAppFeature#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.DeployAppFeature#getType()
   * @see #getDeployAppFeature()
   * @generated
   */
  EReference getDeployAppFeature_Type();

  /**
   * Returns the meta object for class '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.DeployTypeFeature <em>Deploy Type Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Deploy Type Feature</em>'.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.DeployTypeFeature
   * @generated
   */
  EClass getDeployTypeFeature();

  /**
   * Returns the meta object for the attribute '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.DeployTypeFeature#getMany <em>Many</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Many</em>'.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.DeployTypeFeature#getMany()
   * @see #getDeployTypeFeature()
   * @generated
   */
  EAttribute getDeployTypeFeature_Many();

  /**
   * Returns the meta object for the attribute '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.DeployTypeFeature#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.DeployTypeFeature#getName()
   * @see #getDeployTypeFeature()
   * @generated
   */
  EAttribute getDeployTypeFeature_Name();

  /**
   * Returns the meta object for the reference '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.DeployTypeFeature#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.DeployTypeFeature#getType()
   * @see #getDeployTypeFeature()
   * @generated
   */
  EReference getDeployTypeFeature_Type();

  /**
   * Returns the meta object for class '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.DeployType <em>Deploy Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Deploy Type</em>'.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.DeployType
   * @generated
   */
  EClass getDeployType();

  /**
   * Returns the meta object for the containment reference list '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.DeployType#getRange <em>Range</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Range</em>'.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.DeployType#getRange()
   * @see #getDeployType()
   * @generated
   */
  EReference getDeployType_Range();

  /**
   * Returns the meta object for class '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.DeployRangeType <em>Deploy Range Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Deploy Range Type</em>'.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.DeployRangeType
   * @generated
   */
  EClass getDeployRangeType();

  /**
   * Returns the meta object for the attribute '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.DeployRangeType#getMany <em>Many</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Many</em>'.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.DeployRangeType#getMany()
   * @see #getDeployRangeType()
   * @generated
   */
  EAttribute getDeployRangeType_Many();

  /**
   * Returns the meta object for the attribute '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.DeployRangeType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.DeployRangeType#getName()
   * @see #getDeployRangeType()
   * @generated
   */
  EAttribute getDeployRangeType_Name();

  /**
   * Returns the meta object for the attribute '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.DeployRangeType#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.DeployRangeType#getType()
   * @see #getDeployRangeType()
   * @generated
   */
  EAttribute getDeployRangeType_Type();

  /**
   * Returns the meta object for class '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.DeployApp <em>Deploy App</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Deploy App</em>'.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.DeployApp
   * @generated
   */
  EClass getDeployApp();

  /**
   * Returns the meta object for the containment reference list '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.DeployApp#getClass_ <em>Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Class</em>'.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.DeployApp#getClass_()
   * @see #getDeployApp()
   * @generated
   */
  EReference getDeployApp_Class();

  /**
   * Returns the meta object for the containment reference list '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.DeployApp#getDeployMasterMethod <em>Deploy Master Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Deploy Master Method</em>'.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.DeployApp#getDeployMasterMethod()
   * @see #getDeployApp()
   * @generated
   */
  EReference getDeployApp_DeployMasterMethod();

  /**
   * Returns the meta object for the containment reference list '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.DeployApp#getDeploySlaveMethod <em>Deploy Slave Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Deploy Slave Method</em>'.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.DeployApp#getDeploySlaveMethod()
   * @see #getDeployApp()
   * @generated
   */
  EReference getDeployApp_DeploySlaveMethod();

  /**
   * Returns the meta object for class '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.DeployAppClassType <em>Deploy App Class Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Deploy App Class Type</em>'.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.DeployAppClassType
   * @generated
   */
  EClass getDeployAppClassType();

  /**
   * Returns the meta object for the attribute '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.DeployAppClassType#getMany <em>Many</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Many</em>'.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.DeployAppClassType#getMany()
   * @see #getDeployAppClassType()
   * @generated
   */
  EAttribute getDeployAppClassType_Many();

  /**
   * Returns the meta object for the attribute '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.DeployAppClassType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.DeployAppClassType#getName()
   * @see #getDeployAppClassType()
   * @generated
   */
  EAttribute getDeployAppClassType_Name();

  /**
   * Returns the meta object for the attribute '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.DeployAppClassType#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.DeployAppClassType#getType()
   * @see #getDeployAppClassType()
   * @generated
   */
  EAttribute getDeployAppClassType_Type();

  /**
   * Returns the meta object for class '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.DeployAppMasterMethodType <em>Deploy App Master Method Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Deploy App Master Method Type</em>'.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.DeployAppMasterMethodType
   * @generated
   */
  EClass getDeployAppMasterMethodType();

  /**
   * Returns the meta object for the attribute '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.DeployAppMasterMethodType#getMany <em>Many</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Many</em>'.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.DeployAppMasterMethodType#getMany()
   * @see #getDeployAppMasterMethodType()
   * @generated
   */
  EAttribute getDeployAppMasterMethodType_Many();

  /**
   * Returns the meta object for the attribute '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.DeployAppMasterMethodType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.DeployAppMasterMethodType#getName()
   * @see #getDeployAppMasterMethodType()
   * @generated
   */
  EAttribute getDeployAppMasterMethodType_Name();

  /**
   * Returns the meta object for the attribute '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.DeployAppMasterMethodType#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.DeployAppMasterMethodType#getType()
   * @see #getDeployAppMasterMethodType()
   * @generated
   */
  EAttribute getDeployAppMasterMethodType_Type();

  /**
   * Returns the meta object for class '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.DeployAppSlaveMethodType <em>Deploy App Slave Method Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Deploy App Slave Method Type</em>'.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.DeployAppSlaveMethodType
   * @generated
   */
  EClass getDeployAppSlaveMethodType();

  /**
   * Returns the meta object for the attribute '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.DeployAppSlaveMethodType#getMany <em>Many</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Many</em>'.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.DeployAppSlaveMethodType#getMany()
   * @see #getDeployAppSlaveMethodType()
   * @generated
   */
  EAttribute getDeployAppSlaveMethodType_Many();

  /**
   * Returns the meta object for the attribute '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.DeployAppSlaveMethodType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.DeployAppSlaveMethodType#getName()
   * @see #getDeployAppSlaveMethodType()
   * @generated
   */
  EAttribute getDeployAppSlaveMethodType_Name();

  /**
   * Returns the meta object for the attribute '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.DeployAppSlaveMethodType#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.DeployAppSlaveMethodType#getType()
   * @see #getDeployAppSlaveMethodType()
   * @generated
   */
  EAttribute getDeployAppSlaveMethodType_Type();

  /**
   * Returns the meta object for class '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.Monitor <em>Monitor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Monitor</em>'.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.Monitor
   * @generated
   */
  EClass getMonitor();

  /**
   * Returns the meta object for the containment reference list '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.Monitor#getRange <em>Range</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Range</em>'.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.Monitor#getRange()
   * @see #getMonitor()
   * @generated
   */
  EReference getMonitor_Range();

  /**
   * Returns the meta object for the containment reference list '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.Monitor#getMonitoringType <em>Monitoring Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Monitoring Type</em>'.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.Monitor#getMonitoringType()
   * @see #getMonitor()
   * @generated
   */
  EReference getMonitor_MonitoringType();

  /**
   * Returns the meta object for class '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.MonitorRangeType <em>Monitor Range Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Monitor Range Type</em>'.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.MonitorRangeType
   * @generated
   */
  EClass getMonitorRangeType();

  /**
   * Returns the meta object for the attribute '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.MonitorRangeType#getMany <em>Many</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Many</em>'.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.MonitorRangeType#getMany()
   * @see #getMonitorRangeType()
   * @generated
   */
  EAttribute getMonitorRangeType_Many();

  /**
   * Returns the meta object for the attribute '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.MonitorRangeType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.MonitorRangeType#getName()
   * @see #getMonitorRangeType()
   * @generated
   */
  EAttribute getMonitorRangeType_Name();

  /**
   * Returns the meta object for the attribute '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.MonitorRangeType#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.MonitorRangeType#getType()
   * @see #getMonitorRangeType()
   * @generated
   */
  EAttribute getMonitorRangeType_Type();

  /**
   * Returns the meta object for class '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.MonitoringType <em>Monitoring Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Monitoring Type</em>'.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.MonitoringType
   * @generated
   */
  EClass getMonitoringType();

  /**
   * Returns the meta object for the attribute '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.MonitoringType#getMany <em>Many</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Many</em>'.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.MonitoringType#getMany()
   * @see #getMonitoringType()
   * @generated
   */
  EAttribute getMonitoringType_Many();

  /**
   * Returns the meta object for the attribute '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.MonitoringType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.MonitoringType#getName()
   * @see #getMonitoringType()
   * @generated
   */
  EAttribute getMonitoringType_Name();

  /**
   * Returns the meta object for the attribute '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.MonitoringType#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.MonitoringType#getType()
   * @see #getMonitoringType()
   * @generated
   */
  EAttribute getMonitoringType_Type();

  /**
   * Returns the meta object for class '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.Stress <em>Stress</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Stress</em>'.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.Stress
   * @generated
   */
  EClass getStress();

  /**
   * Returns the meta object for the containment reference list '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.Stress#getRange <em>Range</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Range</em>'.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.Stress#getRange()
   * @see #getStress()
   * @generated
   */
  EReference getStress_Range();

  /**
   * Returns the meta object for the containment reference list '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.Stress#getStressClass <em>Stress Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Stress Class</em>'.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.Stress#getStressClass()
   * @see #getStress()
   * @generated
   */
  EReference getStress_StressClass();

  /**
   * Returns the meta object for the containment reference list '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.Stress#getStressMethod <em>Stress Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Stress Method</em>'.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.Stress#getStressMethod()
   * @see #getStress()
   * @generated
   */
  EReference getStress_StressMethod();

  /**
   * Returns the meta object for class '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.StressRangeType <em>Stress Range Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Stress Range Type</em>'.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.StressRangeType
   * @generated
   */
  EClass getStressRangeType();

  /**
   * Returns the meta object for the attribute '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.StressRangeType#getMany <em>Many</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Many</em>'.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.StressRangeType#getMany()
   * @see #getStressRangeType()
   * @generated
   */
  EAttribute getStressRangeType_Many();

  /**
   * Returns the meta object for the attribute '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.StressRangeType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.StressRangeType#getName()
   * @see #getStressRangeType()
   * @generated
   */
  EAttribute getStressRangeType_Name();

  /**
   * Returns the meta object for the attribute '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.StressRangeType#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.StressRangeType#getType()
   * @see #getStressRangeType()
   * @generated
   */
  EAttribute getStressRangeType_Type();

  /**
   * Returns the meta object for class '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.StressClassType <em>Stress Class Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Stress Class Type</em>'.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.StressClassType
   * @generated
   */
  EClass getStressClassType();

  /**
   * Returns the meta object for the attribute '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.StressClassType#getMany <em>Many</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Many</em>'.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.StressClassType#getMany()
   * @see #getStressClassType()
   * @generated
   */
  EAttribute getStressClassType_Many();

  /**
   * Returns the meta object for the attribute '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.StressClassType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.StressClassType#getName()
   * @see #getStressClassType()
   * @generated
   */
  EAttribute getStressClassType_Name();

  /**
   * Returns the meta object for the attribute '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.StressClassType#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.StressClassType#getType()
   * @see #getStressClassType()
   * @generated
   */
  EAttribute getStressClassType_Type();

  /**
   * Returns the meta object for class '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.StressMethodType <em>Stress Method Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Stress Method Type</em>'.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.StressMethodType
   * @generated
   */
  EClass getStressMethodType();

  /**
   * Returns the meta object for the attribute '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.StressMethodType#getMany <em>Many</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Many</em>'.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.StressMethodType#getMany()
   * @see #getStressMethodType()
   * @generated
   */
  EAttribute getStressMethodType_Many();

  /**
   * Returns the meta object for the attribute '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.StressMethodType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.StressMethodType#getName()
   * @see #getStressMethodType()
   * @generated
   */
  EAttribute getStressMethodType_Name();

  /**
   * Returns the meta object for the attribute '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.StressMethodType#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.StressMethodType#getType()
   * @see #getStressMethodType()
   * @generated
   */
  EAttribute getStressMethodType_Type();

  /**
   * Returns the meta object for class '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.Action <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Action</em>'.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.Action
   * @generated
   */
  EClass getAction();

  /**
   * Returns the meta object for the containment reference list '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.Action#getRange <em>Range</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Range</em>'.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.Action#getRange()
   * @see #getAction()
   * @generated
   */
  EReference getAction_Range();

  /**
   * Returns the meta object for the containment reference list '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.Action#getClass_ <em>Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Class</em>'.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.Action#getClass_()
   * @see #getAction()
   * @generated
   */
  EReference getAction_Class();

  /**
   * Returns the meta object for the containment reference list '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.Action#getMethod <em>Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Method</em>'.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.Action#getMethod()
   * @see #getAction()
   * @generated
   */
  EReference getAction_Method();

  /**
   * Returns the meta object for class '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.ActionRangeType <em>Action Range Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Action Range Type</em>'.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.ActionRangeType
   * @generated
   */
  EClass getActionRangeType();

  /**
   * Returns the meta object for the attribute '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.ActionRangeType#getMany <em>Many</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Many</em>'.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.ActionRangeType#getMany()
   * @see #getActionRangeType()
   * @generated
   */
  EAttribute getActionRangeType_Many();

  /**
   * Returns the meta object for the attribute '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.ActionRangeType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.ActionRangeType#getName()
   * @see #getActionRangeType()
   * @generated
   */
  EAttribute getActionRangeType_Name();

  /**
   * Returns the meta object for the attribute '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.ActionRangeType#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.ActionRangeType#getType()
   * @see #getActionRangeType()
   * @generated
   */
  EAttribute getActionRangeType_Type();

  /**
   * Returns the meta object for class '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.ActionClassType <em>Action Class Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Action Class Type</em>'.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.ActionClassType
   * @generated
   */
  EClass getActionClassType();

  /**
   * Returns the meta object for the attribute '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.ActionClassType#getMany <em>Many</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Many</em>'.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.ActionClassType#getMany()
   * @see #getActionClassType()
   * @generated
   */
  EAttribute getActionClassType_Many();

  /**
   * Returns the meta object for the attribute '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.ActionClassType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.ActionClassType#getName()
   * @see #getActionClassType()
   * @generated
   */
  EAttribute getActionClassType_Name();

  /**
   * Returns the meta object for the attribute '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.ActionClassType#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.ActionClassType#getType()
   * @see #getActionClassType()
   * @generated
   */
  EAttribute getActionClassType_Type();

  /**
   * Returns the meta object for class '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.ActionMethodType <em>Action Method Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Action Method Type</em>'.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.ActionMethodType
   * @generated
   */
  EClass getActionMethodType();

  /**
   * Returns the meta object for the attribute '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.ActionMethodType#getMany <em>Many</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Many</em>'.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.ActionMethodType#getMany()
   * @see #getActionMethodType()
   * @generated
   */
  EAttribute getActionMethodType_Many();

  /**
   * Returns the meta object for the attribute '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.ActionMethodType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.ActionMethodType#getName()
   * @see #getActionMethodType()
   * @generated
   */
  EAttribute getActionMethodType_Name();

  /**
   * Returns the meta object for the attribute '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.ActionMethodType#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.ActionMethodType#getType()
   * @see #getActionMethodType()
   * @generated
   */
  EAttribute getActionMethodType_Type();

  /**
   * Returns the meta object for class '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.Features <em>Features</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Features</em>'.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.Features
   * @generated
   */
  EClass getFeatures();

  /**
   * Returns the meta object for the attribute '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.Features#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.Features#getName()
   * @see #getFeatures()
   * @generated
   */
  EAttribute getFeatures_Name();

  /**
   * Returns the meta object for class '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.IntFeature <em>Int Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Int Feature</em>'.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.IntFeature
   * @generated
   */
  EClass getIntFeature();

  /**
   * Returns the meta object for the attribute '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.IntFeature#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.IntFeature#getName()
   * @see #getIntFeature()
   * @generated
   */
  EAttribute getIntFeature_Name();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  GiraffeDSLFactory getGiraffeDSLFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.DomainModelImpl <em>Domain Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.DomainModelImpl
     * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.GiraffeDSLPackageImpl#getDomainModel()
     * @generated
     */
    EClass DOMAIN_MODEL = eINSTANCE.getDomainModel();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOMAIN_MODEL__ELEMENTS = eINSTANCE.getDomainModel_Elements();

    /**
     * The meta object literal for the '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.TypeImpl <em>Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.TypeImpl
     * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.GiraffeDSLPackageImpl#getType()
     * @generated
     */
    EClass TYPE = eINSTANCE.getType();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE__NAME = eINSTANCE.getType_Name();

    /**
     * The meta object literal for the '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.CreateImpl <em>Create</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.CreateImpl
     * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.GiraffeDSLPackageImpl#getCreate()
     * @generated
     */
    EClass CREATE = eINSTANCE.getCreate();

    /**
     * The meta object literal for the '<em><b>VMachine</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CREATE__VMACHINE = eINSTANCE.getCreate_VMachine();

    /**
     * The meta object literal for the '<em><b>Init Machines</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CREATE__INIT_MACHINES = eINSTANCE.getCreate_InitMachines();

    /**
     * The meta object literal for the '<em><b>Init Increment</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CREATE__INIT_INCREMENT = eINSTANCE.getCreate_InitIncrement();

    /**
     * The meta object literal for the '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.InitMachinesFeatureImpl <em>Init Machines Feature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.InitMachinesFeatureImpl
     * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.GiraffeDSLPackageImpl#getInitMachinesFeature()
     * @generated
     */
    EClass INIT_MACHINES_FEATURE = eINSTANCE.getInitMachinesFeature();

    /**
     * The meta object literal for the '<em><b>Many</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INIT_MACHINES_FEATURE__MANY = eINSTANCE.getInitMachinesFeature_Many();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INIT_MACHINES_FEATURE__NAME = eINSTANCE.getInitMachinesFeature_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INIT_MACHINES_FEATURE__TYPE = eINSTANCE.getInitMachinesFeature_Type();

    /**
     * The meta object literal for the '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.InitIncrementFeatureImpl <em>Init Increment Feature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.InitIncrementFeatureImpl
     * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.GiraffeDSLPackageImpl#getInitIncrementFeature()
     * @generated
     */
    EClass INIT_INCREMENT_FEATURE = eINSTANCE.getInitIncrementFeature();

    /**
     * The meta object literal for the '<em><b>Many</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INIT_INCREMENT_FEATURE__MANY = eINSTANCE.getInitIncrementFeature_Many();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INIT_INCREMENT_FEATURE__NAME = eINSTANCE.getInitIncrementFeature_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INIT_INCREMENT_FEATURE__TYPE = eINSTANCE.getInitIncrementFeature_Type();

    /**
     * The meta object literal for the '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.VirtualMachineFeatureImpl <em>Virtual Machine Feature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.VirtualMachineFeatureImpl
     * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.GiraffeDSLPackageImpl#getVirtualMachineFeature()
     * @generated
     */
    EClass VIRTUAL_MACHINE_FEATURE = eINSTANCE.getVirtualMachineFeature();

    /**
     * The meta object literal for the '<em><b>Many</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VIRTUAL_MACHINE_FEATURE__MANY = eINSTANCE.getVirtualMachineFeature_Many();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VIRTUAL_MACHINE_FEATURE__NAME = eINSTANCE.getVirtualMachineFeature_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VIRTUAL_MACHINE_FEATURE__TYPE = eINSTANCE.getVirtualMachineFeature_Type();

    /**
     * The meta object literal for the '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.VirtualMachineImpl <em>Virtual Machine</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.VirtualMachineImpl
     * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.GiraffeDSLPackageImpl#getVirtualMachine()
     * @generated
     */
    EClass VIRTUAL_MACHINE = eINSTANCE.getVirtualMachine();

    /**
     * The meta object literal for the '<em><b>VM</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VIRTUAL_MACHINE__VM = eINSTANCE.getVirtualMachine_VM();

    /**
     * The meta object literal for the '<em><b>Cloud Provider</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VIRTUAL_MACHINE__CLOUD_PROVIDER = eINSTANCE.getVirtualMachine_CloudProvider();

    /**
     * The meta object literal for the '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.VirtualMachineTypeFeatureImpl <em>Virtual Machine Type Feature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.VirtualMachineTypeFeatureImpl
     * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.GiraffeDSLPackageImpl#getVirtualMachineTypeFeature()
     * @generated
     */
    EClass VIRTUAL_MACHINE_TYPE_FEATURE = eINSTANCE.getVirtualMachineTypeFeature();

    /**
     * The meta object literal for the '<em><b>Many</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VIRTUAL_MACHINE_TYPE_FEATURE__MANY = eINSTANCE.getVirtualMachineTypeFeature_Many();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VIRTUAL_MACHINE_TYPE_FEATURE__NAME = eINSTANCE.getVirtualMachineTypeFeature_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VIRTUAL_MACHINE_TYPE_FEATURE__TYPE = eINSTANCE.getVirtualMachineTypeFeature_Type();

    /**
     * The meta object literal for the '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.CloudProviderTypeImpl <em>Cloud Provider Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.CloudProviderTypeImpl
     * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.GiraffeDSLPackageImpl#getCloudProviderType()
     * @generated
     */
    EClass CLOUD_PROVIDER_TYPE = eINSTANCE.getCloudProviderType();

    /**
     * The meta object literal for the '<em><b>Many</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLOUD_PROVIDER_TYPE__MANY = eINSTANCE.getCloudProviderType_Many();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLOUD_PROVIDER_TYPE__NAME = eINSTANCE.getCloudProviderType_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLOUD_PROVIDER_TYPE__TYPE = eINSTANCE.getCloudProviderType_Type();

    /**
     * The meta object literal for the '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.CloudProviderImpl <em>Cloud Provider</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.CloudProviderImpl
     * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.GiraffeDSLPackageImpl#getCloudProvider()
     * @generated
     */
    EClass CLOUD_PROVIDER = eINSTANCE.getCloudProvider();

    /**
     * The meta object literal for the '<em><b>Cloud Type</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLOUD_PROVIDER__CLOUD_TYPE = eINSTANCE.getCloudProvider_CloudType();

    /**
     * The meta object literal for the '<em><b>Cloud Address</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLOUD_PROVIDER__CLOUD_ADDRESS = eINSTANCE.getCloudProvider_CloudAddress();

    /**
     * The meta object literal for the '<em><b>Cloud Credential</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLOUD_PROVIDER__CLOUD_CREDENTIAL = eINSTANCE.getCloudProvider_CloudCredential();

    /**
     * The meta object literal for the '<em><b>Cloud Optional Types</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLOUD_PROVIDER__CLOUD_OPTIONAL_TYPES = eINSTANCE.getCloudProvider_CloudOptionalTypes();

    /**
     * The meta object literal for the '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.CloudOptionalTypesImpl <em>Cloud Optional Types</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.CloudOptionalTypesImpl
     * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.GiraffeDSLPackageImpl#getCloudOptionalTypes()
     * @generated
     */
    EClass CLOUD_OPTIONAL_TYPES = eINSTANCE.getCloudOptionalTypes();

    /**
     * The meta object literal for the '<em><b>Many</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLOUD_OPTIONAL_TYPES__MANY = eINSTANCE.getCloudOptionalTypes_Many();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLOUD_OPTIONAL_TYPES__NAME = eINSTANCE.getCloudOptionalTypes_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLOUD_OPTIONAL_TYPES__TYPE = eINSTANCE.getCloudOptionalTypes_Type();

    /**
     * The meta object literal for the '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.CloudTypeImpl <em>Cloud Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.CloudTypeImpl
     * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.GiraffeDSLPackageImpl#getCloudType()
     * @generated
     */
    EClass CLOUD_TYPE = eINSTANCE.getCloudType();

    /**
     * The meta object literal for the '<em><b>Many</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLOUD_TYPE__MANY = eINSTANCE.getCloudType_Many();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLOUD_TYPE__NAME = eINSTANCE.getCloudType_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLOUD_TYPE__TYPE = eINSTANCE.getCloudType_Type();

    /**
     * The meta object literal for the '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.ScriptTypeImpl <em>Script Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.ScriptTypeImpl
     * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.GiraffeDSLPackageImpl#getScriptType()
     * @generated
     */
    EClass SCRIPT_TYPE = eINSTANCE.getScriptType();

    /**
     * The meta object literal for the '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.GeoZoneTypeImpl <em>Geo Zone Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.GeoZoneTypeImpl
     * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.GiraffeDSLPackageImpl#getGeoZoneType()
     * @generated
     */
    EClass GEO_ZONE_TYPE = eINSTANCE.getGeoZoneType();

    /**
     * The meta object literal for the '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.MgmAddressTypeImpl <em>Mgm Address Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.MgmAddressTypeImpl
     * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.GiraffeDSLPackageImpl#getMgmAddressType()
     * @generated
     */
    EClass MGM_ADDRESS_TYPE = eINSTANCE.getMgmAddressType();

    /**
     * The meta object literal for the '<em><b>Many</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MGM_ADDRESS_TYPE__MANY = eINSTANCE.getMgmAddressType_Many();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MGM_ADDRESS_TYPE__NAME = eINSTANCE.getMgmAddressType_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MGM_ADDRESS_TYPE__TYPE = eINSTANCE.getMgmAddressType_Type();

    /**
     * The meta object literal for the '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.CloudCredentialTypeImpl <em>Cloud Credential Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.CloudCredentialTypeImpl
     * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.GiraffeDSLPackageImpl#getCloudCredentialType()
     * @generated
     */
    EClass CLOUD_CREDENTIAL_TYPE = eINSTANCE.getCloudCredentialType();

    /**
     * The meta object literal for the '<em><b>Many</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLOUD_CREDENTIAL_TYPE__MANY = eINSTANCE.getCloudCredentialType_Many();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLOUD_CREDENTIAL_TYPE__NAME = eINSTANCE.getCloudCredentialType_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLOUD_CREDENTIAL_TYPE__TYPE = eINSTANCE.getCloudCredentialType_Type();

    /**
     * The meta object literal for the '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.CloudUserTypeImpl <em>Cloud User Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.CloudUserTypeImpl
     * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.GiraffeDSLPackageImpl#getCloudUserType()
     * @generated
     */
    EClass CLOUD_USER_TYPE = eINSTANCE.getCloudUserType();

    /**
     * The meta object literal for the '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.CloudPasswordTypeImpl <em>Cloud Password Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.CloudPasswordTypeImpl
     * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.GiraffeDSLPackageImpl#getCloudPasswordType()
     * @generated
     */
    EClass CLOUD_PASSWORD_TYPE = eINSTANCE.getCloudPasswordType();

    /**
     * The meta object literal for the '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.DeployImpl <em>Deploy</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.DeployImpl
     * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.GiraffeDSLPackageImpl#getDeploy()
     * @generated
     */
    EClass DEPLOY = eINSTANCE.getDeploy();

    /**
     * The meta object literal for the '<em><b>Deploy One</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEPLOY__DEPLOY_ONE = eINSTANCE.getDeploy_DeployOne();

    /**
     * The meta object literal for the '<em><b>Deploy Two</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEPLOY__DEPLOY_TWO = eINSTANCE.getDeploy_DeployTwo();

    /**
     * The meta object literal for the '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.DeployAppFeatureImpl <em>Deploy App Feature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.DeployAppFeatureImpl
     * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.GiraffeDSLPackageImpl#getDeployAppFeature()
     * @generated
     */
    EClass DEPLOY_APP_FEATURE = eINSTANCE.getDeployAppFeature();

    /**
     * The meta object literal for the '<em><b>Many</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEPLOY_APP_FEATURE__MANY = eINSTANCE.getDeployAppFeature_Many();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEPLOY_APP_FEATURE__NAME = eINSTANCE.getDeployAppFeature_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEPLOY_APP_FEATURE__TYPE = eINSTANCE.getDeployAppFeature_Type();

    /**
     * The meta object literal for the '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.DeployTypeFeatureImpl <em>Deploy Type Feature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.DeployTypeFeatureImpl
     * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.GiraffeDSLPackageImpl#getDeployTypeFeature()
     * @generated
     */
    EClass DEPLOY_TYPE_FEATURE = eINSTANCE.getDeployTypeFeature();

    /**
     * The meta object literal for the '<em><b>Many</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEPLOY_TYPE_FEATURE__MANY = eINSTANCE.getDeployTypeFeature_Many();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEPLOY_TYPE_FEATURE__NAME = eINSTANCE.getDeployTypeFeature_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEPLOY_TYPE_FEATURE__TYPE = eINSTANCE.getDeployTypeFeature_Type();

    /**
     * The meta object literal for the '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.DeployTypeImpl <em>Deploy Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.DeployTypeImpl
     * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.GiraffeDSLPackageImpl#getDeployType()
     * @generated
     */
    EClass DEPLOY_TYPE = eINSTANCE.getDeployType();

    /**
     * The meta object literal for the '<em><b>Range</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEPLOY_TYPE__RANGE = eINSTANCE.getDeployType_Range();

    /**
     * The meta object literal for the '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.DeployRangeTypeImpl <em>Deploy Range Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.DeployRangeTypeImpl
     * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.GiraffeDSLPackageImpl#getDeployRangeType()
     * @generated
     */
    EClass DEPLOY_RANGE_TYPE = eINSTANCE.getDeployRangeType();

    /**
     * The meta object literal for the '<em><b>Many</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEPLOY_RANGE_TYPE__MANY = eINSTANCE.getDeployRangeType_Many();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEPLOY_RANGE_TYPE__NAME = eINSTANCE.getDeployRangeType_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEPLOY_RANGE_TYPE__TYPE = eINSTANCE.getDeployRangeType_Type();

    /**
     * The meta object literal for the '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.DeployAppImpl <em>Deploy App</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.DeployAppImpl
     * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.GiraffeDSLPackageImpl#getDeployApp()
     * @generated
     */
    EClass DEPLOY_APP = eINSTANCE.getDeployApp();

    /**
     * The meta object literal for the '<em><b>Class</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEPLOY_APP__CLASS = eINSTANCE.getDeployApp_Class();

    /**
     * The meta object literal for the '<em><b>Deploy Master Method</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEPLOY_APP__DEPLOY_MASTER_METHOD = eINSTANCE.getDeployApp_DeployMasterMethod();

    /**
     * The meta object literal for the '<em><b>Deploy Slave Method</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEPLOY_APP__DEPLOY_SLAVE_METHOD = eINSTANCE.getDeployApp_DeploySlaveMethod();

    /**
     * The meta object literal for the '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.DeployAppClassTypeImpl <em>Deploy App Class Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.DeployAppClassTypeImpl
     * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.GiraffeDSLPackageImpl#getDeployAppClassType()
     * @generated
     */
    EClass DEPLOY_APP_CLASS_TYPE = eINSTANCE.getDeployAppClassType();

    /**
     * The meta object literal for the '<em><b>Many</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEPLOY_APP_CLASS_TYPE__MANY = eINSTANCE.getDeployAppClassType_Many();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEPLOY_APP_CLASS_TYPE__NAME = eINSTANCE.getDeployAppClassType_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEPLOY_APP_CLASS_TYPE__TYPE = eINSTANCE.getDeployAppClassType_Type();

    /**
     * The meta object literal for the '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.DeployAppMasterMethodTypeImpl <em>Deploy App Master Method Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.DeployAppMasterMethodTypeImpl
     * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.GiraffeDSLPackageImpl#getDeployAppMasterMethodType()
     * @generated
     */
    EClass DEPLOY_APP_MASTER_METHOD_TYPE = eINSTANCE.getDeployAppMasterMethodType();

    /**
     * The meta object literal for the '<em><b>Many</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEPLOY_APP_MASTER_METHOD_TYPE__MANY = eINSTANCE.getDeployAppMasterMethodType_Many();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEPLOY_APP_MASTER_METHOD_TYPE__NAME = eINSTANCE.getDeployAppMasterMethodType_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEPLOY_APP_MASTER_METHOD_TYPE__TYPE = eINSTANCE.getDeployAppMasterMethodType_Type();

    /**
     * The meta object literal for the '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.DeployAppSlaveMethodTypeImpl <em>Deploy App Slave Method Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.DeployAppSlaveMethodTypeImpl
     * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.GiraffeDSLPackageImpl#getDeployAppSlaveMethodType()
     * @generated
     */
    EClass DEPLOY_APP_SLAVE_METHOD_TYPE = eINSTANCE.getDeployAppSlaveMethodType();

    /**
     * The meta object literal for the '<em><b>Many</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEPLOY_APP_SLAVE_METHOD_TYPE__MANY = eINSTANCE.getDeployAppSlaveMethodType_Many();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEPLOY_APP_SLAVE_METHOD_TYPE__NAME = eINSTANCE.getDeployAppSlaveMethodType_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEPLOY_APP_SLAVE_METHOD_TYPE__TYPE = eINSTANCE.getDeployAppSlaveMethodType_Type();

    /**
     * The meta object literal for the '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.MonitorImpl <em>Monitor</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.MonitorImpl
     * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.GiraffeDSLPackageImpl#getMonitor()
     * @generated
     */
    EClass MONITOR = eINSTANCE.getMonitor();

    /**
     * The meta object literal for the '<em><b>Range</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MONITOR__RANGE = eINSTANCE.getMonitor_Range();

    /**
     * The meta object literal for the '<em><b>Monitoring Type</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MONITOR__MONITORING_TYPE = eINSTANCE.getMonitor_MonitoringType();

    /**
     * The meta object literal for the '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.MonitorRangeTypeImpl <em>Monitor Range Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.MonitorRangeTypeImpl
     * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.GiraffeDSLPackageImpl#getMonitorRangeType()
     * @generated
     */
    EClass MONITOR_RANGE_TYPE = eINSTANCE.getMonitorRangeType();

    /**
     * The meta object literal for the '<em><b>Many</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MONITOR_RANGE_TYPE__MANY = eINSTANCE.getMonitorRangeType_Many();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MONITOR_RANGE_TYPE__NAME = eINSTANCE.getMonitorRangeType_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MONITOR_RANGE_TYPE__TYPE = eINSTANCE.getMonitorRangeType_Type();

    /**
     * The meta object literal for the '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.MonitoringTypeImpl <em>Monitoring Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.MonitoringTypeImpl
     * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.GiraffeDSLPackageImpl#getMonitoringType()
     * @generated
     */
    EClass MONITORING_TYPE = eINSTANCE.getMonitoringType();

    /**
     * The meta object literal for the '<em><b>Many</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MONITORING_TYPE__MANY = eINSTANCE.getMonitoringType_Many();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MONITORING_TYPE__NAME = eINSTANCE.getMonitoringType_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MONITORING_TYPE__TYPE = eINSTANCE.getMonitoringType_Type();

    /**
     * The meta object literal for the '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.StressImpl <em>Stress</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.StressImpl
     * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.GiraffeDSLPackageImpl#getStress()
     * @generated
     */
    EClass STRESS = eINSTANCE.getStress();

    /**
     * The meta object literal for the '<em><b>Range</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRESS__RANGE = eINSTANCE.getStress_Range();

    /**
     * The meta object literal for the '<em><b>Stress Class</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRESS__STRESS_CLASS = eINSTANCE.getStress_StressClass();

    /**
     * The meta object literal for the '<em><b>Stress Method</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRESS__STRESS_METHOD = eINSTANCE.getStress_StressMethod();

    /**
     * The meta object literal for the '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.StressRangeTypeImpl <em>Stress Range Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.StressRangeTypeImpl
     * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.GiraffeDSLPackageImpl#getStressRangeType()
     * @generated
     */
    EClass STRESS_RANGE_TYPE = eINSTANCE.getStressRangeType();

    /**
     * The meta object literal for the '<em><b>Many</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRESS_RANGE_TYPE__MANY = eINSTANCE.getStressRangeType_Many();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRESS_RANGE_TYPE__NAME = eINSTANCE.getStressRangeType_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRESS_RANGE_TYPE__TYPE = eINSTANCE.getStressRangeType_Type();

    /**
     * The meta object literal for the '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.StressClassTypeImpl <em>Stress Class Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.StressClassTypeImpl
     * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.GiraffeDSLPackageImpl#getStressClassType()
     * @generated
     */
    EClass STRESS_CLASS_TYPE = eINSTANCE.getStressClassType();

    /**
     * The meta object literal for the '<em><b>Many</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRESS_CLASS_TYPE__MANY = eINSTANCE.getStressClassType_Many();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRESS_CLASS_TYPE__NAME = eINSTANCE.getStressClassType_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRESS_CLASS_TYPE__TYPE = eINSTANCE.getStressClassType_Type();

    /**
     * The meta object literal for the '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.StressMethodTypeImpl <em>Stress Method Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.StressMethodTypeImpl
     * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.GiraffeDSLPackageImpl#getStressMethodType()
     * @generated
     */
    EClass STRESS_METHOD_TYPE = eINSTANCE.getStressMethodType();

    /**
     * The meta object literal for the '<em><b>Many</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRESS_METHOD_TYPE__MANY = eINSTANCE.getStressMethodType_Many();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRESS_METHOD_TYPE__NAME = eINSTANCE.getStressMethodType_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRESS_METHOD_TYPE__TYPE = eINSTANCE.getStressMethodType_Type();

    /**
     * The meta object literal for the '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.ActionImpl <em>Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.ActionImpl
     * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.GiraffeDSLPackageImpl#getAction()
     * @generated
     */
    EClass ACTION = eINSTANCE.getAction();

    /**
     * The meta object literal for the '<em><b>Range</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTION__RANGE = eINSTANCE.getAction_Range();

    /**
     * The meta object literal for the '<em><b>Class</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTION__CLASS = eINSTANCE.getAction_Class();

    /**
     * The meta object literal for the '<em><b>Method</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTION__METHOD = eINSTANCE.getAction_Method();

    /**
     * The meta object literal for the '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.ActionRangeTypeImpl <em>Action Range Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.ActionRangeTypeImpl
     * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.GiraffeDSLPackageImpl#getActionRangeType()
     * @generated
     */
    EClass ACTION_RANGE_TYPE = eINSTANCE.getActionRangeType();

    /**
     * The meta object literal for the '<em><b>Many</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTION_RANGE_TYPE__MANY = eINSTANCE.getActionRangeType_Many();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTION_RANGE_TYPE__NAME = eINSTANCE.getActionRangeType_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTION_RANGE_TYPE__TYPE = eINSTANCE.getActionRangeType_Type();

    /**
     * The meta object literal for the '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.ActionClassTypeImpl <em>Action Class Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.ActionClassTypeImpl
     * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.GiraffeDSLPackageImpl#getActionClassType()
     * @generated
     */
    EClass ACTION_CLASS_TYPE = eINSTANCE.getActionClassType();

    /**
     * The meta object literal for the '<em><b>Many</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTION_CLASS_TYPE__MANY = eINSTANCE.getActionClassType_Many();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTION_CLASS_TYPE__NAME = eINSTANCE.getActionClassType_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTION_CLASS_TYPE__TYPE = eINSTANCE.getActionClassType_Type();

    /**
     * The meta object literal for the '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.ActionMethodTypeImpl <em>Action Method Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.ActionMethodTypeImpl
     * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.GiraffeDSLPackageImpl#getActionMethodType()
     * @generated
     */
    EClass ACTION_METHOD_TYPE = eINSTANCE.getActionMethodType();

    /**
     * The meta object literal for the '<em><b>Many</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTION_METHOD_TYPE__MANY = eINSTANCE.getActionMethodType_Many();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTION_METHOD_TYPE__NAME = eINSTANCE.getActionMethodType_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTION_METHOD_TYPE__TYPE = eINSTANCE.getActionMethodType_Type();

    /**
     * The meta object literal for the '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.FeaturesImpl <em>Features</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.FeaturesImpl
     * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.GiraffeDSLPackageImpl#getFeatures()
     * @generated
     */
    EClass FEATURES = eINSTANCE.getFeatures();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FEATURES__NAME = eINSTANCE.getFeatures_Name();

    /**
     * The meta object literal for the '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.IntFeatureImpl <em>Int Feature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.IntFeatureImpl
     * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.GiraffeDSLPackageImpl#getIntFeature()
     * @generated
     */
    EClass INT_FEATURE = eINSTANCE.getIntFeature();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INT_FEATURE__NAME = eINSTANCE.getIntFeature_Name();

  }

} //GiraffeDSLPackage
