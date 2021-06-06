<template>
  <div class="container">
    <div id="senti" class="col-md-12"></div>
  </div>
</template>

<script>
let echarts = require('echarts');
let $ = require('jquery');

$(document).ready(()=>{
  let myChart = echarts.init(document.getElementById('senti'));
  let option = {
    title: [
      {
        text:"情感分析图",
        padding: 5,
        itemGap: 10,
        textStyle: {
          fontSize: 30
        }
      }
    ],
    tooltip: {
      trigger: 'axis',
      axisPointer: {            // 坐标轴指示器，坐标轴触发有效
        type: 'shadow'        // 默认为直线，可选为：'line' | 'shadow'
      }
    },
    legend: {
      data: ['negative', 'positive']
    },
    grid: {
      left: '3%',
      right: '4%',
      bottom: '3%',
      containLabel: true
    },
    xAxis: [
      {
        type: 'value'
      }
    ],
    yAxis: [
      {
        type: 'category',
        axisTick: {
          show: false
        },
        data: ['生育率', '婚姻自由', '结婚冷静期', '离婚率', '婚姻', '家暴', '冷静期', '离婚冷静期']
      }
    ],
    series: [
      {
        name: 'negative',
        type: 'bar',
        stack: 'count',
        label: {
          show: true,
          position: 'left'
        },
        emphasis: {
          focus: 'series'
        },
        data: [-182,-346, -942, -1097, -1157, -1444, -4986, -16723]
      },
      {
        name: 'positive',
        type: 'bar',
        stack: 'count',
        label: {
          show: true,
          position: 'right'
        },
        emphasis: {
          focus: 'series'
        },
        data: [55, 86, 239, 360, 66,198, 1667, 2995]
      }
    ]
  }
  myChart.setOption(option)
})

export default {
  name: "sentiment"
}
</script>

<style scoped>
#senti{
  position: center;
  padding: 30px 0px;
  width: 1400px;
  height: 1000px;
}
</style>