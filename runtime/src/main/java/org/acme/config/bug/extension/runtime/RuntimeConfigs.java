package org.acme.config.bug.extension.runtime;

import io.quarkus.runtime.annotations.*;

import java.util.Map;

@ConfigRoot(name = "bug", phase = ConfigPhase.RUN_TIME)
public class RuntimeConfigs {

    /**
     * The default config.
     */
    @ConfigItem(name = ConfigItem.PARENT)
    public RuntimeConfig defaultConfig;

    /**
     * Additional named clients.
     */
    @ConfigDocSection
    @ConfigDocMapKey("config-name")
    @ConfigItem(name = ConfigItem.PARENT)
    public Map<String, RuntimeConfig> namedConfigs;
}
