<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020-12-24
  Time: 오전 6:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<head>
    <title>${title }</title>
    <tiles:insertAttribute name="head" />
</head>

<body class="hold-transition sidebar-mini layout-fixed">

<div class="wrapper">

    <tiles:insertAttribute name="navbar" />
    <tiles:insertAttribute name="sidebar" />

    <!-- Content Wrapper. Contains page content -->
    <div class="content-wrapper">
    <tiles:insertAttribute name="header" />
    <!-- Main content -->
        <section class="content">
            <div class="container-fluid">
                <tiles:insertAttribute name="body" />
            </div>
    </section>

    </div>

    <footer class="main-footer">
    <tiles:insertAttribute name="footer" />
    </footer>

    <!-- Control Sidebar -->
    <aside class="control-sidebar control-sidebar-dark">
        <!-- Control sidebar content goes here -->
    </aside>
    <!-- /.control-sidebar -->

</div>

<script>
    $.widget.bridge('uibutton', $.ui.button)
</script>
<!-- Bootstrap 4 -->
<script src="<c:url value="/plugins/bootstrap/js/bootstrap.bundle.min.js" />"></script>
<!-- ChartJS -->
<script src="<c:url value="/plugins/chart.js/Chart.min.js" />"></script>
<!-- Sparkline -->
<script src="<c:url value="/plugins/sparklines/sparkline.js" />"></script>
<!-- JQVMap -->
<script src="<c:url value="/plugins/jqvmap/jquery.vmap.min.js" />"></script>
<script src="<c:url value="/plugins/jqvmap/maps/jquery.vmap.usa.js" />"></script>
<!-- jQuery Knob Chart -->
<script src="<c:url value="/plugins/jquery-knob/jquery.knob.min.js" />"></script>
<!-- daterangepicker -->
<script src="<c:url value="/plugins/moment/moment.min.js" />"></script>
<script src="<c:url value="/plugins/daterangepicker/daterangepicker.js" />"></script>
<!-- Tempusdominus Bootstrap 4 -->
<script src="<c:url value="/plugins/tempusdominus-bootstrap-4/js/tempusdominus-bootstrap-4.min.js" />"></script>
<!-- Summernote -->
<script src="<c:url value="/plugins/summernote/summernote-bs4.min.js" />"></script>
<!-- overlayScrollbars -->
<script src="<c:url value="/plugins/overlayScrollbars/js/jquery.overlayScrollbars.min.js" />"></script>
<!-- AdminLTE App -->
<script src="<c:url value="/dist/js/adminlte.js" />"></script>
<!-- AdminLTE dashboard demo (This is only for demo purposes) -->
<script src="<c:url value="/dist/js/pages/dashboard.js" />"></script>
<!-- AdminLTE for demo purposes -->
<script src="<c:url value="/dist/js/demo.js" />"></script>

</body>
</html>
