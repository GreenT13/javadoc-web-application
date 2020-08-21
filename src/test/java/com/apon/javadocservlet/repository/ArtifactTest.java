package com.apon.javadocservlet.repository;

import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.jupiter.api.Test;

class ArtifactTest {

    @Test
    public void equalsAndHashCodeAreImplemented() {
        EqualsVerifier.simple().forClass(Artifact.class).verify();
    }
}
