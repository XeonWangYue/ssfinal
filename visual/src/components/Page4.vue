<template>
  <div class="container">
    <div id="map4" class="col-md-12"></div>
  </div>
</template>

<script>
let echarts = require("echarts");
let $ = require('jquery');


$(document).ready(() => {
  var myChart = echarts.init(
      document.getElementById("map4"),
      'white', {renderer: 'canvas'});
  var option = {
    animation: true,
    animationThreshold: 2000,
    animationDuration: 5000,
    animationEasing: "cubicOut",
    animationDelay: 0,
    animationDurationUpdate: 300,
    animationEasingUpdate: "cubicOut",
    animationDelayUpdate: 0,
    color: [
      "#c23531",
      "#2f4554",
      "#61a0a8",
      "#d48265",
      "#749f83",
      "#ca8622",
      "#bda29a",
      "#6e7074",
      "#546570",
      "#c4ccd3",
      "#f05b72",
      "#ef5b9c",
      "#f47920",
      "#905a3d",
      "#fab27b",
      "#2a5caa",
      "#444693",
      "#726930",
      "#b2d235",
      "#6d8346",
      "#ac6767",
      "#1d953f",
      "#6950a1",
      "#918597"
    ],
    series: [],
    legend: [
      {
        data: [
          "宝山区",
          "崇明区",
          "奉贤区",
          "虹口区",
          "黄浦区",
          "嘉定区",
          "金山区",
          "境外来沪",
          "境外输入",
          "静安区",
          "闵行区",
          "浦东新区",
          "普陀区",
          "青浦区",
          "松江区",
          "外地来沪",
          "未知地区",
          "徐汇区",
          "杨浦区",
          "长宁区"
        ],
        selected: {
          宝山区: true,
          崇明区: true,
          奉贤区: true,
          虹口区: true,
          黄浦区: true,
          嘉定区: true,
          金山区: true,
          境外来沪: true,
          境外输入: true,
          静安区: true,
          闵行区: true,
          浦东新区: true,
          普陀区: true,
          青浦区: true,
          松江区: true,
          外地来沪: true,
          未知地区: true,
          徐汇区: true,
          杨浦区: true,
          长宁区: true
        },
        show: true,
        right: 35,
        top: 70,
        orient: "vertical",
        padding: 5,
        itemGap: 20,
        itemWidth: 25,
        itemHeight: 14,
        textStyle: {
          fontSize: 15
        }
      }
    ],
    tooltip: {
      show: true,
      trigger: "axis",
      triggerOn: "mousemove|click",
      axisPointer: {
        type: "line"
      },
      showContent: true,
      alwaysShowContent: false,
      showDelay: 0,
      hideDelay: 100,
      textStyle: {
        fontSize: 14
      },
      borderWidth: 0,
      padding: 5
    },
    // grid: {
    //   left: "20%",
    //   top: "20%",
    //   right: "20%",
    //   bottom: "30%",
    //   containLabel: false  // 这个啥？看下面
    // },
    xAxis: [
      {
        type: "category",
        show: true,
        scale: false,
        nameLocation: "end",
        nameGap: 15,
        gridIndex: 0,
        inverse: false,
        offset: 0,
        splitNumber: 5,
        boundaryGap: false,
        minInterval: 0,
        splitLine: {
          show: false,
          lineStyle: {
            show: true,
            width: 1,
            opacity: 1,
            curveness: 0,
            type: "solid"
          }
        },
        data: null
      }
    ],
    yAxis: [
      {
        type: "value",
        show: true,
        scale: false,
        nameLocation: "end",
        nameGap: 15,
        gridIndex: 0,
        axisTick: {
          show: true,
          alignWithLabel: false,
          inside: false
        },
        inverse: false,
        offset: 0,
        splitNumber: 5,
        minInterval: 0,
        splitLine: {
          show: true,
          lineStyle: {
            show: true,
            width: 1,
            opacity: 1,
            curveness: 0,
            type: "solid"
          }
        }
      }
    ],
    title: [
      {
        text:
            "上海市疫情确诊人数变化趋势",
        left: "center",
        padding: 5,
        itemGap: 10,
        textStyle: {
          fontSize: 30
        }
      }
    ],
  };


  let discname = []
  $.ajax({
    method: "get",
    url: "/api/discname",
    async: false,
    contentType: "application/json",
    success: function (result) {
      discname = JSON.parse(result);
    }
  })
  $.ajax({
    method: "get",
    url: "/api/date/range",
    async: false,
    contentType: "application/json",
    success: function (result) {
      let date = JSON.parse(result);
      option.xAxis[0].data = date;
    }
  })
  $.ajax({
    method: "get",
    url: "/api/disct/all",
    async: false,
    contentType: "application/json",
    success: function (result) {
      let data = JSON.parse(result);
      for (let i = 0; i < data.length; i++) {
        let nums = new Array();
        for (let j = data[i].length - 1; j >= 0; j--)
          nums.push({"category": data[i][j].updateTime, "value": data[i][j].curedCount})
        option.series[i] = {
          type: 'line',
          name: discname[i],
          connectNulls: false,
          symbolSize: 4,
          showSymbol: true,
          smooth: false,
          clip: true,
          step: false,
          itemStyle: {normal: {color: option.color[i]}},
          data: nums,
          hoverAnimation: true,
          label: {
            show: false,
            position: "top",
            margin: 8
          },
          lineStyle: {
            "show": true,
            "width": 4,
            "opacity": 1,
            "curveness": 0,
            "type": "solid"
          },
          areaStyle: {
            "opacity": 0
          },
          zlevel: 0,
          z: 0
        };
        // myChart.setOption(option)
      }
    }
  })


  let isSet = false;
  $(document).on("scroll", function () {
    if (!isSet && window.pageYOffset >= 2800) {
      isSet = true;
      myChart.setOption(option);
    }
  });
});

export default {
  name: "Page"
};
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
#map4 {
  position: center;
  padding: 30px 0px;
  width: 1400px;
  height: 900px;
}
</style>
