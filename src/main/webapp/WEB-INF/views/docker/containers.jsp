<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020-12-26
  Time: 오후 8:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<script type="text/javascript">

    $(function () {
        $('#containers').attr('class', 'nav-link active active');
    });

</script>

<div class="card">
    <div class="card-header">
        <h3 class="card-title">컨테이너 리스트</h3>
    </div>
    <!-- /.card-header -->
    <div class="card-body">
        <table id="container_list" class="table table-bordered table-hover">
            <thead>
            <tr>
                <th>컨테이너 이름</th>
                <th>상태</th>
                <th>포트</th>
                <th>이미지</th>
                <th>관리</th>
            </tr>
            <colgroup>
                <%--<col width="5%">--%>

                <col width="10%">
                <col width="5%">
                <col width="5%">
                <col width="5%">
                <col width="5%">
            </colgroup>
            </thead>
            <tbody>
            <c:forEach items="${containers }" var="list">
                <tr>
                    <td>${list.names}</td>
                    <td>
                        <c:if test="${list.state eq 'exited' }">
                            <span class="label label-danger">정지</span>
                        </c:if>
                        <c:if test="${list.state eq 'running' }">
                            <span class="label label-danger">실행중</span>
                        </c:if>
                    </td>
                    <td>${list.ports }</td>
                    <td>-</td>
                    <td>-</td>
                </tr>
            </c:forEach>
            </tbody>

        </table>
    </div>
    <!-- /.card-body -->
</div>

<!-- DataTables -->
<script src="<c:url value="/plugins/datatables/jquery.dataTables.min.js" />"></script>
<script src="<c:url value="/plugins/datatables-bs4/js/dataTables.bootstrap4.min.js" />"></script>
<script src="<c:url value="/plugins/datatables-responsive/js/dataTables.responsive.min.js" />"></script>
<script src="<c:url value="/plugins/datatables-responsive/js/responsive.bootstrap4.min.js" />"></script>

<script>
    $(function () {
        $("#container_list").DataTable({
            "responsive": true,
            "autoWidth": false,
            language : lang_kor //or lang_eng
        });
    });
</script>
