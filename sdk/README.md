<a id="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *https://fbn-prd.lusid.com/honeycomb*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ApplicationMetadataApi* | [**getServicesAsAccessControlledResources**](docs/ApplicationMetadataApi.md#getservicesasaccesscontrolledresources) | **GET** /api/metadata/access/resources | GetServicesAsAccessControlledResources: Get resources available for access control
*BinaryDownloadingApi* | [**downloadBinary**](docs/BinaryDownloadingApi.md#downloadbinary) | **GET** /api/Download/download | [EXPERIMENTAL] DownloadBinary: Downloads the latest version (or specific if needs be) of the specified Luminesce Binary, given the required entitlements.
*BinaryDownloadingApi* | [**getBinaryVersions**](docs/BinaryDownloadingApi.md#getbinaryversions) | **GET** /api/Download/versions | [EXPERIMENTAL] GetBinaryVersions: Gets the list of available versions of a user-downloadable binary from Nexus
*CertificateManagementApi* | [**downloadCertificate**](docs/CertificateManagementApi.md#downloadcertificate) | **GET** /api/Certificate/certificate | [EXPERIMENTAL] DownloadCertificate: Downloads your latest Domain or User certificate's public or private key - if any
*CertificateManagementApi* | [**listCertificates**](docs/CertificateManagementApi.md#listcertificates) | **GET** /api/Certificate/certificates | [EXPERIMENTAL] ListCertificates: Lists all the certificates previously minted to which you have access
*CertificateManagementApi* | [**manageCertificate**](docs/CertificateManagementApi.md#managecertificate) | **PUT** /api/Certificate/manage | [EXPERIMENTAL] ManageCertificate: Manages a new certificate (Create / Renew / Revoke)
*CurrentTableFieldCatalogApi* | [**getCatalog**](docs/CurrentTableFieldCatalogApi.md#getcatalog) | **GET** /api/Catalog | GetCatalog: Shows Table and Field level information on Providers that are currently running that you have access to (in Json format)
*CurrentTableFieldCatalogApi* | [**getFields**](docs/CurrentTableFieldCatalogApi.md#getfields) | **GET** /api/Catalog/fields | GetFields: Shows Table level information on Providers that are currently running that you have access to (in Json format)
*CurrentTableFieldCatalogApi* | [**getProviders**](docs/CurrentTableFieldCatalogApi.md#getproviders) | **GET** /api/Catalog/providers | GetProviders: Shows Table level information on Providers that are currently running that you have access to (in Json format)
*HealthCheckingEndpointApi* | [**fakeNodeReclaim**](docs/HealthCheckingEndpointApi.md#fakenodereclaim) | **GET** /fakeNodeReclaim | [INTERNAL] FakeNodeReclaim: An internal Method used to mark the next SIGTERM as though an Aws Node reclaim were about to take place.
*HistoricallyExecutedQueriesApi* | [**cancelHistory**](docs/HistoricallyExecutedQueriesApi.md#cancelhistory) | **DELETE** /api/History/{executionId} | CancelHistory: Cancels (if running) or clears the data from (if completed) a previously started History query
*HistoricallyExecutedQueriesApi* | [**fetchHistoryResultHistogram**](docs/HistoricallyExecutedQueriesApi.md#fetchhistoryresulthistogram) | **GET** /api/History/{executionId}/histogram | FetchHistoryResultHistogram: Fetches the result from a previously started query, converts it to a histogram (counts in buckets).
*HistoricallyExecutedQueriesApi* | [**fetchHistoryResultJson**](docs/HistoricallyExecutedQueriesApi.md#fetchhistoryresultjson) | **GET** /api/History/{executionId}/json | FetchHistoryResultJson: Fetches the result from a previously started query, in JSON format.
*HistoricallyExecutedQueriesApi* | [**getHistory**](docs/HistoricallyExecutedQueriesApi.md#gethistory) | **GET** /api/History | GetHistory: Shows queries executed in a given historical time window (in Json format).
*HistoricallyExecutedQueriesApi* | [**getProgressOfHistory**](docs/HistoricallyExecutedQueriesApi.md#getprogressofhistory) | **GET** /api/History/{executionId} | GetProgressOfHistory: View progress information (up until this point) of a history query
*MultiQueryExecutionApi* | [**cancelMultiQuery**](docs/MultiQueryExecutionApi.md#cancelmultiquery) | **DELETE** /api/MultiQueryBackground/{executionId} | CancelMultiQuery: Cancels (if running) or clears the data from (if completed) a previously started query-set
*MultiQueryExecutionApi* | [**getProgressOfMultiQuery**](docs/MultiQueryExecutionApi.md#getprogressofmultiquery) | **GET** /api/MultiQueryBackground/{executionId} | GetProgressOfMultiQuery: View progress information (up until this point) for the entire query-set
*MultiQueryExecutionApi* | [**startQueries**](docs/MultiQueryExecutionApi.md#startqueries) | **PUT** /api/MultiQueryBackground | StartQueries: Starts to Execute the LuminesceSql statements in the background.
*SqlBackgroundExecutionApi* | [**cancelQuery**](docs/SqlBackgroundExecutionApi.md#cancelquery) | **DELETE** /api/SqlBackground/{executionId} | CancelQuery: Cancels (if running) or clears the data from (if completed) a previously started query
*SqlBackgroundExecutionApi* | [**fetchQueryResultCsv**](docs/SqlBackgroundExecutionApi.md#fetchqueryresultcsv) | **GET** /api/SqlBackground/{executionId}/csv | FetchQueryResultCsv: Fetches the result from a previously started query, in CSV format.
*SqlBackgroundExecutionApi* | [**fetchQueryResultExcel**](docs/SqlBackgroundExecutionApi.md#fetchqueryresultexcel) | **GET** /api/SqlBackground/{executionId}/excel | FetchQueryResultExcel: Fetches the result from a previously started query, in Excel format.
*SqlBackgroundExecutionApi* | [**fetchQueryResultHistogram**](docs/SqlBackgroundExecutionApi.md#fetchqueryresulthistogram) | **GET** /api/SqlBackground/{executionId}/histogram | FetchQueryResultHistogram: Fetches the result from a previously started query, converts it to a histogram (counts in buckets).
*SqlBackgroundExecutionApi* | [**fetchQueryResultJson**](docs/SqlBackgroundExecutionApi.md#fetchqueryresultjson) | **GET** /api/SqlBackground/{executionId}/json | FetchQueryResultJson: Fetches the result from a previously started query, in JSON string format.  Please move to '/jsonProper' instead. This may be marked as Deprecated in the future.
*SqlBackgroundExecutionApi* | [**fetchQueryResultJsonProper**](docs/SqlBackgroundExecutionApi.md#fetchqueryresultjsonproper) | **GET** /api/SqlBackground/{executionId}/jsonProper | FetchQueryResultJsonProper: Fetches the result from a previously started query, in JSON format.
*SqlBackgroundExecutionApi* | [**fetchQueryResultParquet**](docs/SqlBackgroundExecutionApi.md#fetchqueryresultparquet) | **GET** /api/SqlBackground/{executionId}/parquet | FetchQueryResultParquet: Fetches the result from a previously started query, in Parquet format.
*SqlBackgroundExecutionApi* | [**fetchQueryResultPipe**](docs/SqlBackgroundExecutionApi.md#fetchqueryresultpipe) | **GET** /api/SqlBackground/{executionId}/pipe | FetchQueryResultPipe: Fetches the result from a previously started query, in pipe-delimited format.
*SqlBackgroundExecutionApi* | [**fetchQueryResultSqlite**](docs/SqlBackgroundExecutionApi.md#fetchqueryresultsqlite) | **GET** /api/SqlBackground/{executionId}/sqlite | FetchQueryResultSqlite: Fetches the result from a previously started query, in SqLite format.
*SqlBackgroundExecutionApi* | [**fetchQueryResultXml**](docs/SqlBackgroundExecutionApi.md#fetchqueryresultxml) | **GET** /api/SqlBackground/{executionId}/xml | FetchQueryResultXml: Fetches the result from a previously started query, in Xml format.
*SqlBackgroundExecutionApi* | [**getProgressOf**](docs/SqlBackgroundExecutionApi.md#getprogressof) | **GET** /api/SqlBackground/{executionId} | GetProgressOf: View progress information (up until this point)
*SqlBackgroundExecutionApi* | [**startQuery**](docs/SqlBackgroundExecutionApi.md#startquery) | **PUT** /api/SqlBackground | StartQuery: Starts to Execute LuminesceSql in the background.
*SqlDesignApi* | [**putCaseStatementDesignSqlToDesign**](docs/SqlDesignApi.md#putcasestatementdesignsqltodesign) | **PUT** /api/Sql/tocasestatementdesign | [EXPERIMENTAL] PutCaseStatementDesignSqlToDesign: Converts SQL queries to a CaseStatementDesign object.
*SqlDesignApi* | [**putCaseStatementDesignToSql**](docs/SqlDesignApi.md#putcasestatementdesigntosql) | **PUT** /api/Sql/fromcasestatementdesign | [EXPERIMENTAL] PutCaseStatementDesignToSql: Generates SQL case statement queries from a structured design
*SqlDesignApi* | [**putFileReadDesignToSql**](docs/SqlDesignApi.md#putfilereaddesigntosql) | **PUT** /api/Sql/fromfilereaddesign | [EXPERIMENTAL] PutFileReadDesignToSql: Generates file read SQL from a structured query design
*SqlDesignApi* | [**putInlinedPropertiesDesignSqlToDesign**](docs/SqlDesignApi.md#putinlinedpropertiesdesignsqltodesign) | **PUT** /api/Sql/toinlinedpropertiesdesign | [EXPERIMENTAL] PutInlinedPropertiesDesignSqlToDesign: Generates a SQL-inlined-properties-design object from SQL string, if possible.
*SqlDesignApi* | [**putInlinedPropertiesDesignToSql**](docs/SqlDesignApi.md#putinlinedpropertiesdesigntosql) | **PUT** /api/Sql/frominlinedpropertiesdesign | [EXPERIMENTAL] PutInlinedPropertiesDesignToSql: Generates inlined properties SQL from a structured design
*SqlDesignApi* | [**putIntellisense**](docs/SqlDesignApi.md#putintellisense) | **PUT** /api/Sql/intellisense | PutIntellisense: Generate a set of possible intellisense prompts given a SQL snip-it (in need not yet be valid) and cursor location
*SqlDesignApi* | [**putIntellisenseError**](docs/SqlDesignApi.md#putintellisenseerror) | **PUT** /api/Sql/intellisenseError | PutIntellisenseError: Generate a set of error ranges, if any, in the given SQL (expressed as Lines)
*SqlDesignApi* | [**putQueryDesignToSql**](docs/SqlDesignApi.md#putquerydesigntosql) | **PUT** /api/Sql/fromdesign | [EXPERIMENTAL] PutQueryDesignToSql: Generates SQL from a structured query design
*SqlDesignApi* | [**putQueryToFormat**](docs/SqlDesignApi.md#putquerytoformat) | **PUT** /api/Sql/pretty | PutQueryToFormat: Formats SQL into a more readable form, a.k.a. Pretty-Print the SQL.
*SqlDesignApi* | [**putSqlToExtractScalarParameters**](docs/SqlDesignApi.md#putsqltoextractscalarparameters) | **PUT** /api/Sql/extractscalarparameters | [EXPERIMENTAL] PutSqlToExtractScalarParameters: Generates information about all the scalar parameters defined in the given SQL statement
*SqlDesignApi* | [**putSqlToFileReadDesign**](docs/SqlDesignApi.md#putsqltofilereaddesign) | **PUT** /api/Sql/tofilereaddesign | [EXPERIMENTAL] PutSqlToFileReadDesign: Generates a SQL-file-read-design object from SQL string, if possible.
*SqlDesignApi* | [**putSqlToQueryDesign**](docs/SqlDesignApi.md#putsqltoquerydesign) | **PUT** /api/Sql/todesign | [EXPERIMENTAL] PutSqlToQueryDesign: Generates a SQL-design object from SQL string, if possible.
*SqlDesignApi* | [**putSqlToViewDesign**](docs/SqlDesignApi.md#putsqltoviewdesign) | **PUT** /api/Sql/toviewdesign | [EXPERIMENTAL] PutSqlToViewDesign: Generates a structured view creation design from existing view creation SQL.
*SqlDesignApi* | [**putSqlToWriterDesign**](docs/SqlDesignApi.md#putsqltowriterdesign) | **PUT** /api/Sql/towriterdesign | [EXPERIMENTAL] PutSqlToWriterDesign: Generates a SQL-writer-design object from SQL string, if possible.
*SqlDesignApi* | [**putViewDesignToSql**](docs/SqlDesignApi.md#putviewdesigntosql) | **PUT** /api/Sql/fromviewdesign | [EXPERIMENTAL] PutViewDesignToSql: Generates view creation sql from a structured view creation design
*SqlDesignApi* | [**putWriterDesignToSql**](docs/SqlDesignApi.md#putwriterdesigntosql) | **PUT** /api/Sql/fromwriterdesign | [EXPERIMENTAL] PutWriterDesignToSql: Generates writer SQL from a valid writer-design structure
*SqlExecutionApi* | [**getByQueryCsv**](docs/SqlExecutionApi.md#getbyquerycsv) | **GET** /api/Sql/csv/{query} | GetByQueryCsv: Executes Sql, returned in CSV format, where the sql is simply in the url.
*SqlExecutionApi* | [**getByQueryExcel**](docs/SqlExecutionApi.md#getbyqueryexcel) | **GET** /api/Sql/excel/{query} | GetByQueryExcel: Executes Sql, returned in Excel (xlsx) format (as a file to be downloaded) format, where the sql is simply in the url.
*SqlExecutionApi* | [**getByQueryJson**](docs/SqlExecutionApi.md#getbyqueryjson) | **GET** /api/Sql/json/{query} | GetByQueryJson: Executes Sql, returned in JSON format, where the sql is simply in the url.
*SqlExecutionApi* | [**getByQueryParquet**](docs/SqlExecutionApi.md#getbyqueryparquet) | **GET** /api/Sql/parquet/{query} | GetByQueryParquet: Executes Sql, returned in Parquet (.parquet) format (as a file to be downloaded) format, where the sql is simply in the url.
*SqlExecutionApi* | [**getByQueryPipe**](docs/SqlExecutionApi.md#getbyquerypipe) | **GET** /api/Sql/pipe/{query} | GetByQueryPipe: Executes Sql, returned in pipe-delimited format, where the sql is simply in the url.
*SqlExecutionApi* | [**getByQuerySqlite**](docs/SqlExecutionApi.md#getbyquerysqlite) | **GET** /api/Sql/sqlite/{query} | GetByQuerySqlite: Executes Sql, returned in SqLite DB (sqlite3) format (as a file to be downloaded) format, where the sql is simply in the url.
*SqlExecutionApi* | [**getByQueryXml**](docs/SqlExecutionApi.md#getbyqueryxml) | **GET** /api/Sql/xml/{query} | GetByQueryXml: Executes Sql, returned in Xml format, where the sql is simply in the url.
*SqlExecutionApi* | [**putByQueryCsv**](docs/SqlExecutionApi.md#putbyquerycsv) | **PUT** /api/Sql/csv | PutByQueryCsv: Executes Sql, returned in CSV format, where the sql is the post-body url.
*SqlExecutionApi* | [**putByQueryExcel**](docs/SqlExecutionApi.md#putbyqueryexcel) | **PUT** /api/Sql/excel | PutByQueryExcel: Executes Sql, returned in Excel (xlsx) format (as a file to be downloaded), where the sql is the post-body url.
*SqlExecutionApi* | [**putByQueryJson**](docs/SqlExecutionApi.md#putbyqueryjson) | **PUT** /api/Sql/json | PutByQueryJson: Executes Sql, returned in JSON format, where the sql is the post-body url.
*SqlExecutionApi* | [**putByQueryParquet**](docs/SqlExecutionApi.md#putbyqueryparquet) | **PUT** /api/Sql/parquet | PutByQueryParquet: Executes Sql, returned in Parquet format, where the sql is the post-body url.
*SqlExecutionApi* | [**putByQueryPipe**](docs/SqlExecutionApi.md#putbyquerypipe) | **PUT** /api/Sql/pipe | PutByQueryPipe: Executes Sql, returned in pipe-delimited format, where the sql is the post-body url.
*SqlExecutionApi* | [**putByQuerySqlite**](docs/SqlExecutionApi.md#putbyquerysqlite) | **PUT** /api/Sql/sqlite | PutByQuerySqlite: Executes Sql, returned in SqLite DB (sqlite3) format (as a file to be downloaded), where the sql is the post-body url.
*SqlExecutionApi* | [**putByQueryXml**](docs/SqlExecutionApi.md#putbyqueryxml) | **PUT** /api/Sql/xml | PutByQueryXml: Executes Sql, returned in Xml format, where the sql is the post-body url.


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

