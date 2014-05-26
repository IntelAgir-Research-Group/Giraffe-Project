/**
 */
package org.xtext.example.mydsl.myDsl;

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
 * @see org.xtext.example.mydsl.myDsl.MyDslFactory
 * @model kind="package"
 * @generated
 */
public interface MyDslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "myDsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/example/mydsl/MyDsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "myDsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MyDslPackage eINSTANCE = org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.DomainModelImpl <em>Domain Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.DomainModelImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getDomainModel()
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
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.TypeImpl <em>Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.TypeImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getType()
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
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.CreateImpl <em>Create</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.CreateImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getCreate()
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
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.InitMachinesFeatureImpl <em>Init Machines Feature</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.InitMachinesFeatureImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getInitMachinesFeature()
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
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.InitIncrementFeatureImpl <em>Init Increment Feature</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.InitIncrementFeatureImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getInitIncrementFeature()
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
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.VirtualMachineFeatureImpl <em>Virtual Machine Feature</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.VirtualMachineFeatureImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getVirtualMachineFeature()
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
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.VirtualMachineImpl <em>Virtual Machine</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.VirtualMachineImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getVirtualMachine()
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
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.VirtualMachineTypeFeatureImpl <em>Virtual Machine Type Feature</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.VirtualMachineTypeFeatureImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getVirtualMachineTypeFeature()
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
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.CloudProviderTypeImpl <em>Cloud Provider Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.CloudProviderTypeImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getCloudProviderType()
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
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.CloudProviderImpl <em>Cloud Provider</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.CloudProviderImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getCloudProvider()
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
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.CloudOptionalTypesImpl <em>Cloud Optional Types</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.CloudOptionalTypesImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getCloudOptionalTypes()
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
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.CloudTypeImpl <em>Cloud Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.CloudTypeImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getCloudType()
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
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.ScriptTypeImpl <em>Script Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.ScriptTypeImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getScriptType()
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
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.GeoZoneTypeImpl <em>Geo Zone Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.GeoZoneTypeImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getGeoZoneType()
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
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.MgmAddressTypeImpl <em>Mgm Address Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.MgmAddressTypeImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getMgmAddressType()
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
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.CloudCredentialTypeImpl <em>Cloud Credential Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.CloudCredentialTypeImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getCloudCredentialType()
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
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.CloudUserTypeImpl <em>Cloud User Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.CloudUserTypeImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getCloudUserType()
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
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.CloudPasswordTypeImpl <em>Cloud Password Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.CloudPasswordTypeImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getCloudPasswordType()
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
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.DeployImpl <em>Deploy</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.DeployImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getDeploy()
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
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.DeployAppFeatureImpl <em>Deploy App Feature</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.DeployAppFeatureImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getDeployAppFeature()
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
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.DeployTypeFeatureImpl <em>Deploy Type Feature</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.DeployTypeFeatureImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getDeployTypeFeature()
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
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.DeployTypeImpl <em>Deploy Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.DeployTypeImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getDeployType()
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
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.DeployRangeTypeImpl <em>Deploy Range Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.DeployRangeTypeImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getDeployRangeType()
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
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.DeployAppImpl <em>Deploy App</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.DeployAppImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getDeployApp()
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
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.DeployAppClassTypeImpl <em>Deploy App Class Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.DeployAppClassTypeImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getDeployAppClassType()
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
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.DeployAppMasterMethodTypeImpl <em>Deploy App Master Method Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.DeployAppMasterMethodTypeImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getDeployAppMasterMethodType()
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
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.DeployAppSlaveMethodTypeImpl <em>Deploy App Slave Method Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.DeployAppSlaveMethodTypeImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getDeployAppSlaveMethodType()
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
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.MonitorImpl <em>Monitor</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.MonitorImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getMonitor()
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
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.MonitorRangeTypeImpl <em>Monitor Range Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.MonitorRangeTypeImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getMonitorRangeType()
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
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.MonitoringTypeImpl <em>Monitoring Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.MonitoringTypeImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getMonitoringType()
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
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.StressImpl <em>Stress</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.StressImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getStress()
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
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.StressRangeTypeImpl <em>Stress Range Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.StressRangeTypeImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getStressRangeType()
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
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.StressClassTypeImpl <em>Stress Class Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.StressClassTypeImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getStressClassType()
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
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.StressMethodTypeImpl <em>Stress Method Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.StressMethodTypeImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getStressMethodType()
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
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.ActionImpl <em>Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.ActionImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getAction()
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
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.ActionRangeTypeImpl <em>Action Range Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.ActionRangeTypeImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getActionRangeType()
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
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.ActionClassTypeImpl <em>Action Class Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.ActionClassTypeImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getActionClassType()
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
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.ActionMethodTypeImpl <em>Action Method Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.ActionMethodTypeImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getActionMethodType()
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
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.FeaturesImpl <em>Features</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.FeaturesImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getFeatures()
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
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.IntFeatureImpl <em>Int Feature</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.IntFeatureImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getIntFeature()
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
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.DomainModel <em>Domain Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Domain Model</em>'.
   * @see org.xtext.example.mydsl.myDsl.DomainModel
   * @generated
   */
  EClass getDomainModel();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.DomainModel#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see org.xtext.example.mydsl.myDsl.DomainModel#getElements()
   * @see #getDomainModel()
   * @generated
   */
  EReference getDomainModel_Elements();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type</em>'.
   * @see org.xtext.example.mydsl.myDsl.Type
   * @generated
   */
  EClass getType();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Type#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.Type#getName()
   * @see #getType()
   * @generated
   */
  EAttribute getType_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Create <em>Create</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Create</em>'.
   * @see org.xtext.example.mydsl.myDsl.Create
   * @generated
   */
  EClass getCreate();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.Create#getVMachine <em>VMachine</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>VMachine</em>'.
   * @see org.xtext.example.mydsl.myDsl.Create#getVMachine()
   * @see #getCreate()
   * @generated
   */
  EReference getCreate_VMachine();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.Create#getInitMachines <em>Init Machines</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Init Machines</em>'.
   * @see org.xtext.example.mydsl.myDsl.Create#getInitMachines()
   * @see #getCreate()
   * @generated
   */
  EReference getCreate_InitMachines();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.Create#getInitIncrement <em>Init Increment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Init Increment</em>'.
   * @see org.xtext.example.mydsl.myDsl.Create#getInitIncrement()
   * @see #getCreate()
   * @generated
   */
  EReference getCreate_InitIncrement();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.InitMachinesFeature <em>Init Machines Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Init Machines Feature</em>'.
   * @see org.xtext.example.mydsl.myDsl.InitMachinesFeature
   * @generated
   */
  EClass getInitMachinesFeature();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.InitMachinesFeature#getMany <em>Many</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Many</em>'.
   * @see org.xtext.example.mydsl.myDsl.InitMachinesFeature#getMany()
   * @see #getInitMachinesFeature()
   * @generated
   */
  EAttribute getInitMachinesFeature_Many();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.InitMachinesFeature#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.InitMachinesFeature#getName()
   * @see #getInitMachinesFeature()
   * @generated
   */
  EAttribute getInitMachinesFeature_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.InitMachinesFeature#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.xtext.example.mydsl.myDsl.InitMachinesFeature#getType()
   * @see #getInitMachinesFeature()
   * @generated
   */
  EAttribute getInitMachinesFeature_Type();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.InitIncrementFeature <em>Init Increment Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Init Increment Feature</em>'.
   * @see org.xtext.example.mydsl.myDsl.InitIncrementFeature
   * @generated
   */
  EClass getInitIncrementFeature();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.InitIncrementFeature#getMany <em>Many</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Many</em>'.
   * @see org.xtext.example.mydsl.myDsl.InitIncrementFeature#getMany()
   * @see #getInitIncrementFeature()
   * @generated
   */
  EAttribute getInitIncrementFeature_Many();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.InitIncrementFeature#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.InitIncrementFeature#getName()
   * @see #getInitIncrementFeature()
   * @generated
   */
  EAttribute getInitIncrementFeature_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.InitIncrementFeature#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.xtext.example.mydsl.myDsl.InitIncrementFeature#getType()
   * @see #getInitIncrementFeature()
   * @generated
   */
  EAttribute getInitIncrementFeature_Type();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.VirtualMachineFeature <em>Virtual Machine Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Virtual Machine Feature</em>'.
   * @see org.xtext.example.mydsl.myDsl.VirtualMachineFeature
   * @generated
   */
  EClass getVirtualMachineFeature();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.VirtualMachineFeature#getMany <em>Many</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Many</em>'.
   * @see org.xtext.example.mydsl.myDsl.VirtualMachineFeature#getMany()
   * @see #getVirtualMachineFeature()
   * @generated
   */
  EAttribute getVirtualMachineFeature_Many();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.VirtualMachineFeature#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.VirtualMachineFeature#getName()
   * @see #getVirtualMachineFeature()
   * @generated
   */
  EAttribute getVirtualMachineFeature_Name();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.mydsl.myDsl.VirtualMachineFeature#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see org.xtext.example.mydsl.myDsl.VirtualMachineFeature#getType()
   * @see #getVirtualMachineFeature()
   * @generated
   */
  EReference getVirtualMachineFeature_Type();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.VirtualMachine <em>Virtual Machine</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Virtual Machine</em>'.
   * @see org.xtext.example.mydsl.myDsl.VirtualMachine
   * @generated
   */
  EClass getVirtualMachine();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.VirtualMachine#getVM <em>VM</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>VM</em>'.
   * @see org.xtext.example.mydsl.myDsl.VirtualMachine#getVM()
   * @see #getVirtualMachine()
   * @generated
   */
  EReference getVirtualMachine_VM();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.VirtualMachine#getCloudProvider <em>Cloud Provider</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Cloud Provider</em>'.
   * @see org.xtext.example.mydsl.myDsl.VirtualMachine#getCloudProvider()
   * @see #getVirtualMachine()
   * @generated
   */
  EReference getVirtualMachine_CloudProvider();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.VirtualMachineTypeFeature <em>Virtual Machine Type Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Virtual Machine Type Feature</em>'.
   * @see org.xtext.example.mydsl.myDsl.VirtualMachineTypeFeature
   * @generated
   */
  EClass getVirtualMachineTypeFeature();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.VirtualMachineTypeFeature#getMany <em>Many</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Many</em>'.
   * @see org.xtext.example.mydsl.myDsl.VirtualMachineTypeFeature#getMany()
   * @see #getVirtualMachineTypeFeature()
   * @generated
   */
  EAttribute getVirtualMachineTypeFeature_Many();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.VirtualMachineTypeFeature#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.VirtualMachineTypeFeature#getName()
   * @see #getVirtualMachineTypeFeature()
   * @generated
   */
  EAttribute getVirtualMachineTypeFeature_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.VirtualMachineTypeFeature#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.xtext.example.mydsl.myDsl.VirtualMachineTypeFeature#getType()
   * @see #getVirtualMachineTypeFeature()
   * @generated
   */
  EAttribute getVirtualMachineTypeFeature_Type();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.CloudProviderType <em>Cloud Provider Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Cloud Provider Type</em>'.
   * @see org.xtext.example.mydsl.myDsl.CloudProviderType
   * @generated
   */
  EClass getCloudProviderType();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.CloudProviderType#getMany <em>Many</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Many</em>'.
   * @see org.xtext.example.mydsl.myDsl.CloudProviderType#getMany()
   * @see #getCloudProviderType()
   * @generated
   */
  EAttribute getCloudProviderType_Many();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.CloudProviderType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.CloudProviderType#getName()
   * @see #getCloudProviderType()
   * @generated
   */
  EAttribute getCloudProviderType_Name();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.mydsl.myDsl.CloudProviderType#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see org.xtext.example.mydsl.myDsl.CloudProviderType#getType()
   * @see #getCloudProviderType()
   * @generated
   */
  EReference getCloudProviderType_Type();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.CloudProvider <em>Cloud Provider</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Cloud Provider</em>'.
   * @see org.xtext.example.mydsl.myDsl.CloudProvider
   * @generated
   */
  EClass getCloudProvider();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.CloudProvider#getCloudType <em>Cloud Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Cloud Type</em>'.
   * @see org.xtext.example.mydsl.myDsl.CloudProvider#getCloudType()
   * @see #getCloudProvider()
   * @generated
   */
  EReference getCloudProvider_CloudType();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.CloudProvider#getCloudAddress <em>Cloud Address</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Cloud Address</em>'.
   * @see org.xtext.example.mydsl.myDsl.CloudProvider#getCloudAddress()
   * @see #getCloudProvider()
   * @generated
   */
  EReference getCloudProvider_CloudAddress();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.CloudProvider#getCloudCredential <em>Cloud Credential</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Cloud Credential</em>'.
   * @see org.xtext.example.mydsl.myDsl.CloudProvider#getCloudCredential()
   * @see #getCloudProvider()
   * @generated
   */
  EReference getCloudProvider_CloudCredential();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.CloudProvider#getCloudOptionalTypes <em>Cloud Optional Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Cloud Optional Types</em>'.
   * @see org.xtext.example.mydsl.myDsl.CloudProvider#getCloudOptionalTypes()
   * @see #getCloudProvider()
   * @generated
   */
  EReference getCloudProvider_CloudOptionalTypes();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.CloudOptionalTypes <em>Cloud Optional Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Cloud Optional Types</em>'.
   * @see org.xtext.example.mydsl.myDsl.CloudOptionalTypes
   * @generated
   */
  EClass getCloudOptionalTypes();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.CloudOptionalTypes#getMany <em>Many</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Many</em>'.
   * @see org.xtext.example.mydsl.myDsl.CloudOptionalTypes#getMany()
   * @see #getCloudOptionalTypes()
   * @generated
   */
  EAttribute getCloudOptionalTypes_Many();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.CloudOptionalTypes#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.CloudOptionalTypes#getName()
   * @see #getCloudOptionalTypes()
   * @generated
   */
  EAttribute getCloudOptionalTypes_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.CloudOptionalTypes#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.xtext.example.mydsl.myDsl.CloudOptionalTypes#getType()
   * @see #getCloudOptionalTypes()
   * @generated
   */
  EAttribute getCloudOptionalTypes_Type();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.CloudType <em>Cloud Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Cloud Type</em>'.
   * @see org.xtext.example.mydsl.myDsl.CloudType
   * @generated
   */
  EClass getCloudType();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.CloudType#getMany <em>Many</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Many</em>'.
   * @see org.xtext.example.mydsl.myDsl.CloudType#getMany()
   * @see #getCloudType()
   * @generated
   */
  EAttribute getCloudType_Many();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.CloudType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.CloudType#getName()
   * @see #getCloudType()
   * @generated
   */
  EAttribute getCloudType_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.CloudType#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.xtext.example.mydsl.myDsl.CloudType#getType()
   * @see #getCloudType()
   * @generated
   */
  EAttribute getCloudType_Type();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.ScriptType <em>Script Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Script Type</em>'.
   * @see org.xtext.example.mydsl.myDsl.ScriptType
   * @generated
   */
  EClass getScriptType();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.GeoZoneType <em>Geo Zone Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Geo Zone Type</em>'.
   * @see org.xtext.example.mydsl.myDsl.GeoZoneType
   * @generated
   */
  EClass getGeoZoneType();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.MgmAddressType <em>Mgm Address Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mgm Address Type</em>'.
   * @see org.xtext.example.mydsl.myDsl.MgmAddressType
   * @generated
   */
  EClass getMgmAddressType();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.MgmAddressType#getMany <em>Many</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Many</em>'.
   * @see org.xtext.example.mydsl.myDsl.MgmAddressType#getMany()
   * @see #getMgmAddressType()
   * @generated
   */
  EAttribute getMgmAddressType_Many();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.MgmAddressType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.MgmAddressType#getName()
   * @see #getMgmAddressType()
   * @generated
   */
  EAttribute getMgmAddressType_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.MgmAddressType#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.xtext.example.mydsl.myDsl.MgmAddressType#getType()
   * @see #getMgmAddressType()
   * @generated
   */
  EAttribute getMgmAddressType_Type();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.CloudCredentialType <em>Cloud Credential Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Cloud Credential Type</em>'.
   * @see org.xtext.example.mydsl.myDsl.CloudCredentialType
   * @generated
   */
  EClass getCloudCredentialType();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.CloudCredentialType#getMany <em>Many</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Many</em>'.
   * @see org.xtext.example.mydsl.myDsl.CloudCredentialType#getMany()
   * @see #getCloudCredentialType()
   * @generated
   */
  EAttribute getCloudCredentialType_Many();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.CloudCredentialType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.CloudCredentialType#getName()
   * @see #getCloudCredentialType()
   * @generated
   */
  EAttribute getCloudCredentialType_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.CloudCredentialType#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.xtext.example.mydsl.myDsl.CloudCredentialType#getType()
   * @see #getCloudCredentialType()
   * @generated
   */
  EAttribute getCloudCredentialType_Type();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.CloudUserType <em>Cloud User Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Cloud User Type</em>'.
   * @see org.xtext.example.mydsl.myDsl.CloudUserType
   * @generated
   */
  EClass getCloudUserType();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.CloudPasswordType <em>Cloud Password Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Cloud Password Type</em>'.
   * @see org.xtext.example.mydsl.myDsl.CloudPasswordType
   * @generated
   */
  EClass getCloudPasswordType();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Deploy <em>Deploy</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Deploy</em>'.
   * @see org.xtext.example.mydsl.myDsl.Deploy
   * @generated
   */
  EClass getDeploy();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.Deploy#getDeployOne <em>Deploy One</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Deploy One</em>'.
   * @see org.xtext.example.mydsl.myDsl.Deploy#getDeployOne()
   * @see #getDeploy()
   * @generated
   */
  EReference getDeploy_DeployOne();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.Deploy#getDeployTwo <em>Deploy Two</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Deploy Two</em>'.
   * @see org.xtext.example.mydsl.myDsl.Deploy#getDeployTwo()
   * @see #getDeploy()
   * @generated
   */
  EReference getDeploy_DeployTwo();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.DeployAppFeature <em>Deploy App Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Deploy App Feature</em>'.
   * @see org.xtext.example.mydsl.myDsl.DeployAppFeature
   * @generated
   */
  EClass getDeployAppFeature();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.DeployAppFeature#getMany <em>Many</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Many</em>'.
   * @see org.xtext.example.mydsl.myDsl.DeployAppFeature#getMany()
   * @see #getDeployAppFeature()
   * @generated
   */
  EAttribute getDeployAppFeature_Many();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.DeployAppFeature#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.DeployAppFeature#getName()
   * @see #getDeployAppFeature()
   * @generated
   */
  EAttribute getDeployAppFeature_Name();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.mydsl.myDsl.DeployAppFeature#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see org.xtext.example.mydsl.myDsl.DeployAppFeature#getType()
   * @see #getDeployAppFeature()
   * @generated
   */
  EReference getDeployAppFeature_Type();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.DeployTypeFeature <em>Deploy Type Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Deploy Type Feature</em>'.
   * @see org.xtext.example.mydsl.myDsl.DeployTypeFeature
   * @generated
   */
  EClass getDeployTypeFeature();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.DeployTypeFeature#getMany <em>Many</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Many</em>'.
   * @see org.xtext.example.mydsl.myDsl.DeployTypeFeature#getMany()
   * @see #getDeployTypeFeature()
   * @generated
   */
  EAttribute getDeployTypeFeature_Many();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.DeployTypeFeature#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.DeployTypeFeature#getName()
   * @see #getDeployTypeFeature()
   * @generated
   */
  EAttribute getDeployTypeFeature_Name();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.mydsl.myDsl.DeployTypeFeature#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see org.xtext.example.mydsl.myDsl.DeployTypeFeature#getType()
   * @see #getDeployTypeFeature()
   * @generated
   */
  EReference getDeployTypeFeature_Type();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.DeployType <em>Deploy Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Deploy Type</em>'.
   * @see org.xtext.example.mydsl.myDsl.DeployType
   * @generated
   */
  EClass getDeployType();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.DeployType#getRange <em>Range</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Range</em>'.
   * @see org.xtext.example.mydsl.myDsl.DeployType#getRange()
   * @see #getDeployType()
   * @generated
   */
  EReference getDeployType_Range();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.DeployRangeType <em>Deploy Range Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Deploy Range Type</em>'.
   * @see org.xtext.example.mydsl.myDsl.DeployRangeType
   * @generated
   */
  EClass getDeployRangeType();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.DeployRangeType#getMany <em>Many</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Many</em>'.
   * @see org.xtext.example.mydsl.myDsl.DeployRangeType#getMany()
   * @see #getDeployRangeType()
   * @generated
   */
  EAttribute getDeployRangeType_Many();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.DeployRangeType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.DeployRangeType#getName()
   * @see #getDeployRangeType()
   * @generated
   */
  EAttribute getDeployRangeType_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.DeployRangeType#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.xtext.example.mydsl.myDsl.DeployRangeType#getType()
   * @see #getDeployRangeType()
   * @generated
   */
  EAttribute getDeployRangeType_Type();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.DeployApp <em>Deploy App</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Deploy App</em>'.
   * @see org.xtext.example.mydsl.myDsl.DeployApp
   * @generated
   */
  EClass getDeployApp();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.DeployApp#getClass_ <em>Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Class</em>'.
   * @see org.xtext.example.mydsl.myDsl.DeployApp#getClass_()
   * @see #getDeployApp()
   * @generated
   */
  EReference getDeployApp_Class();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.DeployApp#getDeployMasterMethod <em>Deploy Master Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Deploy Master Method</em>'.
   * @see org.xtext.example.mydsl.myDsl.DeployApp#getDeployMasterMethod()
   * @see #getDeployApp()
   * @generated
   */
  EReference getDeployApp_DeployMasterMethod();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.DeployApp#getDeploySlaveMethod <em>Deploy Slave Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Deploy Slave Method</em>'.
   * @see org.xtext.example.mydsl.myDsl.DeployApp#getDeploySlaveMethod()
   * @see #getDeployApp()
   * @generated
   */
  EReference getDeployApp_DeploySlaveMethod();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.DeployAppClassType <em>Deploy App Class Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Deploy App Class Type</em>'.
   * @see org.xtext.example.mydsl.myDsl.DeployAppClassType
   * @generated
   */
  EClass getDeployAppClassType();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.DeployAppClassType#getMany <em>Many</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Many</em>'.
   * @see org.xtext.example.mydsl.myDsl.DeployAppClassType#getMany()
   * @see #getDeployAppClassType()
   * @generated
   */
  EAttribute getDeployAppClassType_Many();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.DeployAppClassType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.DeployAppClassType#getName()
   * @see #getDeployAppClassType()
   * @generated
   */
  EAttribute getDeployAppClassType_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.DeployAppClassType#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.xtext.example.mydsl.myDsl.DeployAppClassType#getType()
   * @see #getDeployAppClassType()
   * @generated
   */
  EAttribute getDeployAppClassType_Type();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.DeployAppMasterMethodType <em>Deploy App Master Method Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Deploy App Master Method Type</em>'.
   * @see org.xtext.example.mydsl.myDsl.DeployAppMasterMethodType
   * @generated
   */
  EClass getDeployAppMasterMethodType();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.DeployAppMasterMethodType#getMany <em>Many</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Many</em>'.
   * @see org.xtext.example.mydsl.myDsl.DeployAppMasterMethodType#getMany()
   * @see #getDeployAppMasterMethodType()
   * @generated
   */
  EAttribute getDeployAppMasterMethodType_Many();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.DeployAppMasterMethodType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.DeployAppMasterMethodType#getName()
   * @see #getDeployAppMasterMethodType()
   * @generated
   */
  EAttribute getDeployAppMasterMethodType_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.DeployAppMasterMethodType#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.xtext.example.mydsl.myDsl.DeployAppMasterMethodType#getType()
   * @see #getDeployAppMasterMethodType()
   * @generated
   */
  EAttribute getDeployAppMasterMethodType_Type();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.DeployAppSlaveMethodType <em>Deploy App Slave Method Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Deploy App Slave Method Type</em>'.
   * @see org.xtext.example.mydsl.myDsl.DeployAppSlaveMethodType
   * @generated
   */
  EClass getDeployAppSlaveMethodType();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.DeployAppSlaveMethodType#getMany <em>Many</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Many</em>'.
   * @see org.xtext.example.mydsl.myDsl.DeployAppSlaveMethodType#getMany()
   * @see #getDeployAppSlaveMethodType()
   * @generated
   */
  EAttribute getDeployAppSlaveMethodType_Many();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.DeployAppSlaveMethodType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.DeployAppSlaveMethodType#getName()
   * @see #getDeployAppSlaveMethodType()
   * @generated
   */
  EAttribute getDeployAppSlaveMethodType_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.DeployAppSlaveMethodType#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.xtext.example.mydsl.myDsl.DeployAppSlaveMethodType#getType()
   * @see #getDeployAppSlaveMethodType()
   * @generated
   */
  EAttribute getDeployAppSlaveMethodType_Type();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Monitor <em>Monitor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Monitor</em>'.
   * @see org.xtext.example.mydsl.myDsl.Monitor
   * @generated
   */
  EClass getMonitor();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.Monitor#getRange <em>Range</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Range</em>'.
   * @see org.xtext.example.mydsl.myDsl.Monitor#getRange()
   * @see #getMonitor()
   * @generated
   */
  EReference getMonitor_Range();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.Monitor#getMonitoringType <em>Monitoring Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Monitoring Type</em>'.
   * @see org.xtext.example.mydsl.myDsl.Monitor#getMonitoringType()
   * @see #getMonitor()
   * @generated
   */
  EReference getMonitor_MonitoringType();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.MonitorRangeType <em>Monitor Range Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Monitor Range Type</em>'.
   * @see org.xtext.example.mydsl.myDsl.MonitorRangeType
   * @generated
   */
  EClass getMonitorRangeType();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.MonitorRangeType#getMany <em>Many</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Many</em>'.
   * @see org.xtext.example.mydsl.myDsl.MonitorRangeType#getMany()
   * @see #getMonitorRangeType()
   * @generated
   */
  EAttribute getMonitorRangeType_Many();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.MonitorRangeType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.MonitorRangeType#getName()
   * @see #getMonitorRangeType()
   * @generated
   */
  EAttribute getMonitorRangeType_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.MonitorRangeType#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.xtext.example.mydsl.myDsl.MonitorRangeType#getType()
   * @see #getMonitorRangeType()
   * @generated
   */
  EAttribute getMonitorRangeType_Type();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.MonitoringType <em>Monitoring Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Monitoring Type</em>'.
   * @see org.xtext.example.mydsl.myDsl.MonitoringType
   * @generated
   */
  EClass getMonitoringType();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.MonitoringType#getMany <em>Many</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Many</em>'.
   * @see org.xtext.example.mydsl.myDsl.MonitoringType#getMany()
   * @see #getMonitoringType()
   * @generated
   */
  EAttribute getMonitoringType_Many();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.MonitoringType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.MonitoringType#getName()
   * @see #getMonitoringType()
   * @generated
   */
  EAttribute getMonitoringType_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.MonitoringType#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.xtext.example.mydsl.myDsl.MonitoringType#getType()
   * @see #getMonitoringType()
   * @generated
   */
  EAttribute getMonitoringType_Type();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Stress <em>Stress</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Stress</em>'.
   * @see org.xtext.example.mydsl.myDsl.Stress
   * @generated
   */
  EClass getStress();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.Stress#getRange <em>Range</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Range</em>'.
   * @see org.xtext.example.mydsl.myDsl.Stress#getRange()
   * @see #getStress()
   * @generated
   */
  EReference getStress_Range();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.Stress#getStressClass <em>Stress Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Stress Class</em>'.
   * @see org.xtext.example.mydsl.myDsl.Stress#getStressClass()
   * @see #getStress()
   * @generated
   */
  EReference getStress_StressClass();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.Stress#getStressMethod <em>Stress Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Stress Method</em>'.
   * @see org.xtext.example.mydsl.myDsl.Stress#getStressMethod()
   * @see #getStress()
   * @generated
   */
  EReference getStress_StressMethod();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.StressRangeType <em>Stress Range Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Stress Range Type</em>'.
   * @see org.xtext.example.mydsl.myDsl.StressRangeType
   * @generated
   */
  EClass getStressRangeType();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.StressRangeType#getMany <em>Many</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Many</em>'.
   * @see org.xtext.example.mydsl.myDsl.StressRangeType#getMany()
   * @see #getStressRangeType()
   * @generated
   */
  EAttribute getStressRangeType_Many();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.StressRangeType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.StressRangeType#getName()
   * @see #getStressRangeType()
   * @generated
   */
  EAttribute getStressRangeType_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.StressRangeType#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.xtext.example.mydsl.myDsl.StressRangeType#getType()
   * @see #getStressRangeType()
   * @generated
   */
  EAttribute getStressRangeType_Type();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.StressClassType <em>Stress Class Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Stress Class Type</em>'.
   * @see org.xtext.example.mydsl.myDsl.StressClassType
   * @generated
   */
  EClass getStressClassType();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.StressClassType#getMany <em>Many</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Many</em>'.
   * @see org.xtext.example.mydsl.myDsl.StressClassType#getMany()
   * @see #getStressClassType()
   * @generated
   */
  EAttribute getStressClassType_Many();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.StressClassType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.StressClassType#getName()
   * @see #getStressClassType()
   * @generated
   */
  EAttribute getStressClassType_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.StressClassType#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.xtext.example.mydsl.myDsl.StressClassType#getType()
   * @see #getStressClassType()
   * @generated
   */
  EAttribute getStressClassType_Type();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.StressMethodType <em>Stress Method Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Stress Method Type</em>'.
   * @see org.xtext.example.mydsl.myDsl.StressMethodType
   * @generated
   */
  EClass getStressMethodType();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.StressMethodType#getMany <em>Many</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Many</em>'.
   * @see org.xtext.example.mydsl.myDsl.StressMethodType#getMany()
   * @see #getStressMethodType()
   * @generated
   */
  EAttribute getStressMethodType_Many();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.StressMethodType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.StressMethodType#getName()
   * @see #getStressMethodType()
   * @generated
   */
  EAttribute getStressMethodType_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.StressMethodType#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.xtext.example.mydsl.myDsl.StressMethodType#getType()
   * @see #getStressMethodType()
   * @generated
   */
  EAttribute getStressMethodType_Type();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Action <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Action</em>'.
   * @see org.xtext.example.mydsl.myDsl.Action
   * @generated
   */
  EClass getAction();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.Action#getRange <em>Range</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Range</em>'.
   * @see org.xtext.example.mydsl.myDsl.Action#getRange()
   * @see #getAction()
   * @generated
   */
  EReference getAction_Range();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.Action#getClass_ <em>Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Class</em>'.
   * @see org.xtext.example.mydsl.myDsl.Action#getClass_()
   * @see #getAction()
   * @generated
   */
  EReference getAction_Class();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.Action#getMethod <em>Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Method</em>'.
   * @see org.xtext.example.mydsl.myDsl.Action#getMethod()
   * @see #getAction()
   * @generated
   */
  EReference getAction_Method();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.ActionRangeType <em>Action Range Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Action Range Type</em>'.
   * @see org.xtext.example.mydsl.myDsl.ActionRangeType
   * @generated
   */
  EClass getActionRangeType();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.ActionRangeType#getMany <em>Many</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Many</em>'.
   * @see org.xtext.example.mydsl.myDsl.ActionRangeType#getMany()
   * @see #getActionRangeType()
   * @generated
   */
  EAttribute getActionRangeType_Many();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.ActionRangeType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.ActionRangeType#getName()
   * @see #getActionRangeType()
   * @generated
   */
  EAttribute getActionRangeType_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.ActionRangeType#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.xtext.example.mydsl.myDsl.ActionRangeType#getType()
   * @see #getActionRangeType()
   * @generated
   */
  EAttribute getActionRangeType_Type();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.ActionClassType <em>Action Class Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Action Class Type</em>'.
   * @see org.xtext.example.mydsl.myDsl.ActionClassType
   * @generated
   */
  EClass getActionClassType();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.ActionClassType#getMany <em>Many</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Many</em>'.
   * @see org.xtext.example.mydsl.myDsl.ActionClassType#getMany()
   * @see #getActionClassType()
   * @generated
   */
  EAttribute getActionClassType_Many();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.ActionClassType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.ActionClassType#getName()
   * @see #getActionClassType()
   * @generated
   */
  EAttribute getActionClassType_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.ActionClassType#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.xtext.example.mydsl.myDsl.ActionClassType#getType()
   * @see #getActionClassType()
   * @generated
   */
  EAttribute getActionClassType_Type();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.ActionMethodType <em>Action Method Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Action Method Type</em>'.
   * @see org.xtext.example.mydsl.myDsl.ActionMethodType
   * @generated
   */
  EClass getActionMethodType();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.ActionMethodType#getMany <em>Many</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Many</em>'.
   * @see org.xtext.example.mydsl.myDsl.ActionMethodType#getMany()
   * @see #getActionMethodType()
   * @generated
   */
  EAttribute getActionMethodType_Many();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.ActionMethodType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.ActionMethodType#getName()
   * @see #getActionMethodType()
   * @generated
   */
  EAttribute getActionMethodType_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.ActionMethodType#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.xtext.example.mydsl.myDsl.ActionMethodType#getType()
   * @see #getActionMethodType()
   * @generated
   */
  EAttribute getActionMethodType_Type();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Features <em>Features</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Features</em>'.
   * @see org.xtext.example.mydsl.myDsl.Features
   * @generated
   */
  EClass getFeatures();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Features#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.Features#getName()
   * @see #getFeatures()
   * @generated
   */
  EAttribute getFeatures_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.IntFeature <em>Int Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Int Feature</em>'.
   * @see org.xtext.example.mydsl.myDsl.IntFeature
   * @generated
   */
  EClass getIntFeature();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.IntFeature#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.IntFeature#getName()
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
  MyDslFactory getMyDslFactory();

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
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.DomainModelImpl <em>Domain Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.DomainModelImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getDomainModel()
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
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.TypeImpl <em>Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.TypeImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getType()
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
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.CreateImpl <em>Create</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.CreateImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getCreate()
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
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.InitMachinesFeatureImpl <em>Init Machines Feature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.InitMachinesFeatureImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getInitMachinesFeature()
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
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.InitIncrementFeatureImpl <em>Init Increment Feature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.InitIncrementFeatureImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getInitIncrementFeature()
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
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.VirtualMachineFeatureImpl <em>Virtual Machine Feature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.VirtualMachineFeatureImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getVirtualMachineFeature()
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
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.VirtualMachineImpl <em>Virtual Machine</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.VirtualMachineImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getVirtualMachine()
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
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.VirtualMachineTypeFeatureImpl <em>Virtual Machine Type Feature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.VirtualMachineTypeFeatureImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getVirtualMachineTypeFeature()
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
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.CloudProviderTypeImpl <em>Cloud Provider Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.CloudProviderTypeImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getCloudProviderType()
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
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.CloudProviderImpl <em>Cloud Provider</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.CloudProviderImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getCloudProvider()
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
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.CloudOptionalTypesImpl <em>Cloud Optional Types</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.CloudOptionalTypesImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getCloudOptionalTypes()
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
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.CloudTypeImpl <em>Cloud Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.CloudTypeImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getCloudType()
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
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.ScriptTypeImpl <em>Script Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.ScriptTypeImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getScriptType()
     * @generated
     */
    EClass SCRIPT_TYPE = eINSTANCE.getScriptType();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.GeoZoneTypeImpl <em>Geo Zone Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.GeoZoneTypeImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getGeoZoneType()
     * @generated
     */
    EClass GEO_ZONE_TYPE = eINSTANCE.getGeoZoneType();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.MgmAddressTypeImpl <em>Mgm Address Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.MgmAddressTypeImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getMgmAddressType()
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
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.CloudCredentialTypeImpl <em>Cloud Credential Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.CloudCredentialTypeImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getCloudCredentialType()
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
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.CloudUserTypeImpl <em>Cloud User Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.CloudUserTypeImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getCloudUserType()
     * @generated
     */
    EClass CLOUD_USER_TYPE = eINSTANCE.getCloudUserType();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.CloudPasswordTypeImpl <em>Cloud Password Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.CloudPasswordTypeImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getCloudPasswordType()
     * @generated
     */
    EClass CLOUD_PASSWORD_TYPE = eINSTANCE.getCloudPasswordType();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.DeployImpl <em>Deploy</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.DeployImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getDeploy()
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
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.DeployAppFeatureImpl <em>Deploy App Feature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.DeployAppFeatureImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getDeployAppFeature()
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
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.DeployTypeFeatureImpl <em>Deploy Type Feature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.DeployTypeFeatureImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getDeployTypeFeature()
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
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.DeployTypeImpl <em>Deploy Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.DeployTypeImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getDeployType()
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
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.DeployRangeTypeImpl <em>Deploy Range Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.DeployRangeTypeImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getDeployRangeType()
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
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.DeployAppImpl <em>Deploy App</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.DeployAppImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getDeployApp()
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
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.DeployAppClassTypeImpl <em>Deploy App Class Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.DeployAppClassTypeImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getDeployAppClassType()
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
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.DeployAppMasterMethodTypeImpl <em>Deploy App Master Method Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.DeployAppMasterMethodTypeImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getDeployAppMasterMethodType()
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
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.DeployAppSlaveMethodTypeImpl <em>Deploy App Slave Method Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.DeployAppSlaveMethodTypeImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getDeployAppSlaveMethodType()
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
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.MonitorImpl <em>Monitor</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.MonitorImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getMonitor()
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
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.MonitorRangeTypeImpl <em>Monitor Range Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.MonitorRangeTypeImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getMonitorRangeType()
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
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.MonitoringTypeImpl <em>Monitoring Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.MonitoringTypeImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getMonitoringType()
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
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.StressImpl <em>Stress</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.StressImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getStress()
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
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.StressRangeTypeImpl <em>Stress Range Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.StressRangeTypeImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getStressRangeType()
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
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.StressClassTypeImpl <em>Stress Class Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.StressClassTypeImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getStressClassType()
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
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.StressMethodTypeImpl <em>Stress Method Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.StressMethodTypeImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getStressMethodType()
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
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.ActionImpl <em>Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.ActionImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getAction()
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
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.ActionRangeTypeImpl <em>Action Range Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.ActionRangeTypeImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getActionRangeType()
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
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.ActionClassTypeImpl <em>Action Class Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.ActionClassTypeImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getActionClassType()
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
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.ActionMethodTypeImpl <em>Action Method Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.ActionMethodTypeImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getActionMethodType()
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
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.FeaturesImpl <em>Features</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.FeaturesImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getFeatures()
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
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.IntFeatureImpl <em>Int Feature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.IntFeatureImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getIntFeature()
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

} //MyDslPackage
