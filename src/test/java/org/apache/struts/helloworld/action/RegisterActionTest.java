package org.apache.struts.helloworld.action;

import org.apache.struts2.StrutsTestCase;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;


@RunWith(JUnit4.class)
@Ignore
public class RegisterActionTest extends StrutsTestCase{
	
	@Test
	public void testExecute() throws Exception{
		String mapping = executeAction("/registerAction.do");
        assertNotNull(mapping);
	}
	
}
