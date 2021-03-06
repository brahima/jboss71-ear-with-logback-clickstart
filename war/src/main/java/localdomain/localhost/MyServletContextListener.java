/*
 * Copyright 2010-2013, the original author or authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package localdomain.localhost;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * @author <a href="mailto:cleclerc@cloudbees.com">Cyrille Le Clerc</a>
 */
public class MyServletContextListener implements ServletContextListener {
    private final Logger logger = LoggerFactory.getLogger(getClass());

    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("Append warn, info, debug and trace messages on logger: " + logger.getName());
        logger.warn("MyServletContextListener warn");
        logger.info("MyServletContextListener info");
        logger.debug("MyServletContextListener debug");
        logger.trace("MyServletContextListener trace");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
    }
}
