package org.acme.config.bug.extension.runtime;

import io.quarkus.runtime.annotations.ConfigDocSection;
import io.quarkus.runtime.annotations.ConfigGroup;
import io.quarkus.runtime.annotations.ConfigItem;

@ConfigGroup
public class RuntimeConfig {
    /**
     * TLS configuration
     */
    @ConfigItem
    @ConfigDocSection
    public TlsConfig tls;

    @ConfigGroup
    public static class TlsConfig {

        /**
         * Enables TLS
         */
        @ConfigItem(defaultValue = "false")
        public boolean enabled;
    }
}
