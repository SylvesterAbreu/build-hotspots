package com.github.quiram.buildhotspots.clients;

public class BuildConfiguration {
    private final String name;
    private final BuildConfigurations buildConfigurations = new BuildConfigurations();

    public BuildConfiguration(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof BuildConfiguration)) {
            return false;
        }

        BuildConfiguration otherBuild = BuildConfiguration.class.cast(o);

        return name.equals(otherBuild.name);
    }

    public boolean addBuildConfigurationDependency(BuildConfiguration buildConfiguration) {
        buildConfigurations.add(buildConfiguration);
        return true;
    }

    public boolean dependsOn(BuildConfiguration buildConfiguration) {
        return buildConfigurations.contains(buildConfiguration);
    }
}
