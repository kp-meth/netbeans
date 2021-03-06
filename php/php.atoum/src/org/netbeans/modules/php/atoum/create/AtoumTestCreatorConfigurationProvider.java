/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.netbeans.modules.php.atoum.create;

import org.netbeans.modules.gsf.testrunner.ui.spi.TestCreatorConfiguration;
import org.netbeans.modules.gsf.testrunner.ui.spi.TestCreatorConfigurationProvider;
import org.netbeans.modules.php.atoum.AtoumTestingProvider;
import org.netbeans.modules.php.spi.testing.create.CreateTestsSupport;
import org.openide.filesystems.FileObject;
import org.openide.util.lookup.ServiceProvider;


@ServiceProvider(service = TestCreatorConfigurationProvider.class, position = 110)
public class AtoumTestCreatorConfigurationProvider implements TestCreatorConfigurationProvider {

    @Override
    public TestCreatorConfiguration createTestCreatorConfiguration(FileObject[] activatedFileObjects) {
        return CreateTestsSupport.create(AtoumTestingProvider.getInstance(), activatedFileObjects)
                .createEmptyConfiguration(AtoumTestingProvider.IDENTIFIER);
    }

}
