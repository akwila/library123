<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="java.util.ArrayList"%>
<%
	/* we have 4 session: UID, UTypeID, Name, Menuss
	for menuss : 0-> search, 1-> librarian, 2-> student
	for utypeid : 1-> librarian, 2-> student
	*/
	int menu = 1;
	int utypeid = 1;
	//ArrayList<String> menuName;
	//ArrayList<Integer> menuValue;

	HttpSession session1 = request.getSession(false);
	if (session1 == null || !request.isRequestedSessionIdValid()) {

	} else {
		if (null == session.getAttribute("Menuss")) {
		} else {
			menu = (int) session.getAttribute("Menuss");
		}

		if (null == session.getAttribute("UTypeID")) {
		} else {
			utypeid = (int) session.getAttribute("UTypeID");
		}

		if (null == session.getAttribute("menuValue")) {

		} else {
			//menuName = (ArrayList<String>)session.getAttribute("menuName");
			//menuValue = (ArrayList<Integer>)session.getAttribute("menuValue");
		}
	}

	// dummy array list, later I need to delete this one
	ArrayList<String> menuName = new ArrayList<String>();
	ArrayList<Integer> menuValue = new ArrayList<Integer>();
	menuName.add("Home");
	menuValue.add(0);
	menuName.add("Book");
	menuValue.add(1);
	menuName.add("CD");
	menuValue.add(2);
	menuName.add("Magazines");
	menuValue.add(3);
%>
<div style="background-color: white;">
	<div class="container">
		<div style="height: 7px;"></div>
		<div style="float: left">
			<img src="Picture/title.png" />
		</div>
		<div style="float: right;">Sign In</div>
		<div style="clear: both; height: 5px;"></div>
		<div style="float: right;">
			<%
				if (utypeid == 1) {
					out.print("<a href=''>");
					if (menu == 1)
						out.print("<span style='font-weight: 600'>");
					out.print("Librarian");
					if (menu == 1)
						out.print("</span>");
					out.print("</a> | ");
					out.print("<a href=''>");
					if (menu == 0)
						out.print("<span style='font-weight: 600'>");
					out.print("Search");
					if (menu == 0)
						out.print("</span>");
					out.print("</a>");
				} else if (utypeid == 2) {
					out.print("<a href=''>");
					if (menu == 2)
						out.print("<span style='font-weight: 600'>");
					out.print("Student");
					if (menu == 2)
						out.print("</span>");
					out.print("</a> | ");
					out.print("<a href=''>");
					if (menu == 0)
						out.print("<span style='font-weight: 600'>");
					out.print("Search");
					if (menu == 0)
						out.print("</span>");
					out.print("</a>");
				}
			%>
		</div>
		<div style="clear: both;"></div>
	</div>
</div>

<div
	style="width: 100%; height: 35px; background-image: url(Picture/menu.png);">
	<div class="container">
		<div style="float: left; width: 20px; height: 1px;"></div>
		<%
			if (menu == 0) {
				for (int i = 0; i < menuValue.size(); i++) {
					out.print("<div style='float:left; padding-top:7px; margin-right:25px;'>");
					out.print("<a class='menu' href='itemSearch.html?id=" + menuValue.get(i) + "'>" + menuName.get(i)
							+ "</a>");
					out.print("</div>");
				}
			} else if (menu == 1) {
				out.print(
						"<div class='menu' style='float:left; padding-top:7px; margin-right:25px;'><a class='menu' href=''>Home</a></div>");
				out.print(
						"<div class='menu' style='float:left; padding-top:7px; margin-right:25px;'><a class='menu' href='ItemBorrow1.jsp'>Borrow</a></div>");
				out.print(
						"<div class='menu' style='float:left; padding-top:7px; margin-right:25px;'><a class='menu' href='ItemReturn.jsp'>Return</a></div>");
				out.print("<div class='menu' style='float:left; padding-top:7px; margin-right:25px;'>Item</div>");
				out.print(
						"<div class='menu' style='float:left; padding-top:7px; margin-right:25px;'><a class='menu' href='StudentEdit1.jsp'>Student</a></div>");
				out.print(
						"<div class='menu' style='float:left; padding-top:7px; margin-right:25px;'>Loan History</div>");
			} else if (menu == 2) {
				out.print(
						"<div class='menu' style='float:left; padding-top:7px; margin-right:25px;'><a class='menu' href=''>Home</a></div>");
				out.print(
						"<div class='menu' style='float:left; padding-top:7px; margin-right:25px;'><a class='menu' href='ItemBorrow1.jsp'>Borrow</a></div>");
				out.print(
						"<div class='menu' style='float:left; padding-top:7px; margin-right:25px;'><a class='menu' href='ItemReturn.jsp'>Return</a></div>");
				out.print(
						"<div class='menu' style='float:left; padding-top:7px; margin-right:25px;'><a class='menu' href='LoanHistory1.jsp'>Loan History</a></div>");
			}
		%>
		<div style="clear: both;"></div>
	</div>
</div>