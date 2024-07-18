

    <!-- Including the header.jsp with a parameter -->
    <jsp:include page="include/header.jsp">
        <jsp:param name="titlepage" value="Homepage"/>
    </jsp:include>

    <!-- Login link -->
    <a href="<%=request.getContextPath()%>/login?action=login">login</a>
    <a href="<%=request.getContextPath()%>/test?page=listusers">listuders</a>
</div>
</body>
</html>
