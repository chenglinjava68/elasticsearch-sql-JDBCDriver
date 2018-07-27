package org.nlpcn.es4sql.jdbc;

import java.net.URI;
import java.net.URISyntaxException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.DriverPropertyInfo;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;
import java.util.logging.Logger;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.ElasticSearchDruidDataSourceFactory;



public class Driver implements java.sql.Driver {

	static
	  {
			try {
				DriverManager.registerDriver(new Driver());
			} catch (SQLException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
	   
	  }
	
	public Connection connect(String url, Properties info) throws SQLException {
		// TODO 自动生成的方法存根
		// TODO 自动生成的方法存根
		//return null;
		// TODO 自动生成的方法存根
		//return null;
		 Properties properties = new Properties();
	        properties.put("url", url);
	        DruidDataSource dds=null;
			
			
			try {
				dds = (DruidDataSource) ElasticSearchDruidDataSourceFactory.createDataSource(properties);
			} catch (Exception e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
			
			
	        dds.setInitialSize(1);
	        Connection connection = dds.getConnection();
	        return connection;
	}

	public boolean acceptsURL(String url) throws SQLException {
		// TODO 自动生成的方法存根
		if (!url.startsWith("jdbc:elasticsearch:"))
			return false;
		else
			return true;
	}

	public DriverPropertyInfo[] getPropertyInfo(String url, Properties info) throws SQLException {
		// TODO 自动生成的方法存根
		return null;
	}

	public int getMajorVersion() {
		// TODO 自动生成的方法存根
		return 0;
	}

	public int getMinorVersion() {
		// TODO 自动生成的方法存根
		return 0;
	}

	public boolean jdbcCompliant() {
		// TODO 自动生成的方法存根
		return false;
	}

	public Logger getParentLogger() throws SQLFeatureNotSupportedException {
		// TODO 自动生成的方法存根
		return null;
	}

}
