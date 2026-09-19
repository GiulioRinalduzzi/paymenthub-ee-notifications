package org.mifos.connector.notification.config.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.bind.DefaultValue;

/**
 * The Zeebe gateway and the worker settings, read in five classes before this record existed -
 * zeebe.client.ttl alone was a @Value in four of them.
 *
 * <p>
 * zeebe.client.evenly-allocated-max-jobs is deliberately not here. Its value in application.yml is a
 * SpEL expression over the other two client settings, and only @Value evaluates SpEL, so it stays
 * where it is.
 * </p>
 */
@ConfigurationProperties(prefix = "zeebe")
public record ZeebeProperties(@DefaultValue Broker broker, @DefaultValue Client client,
        @DefaultValue Worker worker) {

    public record Broker(@DefaultValue("zeebe-zeebe-gateway:26500") String contactpoint) {}

    public record Client(@DefaultValue("100") int maxExecutionThreads, @DefaultValue("30000") int ttl) {}

    /** timer is an ISO-8601 duration handed to Zeebe as a job variable, so it stays a string. */
    public record Worker(@DefaultValue("PT15S") String timer, @DefaultValue("3") int retries) {}
}
