<template>
  <div class="outer">
    <div class="left">
      <div class="p">{{ result }}</div>
      <input
          type="radio"
          name="radio1"
          value="0"
          id="Input1"
          v-on:click="res(1)"
          hidden
      />
      <label class="label1" for="Input1">1</label>
      <input
          type="radio"
          name="radio2"
          value="1"
          id="Input2"
          v-on:click="res(2)"
          hidden
      />
      <label class="label2" for="Input2">2</label>
      <input
          type="radio"
          name="radio3"
          value="1"
          id="Input3"
          v-on:click="res(3)"
          hidden
      />
      <label class="label3" for="Input3">3</label>
    </div>
    <div id="map2" class="right"></div>
  </div>
</template>

<script>

function drawEchart() {
  let echarts = require("echarts");
  let $ = require("jquery");
  let cured = new Array();
  let dead = new Array();
  let confirm = new Array();
  $(document).ready(() => {
    var myChart = echarts.init(document.getElementById("map2"), "white", {
      renderer: "canvas",
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
    myChart.showLoading({
      text: '数据正在加载...',
      textStyle: {fontSize: 30, color: '#444'},
      effectOption: {backgroundColor: '#999999'}
    })
    option = {
      "animation": true,
      "animationThreshold": 2000,
      "animationDuration": 3000,
      "animationEasing": "cubicOut",
      "animationDelay": 0,
      "animationDurationUpdate": 300,
      "animationEasingUpdate": "cubicOut",
      "animationDelayUpdate": 0,
      "color": [
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
      "series": [
        {
          "type": "line",
          "name": "\u786e\u8bca\u4eba\u6570",
          "connectNulls": false,
          "symbolSize": 4,
          "showSymbol": true,
          "smooth": true,
          "clip": true,
          "step": false,
          "data": confirm,
          "hoverAnimation": true,
          "label": {
            "show": false,
            "position": "top",
            "margin": 8
          },
          "lineStyle": {
            "show": true,
            "width": 4,
            "opacity": 1,
            "curveness": 0,
            "type": "solid"
          },
          "areaStyle": {
            "opacity": 0.5
          },
          "zlevel": 0,
          "z": 0,
          "rippleEffect": {
            "show": true,
            "brushType": "stroke",
            "scale": 2.5,
            "period": 4
          }
        },
        {
          "type": "line",
          "name": "\u6cbb\u6108\u4eba\u6570",
          "connectNulls": false,
          "symbolSize": 4,
          "showSymbol": true,
          "smooth": true,
          "clip": true,
          "step": false,
          "data": cured,
          "hoverAnimation": true,
          "label": {
            "show": false,
            "position": "top",
            "margin": 8
          },
          "lineStyle": {
            "show": true,
            "width": 4,
            "opacity": 1,
            "curveness": 0,
            "type": "solid"
          },
          "areaStyle": {
            "opacity": 0.5
          },
          "zlevel": 0,
          "z": 0,
          "rippleEffect": {
            "show": true,
            "brushType": "stroke",
            "scale": 2.5,
            "period": 4
          }
        },
        {
          "type": "line",
          "name": "\u6b7b\u4ea1\u4eba\u6570",
          "connectNulls": false,
          "symbolSize": 4,
          "showSymbol": true,
          "smooth": true,
          "clip": true,
          "step": false,
          "data": dead,
          "hoverAnimation": true,
          "label": {
            "show": false,
            "position": "top",
            "margin": 8
          },
          "lineStyle": {
            "show": true,
            "width": 4,
            "opacity": 1,
            "curveness": 0,
            "type": "solid"
          },
          "areaStyle": {
            "opacity": 0.5
          },
          "zlevel": 0,
          "z": 0,
          "rippleEffect": {
            "show": true,
            "brushType": "stroke",
            "scale": 2.5,
            "period": 4
          }
        }
      ],
      "legend": [
        {
          "data": [
            "\u786e\u8bca\u4eba\u6570",
            "\u6cbb\u6108\u4eba\u6570",
            "\u6b7b\u4ea1\u4eba\u6570"
          ],
          "selected": {
            "\u786e\u8bca\u4eba\u6570": true,
            "\u6cbb\u6108\u4eba\u6570": true,
            "\u6b7b\u4ea1\u4eba\u6570": true
          },
          "show": true,
          "right": 5,
          "top": "35%",
          "orient": "vertical",
          "padding": 5,
          "itemGap": 20,
          "itemWidth": 25,
          "itemHeight": 14,
          "textStyle": {
            "fontSize": 15
          }
        }
      ],
      "tooltip": {
        "show": true,
        "trigger": "axis",
        "triggerOn": "mousemove|click",
        "axisPointer": {
          "type": "line"
        },
        "showContent": true,
        "alwaysShowContent": false,
        "showDelay": 0,
        "hideDelay": 100,
        "textStyle": {
          "fontSize": 14
        },
        "borderWidth": 0,
        "padding": 5
      },
      "xAxis": [
        {
          "type": "category",
          "show": true,
          "scale": false,
          "nameLocation": "end",
          "nameGap": 15,
          "gridIndex": 0,
          "axisTick": {
            "show": true,
            "alignWithLabel": true,
            "inside": false
          },
          "inverse": false,
          "offset": 0,
          "splitNumber": 5,
          "boundaryGap": false,
          "minInterval": 0,
          "splitLine": {
            "show": false,
            "lineStyle": {
              "show": true,
              "width": 1,
              "opacity": 1,
              "curveness": 0,
              "type": "solid"
            }
          },
          "data": null
        }
      ],
      "yAxis": [
        {
          "type": "value",
          "show": true,
          "scale": false,
          "nameLocation": "end",
          "nameGap": 15,
          "gridIndex": 0,
          "axisTick": {
            "show": true,
            "alignWithLabel": false,
            "inside": false
          },
          "inverse": false,
          "offset": 0,
          "splitNumber": 5,
          "minInterval": 0,
          "splitLine": {
            "show": true,
            "lineStyle": {
              "show": true,
              "width": 1,
              "opacity": 1,
              "curveness": 0,
              "type": "solid"
            }
          }
        }
      ],
      "title": [
        {
          "text": "上海市疫情变化趋势",
          "left": "center",
          "padding": 5,
          "itemGap": 10,
          "textStyle": {
            "fontSize": 30
          }
        }
      ]
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
}


export default {
  name: "Page",
  mounted() {
    drawEchart();
  }
};
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
#map2 {
  /* position: center; */
  padding: 30px 0px;
  width: 1120px;
  height: 720px;
}
.outer {
  display: table;
  width: 80%;
  margin: 10px auto;
  padding: 10px;
  border: 1px;
}
.left {
  display: table-cell;
  width: 400px;
  line-height: 2;
  padding-top: 100px;
  border: 1px;
  vertical-align: top;
  text-align: center;
}
.right {
  border: 1px;
  margin-left: 10px;
  padding: 10px;
}
.label1 {
  position: absolute;
  bottom: 200px;
  left: 0px;
  width: 20px;
  height: 20px;
  margin: 0 10px;
  margin-left: 380px;
  line-height: 20px;
  color: #fff;
  background: #000;
  cursor: pointer;
} /*用于调整单选框的属性以及位置*/
.label2 {
  position: absolute;
  bottom: 200px;
  left: 30px;
  width: 20px;
  height: 20px;
  margin: 0 10px;
  margin-left: 380px;
  line-height: 20px;
  color: #fff;
  background: #000;
  cursor: pointer;
} /*用于调整单选框的属性以及位置*/
.label3 {
  position: absolute;
  bottom: 200px;
  left: 60px;
  width: 20px;
  height: 20px;
  margin: 0 10px;
  margin-left: 380px;
  line-height: 20px;
  color: #fff;
  background: #000;
  cursor: pointer;
}

.p {
  width: 180px;
  height: 400px;
  right: 0px;
  display: block;
  font-size: 20px;
  margin-block-start: 1em;
  margin-block-end: 1em;
  margin-inline-start: 50px;
  margin-inline-end: 50px;
  display: inline;
  color: #86868b;
  font-family: "SF Pro SC", "SF Pro Display", "SF Pro Icons", "PingFang SC",
  "Helvetica Neue", "Helvetica", "Arial", sans-serif;
}
</style>
