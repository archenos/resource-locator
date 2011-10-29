package org.archenos.locator.classpath;


public final class SystemClassLoaderResourceLocator extends AbstractClasspathResourceLocator {
    public ClassLoader getClasssLoader() {
        return ClassLoader.getSystemClassLoader();
    }
}
