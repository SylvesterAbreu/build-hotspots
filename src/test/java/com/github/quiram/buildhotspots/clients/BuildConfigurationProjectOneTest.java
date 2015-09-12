package com.github.quiram.buildhotspots.clients;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class BuildConfigurationProjectOneTest {
    
    @Test
    public void addsDependencyOnBuildConfigurationProjectTwo() throws Exception {
        
        final BuildConfiguration projectOne = new BuildConfiguration("Project One");
        final BuildConfiguration projectTwo = new BuildConfiguration("Project Two");

        assertTrue(projectOne.addBuildConfigurationDependency(projectTwo));
    }
    
    @Test
    public void dependsOnProjectTwo() throws Exception {
        
        final BuildConfiguration projectOne = new BuildConfiguration("Project One");
        final BuildConfiguration projectTwo = new BuildConfiguration("Project Two");
        
        assertTrue(projectOne.dependsOn(projectTwo));
    }
}
