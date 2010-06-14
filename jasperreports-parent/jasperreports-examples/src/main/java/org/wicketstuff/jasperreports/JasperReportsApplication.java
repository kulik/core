/*
 * $Id$
 * $Revision$ $Date$
 * 
 * ==================================================================== Licensed
 * under the Apache License, Version 2.0 (the "License"); you may not use this
 * file except in compliance with the License. You may obtain a copy of the
 * License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package org.wicketstuff.jasperreports;

import org.apache.wicket.Page;
import org.apache.wicket.protocol.http.WebApplication;
import org.apache.wicket.util.time.Duration;

/**
 * Wicket application class for jasper reports example.
 * 
 * @author Eelco Hillenius
 */
public class JasperReportsApplication extends WebApplication
{
	/**
	 * Constructor.
	 */
	public JasperReportsApplication()
	{
	}

	/**
	 * @see org.apache.wicket.protocol.http.WebApplication#init()
	 */
	protected void init()
	{
		getResourceSettings().setResourcePollFrequency(Duration.ONE_SECOND);
	}

	/**
	 * @see org.apache.wicket.Application#getHomePage()
	 */
	public Class<? extends Page> getHomePage()
	{
		return Index.class;
	}
}