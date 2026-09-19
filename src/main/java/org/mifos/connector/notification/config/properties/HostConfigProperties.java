package org.mifos.connector.notification.config.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.bind.DefaultValue;

/** The host this service advertises as its own. The deployment sets HOSTCONFIG_HOST. */
@ConfigurationProperties(prefix = "hostconfig")
public record HostConfigProperties(@DefaultValue("localhost") String host, @DefaultValue("http") String protocol) {}
