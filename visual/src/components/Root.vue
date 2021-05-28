<template>
  <div class="container">
    <head>
      <meta charset="utf-8" />
    </head>

    <body>
      <div class="top">
        <div class="menu">
          <h1 class="logo"><a href="https://ncov.dxy.cn/ncovh5/view/pneumonia"></a></h1>
          <ul class="nav">
            <li>
              <a href="javascript:">首页</a>
            </li>
            <li>
              <a href="javascript:">产品</a>
            </li>
            <li>
              <a href="javascript:">技术</a>
            </li>
            <li>
              <a href="javascript:">渠道</a>
            </li>
            <li>
              <a href="javascript:">论坛</a>
            </li>
            <li>
              <a href="javascript:">关于我们</a>
            </li>
          </ul>
        </div>
      </div>
    </body>
  </div>
</template>

<script>
import "bootstrap/dist/css/bootstrap.min.css";
export default {
  name: "root"
};

</script>
<style type="text/css">
* {
  margin: 0;
  padding: 0;
}

ul {
  list-style-type: none;
}

.top {
  position: fixed;
  left: 0;
  right: 0;
  top: 0;
  z-index: 999;
  height: 50px;
  background-color: rgba(0, 0, 0, 0.6);
}

.menu {
  width: 1000px;
  margin: 0 auto;
  overflow: hidden;
}

.logo {
  float: left;
  margin-top: 9px;
}

.logo a {
  display: inline-block;
  width: 60px;
  height: 38px;
 top:0 ;
  background-image: url("http://img.mp.sohu.com/upload/20170716/1ec5fdaded8445139d009d76d44252f4_th.png");
  background-size: cover;
}

.nav {
  float: right;
  margin-top: 5px;
  font-size: 0;
}

.nav li {
  display: inline-block;
  margin-left: 40px;
}

.nav a {
  display: inline-block;
  height: 30px;
  line-height: 30px;
  font-size: 12px;
  color: #fff;
  text-decoration: none;
}

.nav a:hover {
  color: #83c3f3;
}
</style>
