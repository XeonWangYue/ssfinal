<template>
  <div class="container">
    <header class="d-flex flex-wrap justify-content-center py-3 mb-4 border-bottom">
      <a href="/" class="d-flex align-items-center mb-3 mb-md-0 me-md-auto text-dark text-decoration-none">
        <svg class="bi me-2" width="40" height="32">
          <use xlink:href="#bootstrap"></use>
        </svg>
        <span class="fs-4"><img src="../assets/logo.png" style="width: 160px;height: 80px"></span>
      </a>
      <ul class="nav nav-pills">
        <li class="nav-item"><a href="index.html" class="nav-link" id="index_li">主页</a></li>
        <li class="nav-item"><a href="covid.html" class="nav-link" id="shang_li">上海疫情</a></li>
        <li class="nav-item"><a href="marriage.html" class="nav-link" id="marr_li">离婚冷静期</a></li>
      </ul>
    </header>
  </div>
</template>

<script>
import "bootstrap/dist/css/bootstrap.min.css";

export default {
  name: "Avatar",
};
</script>
<style type="text/css">

</style>
