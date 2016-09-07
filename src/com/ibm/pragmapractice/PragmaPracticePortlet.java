package com.ibm.pragmapractice;

import java.io.IOException;
import java.util.Locale;
import java.util.ResourceBundle;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.PortletRequestDispatcher;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import com.ibm.business.Company;
import com.ibm.business.LoadCompany;

/**
 * A sample portlet
 */
public class PragmaPracticePortlet extends javax.portlet.GenericPortlet {
	/**
	 * @see javax.portlet.Portlet#init()
	 */
	public void init() throws PortletException {
		super.init();
	}

	/**
	 * Serve up the <code>view</code> mode.
	 * 
	 * @see javax.portlet.GenericPortlet#doView(javax.portlet.RenderRequest,
	 *      javax.portlet.RenderResponse)
	 */
	public void doView(RenderRequest request, RenderResponse response)
			throws PortletException, IOException {

		response.setContentType(request.getResponseContentType());
		Locale locale = request.getLocale();
		Company company = (Company) getPortletContext().getAttribute(
				"company" + locale.toString());

		if (company == null) {
			ResourceBundle porletBundle = getPortletConfig().getResourceBundle(
					locale);
			LoadCompany loadCompany = new LoadCompany();
			company = loadCompany.getCompany(porletBundle);
			getPortletContext().setAttribute("company" + locale.toString(),
					company);
		}

		request.setAttribute("company", company);

		PortletRequestDispatcher rd = getPortletContext().getRequestDispatcher(
				"/jsps/DisplayCompany.jsp");
		rd.include(request, response);
	}

	/**
	 * Serve up the <code>edit</code> mode.
	 * 
	 * @see javax.portlet.GenericPortlet#doEdit(javax.portlet.RenderRequest,
	 *      javax.portlet.RenderResponse)
	 */
	public void doEdit(RenderRequest request, RenderResponse response)
			throws PortletException, IOException {
		// TODO: auto-generated method stub
	}

	/**
	 * Serve up the <code>help</code> mode.
	 * 
	 * @see javax.portlet.GenericPortlet#doHelp(javax.portlet.RenderRequest,
	 *      javax.portlet.RenderResponse)
	 */
	protected void doHelp(RenderRequest request, RenderResponse response)
			throws PortletException, IOException {
		// TODO: auto-generated method stub
	}

	/**
	 * Process an action request.
	 * 
	 * @see javax.portlet.Portlet#processAction(javax.portlet.ActionRequest,
	 *      javax.portlet.ActionResponse)
	 */
	public void processAction(ActionRequest request, ActionResponse response)
			throws PortletException, java.io.IOException {
		// TODO: auto-generated method stub
	}

}
