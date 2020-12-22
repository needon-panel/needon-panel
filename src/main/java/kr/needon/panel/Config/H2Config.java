package kr.needon.panel.Config;

import org.h2.tools.Server;
import org.springframework.context.annotation.Bean;

import java.sql.SQLException;

//@Configuration
public class H2Config {

    @Bean(initMethod = "start", destroyMethod = "stop")
    public Server H2DatabaseServer() throws SQLException {
        return Server.createTcpServer("-tcp", "-tcpAllowOthers", "-tcpPort", "9092");
    }

}