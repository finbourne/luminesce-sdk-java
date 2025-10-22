<a id="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *https://fbn-prd.lusid.com/honeycomb*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ApplicationMetadataApi* | [**getServicesAsAccessControlledResources**](docs/ApplicationMetadataApi.md#getservicesasaccesscontrolledresources) | **GET** /api/metadata/access/resources | GetServicesAsAccessControlledResources: Get resources available for access control
*BinaryDownloadingApi* | [**downloadBinary**](docs/BinaryDownloadingApi.md#downloadbinary) | **GET** /api/Download/download | DownloadBinary: Download a Luminesce Binary you may run on-site
*BinaryDownloadingApi* | [**getBinaryVersions**](docs/BinaryDownloadingApi.md#getbinaryversions) | **GET** /api/Download/versions | GetBinaryVersions: List available versions of binaries
*CertificateManagementApi* | [**downloadCertificate**](docs/CertificateManagementApi.md#downloadcertificate) | **GET** /api/Certificate/certificate | DownloadCertificate: Download domain or your personal certificates
*CertificateManagementApi* | [**listCertificates**](docs/CertificateManagementApi.md#listcertificates) | **GET** /api/Certificate/certificates | ListCertificates: List previously minted certificates
*CertificateManagementApi* | [**manageCertificate**](docs/CertificateManagementApi.md#managecertificate) | **PUT** /api/Certificate/manage | ManageCertificate: Create / Renew / Revoke a certificate
*CurrentTableFieldCatalogApi* | [**getCatalog**](docs/CurrentTableFieldCatalogApi.md#getcatalog) | **GET** /api/Catalog | GetCatalog: Get a Flattened Table/Field Catalog
*CurrentTableFieldCatalogApi* | [**getFields**](docs/CurrentTableFieldCatalogApi.md#getfields) | **GET** /api/Catalog/fields | GetFields: List field and parameters for providers
*CurrentTableFieldCatalogApi* | [**getProviders**](docs/CurrentTableFieldCatalogApi.md#getproviders) | **GET** /api/Catalog/providers | GetProviders: List available providers
*HealthCheckingEndpointApi* | [**fakeNodeReclaim**](docs/HealthCheckingEndpointApi.md#fakenodereclaim) | **GET** /fakeNodeReclaim | [INTERNAL] FakeNodeReclaim: Helps testing of AWS node reclaim behaviour
*HistoricallyExecutedQueriesApi* | [**cancelHistory**](docs/HistoricallyExecutedQueriesApi.md#cancelhistory) | **DELETE** /api/History/{executionId} | CancelHistory: Cancel / Clear data from a history search
*HistoricallyExecutedQueriesApi* | [**fetchHistoryResultHistogram**](docs/HistoricallyExecutedQueriesApi.md#fetchhistoryresulthistogram) | **GET** /api/History/{executionId}/histogram | FetchHistoryResultHistogram: Make a histogram of results of a history search
*HistoricallyExecutedQueriesApi* | [**fetchHistoryResultJson**](docs/HistoricallyExecutedQueriesApi.md#fetchhistoryresultjson) | **GET** /api/History/{executionId}/json | FetchHistoryResultJson: Fetch JSON results from a query history search
*HistoricallyExecutedQueriesApi* | [**getHistory**](docs/HistoricallyExecutedQueriesApi.md#gethistory) | **GET** /api/History | GetHistory: Start a background history search
*HistoricallyExecutedQueriesApi* | [**getProgressOfHistory**](docs/HistoricallyExecutedQueriesApi.md#getprogressofhistory) | **GET** /api/History/{executionId} | GetProgressOfHistory: View progress of a history search
*MultiQueryExecutionApi* | [**cancelMultiQuery**](docs/MultiQueryExecutionApi.md#cancelmultiquery) | **DELETE** /api/MultiQueryBackground/{executionId} | CancelMultiQuery: Cancel / Clear a previously started query-set
*MultiQueryExecutionApi* | [**getProgressOfMultiQuery**](docs/MultiQueryExecutionApi.md#getprogressofmultiquery) | **GET** /api/MultiQueryBackground/{executionId} | GetProgressOfMultiQuery: View progress of the entire query-set load
*MultiQueryExecutionApi* | [**startQueries**](docs/MultiQueryExecutionApi.md#startqueries) | **PUT** /api/MultiQueryBackground | StartQueries: Run a given set of Sql queries in the background
*SqlBackgroundExecutionApi* | [**cancelQuery**](docs/SqlBackgroundExecutionApi.md#cancelquery) | **DELETE** /api/SqlBackground/{executionId} | CancelQuery: Cancel / Clear data from a previously run query
*SqlBackgroundExecutionApi* | [**fetchQueryResultCsv**](docs/SqlBackgroundExecutionApi.md#fetchqueryresultcsv) | **GET** /api/SqlBackground/{executionId}/csv | FetchQueryResultCsv: Fetch the result of a query as CSV
*SqlBackgroundExecutionApi* | [**fetchQueryResultExcel**](docs/SqlBackgroundExecutionApi.md#fetchqueryresultexcel) | **GET** /api/SqlBackground/{executionId}/excel | FetchQueryResultExcel: Fetch the result of a query as an Excel file
*SqlBackgroundExecutionApi* | [**fetchQueryResultHistogram**](docs/SqlBackgroundExecutionApi.md#fetchqueryresulthistogram) | **GET** /api/SqlBackground/{executionId}/histogram | FetchQueryResultHistogram: Construct a histogram of the result of a query
*SqlBackgroundExecutionApi* | [**fetchQueryResultJson**](docs/SqlBackgroundExecutionApi.md#fetchqueryresultjson) | **GET** /api/SqlBackground/{executionId}/json | FetchQueryResultJson: Fetch the result of a query as a JSON string
*SqlBackgroundExecutionApi* | [**fetchQueryResultJsonProper**](docs/SqlBackgroundExecutionApi.md#fetchqueryresultjsonproper) | **GET** /api/SqlBackground/{executionId}/jsonProper | FetchQueryResultJsonProper: Fetch the result of a query as JSON
*SqlBackgroundExecutionApi* | [**fetchQueryResultParquet**](docs/SqlBackgroundExecutionApi.md#fetchqueryresultparquet) | **GET** /api/SqlBackground/{executionId}/parquet | FetchQueryResultParquet: Fetch the result of a query as Parquet
*SqlBackgroundExecutionApi* | [**fetchQueryResultPipe**](docs/SqlBackgroundExecutionApi.md#fetchqueryresultpipe) | **GET** /api/SqlBackground/{executionId}/pipe | FetchQueryResultPipe: Fetch the result of a query as pipe-delimited
*SqlBackgroundExecutionApi* | [**fetchQueryResultSqlite**](docs/SqlBackgroundExecutionApi.md#fetchqueryresultsqlite) | **GET** /api/SqlBackground/{executionId}/sqlite | FetchQueryResultSqlite: Fetch the result of a query as SqLite
*SqlBackgroundExecutionApi* | [**fetchQueryResultXml**](docs/SqlBackgroundExecutionApi.md#fetchqueryresultxml) | **GET** /api/SqlBackground/{executionId}/xml | FetchQueryResultXml: Fetch the result of a query as XML
*SqlBackgroundExecutionApi* | [**getHistoricalFeedback**](docs/SqlBackgroundExecutionApi.md#gethistoricalfeedback) | **GET** /api/SqlBackground/{executionId}/historicalFeedback | GetHistoricalFeedback: View query progress up to this point
*SqlBackgroundExecutionApi* | [**getProgressOf**](docs/SqlBackgroundExecutionApi.md#getprogressof) | **GET** /api/SqlBackground/{executionId} | GetProgressOf: View query progress up to this point.
*SqlBackgroundExecutionApi* | [**startQuery**](docs/SqlBackgroundExecutionApi.md#startquery) | **PUT** /api/SqlBackground | StartQuery: Start to Execute Sql in the background
*SqlDesignApi* | [**getProviderTemplateForExport**](docs/SqlDesignApi.md#getprovidertemplateforexport) | **GET** /api/Sql/providertemplateforexport | GetProviderTemplateForExport: Makes a fields template for file importing via a writer
*SqlDesignApi* | [**putCaseStatementDesignSqlToDesign**](docs/SqlDesignApi.md#putcasestatementdesignsqltodesign) | **PUT** /api/Sql/tocasestatementdesign | PutCaseStatementDesignSqlToDesign: Convert SQL to a case statement design object
*SqlDesignApi* | [**putCaseStatementDesignToSql**](docs/SqlDesignApi.md#putcasestatementdesigntosql) | **PUT** /api/Sql/fromcasestatementdesign | PutCaseStatementDesignToSql: Convert a case statement design object to SQL
*SqlDesignApi* | [**putFileReadDesignToSql**](docs/SqlDesignApi.md#putfilereaddesigntosql) | **PUT** /api/Sql/fromfilereaddesign | PutFileReadDesignToSql: Make file read SQL from a design object
*SqlDesignApi* | [**putInlinedPropertiesDesignSqlToDesign**](docs/SqlDesignApi.md#putinlinedpropertiesdesignsqltodesign) | **PUT** /api/Sql/toinlinedpropertiesdesign | PutInlinedPropertiesDesignSqlToDesign: Make an inlined properties design from SQL
*SqlDesignApi* | [**putInlinedPropertiesDesignToSql**](docs/SqlDesignApi.md#putinlinedpropertiesdesigntosql) | **PUT** /api/Sql/frominlinedpropertiesdesign | PutInlinedPropertiesDesignToSql: Make inlined properties SQL from a design object
*SqlDesignApi* | [**putIntellisense**](docs/SqlDesignApi.md#putintellisense) | **PUT** /api/Sql/intellisense | PutIntellisense: Make intellisense prompts given an SQL snip-it
*SqlDesignApi* | [**putIntellisenseError**](docs/SqlDesignApi.md#putintellisenseerror) | **PUT** /api/Sql/intellisenseError | PutIntellisenseError: Get error ranges from SQL
*SqlDesignApi* | [**putLusidGridToQuery**](docs/SqlDesignApi.md#putlusidgridtoquery) | **PUT** /api/Sql/fromlusidgrid | [EXPERIMENTAL] PutLusidGridToQuery: Generates SQL from a dashboard view
*SqlDesignApi* | [**putQueryDesignToSql**](docs/SqlDesignApi.md#putquerydesigntosql) | **PUT** /api/Sql/fromdesign | PutQueryDesignToSql: Make SQL from a structured query design
*SqlDesignApi* | [**putQueryToFormat**](docs/SqlDesignApi.md#putquerytoformat) | **PUT** /api/Sql/pretty | PutQueryToFormat: Format SQL into a more readable form
*SqlDesignApi* | [**putSqlToExtractScalarParameters**](docs/SqlDesignApi.md#putsqltoextractscalarparameters) | **PUT** /api/Sql/extractscalarparameters | PutSqlToExtractScalarParameters: Extract scalar parameter information from SQL
*SqlDesignApi* | [**putSqlToFileReadDesign**](docs/SqlDesignApi.md#putsqltofilereaddesign) | **PUT** /api/Sql/tofilereaddesign | PutSqlToFileReadDesign: Make a design object from file-read SQL
*SqlDesignApi* | [**putSqlToQueryDesign**](docs/SqlDesignApi.md#putsqltoquerydesign) | **PUT** /api/Sql/todesign | PutSqlToQueryDesign: Make a SQL-design object from SQL if possible
*SqlDesignApi* | [**putSqlToViewDesign**](docs/SqlDesignApi.md#putsqltoviewdesign) | **PUT** /api/Sql/toviewdesign | PutSqlToViewDesign: Make a view-design from view creation SQL
*SqlDesignApi* | [**putSqlToWriterDesign**](docs/SqlDesignApi.md#putsqltowriterdesign) | **PUT** /api/Sql/towriterdesign | PutSqlToWriterDesign: Make a SQL-writer-design object from SQL
*SqlDesignApi* | [**putViewDesignToSql**](docs/SqlDesignApi.md#putviewdesigntosql) | **PUT** /api/Sql/fromviewdesign | PutViewDesignToSql: Make view creation sql from a view-design
*SqlDesignApi* | [**putWriterDesignToSql**](docs/SqlDesignApi.md#putwriterdesigntosql) | **PUT** /api/Sql/fromwriterdesign | PutWriterDesignToSql: Make writer SQL from a writer-design object
*SqlExecutionApi* | [**getByQueryCsv**](docs/SqlExecutionApi.md#getbyquerycsv) | **GET** /api/Sql/csv/{query} | GetByQueryCsv: Execute Sql from the url returning CSV
*SqlExecutionApi* | [**getByQueryExcel**](docs/SqlExecutionApi.md#getbyqueryexcel) | **GET** /api/Sql/excel/{query} | GetByQueryExcel: Execute Sql from the url returning an Excel file
*SqlExecutionApi* | [**getByQueryJson**](docs/SqlExecutionApi.md#getbyqueryjson) | **GET** /api/Sql/json/{query} | GetByQueryJson: Execute Sql from the url returning JSON
*SqlExecutionApi* | [**getByQueryParquet**](docs/SqlExecutionApi.md#getbyqueryparquet) | **GET** /api/Sql/parquet/{query} | GetByQueryParquet: Execute Sql from the url returning a Parquet file
*SqlExecutionApi* | [**getByQueryPipe**](docs/SqlExecutionApi.md#getbyquerypipe) | **GET** /api/Sql/pipe/{query} | GetByQueryPipe: Execute Sql from the url returning pipe-delimited
*SqlExecutionApi* | [**getByQuerySqlite**](docs/SqlExecutionApi.md#getbyquerysqlite) | **GET** /api/Sql/sqlite/{query} | GetByQuerySqlite: Execute Sql from the url returning SqLite DB
*SqlExecutionApi* | [**getByQueryXml**](docs/SqlExecutionApi.md#getbyqueryxml) | **GET** /api/Sql/xml/{query} | GetByQueryXml: Execute Sql from the url returning XML
*SqlExecutionApi* | [**putByQueryCsv**](docs/SqlExecutionApi.md#putbyquerycsv) | **PUT** /api/Sql/csv | PutByQueryCsv: Execute Sql from the body returning CSV
*SqlExecutionApi* | [**putByQueryExcel**](docs/SqlExecutionApi.md#putbyqueryexcel) | **PUT** /api/Sql/excel | PutByQueryExcel: Execute Sql from the body making an Excel file
*SqlExecutionApi* | [**putByQueryJson**](docs/SqlExecutionApi.md#putbyqueryjson) | **PUT** /api/Sql/json | PutByQueryJson: Execute Sql from the body returning JSON
*SqlExecutionApi* | [**putByQueryParquet**](docs/SqlExecutionApi.md#putbyqueryparquet) | **PUT** /api/Sql/parquet | PutByQueryParquet: Execute Sql from the body making a Parquet file
*SqlExecutionApi* | [**putByQueryPipe**](docs/SqlExecutionApi.md#putbyquerypipe) | **PUT** /api/Sql/pipe | PutByQueryPipe: Execute Sql from the body making pipe-delimited
*SqlExecutionApi* | [**putByQuerySqlite**](docs/SqlExecutionApi.md#putbyquerysqlite) | **PUT** /api/Sql/sqlite | PutByQuerySqlite: Execute Sql from the body returning SqLite DB
*SqlExecutionApi* | [**putByQueryXml**](docs/SqlExecutionApi.md#putbyqueryxml) | **PUT** /api/Sql/xml | PutByQueryXml: Execute Sql from the body returning XML


<a id="documentation-for-models"></a>
## Documentation for Models

 - [AccessControlledAction](docs/AccessControlledAction.md)
 - [AccessControlledResource](docs/AccessControlledResource.md)
 - [AccessControlledResourceIdentifierPartSchemaAttribute](docs/AccessControlledResourceIdentifierPartSchemaAttribute.md)
 - [ActionId](docs/ActionId.md)
 - [AggregateFunction](docs/AggregateFunction.md)
 - [Aggregation](docs/Aggregation.md)
 - [AutoDetectType](docs/AutoDetectType.md)
 - [AvailableField](docs/AvailableField.md)
 - [AvailableParameter](docs/AvailableParameter.md)
 - [BackgroundMultiQueryProgressResponse](docs/BackgroundMultiQueryProgressResponse.md)
 - [BackgroundMultiQueryResponse](docs/BackgroundMultiQueryResponse.md)
 - [BackgroundQueryCancelResponse](docs/BackgroundQueryCancelResponse.md)
 - [BackgroundQueryProgressResponse](docs/BackgroundQueryProgressResponse.md)
 - [BackgroundQueryResponse](docs/BackgroundQueryResponse.md)
 - [BackgroundQueryState](docs/BackgroundQueryState.md)
 - [CaseStatementDesign](docs/CaseStatementDesign.md)
 - [CaseStatementItem](docs/CaseStatementItem.md)
 - [CertificateAction](docs/CertificateAction.md)
 - [CertificateFileType](docs/CertificateFileType.md)
 - [CertificateState](docs/CertificateState.md)
 - [CertificateStatus](docs/CertificateStatus.md)
 - [CertificateType](docs/CertificateType.md)
 - [Column](docs/Column.md)
 - [ColumnInfo](docs/ColumnInfo.md)
 - [ColumnStateType](docs/ColumnStateType.md)
 - [ConditionAttributes](docs/ConditionAttributes.md)
 - [ConvertToViewData](docs/ConvertToViewData.md)
 - [CursorPosition](docs/CursorPosition.md)
 - [DashboardType](docs/DashboardType.md)
 - [DataType](docs/DataType.md)
 - [DateParameters](docs/DateParameters.md)
 - [DesignJoinType](docs/DesignJoinType.md)
 - [ErrorHighlightItem](docs/ErrorHighlightItem.md)
 - [ErrorHighlightRequest](docs/ErrorHighlightRequest.md)
 - [ErrorHighlightResponse](docs/ErrorHighlightResponse.md)
 - [ExpressionWithAlias](docs/ExpressionWithAlias.md)
 - [FeedbackEventArgs](docs/FeedbackEventArgs.md)
 - [FeedbackLevel](docs/FeedbackLevel.md)
 - [FieldDesign](docs/FieldDesign.md)
 - [FieldType](docs/FieldType.md)
 - [FileReaderBuilderDef](docs/FileReaderBuilderDef.md)
 - [FileReaderBuilderResponse](docs/FileReaderBuilderResponse.md)
 - [FilterModel](docs/FilterModel.md)
 - [FilterTermDesign](docs/FilterTermDesign.md)
 - [FilterType](docs/FilterType.md)
 - [IdSelectorDefinition](docs/IdSelectorDefinition.md)
 - [InlinedPropertyDesign](docs/InlinedPropertyDesign.md)
 - [InlinedPropertyItem](docs/InlinedPropertyItem.md)
 - [IntellisenseItem](docs/IntellisenseItem.md)
 - [IntellisenseRequest](docs/IntellisenseRequest.md)
 - [IntellisenseResponse](docs/IntellisenseResponse.md)
 - [IntellisenseType](docs/IntellisenseType.md)
 - [JoinedTableDesign](docs/JoinedTableDesign.md)
 - [Link](docs/Link.md)
 - [LuminesceBinaryType](docs/LuminesceBinaryType.md)
 - [LusidGridData](docs/LusidGridData.md)
 - [LusidProblemDetails](docs/LusidProblemDetails.md)
 - [MappableField](docs/MappableField.md)
 - [MappingFlags](docs/MappingFlags.md)
 - [MultiQueryDefinitionType](docs/MultiQueryDefinitionType.md)
 - [OnClauseTermDesign](docs/OnClauseTermDesign.md)
 - [OptionsCsv](docs/OptionsCsv.md)
 - [OptionsExcel](docs/OptionsExcel.md)
 - [OptionsParquet](docs/OptionsParquet.md)
 - [OptionsSqLite](docs/OptionsSqLite.md)
 - [OptionsXml](docs/OptionsXml.md)
 - [OrderByDirection](docs/OrderByDirection.md)
 - [OrderByTermDesign](docs/OrderByTermDesign.md)
 - [QueryDesign](docs/QueryDesign.md)
 - [QueryDesignerBinaryOperator](docs/QueryDesignerBinaryOperator.md)
 - [QueryDesignerVersion](docs/QueryDesignerVersion.md)
 - [ResourceId](docs/ResourceId.md)
 - [ResourceListOfAccessControlledResource](docs/ResourceListOfAccessControlledResource.md)
 - [ScalarParameter](docs/ScalarParameter.md)
 - [Source](docs/Source.md)
 - [SourceType](docs/SourceType.md)
 - [TableMeta](docs/TableMeta.md)
 - [TableView](docs/TableView.md)
 - [TaskStatus](docs/TaskStatus.md)
 - [Type](docs/Type.md)
 - [ViewParameter](docs/ViewParameter.md)
 - [WriterDesign](docs/WriterDesign.md)

