package org.mifos.connector.notification.config.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.bind.DefaultValue;

/** Where the delivery-status callback is posted. The deployment sets CALLBACKCONFIG_HOST. */
@ConfigurationProperties(prefix = "callbackconfig")
public record CallbackConfigProperties(@DefaultValue("0.0.0.0") String host, @DefaultValue("http") String protocol,
        @DefaultValue("5000") int port) {}
