package controller;

import java.io.IOException;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Logic.ChannelLogic;
import Logic.ChannelPackageLogic;
import Logic.SetTopBoxLogic;
import entities.Channel;
import entities.ChannelPackage;
import entities.SetTopBox;

/**
 * Servlet implementation class MyServlet
 */
@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		System.out.println("Hello");
		String option = request.getParameter("option");

		String crud = request.getParameter("crud");
		RequestDispatcher rd = null;
		boolean value = false;
		ChannelLogic chlogic = null;
		SetTopBoxLogic stblogic = null;
		ChannelPackageLogic pkglogic = null;

		switch (option) {
		case "settopbox":

			stblogic = new SetTopBoxLogic();

			if (crud.equals("add")) {
				System.out.println("Here");
				List<String> list = new ArrayList<>();
				String stbType = request.getParameter("stbType");
				System.out.println(stbType);
				int stbLength = Integer.parseInt(request.getParameter("stbLength"));
				int stbBreadth = Integer.parseInt(request.getParameter("stbBreadth"));
				int stbWidth = Integer.parseInt(request.getParameter("stbWidth"));
				double stbPrice = Double.parseDouble(request.getParameter("stbPrice"));
				double installCharges = Double.parseDouble(request.getParameter("installCharges"));
				double updateCharges = Double.parseDouble(request.getParameter("updateCharges"));
				int percentageDicount = Integer.parseInt(request.getParameter("percentageDicount"));
				String billingType = request.getParameter("billingType");
				double refundAmount = Double.parseDouble(request.getParameter("refundAmount"));
				String[] features = request.getParameterValues("feature");
				list = Arrays.asList(features);

				value = stblogic.addSetTopBox(stbType, stbLength, stbBreadth, stbWidth, stbPrice, installCharges, updateCharges,
						percentageDicount, billingType, refundAmount, list);
				if(value) {
					rd = request.getRequestDispatcher("Success.jsp");
					rd.forward(request, response);
				} else {
					 rd = request.getRequestDispatcher("Failure.jsp");
					rd.forward(request, response);
				}

			} else if (crud.equals("view")) {

				List<SetTopBox> list = stblogic.view();
				request.setAttribute("settopbox", list);
				rd = request.getRequestDispatcher("displaySetTopBox.jsp");
				rd.forward(request, response);
				
			} else if (crud.equals("update")) {
				String stbOldType = request.getParameter("oldType");
				String stbNewType = request.getParameter("newType");
				System.out.println(stbNewType);
				int stbLength = Integer.parseInt(request.getParameter("stbLength"));
				int stbBreadth = Integer.parseInt(request.getParameter("stbBreadth"));
				int stbWidth = Integer.parseInt(request.getParameter("stbWidth"));
				double stbPrice = Double.parseDouble(request.getParameter("stbPrice"));
				double installCharges = Double.parseDouble(request.getParameter("installCharges"));
				double updateCharges = Double.parseDouble(request.getParameter("updateCharges"));
				int percentageDicount = Integer.parseInt(request.getParameter("percentageDicount"));
				String billingType = request.getParameter("billingType");
				double refundAmount = Double.parseDouble(request.getParameter("refundAmount"));

				value = stblogic.updateSetTopBox(stbOldType, stbNewType, stbLength, stbBreadth, stbWidth, stbPrice, installCharges, updateCharges,
						percentageDicount, billingType, refundAmount);
				
				if(value) {
					rd = request.getRequestDispatcher("Success.jsp");
					rd.forward(request, response);
				} else {
					 rd = request.getRequestDispatcher("Failure.jsp");
					rd.forward(request, response);
				}

			} else if (crud.equals("delete")) {
				String deleteName = request.getParameter("Type");
				value = stblogic.deleteSetTopBox(deleteName);
				if(value) {
					rd = request.getRequestDispatcher("Success.jsp");
					rd.forward(request, response);
				} else {
					rd = request.getRequestDispatcher("Failure.jsp");
					rd.forward(request, response);
				}
			}

			break;

		case "channel":

			chlogic = new ChannelLogic();

			
			if (crud.equals("view")) {
				List<Channel> listChannel = chlogic.viewChannel();
				request.setAttribute("channel", listChannel);
				rd = request.getRequestDispatcher("disaplayChannels.jsp");
				rd.forward(request, response);
				
			} else if (crud.equals("update")) {
	
				String channelName = request.getParameter("channelName");
				String channelBand = request.getParameter("channelBand");
				double videoFrequency = Double.parseDouble(request.getParameter("videoFrequency"));
				double audioFrequency = Double.parseDouble(request.getParameter("audioFrequency"));
				String channelChargeType = request.getParameter("channelChargeType");
				String channelTransmissionType = request.getParameter("channelTransmissionType");
				double channelCharge = Double.parseDouble(request.getParameter("channelCharge"));
				String enableOrDisable = request.getParameter("enableOrDisable");
				String updateName = request.getParameter("updateName");

				value = chlogic.updateChannel(channelName, channelBand, videoFrequency, audioFrequency, channelChargeType,
						channelTransmissionType, channelCharge, enableOrDisable, updateName);
				
				if(value) {
					rd = request.getRequestDispatcher("Success.jsp");
					rd.forward(request, response);
				} else {
					rd = request.getRequestDispatcher("Failure.jsp");
					rd.forward(request, response);
				}

			} else if (crud.equals("delete")) {
				String deleteName = request.getParameter("deleteName");
				value = chlogic.deleteChannel(deleteName);
				if(value) {
					rd = request.getRequestDispatcher("Success.jsp");
					rd.forward(request, response);
				} else {
					rd = request.getRequestDispatcher("Failure.jsp");
					rd.forward(request, response);
				}
			}

			break;

		case "package":

		     pkglogic = new ChannelPackageLogic();

			if (crud.equals("add")) {
				
				List<String> listCategories = new ArrayList<>();
				String packageName = request.getParameter("packageName");
				String packageChargeType = request.getParameter("packageChargeType");
				String packageTransmissionType = request.getParameter("packageTransmissionType");
				int packagePrice = Integer.parseInt(request.getParameter("packagePrice"));
				String packageFromDate = request.getParameter("packageFromDate");
				Date fromdate = Date.valueOf(packageFromDate);
				String packageToDate = request.getParameter("packageToDate");
				Date todate = Date.valueOf(packageToDate);
				String packageByDefault = request.getParameter("byDefault");
				String[] categories = request.getParameterValues("categories");
				listCategories = Arrays.asList(categories);
				value = pkglogic.addPkg(packageName, packageChargeType, packageTransmissionType,
						packagePrice, fromdate, todate, packageByDefault, listCategories);
				if(value) {
					rd = request.getRequestDispatcher("Success.jsp");
					rd.forward(request, response);
				} else {
					rd = request.getRequestDispatcher("Failure.jsp");
					rd.forward(request, response);
				}
				
			} else if (crud.equals("view")) {
				List<ChannelPackage> channelPackageList = pkglogic.view();
				request.setAttribute("channel", channelPackageList);
				rd = request.getRequestDispatcher("disaplayChannelPackages.jsp");
				rd.forward(request, response);
				
			} else if (crud.equals("update")) {
				String packageName = request.getParameter("packageName");
				String packageCategory = request.getParameter("packageCategory");
				String packageChargeType = request.getParameter("packageChargeType");
				String packageTransmissionType = request.getParameter("packageTransmissionType");
				int packagePrice = Integer.parseInt(request.getParameter("packagePrice"));
				String packageFromDate = request.getParameter("packageFromDate");
				Date fromdate = Date.valueOf(packageFromDate);
				String packageToDate = request.getParameter("packageToDate");
				Date todate = Date.valueOf(packageToDate);
				String packageByDefault = request.getParameter("byDefault");
				String updateName = request.getParameter("updateName");

				value = pkglogic.updateChannelPackage(packageName, updateName, packageChargeType, packageTransmissionType,
						packagePrice, fromdate, todate, packageByDefault);
				
				if(value) {
					rd = request.getRequestDispatcher("Success.jsp");
					rd.forward(request, response);
				} else {
					rd = request.getRequestDispatcher("Failure.jsp");
					rd.forward(request, response);
				}

			} else if (crud.equals("delete")) {
				String deleteName = request.getParameter("deleteName");
				value = pkglogic.deleteChannelPackage(deleteName);
				if(value) {
					rd = request.getRequestDispatcher("Success.jsp");
					rd.forward(request, response);
				} else {
					rd = request.getRequestDispatcher("Failure.jsp");
					rd.forward(request, response);
				}
				
			} else if(crud.equals("channelAdd")) {
				chlogic = new ChannelLogic();
				String channelName = request.getParameter("channelName");
				String channelBand = request.getParameter("channelBand");
				double videoFrequency = Double.parseDouble(request.getParameter("videoFrequency"));
				double audioFrequency = Double.parseDouble(request.getParameter("audioFrequency"));
				String channelChargeType = request.getParameter("channelChargeType");
				String channelTransmissionType = request.getParameter("channelTransmissionType");
				double channelCharge = Double.parseDouble(request.getParameter("channelCharge"));
				String enableOrDisable = request.getParameter("enableOrDisable");
				String packageName = request.getParameter("packageName");

				value = chlogic.addChannel(channelName, channelBand, videoFrequency, audioFrequency, channelChargeType,
						channelTransmissionType, channelCharge, enableOrDisable, packageName);
				if(value) {
					rd = request.getRequestDispatcher("Success.jsp");
					rd.forward(request, response);
				} else {
					rd = request.getRequestDispatcher("Failure.jsp");
					rd.forward(request, response);
				}
			}


			break;
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
