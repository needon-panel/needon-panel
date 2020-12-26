<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: k4584587
  Date: 2020/12/21
  Time: 10:47 오전
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script type="text/javascript">

    $(function () {
        $('#home').attr('class', 'nav-link active active');
    });

</script>

<!-- Small boxes (Stat box) -->
<div class="row">
    <div class="col-lg-3 col-6">
        <!-- small box -->
        <div class="small-box bg-info">
            <div class="inner">
                <h3>${container_count }</h3>

                <p>컨테이너</p>
            </div>
            <div class="icon">
                <i class="fa fa-server"></i>
            </div>
            <a href="<c:url value="/docker/containers" />" class="small-box-footer">더보기 <i class="fas fa-arrow-circle-right"></i></a>
        </div>
    </div>
    <!-- ./col -->
    <div class="col-lg-3 col-6">
        <!-- small box -->
        <div class="small-box bg-success">
            <div class="inner">
                <h3>0</h3>

                <p>이미지</p>
            </div>
            <div class="icon">
                <i class="fa fa-clone"></i>
            </div>
            <a href="#" class="small-box-footer">더보기 <i class="fas fa-arrow-circle-right"></i></a>
        </div>
    </div>
    <!-- ./col -->
    <div class="col-lg-3 col-6">
        <!-- small box -->
        <div class="small-box bg-success">
            <div class="inner">
                <h3>0</h3>

                <p>볼륨</p>
            </div>
            <div class="icon">
                <i class="fa fa-cubes"></i>
            </div>
            <a href="#" class="small-box-footer">더보기 <i class="fas fa-arrow-circle-right"></i></a>
        </div>
    </div>
    <!-- ./col -->
    <div class="col-lg-3 col-6">
        <!-- small box -->
        <div class="small-box bg-danger">
            <div class="inner">
                <h3>0</h3>

                <p>네트워크</p>
            </div>
            <div class="icon">
                <i class="fa fa-sitemap"></i>
            </div>
            <a href="#" class="small-box-footer">더보기 <i class="fas fa-arrow-circle-right"></i></a>
        </div>
    </div>
    <!-- ./col -->
</div>
<!-- /.row -->