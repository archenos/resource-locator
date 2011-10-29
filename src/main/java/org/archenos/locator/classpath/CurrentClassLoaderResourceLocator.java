package org.archenos.locator.classpath;

public final class CurrentClassLoaderResourceLocator extends AbstractClasspathResourceLocator {
    public ClassLoader getClasssLoader() {
        return CurrentClassLoaderResourceLocator.class.getClassLoader();
    }
}
