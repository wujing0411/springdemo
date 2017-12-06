package fenqi.spring.services.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DatabaseProperties {
	
	@Value("${database.driverClassName}")
    private String dbDriverClassName;

    @Value("${database.username}")
    private String dbUserName;

    @Value("${database.password}")
    private String dbPassword;

    @Value("${database.url}")
    private String dbUrl;

	public String getDbDriverClassName() {
		return dbDriverClassName;
	}

	public void setDbDriverClassName(String dbDriverClassName) {
		this.dbDriverClassName = dbDriverClassName;
	}

	public String getDbUserName() {
		return dbUserName;
	}

	public void setDbUserName(String dbUserName) {
		this.dbUserName = dbUserName;
	}

	public String getDbPassword() {
		return dbPassword;
	}

	public void setDbPassword(String dbPassword) {
		this.dbPassword = dbPassword;
	}

	public String getDbUrl() {
		return dbUrl;
	}

	public void setDbUrl(String dbUrl) {
		this.dbUrl = dbUrl;
	}
    
    
}
