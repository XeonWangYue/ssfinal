<template>
  <div class="container">
    <div id="map5" class="col-md-12"></div>
  </div>
</template>

<script>
let echarts = require("echarts");
let $ = require("jquery");
let odata = [];
let pdata = new Array();
let myChart;
let option;

$.ajax({
  method: "get",
  url: "/api/disct",
  async: false,
  contentType: "application/json",
  success: function (data) {
    odata = data;
  },
});
let obj = JSON.parse(odata);
let dateline = Array();
for (let i = 0; i < obj.length; i++) {
  let day = obj[i];
  let oneday = new Array();
  for (let j = 0; j < day.length; j++) {
    oneday.push({name: day[j].disctName, value: day[j].currentCount});
  }
  dateline.push(day[0].updateTime);
  pdata.push(oneday);
}

$(document).ready(() => {
  myChart = echarts.init(document.getElementById("map5"));
  let geojson = require("../assets/shanghai.json");
  echarts.registerMap("shanghai", geojson);
  option = {
    baseOption: {
      timeline: {
        autoPlay: true,
        axisType: "category",
        inverse: false,
        playInterval: 100,
        left: "center",
        top: "90%",
        width: "80%",
        label: {
          normal: {
            textStyle: {
              color: "#999",
            },
          },
          emphasis: {
            textStyle: {
              color: "#fff",
            },
          },
        },
        symbol: "none",
        lineStyle: {
          color: "#555",
        },
        checkpointStyle: {
          color: "#bbb",
          borderColor: "#777",
          borderWidth: 2,
        },
        controlStyle: {
          showNextBtn: false,
          showPrevBtn: false,
          normal: {
            color: "#666",
            borderColor: "#666",
          },
          emphasis: {
            color: "#aaa",
            borderColor: "#aaa",
          },
        },
        data: dateline,
      },
      title: {
        text: "上海地图疫情地图",
        textStyle: {
          fontSize: 30
        }
      },
      tooltip: {
        trigger: "item",
        formatter: function (obj) {
          return "区县： " + obj.name + "<br>" + "人数：" + obj.value + "<br>";
        },
      },
      dataRange: {
        min: 0,
        max: 50,
        color: ["#ff6666", "#ccffff"],
        text: ["高", "低"], // 文本，默认为数值文本
        calculable: true,
      },
      series: [
        {
          name: "上海市疫情地图",
          type: "map",
          mapType: "shanghai",
          itemStyle: {
            normal: {
              label: {
                show: true,
                textStyle: {
                  color: "#000000",
                },
              },
            },
            emphasis: {
              label: {
                show: true,
                textStyle: {
                  color: "#000000",
                },
              },
            },
          },
          data: [],
          label: {
            show: true,
          },
        },
      ],
    },
    options: [],
  };

  for (let i = 0; i < pdata.length; i++) {
    option.options.push({
      series: {
        name: "map",
        type: "map",
        roam: false,
        map: "shanghai",
        data: pdata[i],
      },
    });
  }
  let isSet = false;
  $(document).on("scroll", function () {
    if (!isSet && window.pageYOffset >= 3800) {
      isSet = true;
      myChart.setOption(option);
    }
  });
});
export default {
  name: "Map",
};
</script>
<style>
#map5 {
  position: center;
  padding: 30px 0px;
  width: 1400px;
  height: 900px;
}
</style>
