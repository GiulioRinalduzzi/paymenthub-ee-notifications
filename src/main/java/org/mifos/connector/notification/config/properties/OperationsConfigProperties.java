package org.mifos.connector.notification.config.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.bind.DefaultValue;

/**
 * The tenant header names and values the gateway authenticates its own calls with. Read as four
 * @Value fields
 *            in three different classes before this record existed.
 */
@ConfigurationProperties(prefix = "operationsconfig")
public record OperationsConfigProperties(@DefaultValue("Fineract-Platform-TenantId") String tenantid,
        @DefaultValue("default") String tenantidvalue, @DefaultValue("Fineract-Tenant-App-Key") String tenantappkey,
        @DefaultValue("") String tenantappvalue) {}
