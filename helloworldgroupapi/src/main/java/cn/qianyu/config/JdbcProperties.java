package cn.qianyu.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties
public class JdbcProperties {
    String url;
    String driverClassName;
    String userName;
    String passWord;
}
