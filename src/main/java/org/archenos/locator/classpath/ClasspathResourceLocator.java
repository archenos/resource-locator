package org.archenos.locator.classpath;

import org.archenos.locator.ResourceLocator;

public interface ClasspathResourceLocator extends ResourceLocator {
    ClassLoader getClasssLoader();
}
