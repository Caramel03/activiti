package com.lele.activiti;

import org.activiti.engine.ProcessEngineConfiguration;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

public class ActivitiApplicationTests {

    @Test
    public void contextLoads() {
        ProcessEngineConfiguration processEngineConfiguration = ProcessEngineConfiguration.createStandaloneProcessEngineConfiguration();
        processEngineConfiguration.setJdbcDriver("com.mysql.jdbc.Driver");
        processEngineConfiguration.setJdbcUrl("jdbc:mysql://140.143.225.172:3306/my_activity_test?characterEncoding=utf8&useSSL=true");
        processEngineConfiguration.setJdbcPassword("123456");
        processEngineConfiguration.setJdbcUsername("root");

        processEngineConfiguration.setDatabaseSchemaUpdate(ProcessEngineConfiguration.DB_SCHEMA_UPDATE_TRUE);

        processEngineConfiguration.buildProcessEngine();

    }

}
