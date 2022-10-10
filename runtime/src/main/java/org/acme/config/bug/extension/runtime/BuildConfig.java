package org.acme.config.bug.extension.runtime;

import io.quarkus.runtime.annotations.ConfigGroup;
import io.quarkus.runtime.annotations.ConfigItem;

@ConfigGroup
public class BuildConfig {

    /**
     * Enables the config
     */
    @ConfigItem(defaultValue = "true")
    public boolean enabled;
}
