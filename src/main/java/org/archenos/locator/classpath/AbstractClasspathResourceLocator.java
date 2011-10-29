package org.archenos.locator.classpath;

import java.net.URL;

import org.archenos.locator.ResourceNotFoundException;

public abstract class AbstractClasspathResourceLocator implements ClasspathResourceLocator {

    public URL findResource(String resourceName) throws ResourceNotFoundException {
        ClassLoader loader = getClasssLoader();
        URL path = loader.getResource(resourceName);

        if (path == null) {
            throw new ResourceNotFoundException("Resource \"" + resourceName + "\" not found.");
        }

        return path;
    }
}
