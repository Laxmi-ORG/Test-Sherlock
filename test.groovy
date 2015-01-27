2015-01-27 11:49:46.065::INFO:  Logging to STDERR via org.mortbay.log.StdErrLog
2015-01-27 11:49:46.207::INFO:  jetty-6.1.3
2015-01-27 11:49:46.276::INFO:  Extract jar:file:/vagrant/target/work/solr-home/webapps/solr.war!/ to /tmp/Jetty_0_0_0_0_8983_solr.war__solr__k1kf17/webapp
Jan 27, 2015 11:49:46 AM org.apache.solr.core.SolrResourceLoader locateSolrHome
INFO: JNDI not configured for solr (NoInitialContextEx)
Jan 27, 2015 11:49:46 AM org.apache.solr.core.SolrResourceLoader locateSolrHome
INFO: solr home defaulted to 'solr/' (could not find system property or JNDI)
Jan 27, 2015 11:49:46 AM org.apache.solr.core.SolrResourceLoader <init>
INFO: Solr home set to 'solr/'
Jan 27, 2015 11:49:46 AM org.apache.solr.servlet.SolrDispatchFilter init
INFO: SolrDispatchFilter.init()
Jan 27, 2015 11:49:46 AM org.apache.solr.core.SolrResourceLoader locateSolrHome
INFO: JNDI not configured for solr (NoInitialContextEx)
Jan 27, 2015 11:49:46 AM org.apache.solr.core.SolrResourceLoader locateSolrHome
INFO: solr home defaulted to 'solr/' (could not find system property or JNDI)
Jan 27, 2015 11:49:46 AM org.apache.solr.core.CoreContainer$Initializer initialize
INFO: looking for solr.xml: /vagrant/target/work/solr-home/solr/solr.xml
Jan 27, 2015 11:49:46 AM org.apache.solr.core.SolrResourceLoader <init>
INFO: Solr home set to 'solr/'
Jan 27, 2015 11:49:46 AM org.apache.solr.core.SolrConfig initLibs
INFO: Adding specified lib dirs to ClassLoader
Jan 27, 2015 11:49:47 AM org.apache.solr.core.SolrConfig <init>
INFO: Loaded SolrConfig: solrconfig.xml
Jan 27, 2015 11:49:47 AM org.apache.solr.core.SolrCore <init>
INFO: Opening new SolrCore at solr/, dataDir=./solr/data/
Jan 27, 2015 11:49:47 AM org.apache.solr.schema.IndexSchema readSchema
INFO: Reading Solr Schema
Jan 27, 2015 11:49:47 AM org.apache.solr.schema.IndexSchema readSchema
INFO: Schema name=example
Jan 27, 2015 11:49:47 AM org.apache.solr.util.plugin.AbstractPluginLoader load
INFO: created string: org.apache.solr.schema.StrField
Jan 27, 2015 11:49:47 AM org.apache.solr.util.plugin.AbstractPluginLoader load
INFO: created boolean: org.apache.solr.schema.BoolField
Jan 27, 2015 11:49:47 AM org.apache.solr.util.plugin.AbstractPluginLoader load
INFO: created binary: org.apache.solr.schema.BinaryField
Jan 27, 2015 11:49:47 AM org.apache.solr.util.plugin.AbstractPluginLoader load
INFO: created int: org.apache.solr.schema.TrieIntField
Jan 27, 2015 11:49:47 AM org.apache.solr.util.plugin.AbstractPluginLoader load
INFO: created float: org.apache.solr.schema.TrieFloatField
Jan 27, 2015 11:49:47 AM org.apache.solr.util.plugin.AbstractPluginLoader load
INFO: created long: org.apache.solr.schema.TrieLongField
Jan 27, 2015 11:49:47 AM org.apache.solr.util.plugin.AbstractPluginLoader load
INFO: created double: org.apache.solr.schema.TrieDoubleField
Jan 27, 2015 11:49:47 AM org.apache.solr.util.plugin.AbstractPluginLoader load
INFO: created tint: org.apache.solr.schema.TrieIntField
Jan 27, 2015 11:49:47 AM org.apache.solr.util.plugin.AbstractPluginLoader load
INFO: created tfloat: org.apache.solr.schema.TrieFloatField
Jan 27, 2015 11:49:47 AM org.apache.solr.util.plugin.AbstractPluginLoader load
INFO: created tlong: org.apache.solr.schema.TrieLongField
Jan 27, 2015 11:49:47 AM org.apache.solr.util.plugin.AbstractPluginLoader load
INFO: created tdouble: org.apache.solr.schema.TrieDoubleField
Jan 27, 2015 11:49:47 AM org.apache.solr.util.plugin.AbstractPluginLoader load
INFO: created date: org.apache.solr.schema.TrieDateField
Jan 27, 2015 11:49:47 AM org.apache.solr.util.plugin.AbstractPluginLoader load
INFO: created tdate: org.apache.solr.schema.TrieDateField
Jan 27, 2015 11:49:47 AM org.apache.solr.util.plugin.AbstractPluginLoader load
INFO: created pint: org.apache.solr.schema.IntField
Jan 27, 2015 11:49:47 AM org.apache.solr.util.plugin.AbstractPluginLoader load
INFO: created plong: org.apache.solr.schema.LongField
Jan 27, 2015 11:49:47 AM org.apache.solr.util.plugin.AbstractPluginLoader load
INFO: created pfloat: org.apache.solr.schema.FloatField
Jan 27, 2015 11:49:47 AM org.apache.solr.util.plugin.AbstractPluginLoader load
INFO: created pdouble: org.apache.solr.schema.DoubleField
Jan 27, 2015 11:49:47 AM org.apache.solr.util.plugin.AbstractPluginLoader load
INFO: created pdate: org.apache.solr.schema.DateField
Jan 27, 2015 11:49:47 AM org.apache.solr.util.plugin.AbstractPluginLoader load
INFO: created sint: org.apache.solr.schema.SortableIntField
Jan 27, 2015 11:49:47 AM org.apache.solr.util.plugin.AbstractPluginLoader load
INFO: created slong: org.apache.solr.schema.SortableLongField
Jan 27, 2015 11:49:47 AM org.apache.solr.util.plugin.AbstractPluginLoader load
INFO: created sfloat: org.apache.solr.schema.SortableFloatField
Jan 27, 2015 11:49:47 AM org.apache.solr.util.plugin.AbstractPluginLoader load
INFO: created sdouble: org.apache.solr.schema.SortableDoubleField
Jan 27, 2015 11:49:47 AM org.apache.solr.util.plugin.AbstractPluginLoader load
INFO: created random: org.apache.solr.schema.RandomSortField
Jan 27, 2015 11:49:47 AM org.apache.solr.util.plugin.AbstractPluginLoader load
INFO: created null: org.apache.solr.analysis.WhitespaceTokenizerFactory
Jan 27, 2015 11:49:47 AM org.apache.solr.util.plugin.AbstractPluginLoader load
INFO: created text_ws: org.apache.solr.schema.TextField
Jan 27, 2015 11:49:47 AM org.apache.solr.util.plugin.AbstractPluginLoader load
INFO: created null: org.apache.solr.analysis.WhitespaceTokenizerFactory
Jan 27, 2015 11:49:47 AM org.apache.solr.util.plugin.AbstractPluginLoader load
INFO: created null: org.apache.solr.analysis.SynonymFilterFactory
Jan 27, 2015 11:49:47 AM org.apache.solr.util.plugin.AbstractPluginLoader load
INFO: created null: org.apache.solr.analysis.StopFilterFactory
Jan 27, 2015 11:49:47 AM org.apache.solr.util.plugin.AbstractPluginLoader load
INFO: created null: org.apache.solr.analysis.WordDelimiterFilterFactory
Jan 27, 2015 11:49:47 AM org.apache.solr.util.plugin.AbstractPluginLoader load
INFO: created null: org.apache.solr.analysis.LowerCaseFilterFactory
Jan 27, 2015 11:49:47 AM org.apache.solr.util.plugin.AbstractPluginLoader load
INFO: created null: org.apache.solr.analysis.SnowballPorterFilterFactory
Jan 27, 2015 11:49:47 AM org.apache.solr.util.plugin.AbstractPluginLoader load
INFO: created null: org.apache.solr.analysis.WhitespaceTokenizerFactory
Jan 27, 2015 11:49:47 AM org.apache.solr.util.plugin.AbstractPluginLoader load
INFO: created null: org.apache.solr.analysis.StopFilterFactory
Jan 27, 2015 11:49:47 AM org.apache.solr.util.plugin.AbstractPluginLoader load
INFO: created null: org.apache.solr.analysis.WordDelimiterFilterFactory
Jan 27, 2015 11:49:47 AM org.apache.solr.util.plugin.AbstractPluginLoader load
INFO: created null: org.apache.solr.analysis.LowerCaseFilterFactory
Jan 27, 2015 11:49:47 AM org.apache.solr.util.plugin.AbstractPluginLoader load
INFO: created null: org.apache.solr.analysis.SnowballPorterFilterFactory
Jan 27, 2015 11:49:47 AM org.apache.solr.util.plugin.AbstractPluginLoader load
INFO: created text: org.apache.solr.schema.TextField
Jan 27, 2015 11:49:47 AM org.apache.solr.util.plugin.AbstractPluginLoader load
INFO: created null: org.apache.solr.analysis.WhitespaceTokenizerFactory
Jan 27, 2015 11:49:47 AM org.apache.solr.util.plugin.AbstractPluginLoader load
INFO: created null: org.apache.solr.analysis.SynonymFilterFactory
Jan 27, 2015 11:49:47 AM org.apache.solr.util.plugin.AbstractPluginLoader load
INFO: created null: org.apache.solr.analysis.StopFilterFactory
Jan 27, 2015 11:49:47 AM org.apache.solr.util.plugin.AbstractPluginLoader load
INFO: created null: org.apache.solr.analysis.WordDelimiterFilterFactory
Jan 27, 2015 11:49:47 AM org.apache.solr.util.plugin.AbstractPluginLoader load
INFO: created null: org.apache.solr.analysis.LowerCaseFilterFactory
Jan 27, 2015 11:49:47 AM org.apache.solr.util.plugin.AbstractPluginLoader load
INFO: created null: org.apache.solr.analysis.SnowballPorterFilterFactory
Jan 27, 2015 11:49:47 AM org.apache.solr.util.plugin.AbstractPluginLoader load
INFO: created null: org.apache.solr.analysis.RemoveDuplicatesTokenFilterFactory
Jan 27, 2015 11:49:47 AM org.apache.solr.util.plugin.AbstractPluginLoader load
INFO: created textTight: org.apache.solr.schema.TextField
Jan 27, 2015 11:49:47 AM org.apache.solr.util.plugin.AbstractPluginLoader load
INFO: created null: org.apache.solr.analysis.WhitespaceTokenizerFactory
Jan 27, 2015 11:49:47 AM org.apache.solr.util.plugin.AbstractPluginLoader load
INFO: created null: org.apache.solr.analysis.SynonymFilterFactory
Jan 27, 2015 11:49:47 AM org.apache.solr.util.plugin.AbstractPluginLoader load
INFO: created null: org.apache.solr.analysis.StopFilterFactory
Jan 27, 2015 11:49:47 AM org.apache.solr.util.plugin.AbstractPluginLoader load
INFO: created null: org.apache.solr.analysis.WordDelimiterFilterFactory
Jan 27, 2015 11:49:47 AM org.apache.solr.util.plugin.AbstractPluginLoader load
INFO: created null: org.apache.solr.analysis.LowerCaseFilterFactory
Jan 27, 2015 11:49:47 AM org.apache.solr.util.plugin.AbstractPluginLoader load
INFO: created null: org.apache.solr.analysis.WhitespaceTokenizerFactory
Jan 27, 2015 11:49:47 AM org.apache.solr.util.plugin.AbstractPluginLoader load
INFO: created null: org.apache.solr.analysis.StopFilterFactory
Jan 27, 2015 11:49:47 AM org.apache.solr.util.plugin.AbstractPluginLoader load
INFO: created null: org.apache.solr.analysis.WordDelimiterFilterFactory
Jan 27, 2015 11:49:47 AM org.apache.solr.util.plugin.AbstractPluginLoader load
INFO: created null: org.apache.solr.analysis.LowerCaseFilterFactory
Jan 27, 2015 11:49:47 AM org.apache.solr.util.plugin.AbstractPluginLoader load
INFO: created textgen: org.apache.solr.schema.TextField
Jan 27, 2015 11:49:47 AM org.apache.solr.util.plugin.AbstractPluginLoader load
INFO: created null: org.apache.solr.analysis.WhitespaceTokenizerFactory
Jan 27, 2015 11:49:47 AM org.apache.solr.util.plugin.AbstractPluginLoader load
INFO: created null: org.apache.solr.analysis.SynonymFilterFactory
Jan 27, 2015 11:49:47 AM org.apache.solr.util.plugin.AbstractPluginLoader load
INFO: created null: org.apache.solr.analysis.StopFilterFactory
Jan 27, 2015 11:49:47 AM org.apache.solr.util.plugin.AbstractPluginLoader load
INFO: created null: org.apache.solr.analysis.WordDelimiterFilterFactory
Jan 27, 2015 11:49:47 AM org.apache.solr.util.plugin.AbstractPluginLoader load
INFO: created null: org.apache.solr.analysis.LowerCaseFilterFactory
Jan 27, 2015 11:49:47 AM org.apache.solr.util.plugin.AbstractPluginLoader load
INFO: created null: org.apache.solr.analysis.WhitespaceTokenizerFactory
Jan 27, 2015 11:49:47 AM org.apache.solr.util.plugin.AbstractPluginLoader load
INFO: created null: org.apache.solr.analysis.StopFilterFactory
Jan 27, 2015 11:49:47 AM org.apache.solr.util.plugin.AbstractPluginLoader load
INFO: created null: org.apache.solr.analysis.WordDelimiterFilterFactory
Jan 27, 2015 11:49:47 AM org.apache.solr.util.plugin.AbstractPluginLoader load
INFO: created null: org.apache.solr.analysis.LowerCaseFilterFactory
Jan 27, 2015 11:49:47 AM org.apache.solr.util.plugin.AbstractPluginLoader load
INFO: created null: org.apache.solr.analysis.ReversedWildcardFilterFactory
Jan 27, 2015 11:49:47 AM org.apache.solr.util.plugin.AbstractPluginLoader load
INFO: created text_rev: org.apache.solr.schema.TextField
Jan 27, 2015 11:49:47 AM org.apache.solr.util.plugin.AbstractPluginLoader load
INFO: created null: org.apache.solr.analysis.KeywordTokenizerFactory
Jan 27, 2015 11:49:47 AM org.apache.solr.util.plugin.AbstractPluginLoader load
INFO: created null: org.apache.solr.analysis.LowerCaseFilterFactory
Jan 27, 2015 11:49:47 AM org.apache.solr.util.plugin.AbstractPluginLoader load
INFO: created null: org.apache.solr.analysis.TrimFilterFactory
Jan 27, 2015 11:49:47 AM org.apache.solr.util.plugin.AbstractPluginLoader load
INFO: created null: org.apache.solr.analysis.PatternReplaceFilterFactory
Jan 27, 2015 11:49:47 AM org.apache.solr.util.plugin.AbstractPluginLoader load
INFO: created alphaOnlySort: org.apache.solr.schema.TextField
Jan 27, 2015 11:49:47 AM org.apache.solr.util.plugin.AbstractPluginLoader load
INFO: created null: org.apache.solr.analysis.StandardTokenizerFactory
Jan 27, 2015 11:49:47 AM org.apache.solr.util.plugin.AbstractPluginLoader load
INFO: created null: org.apache.solr.analysis.WordDelimiterFilterFactory
Jan 27, 2015 11:49:47 AM org.apache.solr.util.plugin.AbstractPluginLoader load
INFO: created null: org.apache.solr.analysis.LowerCaseFilterFactory
Jan 27, 2015 11:49:47 AM org.apache.solr.util.plugin.AbstractPluginLoader load
INFO: created null: org.apache.solr.analysis.TrimFilterFactory
Jan 27, 2015 11:49:47 AM org.apache.solr.util.plugin.AbstractPluginLoader load
INFO: created null: org.apache.solr.analysis.SynonymFilterFactory
Jan 27, 2015 11:49:47 AM org.apache.solr.util.plugin.AbstractPluginLoader load
INFO: created null: org.apache.solr.analysis.SnowballPorterFilterFactory
Jan 27, 2015 11:49:47 AM org.apache.solr.util.plugin.AbstractPluginLoader load
INFO: created null: org.apache.solr.analysis.WhitespaceTokenizerFactory
Jan 27, 2015 11:49:47 AM org.apache.solr.util.plugin.AbstractPluginLoader load
INFO: created null: org.apache.solr.analysis.NGramFilterFactory
Jan 27, 2015 11:49:47 AM org.apache.solr.util.plugin.AbstractPluginLoader load
INFO: created null: org.apache.solr.analysis.NGramFilterFactory
Jan 27, 2015 11:49:47 AM org.apache.solr.util.plugin.AbstractPluginLoader load
INFO: created null: org.apache.solr.analysis.StopFilterFactory
Jan 27, 2015 11:49:47 AM org.apache.solr.util.plugin.AbstractPluginLoader load
INFO: created null: org.apache.solr.analysis.LowerCaseFilterFactory
Jan 27, 2015 11:49:47 AM org.apache.solr.util.plugin.AbstractPluginLoader load
INFO: created null: org.apache.solr.analysis.TrimFilterFactory
Jan 27, 2015 11:49:47 AM org.apache.solr.util.plugin.AbstractPluginLoader load
INFO: created null: org.apache.solr.analysis.RemoveDuplicatesTokenFilterFactory
Jan 27, 2015 11:49:47 AM org.apache.solr.util.plugin.AbstractPluginLoader load
INFO: created null: org.apache.solr.analysis.SnowballPorterFilterFactory
Jan 27, 2015 11:49:47 AM org.apache.solr.util.plugin.AbstractPluginLoader load
INFO: created text_partial: org.apache.solr.schema.TextField
Jan 27, 2015 11:49:47 AM org.apache.solr.util.plugin.AbstractPluginLoader load
INFO: created null: org.apache.solr.analysis.StandardTokenizerFactory
Jan 27, 2015 11:49:47 AM org.apache.solr.util.plugin.AbstractPluginLoader load
INFO: created null: org.apache.solr.analysis.DoubleMetaphoneFilterFactory
Jan 27, 2015 11:49:47 AM org.apache.solr.util.plugin.AbstractPluginLoader load
INFO: created phonetic: org.apache.solr.schema.TextField
Jan 27, 2015 11:49:47 AM org.apache.solr.util.plugin.AbstractPluginLoader load
INFO: created null: org.apache.solr.analysis.WhitespaceTokenizerFactory
Jan 27, 2015 11:49:47 AM org.apache.solr.util.plugin.AbstractPluginLoader load
INFO: created null: org.apache.solr.analysis.DelimitedPayloadTokenFilterFactory
Jan 27, 2015 11:49:47 AM org.apache.solr.util.plugin.AbstractPluginLoader load
INFO: created payloads: org.apache.solr.schema.TextField
Jan 27, 2015 11:49:47 AM org.apache.solr.util.plugin.AbstractPluginLoader load
INFO: created null: org.apache.solr.analysis.KeywordTokenizerFactory
Jan 27, 2015 11:49:47 AM org.apache.solr.util.plugin.AbstractPluginLoader load
INFO: created null: org.apache.solr.analysis.LowerCaseFilterFactory
Jan 27, 2015 11:49:47 AM org.apache.solr.util.plugin.AbstractPluginLoader load
INFO: created lowercase: org.apache.solr.schema.TextField
Jan 27, 2015 11:49:47 AM org.apache.solr.util.plugin.AbstractPluginLoader load
INFO: created ignored: org.apache.solr.schema.StrField
Jan 27, 2015 11:49:47 AM org.apache.solr.schema.IndexSchema readSchema
INFO: default search field is title
Jan 27, 2015 11:49:47 AM org.apache.solr.schema.IndexSchema readSchema
INFO: query parser default operator is OR
Jan 27, 2015 11:49:47 AM org.apache.solr.schema.IndexSchema readSchema
INFO: unique key field: id
Jan 27, 2015 11:49:47 AM org.apache.solr.core.JmxMonitoredMap <init>
INFO: No JMX servers found, not exposing Solr information with JMX.
Jan 27, 2015 11:49:47 AM org.apache.solr.core.SolrCore initListeners
INFO: Added SolrEventListener: org.apache.solr.core.QuerySenderListener{queries=[]}
Jan 27, 2015 11:49:47 AM org.apache.solr.core.SolrCore initListeners
INFO: Added SolrEventListener: org.apache.solr.core.QuerySenderListener{queries=[{q=solr rocks,start=0,rows=10}, {q=static firstSearcher warming query from solrconfig.xml}]}
Jan 27, 2015 11:49:47 AM org.apache.solr.request.XSLTResponseWriter init
INFO: xsltCacheLifetimeSeconds=5
Jan 27, 2015 11:49:47 AM org.apache.solr.core.RequestHandlers initHandlersFromConfig
INFO: created standard: solr.SearchHandler
Jan 27, 2015 11:49:47 AM org.apache.solr.core.RequestHandlers initHandlersFromConfig
INFO: created dismax: solr.SearchHandler
Jan 27, 2015 11:49:47 AM org.apache.solr.core.RequestHandlers initHandlersFromConfig
INFO: created partitioned: solr.SearchHandler
Jan 27, 2015 11:49:47 AM org.apache.solr.core.RequestHandlers initHandlersFromConfig
INFO: created /spell: solr.SearchHandler
Jan 27, 2015 11:49:47 AM org.apache.solr.core.RequestHandlers initHandlersFromConfig
INFO: created tvrh: org.apache.solr.handler.component.SearchHandler
Jan 27, 2015 11:49:47 AM org.apache.solr.core.RequestHandlers initHandlersFromConfig
INFO: adding lazy requestHandler: org.apache.solr.handler.extraction.ExtractingRequestHandler
Jan 27, 2015 11:49:47 AM org.apache.solr.core.RequestHandlers initHandlersFromConfig
INFO: created /update/extract: org.apache.solr.handler.extraction.ExtractingRequestHandler
Jan 27, 2015 11:49:47 AM org.apache.solr.core.RequestHandlers initHandlersFromConfig
INFO: created /terms: org.apache.solr.handler.component.SearchHandler
Jan 27, 2015 11:49:47 AM org.apache.solr.core.RequestHandlers initHandlersFromConfig
INFO: adding lazy requestHandler: solr.SearchHandler
Jan 27, 2015 11:49:47 AM org.apache.solr.core.RequestHandlers initHandlersFromConfig
INFO: created /elevate: solr.SearchHandler
Jan 27, 2015 11:49:47 AM org.apache.solr.core.RequestHandlers initHandlersFromConfig
INFO: created /update: solr.XmlUpdateRequestHandler
Jan 27, 2015 11:49:47 AM org.apache.solr.core.RequestHandlers initHandlersFromConfig
INFO: created /update/javabin: solr.BinaryUpdateRequestHandler
Jan 27, 2015 11:49:47 AM org.apache.solr.core.RequestHandlers initHandlersFromConfig
INFO: created /analysis/document: solr.DocumentAnalysisRequestHandler
Jan 27, 2015 11:49:47 AM org.apache.solr.core.RequestHandlers initHandlersFromConfig
INFO: created /analysis/field: solr.FieldAnalysisRequestHandler
Jan 27, 2015 11:49:47 AM org.apache.solr.core.RequestHandlers initHandlersFromConfig
INFO: adding lazy requestHandler: solr.CSVRequestHandler
Jan 27, 2015 11:49:47 AM org.apache.solr.core.RequestHandlers initHandlersFromConfig
INFO: created /update/csv: solr.CSVRequestHandler
Jan 27, 2015 11:49:47 AM org.apache.solr.core.RequestHandlers initHandlersFromConfig
INFO: created /admin/: org.apache.solr.handler.admin.AdminHandlers
Jan 27, 2015 11:49:47 AM org.apache.solr.core.RequestHandlers initHandlersFromConfig
INFO: created /admin/ping: PingRequestHandler
Jan 27, 2015 11:49:47 AM org.apache.solr.core.RequestHandlers initHandlersFromConfig
INFO: created /debug/dump: solr.DumpRequestHandler
Jan 27, 2015 11:49:47 AM org.apache.solr.search.SolrIndexSearcher <init>
INFO: Opening Searcher@3d9f47b7 main
Jan 27, 2015 11:49:47 AM org.apache.solr.update.DirectUpdateHandler2$CommitTracker <init>
INFO: AutoCommit: disabled
Jan 27, 2015 11:49:47 AM org.apache.solr.handler.component.SpellCheckComponent inform
INFO: Initializing spell checkers
Jan 27, 2015 11:49:47 AM org.apache.solr.handler.component.SpellCheckComponent inform
WARNING: No queryConverter defined, using default converter
Jan 27, 2015 11:49:47 AM org.apache.solr.handler.component.QueryElevationComponent inform
INFO: Loading QueryElevation from: /vagrant/target/work/solr-home/solr/conf/elevate.xml
Jan 27, 2015 11:49:47 AM org.apache.solr.handler.component.SearchHandler inform
INFO: Adding  component:org.apache.solr.handler.component.QueryComponent@5fede387
Jan 27, 2015 11:49:47 AM org.apache.solr.handler.component.SearchHandler inform
INFO: Adding  component:org.apache.solr.handler.component.FacetComponent@7af4e544
Jan 27, 2015 11:49:47 AM org.apache.solr.handler.component.SearchHandler inform
INFO: Adding  component:org.apache.solr.handler.component.MoreLikeThisComponent@63f8126c
Jan 27, 2015 11:49:47 AM org.apache.solr.handler.component.SearchHandler inform
INFO: Adding  component:org.apache.solr.handler.component.HighlightComponent@3381a3ba
Jan 27, 2015 11:49:47 AM org.apache.solr.handler.component.SearchHandler inform
INFO: Adding  component:org.apache.solr.handler.component.StatsComponent@42422c1
Jan 27, 2015 11:49:47 AM org.apache.solr.handler.component.SearchHandler inform
INFO: Adding  debug component:org.apache.solr.handler.component.DebugComponent@6065af06
Jan 27, 2015 11:49:47 AM org.apache.solr.handler.component.SearchHandler inform
INFO: Adding  component:org.apache.solr.handler.component.QueryComponent@5fede387
Jan 27, 2015 11:49:47 AM org.apache.solr.handler.component.SearchHandler inform
INFO: Adding  component:org.apache.solr.handler.component.FacetComponent@7af4e544
Jan 27, 2015 11:49:47 AM org.apache.solr.handler.component.SearchHandler inform
INFO: Adding  component:org.apache.solr.handler.component.MoreLikeThisComponent@63f8126c
Jan 27, 2015 11:49:47 AM org.apache.solr.handler.component.SearchHandler inform
INFO: Adding  component:org.apache.solr.handler.component.HighlightComponent@3381a3ba
Jan 27, 2015 11:49:47 AM org.apache.solr.handler.component.SearchHandler inform
INFO: Adding  component:org.apache.solr.handler.component.StatsComponent@42422c1
Jan 27, 2015 11:49:47 AM org.apache.solr.handler.component.SearchHandler inform
INFO: Adding  debug component:org.apache.solr.handler.component.DebugComponent@6065af06
Jan 27, 2015 11:49:47 AM org.apache.solr.handler.component.SearchHandler inform
INFO: Adding  component:org.apache.solr.handler.component.QueryComponent@5fede387
Jan 27, 2015 11:49:47 AM org.apache.solr.handler.component.SearchHandler inform
INFO: Adding  component:org.apache.solr.handler.component.FacetComponent@7af4e544
Jan 27, 2015 11:49:47 AM org.apache.solr.handler.component.SearchHandler inform
INFO: Adding  component:org.apache.solr.handler.component.MoreLikeThisComponent@63f8126c
Jan 27, 2015 11:49:47 AM org.apache.solr.handler.component.SearchHandler inform
INFO: Adding  component:org.apache.solr.handler.component.HighlightComponent@3381a3ba
Jan 27, 2015 11:49:47 AM org.apache.solr.handler.component.SearchHandler inform
INFO: Adding  component:org.apache.solr.handler.component.StatsComponent@42422c1
Jan 27, 2015 11:49:47 AM org.apache.solr.handler.component.SearchHandler inform
INFO: Adding  debug component:org.apache.solr.handler.component.DebugComponent@6065af06
Jan 27, 2015 11:49:47 AM org.apache.solr.handler.component.SearchHandler inform
INFO: Adding  component:org.apache.solr.handler.component.QueryComponent@5fede387
Jan 27, 2015 11:49:47 AM org.apache.solr.handler.component.SearchHandler inform
INFO: Adding  component:org.apache.solr.handler.component.FacetComponent@7af4e544
Jan 27, 2015 11:49:47 AM org.apache.solr.handler.component.SearchHandler inform
INFO: Adding  component:org.apache.solr.handler.component.MoreLikeThisComponent@63f8126c
Jan 27, 2015 11:49:47 AM org.apache.solr.handler.component.SearchHandler inform
INFO: Adding  component:org.apache.solr.handler.component.HighlightComponent@3381a3ba
Jan 27, 2015 11:49:47 AM org.apache.solr.handler.component.SearchHandler inform
INFO: Adding  component:org.apache.solr.handler.component.StatsComponent@42422c1
Jan 27, 2015 11:49:47 AM org.apache.solr.handler.component.SearchHandler inform
INFO: Adding  component:org.apache.solr.handler.component.SpellCheckComponent@33c5e45b
Jan 27, 2015 11:49:47 AM org.apache.solr.handler.component.SearchHandler inform
INFO: Adding  debug component:org.apache.solr.handler.component.DebugComponent@6065af06
Jan 27, 2015 11:49:47 AM org.apache.solr.handler.component.SearchHandler inform
INFO: Adding  component:org.apache.solr.handler.component.QueryComponent@5fede387
Jan 27, 2015 11:49:47 AM org.apache.solr.handler.component.SearchHandler inform
INFO: Adding  component:org.apache.solr.handler.component.FacetComponent@7af4e544
Jan 27, 2015 11:49:47 AM org.apache.solr.handler.component.SearchHandler inform
INFO: Adding  component:org.apache.solr.handler.component.MoreLikeThisComponent@63f8126c
Jan 27, 2015 11:49:47 AM org.apache.solr.handler.component.SearchHandler inform
INFO: Adding  component:org.apache.solr.handler.component.HighlightComponent@3381a3ba
Jan 27, 2015 11:49:47 AM org.apache.solr.handler.component.SearchHandler inform
INFO: Adding  component:org.apache.solr.handler.component.StatsComponent@42422c1
Jan 27, 2015 11:49:47 AM org.apache.solr.handler.component.SearchHandler inform
INFO: Adding  component:org.apache.solr.handler.component.TermVectorComponent@5132ceb
Jan 27, 2015 11:49:47 AM org.apache.solr.handler.component.SearchHandler inform
INFO: Adding  debug component:org.apache.solr.handler.component.DebugComponent@6065af06
Jan 27, 2015 11:49:47 AM org.apache.solr.handler.component.SearchHandler inform
INFO: Adding  component:org.apache.solr.handler.component.TermsComponent@2de9fae7
Jan 27, 2015 11:49:47 AM org.apache.solr.core.QuerySenderListener newSearcher
INFO: QuerySenderListener sending requests to Searcher@3d9f47b7 main
Jan 27, 2015 11:49:47 AM org.apache.solr.core.CoreContainer register
INFO: registering core: 
Jan 27, 2015 11:49:47 AM org.apache.solr.servlet.SolrDispatchFilter init
INFO: user.dir=/vagrant/target/work/solr-home
Jan 27, 2015 11:49:47 AM org.apache.solr.servlet.SolrDispatchFilter init
INFO: SolrDispatchFilter.init() done
Jan 27, 2015 11:49:47 AM org.apache.solr.servlet.SolrServlet init
INFO: SolrServlet.init()
Jan 27, 2015 11:49:47 AM org.apache.solr.core.SolrResourceLoader locateSolrHome
INFO: JNDI not configured for solr (NoInitialContextEx)
Jan 27, 2015 11:49:47 AM org.apache.solr.core.SolrResourceLoader locateSolrHome
INFO: solr home defaulted to 'solr/' (could not find system property or JNDI)
Jan 27, 2015 11:49:47 AM org.apache.solr.servlet.SolrServlet init
INFO: SolrServlet.init() done
Jan 27, 2015 11:49:47 AM org.apache.solr.core.SolrResourceLoader locateSolrHome
INFO: JNDI not configured for solr (NoInitialContextEx)
Jan 27, 2015 11:49:47 AM org.apache.solr.core.SolrResourceLoader locateSolrHome
INFO: solr home defaulted to 'solr/' (could not find system property or JNDI)
Jan 27, 2015 11:49:47 AM org.apache.solr.servlet.SolrUpdateServlet init
INFO: SolrUpdateServlet.init() done
2015-01-27 11:49:47.998::INFO:  Started SocketConnector @ 0.0.0.0:8983
Jan 27, 2015 11:49:48 AM org.apache.solr.core.SolrCore execute
INFO: [] webapp=null path=null params={start=0&event=firstSearcher&q=solr+rocks&rows=10} hits=0 status=0 QTime=72 
Jan 27, 2015 11:49:48 AM org.apache.solr.core.SolrCore execute
INFO: [] webapp=null path=null params={event=firstSearcher&q=static+firstSearcher+warming+query+from+solrconfig.xml} hits=0 status=0 QTime=8 
Jan 27, 2015 11:49:48 AM org.apache.solr.core.QuerySenderListener newSearcher
INFO: QuerySenderListener done.
Jan 27, 2015 11:49:48 AM org.apache.solr.handler.component.SpellCheckComponent$SpellCheckerListener newSearcher
INFO: Loading spell index for spellchecker: default
Jan 27, 2015 11:49:48 AM org.apache.solr.core.SolrCore registerSearcher
INFO: [] Registered new searcher Searcher@3d9f47b7 main
^C2015-01-27 11:50:22.438::INFO:  Shutdown hook executing
2015-01-27 11:50:22.569::INFO:  Shutdown hook complete
