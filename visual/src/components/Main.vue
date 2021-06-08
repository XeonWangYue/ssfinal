<template>
  <div class="cover-container d-flex w-100 h-100 mx-auto flex-column ">
    <div class="cover-container d-flex w-100 h-50 mx-auto flex-column covid" id="top-box" style="box-shadow: inset 0 0 5rem rgba(0 0 0,.5);">
      <header class="mb-auto"></header>
      <div class="right-title">
        <div class="d-title d-flex text-lg-start fw-normal">
          <a href="covid.html">上海疫情</a>
        </div>
      </div>
      <footer class="mt-auto"></footer>
    </div>
    <div class="cover-container d-flex w-100 h-50 p-3 mx-auto flex-column marriage">
      <header class="mb-auto"></header>
      <div class="h-50">
        <div class="letf-title">
          <div class="m-title d-flex text-lg-start fw-normal">
            <a href="marriage.html">离婚冷静期</a>
          </div>
        </div>
      </div>
      <footer class="mt-auto"></footer>
    </div>
  </div>
</template>

<script>

export default {
  name: "Main"
}
</script>

<style scoped>
a {
  color: #333333;
  text-align: center;
  text-decoration: none;
}
a:hover {
  color: #111111;
  text-align: center;
  text-decoration: none;
}
.covid {
  background-color: #ffffff;
  background-image: url("../assets/header.jpg");
  background-repeat: no-repeat;
  background-size: cover;
}

.m-title:hover {
  color: #111111;
  cursor: pointer;
}
.d-title{
  font-size: 90px;
  color: #000000;
}
.d-title:hover{
  color: #111111;
  cursor: pointer;
}
.right-title{
  position: absolute;
  top: 20%;
  right: 20%;
}
.letf-title{
  position: absolute;
  bottom: 20%;
  left: 20%;
}
.marriage {
  background-image: url("../assets/cover_cloud.png");
  background-repeat: no-repeat;
  background-size: cover;
}

.m-title {
  font-size: 90px;
}

</style>