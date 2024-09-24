<a id="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *https://fbn-prd.lusid.com/honeycomb*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ApplicationMetadataApi* | [**getServicesAsAccessControlledResources**](docs/ApplicationMetadataApi.md#getservicesasaccesscontrolledresources) | **GET** /api/metadata/access/resources | GetServicesAsAccessControlledResources: Get resources available for access control
*BinaryDownloadingApi* | [**downloadBinary**](docs/BinaryDownloadingApi.md#downloadbinary) | **GET** /api/Download/download | [EXPERIMENTAL] DownloadBinary: Download Luminesce Binaries you may run on site
*BinaryDownloadingApi* | [**getBinaryVersions**](docs/BinaryDownloadingApi.md#getbinaryversions) | **GET** /api/Download/versions | [EXPERIMENTAL] GetBinaryVersions: Lists the available versions of binaries
*CertificateManagementApi* | [**downloadCertificate**](docs/CertificateManagementApi.md#downloadcertificate) | **GET** /api/Certificate/certificate | [EXPERIMENTAL] DownloadCertificate: Download Domain or your personal certificates
*CertificateManagementApi* | [**listCertificates**](docs/CertificateManagementApi.md#listcertificates) | **GET** /api/Certificate/certificates | [EXPERIMENTAL] ListCertificates: Lists previously minted certificates
*CertificateManagementApi* | [**manageCertificate**](docs/CertificateManagementApi.md#managecertificate) | **PUT** /api/Certificate/manage | [EXPERIMENTAL] ManageCertificate: Create / Renew / Revoke a certificate
*CurrentTableFieldCatalogApi* | [**getCatalog**](docs/CurrentTableFieldCatalogApi.md#getcatalog) | **GET** /api/Catalog | GetCatalog: Flattened Table/Faield Catalog
*CurrentTableFieldCatalogApi* | [**getFields**](docs/CurrentTableFieldCatalogApi.md#getfields) | **GET** /api/Catalog/fields | GetFields: Lists field/parameter information for providers
*CurrentTableFieldCatalogApi* | [**getProviders**](docs/CurrentTableFieldCatalogApi.md#getproviders) | **GET** /api/Catalog/providers | GetProviders: Lists providers available
*HealthCheckingEndpointApi* | [**fakeNodeReclaim**](docs/HealthCheckingEndpointApi.md#fakenodereclaim) | **GET** /fakeNodeReclaim | [INTERNAL] FakeNodeReclaim: Helps testing of AWS node reclaim behaviour
*HistoricallyExecutedQueriesApi* | [**cancelHistory**](docs/HistoricallyExecutedQueriesApi.md#cancelhistory) | **DELETE** /api/History/{executionId} | CancelHistory: Cancels / Clears data from a query history search
*HistoricallyExecutedQueriesApi* | [**fetchHistoryResultHistogram**](docs/HistoricallyExecutedQueriesApi.md#fetchhistoryresulthistogram) | **GET** /api/History/{executionId}/histogram | FetchHistoryResultHistogram: Makes a histogram of results from a query history search
*HistoricallyExecutedQueriesApi* | [**fetchHistoryResultJson**](docs/HistoricallyExecutedQueriesApi.md#fetchhistoryresultjson) | **GET** /api/History/{executionId}/json | FetchHistoryResultJson: Fetches JSON results from a query history search
*HistoricallyExecutedQueriesApi* | [**getHistory**](docs/HistoricallyExecutedQueriesApi.md#gethistory) | **GET** /api/History | GetHistory: Starts a background query history search
*HistoricallyExecutedQueriesApi* | [**getProgressOfHistory**](docs/HistoricallyExecutedQueriesApi.md#getprogressofhistory) | **GET** /api/History/{executionId} | GetProgressOfHistory: View progress of a query history search
*MultiQueryExecutionApi* | [**cancelMultiQuery**](docs/MultiQueryExecutionApi.md#cancelmultiquery) | **DELETE** /api/MultiQueryBackground/{executionId} | CancelMultiQuery: Cancels / Clears a previously started query-set
*MultiQueryExecutionApi* | [**getProgressOfMultiQuery**](docs/MultiQueryExecutionApi.md#getprogressofmultiquery) | **GET** /api/MultiQueryBackground/{executionId} | GetProgressOfMultiQuery: View progress information for the entire query-set
*MultiQueryExecutionApi* | [**startQueries**](docs/MultiQueryExecutionApi.md#startqueries) | **PUT** /api/MultiQueryBackground | StartQueries: Runs a given set of Sql queries in the background
*SqlBackgroundExecutionApi* | [**cancelQuery**](docs/SqlBackgroundExecutionApi.md#cancelquery) | **DELETE** /api/SqlBackground/{executionId} | CancelQuery: Cancels / Clears data from a previously run query
*SqlBackgroundExecutionApi* | [**fetchQueryResultCsv**](docs/SqlBackgroundExecutionApi.md#fetchqueryresultcsv) | **GET** /api/SqlBackground/{executionId}/csv | FetchQueryResultCsv: Fetches the result of a query as CSV
*SqlBackgroundExecutionApi* | [**fetchQueryResultExcel**](docs/SqlBackgroundExecutionApi.md#fetchqueryresultexcel) | **GET** /api/SqlBackground/{executionId}/excel | FetchQueryResultExcel: Fetches the result of a query as an Excel file
*SqlBackgroundExecutionApi* | [**fetchQueryResultHistogram**](docs/SqlBackgroundExecutionApi.md#fetchqueryresulthistogram) | **GET** /api/SqlBackground/{executionId}/histogram | FetchQueryResultHistogram: Constructs a histogram of the result of a query
*SqlBackgroundExecutionApi* | [**fetchQueryResultJson**](docs/SqlBackgroundExecutionApi.md#fetchqueryresultjson) | **GET** /api/SqlBackground/{executionId}/json | FetchQueryResultJson: Fetches the result of a query as a JSON string
*SqlBackgroundExecutionApi* | [**fetchQueryResultJsonProper**](docs/SqlBackgroundExecutionApi.md#fetchqueryresultjsonproper) | **GET** /api/SqlBackground/{executionId}/jsonProper | FetchQueryResultJsonProper: Fetches the result of a query as JSON
*SqlBackgroundExecutionApi* | [**fetchQueryResultParquet**](docs/SqlBackgroundExecutionApi.md#fetchqueryresultparquet) | **GET** /api/SqlBackground/{executionId}/parquet | FetchQueryResultParquet: Fetches the result of a query as Parquet
*SqlBackgroundExecutionApi* | [**fetchQueryResultPipe**](docs/SqlBackgroundExecutionApi.md#fetchqueryresultpipe) | **GET** /api/SqlBackground/{executionId}/pipe | FetchQueryResultPipe: Fetches the result of a query as pipe-delimited
*SqlBackgroundExecutionApi* | [**fetchQueryResultSqlite**](docs/SqlBackgroundExecutionApi.md#fetchqueryresultsqlite) | **GET** /api/SqlBackground/{executionId}/sqlite | FetchQueryResultSqlite: Fetches the result of a query as SqLite
*SqlBackgroundExecutionApi* | [**fetchQueryResultXml**](docs/SqlBackgroundExecutionApi.md#fetchqueryresultxml) | **GET** /api/SqlBackground/{executionId}/xml | FetchQueryResultXml: Fetches the result of a query as XML
*SqlBackgroundExecutionApi* | [**getProgressOf**](docs/SqlBackgroundExecutionApi.md#getprogressof) | **GET** /api/SqlBackground/{executionId} | GetProgressOf: View progress information up until this point
*SqlBackgroundExecutionApi* | [**startQuery**](docs/SqlBackgroundExecutionApi.md#startquery) | **PUT** /api/SqlBackground | StartQuery: Starts to Execute Sql in the background
*SqlDesignApi* | [**putCaseStatementDesignSqlToDesign**](docs/SqlDesignApi.md#putcasestatementdesignsqltodesign) | **PUT** /api/Sql/tocasestatementdesign | [EXPERIMENTAL] PutCaseStatementDesignSqlToDesign: Converts SQL to a case statement design object
*SqlDesignApi* | [**putCaseStatementDesignToSql**](docs/SqlDesignApi.md#putcasestatementdesigntosql) | **PUT** /api/Sql/fromcasestatementdesign | [EXPERIMENTAL] PutCaseStatementDesignToSql: Converts a case statement design object to SQL
*SqlDesignApi* | [**putFileReadDesignToSql**](docs/SqlDesignApi.md#putfilereaddesigntosql) | **PUT** /api/Sql/fromfilereaddesign | [EXPERIMENTAL] PutFileReadDesignToSql: Makes file read SQL from a design object
*SqlDesignApi* | [**putInlinedPropertiesDesignSqlToDesign**](docs/SqlDesignApi.md#putinlinedpropertiesdesignsqltodesign) | **PUT** /api/Sql/toinlinedpropertiesdesign | [EXPERIMENTAL] PutInlinedPropertiesDesignSqlToDesign: Makes an inlined properties design from SQL
*SqlDesignApi* | [**putInlinedPropertiesDesignToSql**](docs/SqlDesignApi.md#putinlinedpropertiesdesigntosql) | **PUT** /api/Sql/frominlinedpropertiesdesign | [EXPERIMENTAL] PutInlinedPropertiesDesignToSql: Makes inlined properties SQL from a design object
*SqlDesignApi* | [**putIntellisense**](docs/SqlDesignApi.md#putintellisense) | **PUT** /api/Sql/intellisense | PutIntellisense: Makes a intellisense prompts given an SQL snip-it
*SqlDesignApi* | [**putIntellisenseError**](docs/SqlDesignApi.md#putintellisenseerror) | **PUT** /api/Sql/intellisenseError | PutIntellisenseError: Expresses error ranges from SQL
*SqlDesignApi* | [**putQueryDesignToSql**](docs/SqlDesignApi.md#putquerydesigntosql) | **PUT** /api/Sql/fromdesign | [EXPERIMENTAL] PutQueryDesignToSql: Makes SQL from a structured query design
*SqlDesignApi* | [**putQueryToFormat**](docs/SqlDesignApi.md#putquerytoformat) | **PUT** /api/Sql/pretty | PutQueryToFormat: Formats SQL into a more readable form
*SqlDesignApi* | [**putSqlToExtractScalarParameters**](docs/SqlDesignApi.md#putsqltoextractscalarparameters) | **PUT** /api/Sql/extractscalarparameters | [EXPERIMENTAL] PutSqlToExtractScalarParameters: Extracts scalar parameter information from SQL
*SqlDesignApi* | [**putSqlToFileReadDesign**](docs/SqlDesignApi.md#putsqltofilereaddesign) | **PUT** /api/Sql/tofilereaddesign | [EXPERIMENTAL] PutSqlToFileReadDesign: Makes a design object from file-read SQL
*SqlDesignApi* | [**putSqlToQueryDesign**](docs/SqlDesignApi.md#putsqltoquerydesign) | **PUT** /api/Sql/todesign | [EXPERIMENTAL] PutSqlToQueryDesign: Makes a SQL-design object from SQL if possible
*SqlDesignApi* | [**putSqlToViewDesign**](docs/SqlDesignApi.md#putsqltoviewdesign) | **PUT** /api/Sql/toviewdesign | [EXPERIMENTAL] PutSqlToViewDesign: Makes a view-design from view creation SQL
*SqlDesignApi* | [**putSqlToWriterDesign**](docs/SqlDesignApi.md#putsqltowriterdesign) | **PUT** /api/Sql/towriterdesign | [EXPERIMENTAL] PutSqlToWriterDesign: Makes a SQL-writer-design object from SQL
*SqlDesignApi* | [**putViewDesignToSql**](docs/SqlDesignApi.md#putviewdesigntosql) | **PUT** /api/Sql/fromviewdesign | [EXPERIMENTAL] PutViewDesignToSql: Makes view creation sql from a view-design
*SqlDesignApi* | [**putWriterDesignToSql**](docs/SqlDesignApi.md#putwriterdesigntosql) | **PUT** /api/Sql/fromwriterdesign | [EXPERIMENTAL] PutWriterDesignToSql: Makes writer SQL from a writer-design object
*SqlExecutionApi* | [**getByQueryCsv**](docs/SqlExecutionApi.md#getbyquerycsv) | **GET** /api/Sql/csv/{query} | GetByQueryCsv: Executes Sql from the url returning CSV
*SqlExecutionApi* | [**getByQueryExcel**](docs/SqlExecutionApi.md#getbyqueryexcel) | **GET** /api/Sql/excel/{query} | GetByQueryExcel: Executes Sql from the url returning an Excel file
*SqlExecutionApi* | [**getByQueryJson**](docs/SqlExecutionApi.md#getbyqueryjson) | **GET** /api/Sql/json/{query} | GetByQueryJson: Executes Sql from the url returning JSON
*SqlExecutionApi* | [**getByQueryParquet**](docs/SqlExecutionApi.md#getbyqueryparquet) | **GET** /api/Sql/parquet/{query} | GetByQueryParquet: Executes Sql from the url returning a Parquet file
*SqlExecutionApi* | [**getByQueryPipe**](docs/SqlExecutionApi.md#getbyquerypipe) | **GET** /api/Sql/pipe/{query} | GetByQueryPipe: Executes Sql from the url returning pipe-delimited
*SqlExecutionApi* | [**getByQuerySqlite**](docs/SqlExecutionApi.md#getbyquerysqlite) | **GET** /api/Sql/sqlite/{query} | GetByQuerySqlite: Executes Sql from the url returning SqLite DB
*SqlExecutionApi* | [**getByQueryXml**](docs/SqlExecutionApi.md#getbyqueryxml) | **GET** /api/Sql/xml/{query} | GetByQueryXml: Executes Sql from the url returning XML
*SqlExecutionApi* | [**putByQueryCsv**](docs/SqlExecutionApi.md#putbyquerycsv) | **PUT** /api/Sql/csv | PutByQueryCsv: Executes Sql from the body returning CSV
*SqlExecutionApi* | [**putByQueryExcel**](docs/SqlExecutionApi.md#putbyqueryexcel) | **PUT** /api/Sql/excel | PutByQueryExcel: Executes Sql from the body making an Excel file
*SqlExecutionApi* | [**putByQueryJson**](docs/SqlExecutionApi.md#putbyqueryjson) | **PUT** /api/Sql/json | PutByQueryJson: Executes Sql from the body returning JSON
*SqlExecutionApi* | [**putByQueryParquet**](docs/SqlExecutionApi.md#putbyqueryparquet) | **PUT** /api/Sql/parquet | PutByQueryParquet: Executes Sql from the body making a Parquet file
*SqlExecutionApi* | [**putByQueryPipe**](docs/SqlExecutionApi.md#putbyquerypipe) | **PUT** /api/Sql/pipe | PutByQueryPipe: Executes Sql from the body making pipe-delimited
*SqlExecutionApi* | [**putByQuerySqlite**](docs/SqlExecutionApi.md#putbyquerysqlite) | **PUT** /api/Sql/sqlite | PutByQuerySqlite: Executes Sql from the body returning SqLite DB
*SqlExecutionApi* | [**putByQueryXml**](docs/SqlExecutionApi.md#putbyqueryxml) | **PUT** /api/Sql/xml | PutByQueryXml: Executes Sql from the body returning XML


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
 - [ConditionAttributes](docs/ConditionAttributes.md)
 - [ConvertToViewData](docs/ConvertToViewData.md)
 - [CursorPosition](docs/CursorPosition.md)
 - [DataType](docs/DataType.md)
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
 - [FilterTermDesign](docs/FilterTermDesign.md)
 - [IdSelectorDefinition](docs/IdSelectorDefinition.md)
 - [InlinedPropertyDesign](docs/InlinedPropertyDesign.md)
 - [InlinedPropertyItem](docs/InlinedPropertyItem.md)
 - [IntellisenseItem](docs/IntellisenseItem.md)
 - [IntellisenseRequest](docs/IntellisenseRequest.md)
 - [IntellisenseResponse](docs/IntellisenseResponse.md)
 - [IntellisenseType](docs/IntellisenseType.md)
 - [Link](docs/Link.md)
 - [LuminesceBinaryType](docs/LuminesceBinaryType.md)
 - [LusidProblemDetails](docs/LusidProblemDetails.md)
 - [MappableField](docs/MappableField.md)
 - [MappingFlags](docs/MappingFlags.md)
 - [MultiQueryDefinitionType](docs/MultiQueryDefinitionType.md)
 - [OptionsCsv](docs/OptionsCsv.md)
 - [OptionsExcel](docs/OptionsExcel.md)
 - [OptionsParquet](docs/OptionsParquet.md)
 - [OptionsSqLite](docs/OptionsSqLite.md)
 - [OptionsXml](docs/OptionsXml.md)
 - [OrderByDirection](docs/OrderByDirection.md)
 - [OrderByTermDesign](docs/OrderByTermDesign.md)
 - [QueryDesign](docs/QueryDesign.md)
 - [QueryDesignerBinaryOperator](docs/QueryDesignerBinaryOperator.md)
 - [ResourceListOfAccessControlledResource](docs/ResourceListOfAccessControlledResource.md)
 - [ScalarParameter](docs/ScalarParameter.md)
 - [Source](docs/Source.md)
 - [SourceType](docs/SourceType.md)
 - [TaskStatus](docs/TaskStatus.md)
 - [ViewParameter](docs/ViewParameter.md)
 - [WriterDesign](docs/WriterDesign.md)

