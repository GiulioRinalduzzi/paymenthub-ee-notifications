package org.mifos.connector.notification.config.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.bind.DefaultValue;

/**
 * The names of the placeholders in the Velocity templates, and the text to use when a value is
 * missing. Thirteen @Value fields in one class before this record existed.
 *
 * <p>
 * failure_type keeps its underscore, because that is the key in application.yml and the name the
 * templates use; relaxed binding matches it to failureType.
 * </p>
 */
@ConfigurationProperties(prefix = "velocity")
public record VelocityProperties(@DefaultValue("transactionid") String transactionid,
        @DefaultValue("amount") String amount, @DefaultValue("date") String date,
        @DefaultValue("account") String account, @DefaultValue("failType") String failureType,
        @DefaultValue("txnType") String txnType, @DefaultValue("currency") String currency,
        @DefaultValue Defaults defaults) {

    public record Defaults(@DefaultValue("123456789") String transactionid, @DefaultValue("100") String amount,
            @DefaultValue("1234567890") String account, @DefaultValue("Reason not available") String failureType,
            @DefaultValue("transfer") String txnType, @DefaultValue("USD") String currency) {}
}
