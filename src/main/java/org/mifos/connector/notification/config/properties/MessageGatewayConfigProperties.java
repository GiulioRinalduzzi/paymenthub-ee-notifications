package org.mifos.connector.notification.config.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.bind.DefaultValue;

/**
 * Where the connector half reaches the gateway half. Since the two were merged this is a loopback
 * call inside the same process, which is why the host defaults to 127.0.0.1 and the deployment sets
 * MESSAGEGATEWAYCONFIG_HOST to the same.
 */
@ConfigurationProperties(prefix = "messagegatewayconfig")
public record MessageGatewayConfigProperties(@DefaultValue("127.0.0.1") String host,
        @DefaultValue("http") String protocol, @DefaultValue("9191") int port) {}
