<%--
  Created by IntelliJ IDEA.
  User: dol
  Date: 26/04/2018
  Time: 12:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Product Discount Calculator</title>
  </head>
  <body>
  <form method="post" action="discount">
    <div class="input">
      <h2>Product Discount Calculator</h2>
      <p>Product Description:    </p><input type="text" name="ProductDescription" size="30">
      <p>List Price:    </p><input type="text" name="ListPrice" size="30">
      <p>Discount Percent:    </p><input type="text" name="DiscountPercent" size="30">
      <input type="submit" value="Calculate Discount"/>
    </div>
  </form>
  </body>
</html>
