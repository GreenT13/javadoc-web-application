package com.apon.javadocservlet.repository;

import java.util.List;
import java.util.Objects;

/**
 * Immutable object containing the information of a single {@link Artifact} with a list of all the versions, including
 * the specification whether each version contains a javadoc.jar or not.
 */
public class ArtifactVersions {
    private final List<Version> versions;

    public ArtifactVersions(List<Version> versions) {
        this.versions = List.copyOf(versions);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ArtifactVersions that = (ArtifactVersions) o;
        return Objects.equals(versions, that.versions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(versions);
    }

    public static class Version {
        private final String version;
        private final boolean hasJavaDocJar;

        public Version(String version, boolean hasJavaDocJar) {
            this.version = version;
            this.hasJavaDocJar = hasJavaDocJar;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Version version1 = (Version) o;
            return hasJavaDocJar == version1.hasJavaDocJar &&
                    Objects.equals(version, version1.version);
        }

        @Override
        public int hashCode() {
            return Objects.hash(version, hasJavaDocJar);
        }

        @Override
        public String toString() {
            return "Version{" +
                    "version='" + version + '\'' +
                    ", hasJavaDocJar=" + hasJavaDocJar +
                    '}';
        }

        public String getVersion() {
            return version;
        }

        // This method MUST have the name "isHasJavaDocJar", otherwise the Thymeleaf template cannot find this getter.
        public boolean isHasJavaDocJar() {
            return hasJavaDocJar;
        }
    }

    public List<Version> getVersions() {
        return versions;
    }
}
