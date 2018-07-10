package org.sdoroshenko;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTransactionalTestNGSpringContextTests;

@ContextConfiguration(locations = {"classpath:beans-persistence.xml"})
public abstract class AbstractRepositoryTest extends AbstractTransactionalTestNGSpringContextTests {
}
