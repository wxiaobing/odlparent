/*
 * Copyright (c) 2020 PANTHEON.tech, s.r.o. and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.opendaylight.odlparent.featuretest;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class KarafConstantsTest {
    @Test
    public void testKarafVersions() {
        assertNotNull(KarafConstants.karafDistroVersion());
        assertNotNull(KarafConstants.karafReleaseVersion());
    }
}
