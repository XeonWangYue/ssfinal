<template>
  <div class="container">
    <div class="row">
      <div class="col-lg-3 col-md-4 flex-column d-flex">
        <div class="mb-auto"></div>
        <main>
          <p class="row align-content-center">{{ result }}</p>
        </main>
        <div class="mt-1">
          <input
              type="radio"
              name="radio1"
              value="0"
              id="Input1"
              v-on:click="res(1)"
              hidden
          />
          <label class="mylabel" for="Input1">1</label>
          <input
              type="radio"
              name="radio2"
              value="1"
              id="Input2"
              v-on:click="res(2)"
              hidden
          />
          <label class="mylabel" for="Input2">2</label>
          <input
              type="radio"
              name="radio3"
              value="1"
              id="Input3"
              v-on:click="res(3)"
              hidden
          />
          <label class="mylabel" for="Input3">3</label>
        </div>
        <div class="mt-auto"></div>
      </div>
      <div id="map2" class="col-lg-9 col-md-8"></div>
    </div>
  </div>
</template>

<script>
let echarts = require("echarts");
let $ = require("jquery");
let cured = new Array();
let dead = new Array();
let confirm = new Array();

$(document).ready(() => {
  var myChart = echarts.init(document.getElementById("map2"), "white", {
    renderer: "canvas",
  });
  myChart.showLoading({
    text: "数据正在加载...",
    textStyle: {fontSize: 30, color: "#444"},
    effectOption: {backgroundColor: "#999999"},
  });
  option = {
    animation: true,
    animationThreshold: 2000,
    animationDuration: 1000,
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
      "#918597",
    ],
    series: [
      {
        type: "line",
        name: "\u786e\u8bca\u4eba\u6570",
        connectNulls: false,
        symbolSize: 4,
        showSymbol: true,
        smooth: true,
        clip: true,
        step: false,
        data: confirm,
        hoverAnimation: true,
        label: {
          show: false,
          position: "top",
          margin: 8,
        },
        lineStyle: {
          show: true,
          width: 4,
          opacity: 1,
          curveness: 0,
          type: "solid",
        },
        areaStyle: {
          opacity: 0.5,
        },
        zlevel: 0,
        z: 0,
        rippleEffect: {
          show: true,
          brushType: "stroke",
          scale: 2.5,
          period: 4,
        },
      },
      {
        type: "line",
        name: "\u6cbb\u6108\u4eba\u6570",
        connectNulls: false,
        symbolSize: 4,
        showSymbol: true,
        smooth: true,
        clip: true,
        step: false,
        data: cured,
        hoverAnimation: true,
        label: {
          show: false,
          position: "top",
          margin: 8,
        },
        lineStyle: {
          show: true,
          width: 4,
          opacity: 1,
          curveness: 0,
          type: "solid",
        },
        areaStyle: {
          opacity: 0.5,
        },
        zlevel: 0,
        z: 0,
        rippleEffect: {
          show: true,
          brushType: "stroke",
          scale: 2.5,
          period: 4,
        },
      },
      {
        type: "line",
        name: "\u6b7b\u4ea1\u4eba\u6570",
        connectNulls: false,
        symbolSize: 4,
        showSymbol: true,
        smooth: true,
        clip: true,
        step: false,
        data: dead,
        hoverAnimation: true,
        label: {
          show: false,
          position: "top",
          margin: 8,
        },
        lineStyle: {
          show: true,
          width: 4,
          opacity: 1,
          curveness: 0,
          type: "solid",
        },
        areaStyle: {
          opacity: 0.5,
        },
        zlevel: 0,
        z: 0,
        rippleEffect: {
          show: true,
          brushType: "stroke",
          scale: 2.5,
          period: 4,
        },
      },
    ],
    legend: [
      {
        data: [
          "\u786e\u8bca\u4eba\u6570",
          "\u6cbb\u6108\u4eba\u6570",
          "\u6b7b\u4ea1\u4eba\u6570",
        ],
        selected: {
          确诊人数: true,
          治愈人数: true,
          死亡人数: true,
        },
        show: true,
        right: 0,
        bottom: 0,
        orient: "horizontal",
        padding: 5,
        itemGap: 20,
        itemWidth: 20,
        itemHeight: 18,
        textStyle: {
          fontSize: 16,
        },
      },
    ],
    tooltip: {
      show: true,
      trigger: "axis",
      triggerOn: "mousemove|click",
      axisPointer: {
        type: "line",
      },
      showContent: true,
      alwaysShowContent: false,
      showDelay: 0,
      hideDelay: 100,
      textStyle: {
        fontSize: 14,
      },
      borderWidth: 0,
      padding: 5,
    },
    xAxis: [
      {
        type: "category",
        show: true,
        scale: false,
        nameLocation: "end",
        nameGap: 15,
        gridIndex: 0,
        axisTick: {
          show: true,
          alignWithLabel: true,
          inside: false,
        },
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
            type: "solid",
          },
        },
        data: null,
      },
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
          inside: false,
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
            type: "solid",
          },
        },
      },
    ],
    title: [
      {
        text: "上海市疫情变化趋势",
        left: "center",
        padding: 5,
        itemGap: 10,
        textStyle: {
          fontSize: 30,
        },
      },
    ],
  };

  var option;
  $.ajax({
    method: "get",
    url: "/api/date/range",
    async: false,
    contentType: "application/json",
    success: function (result) {
      let date = JSON.parse(result);
      option.xAxis[0].data = date;
    },
  });
  $.ajax({
    method: "get",
    url: "/api/disct/上海市",
    async: false,
    contentType: "application/json",
    success: function (result) {
      let data = JSON.parse(result);

      for (let i = 0; i < data.length; i++) {
        cured.push({
          category: "治愈人数",
          value: data[i].curedCount,
        });

        dead.push({
          category: "死亡人数",
          value: data[i].deadCount,
        });

        confirm.push({
          category: "确诊人数",
          value: data[i].confirmCount,
        });
      }
    },
  });
  myChart.hideLoading();
  myChart.setOption(option);
  let isSet = true;
  $(document).on("scroll", function () {
    if (!isSet && window.pageYOffset >= 0) {
      isSet = true;
      myChart.hideLoading();
      myChart.setOption(option);
    }
  });
});

export default {
  name: "Page",
  data: function () {
    return {
      result:
          "2020年1月22日至2021年1月21日间，上海市疫情情况较为乐观，除疫情爆发初期波动较大，未出现大规模爆发的情况。在此期间，新冠确诊人数一直处于上升状态，但治愈人数也随之上升，同时，死亡病例数目自2020年4月7日后便不再增加，意味着确诊病例均得到很好地救治，并没有造成不治而亡的情况。",
    };
  },
  methods: {
    res: function (cs) {
      if (cs == 1) {
        this.result =
            "截至2021年1月21日，除疫情爆发初期波动较大，未出现大规模爆发的情况，总体情况乐观。在此期间，新冠确诊人数一直处于上升状态，但治愈人数也随之上升，同时，死亡病例数目自2020年4月7日后便不再增加，意味着确诊病例均得到很好地救治。";
      } else if (cs == 2) {
        this.result =
            "疫情的确诊人数变化主要分为三个阶段：第一阶段为2020年1月22日至2月15日，疫情初次爆发，确诊人数快速增长，多为本土病例；第二阶段为2月6日至3月21日，确诊人数持平，反映出疫情得到控制；第三阶段为3月22日至2021年1月22日，确诊病例来源转为境外输入，增长速度有多次起伏。除初期出现死亡病例外，治愈数基本与确诊人数保持一致。";
      } else if (cs == 3) {
        this.result =
            "从上海市疫情变化趋势可以看出，在保证本地防疫措施严格执行的情况下，上海市还应对境外输入人员给予高度关注，防止外来输入病例的扩散，从严从细从实高标准地做好疫情防控工作，从而保障上海市人民的安全和幸福生活。";
      }
    },
  },
};
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
#map2 {
  /* position: center; */
  padding: 30px 0px;
  height: 900px;
}

/*用于调整单选框的属性以及位置*/
.mylabel {
  padding: 2px;
  margin: 2px;
  text-align: center;
  width: 30px;
  height: 30px;
  color: #fff;
  background: #000;
  cursor: pointer;
}

p {
  margin: 10px 20px;
  text-align: left;
  height: 400px;
  right: 0px;
  font-size: 20px;
  display: block;
  color: #86868b;
  font-family: "SF Pro SC", "SF Pro Display", "SF Pro Icons", "PingFang SC",
  "Helvetica Neue", "Helvetica", "Arial", sans-serif;
}
</style>
