# elasticsearch-sql-JDBCDriver
elasticsearch-sql的JDBC Driver封装
目前暂时只做了针对 elasticsearch 6.2.4的封装，调用了druid 1.0.16、transport 6.2.4、elasticsearch-sql 6.2.4组件。其中druid组件不要调用超过1.0.16版本的，会报错。。
elasticsearch 6.3.0的好像调用了x-pack组件会报错，所以暂时没提供支持。






目前支持 elasticsearch 6.2.4  elasticsearch-sql 6.2.4
驱动的名字继续沿用elasticsearch-sql的规则吧。 
org.nlpcn.es4sql.jdbc.Driver
