<template>
  <div class="container">
    <div class="row">
      <div class="col-lg-3 col-md-4 flex-column d-flex">
        <div class="mb-auto"></div>
        <main>
          <p>
            1. 微博群体普遍对婚姻抱有消极的态度，“离婚冷静期”事件引爆了网民的负面情绪；而婚恋压力主要承受群体——90后00后，成为了此次舆情的主要参与者。
          </p>
          <p>
            2. “离婚冷静期”事件尤其关注女性群体，以至于“女性”、“家暴”等词成为了相当一部分微博/评论的主体，并且有强烈的负面情感倾向。
          </p>
          <p>
            3. 排序较高的关键词包括“生育率”、“孩子”等，结合 “第七次人口普查”等舆情分析可知，生育问题和抚养问题是该问题负面情绪的助燃剂之一。
          </p>
        </main>
        <div class="mt-auto"></div>
      </div>
      <div id="senti" class="col-lg-9 col-md-8"></div>
    </div>

  </div>
</template>

<script>
let echarts = require('echarts');
let $ = require('jquery');

$(document).ready(() => {
  let myChart = echarts.init(document.getElementById('senti'));
  myChart.showLoading({
    text: '数据正在加载...',
    textStyle: {fontSize: 30, color: '#444'},
    effectOption: {backgroundColor: '#999999'}
  })
  let option = {
    title: [
      {
        text: "情感分析图",
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
        data: ['婚姻自由', '女性', '婚姻', '结婚冷静期', '离婚率', '家暴', '冷静期', '离婚冷静期']
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
        data: [-346, -470, -1157, -942, -1097, -1444, -4986, -16723]
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
        data: [86, 57, 66, 298, 360, 239, 1667, 2995]
      }
    ]
  }
  let isSet = false;
  $(document).on("scroll", function () {
    if (!isSet && window.pageYOffset >= 900) {
      isSet = true;
      myChart.hideLoading();
      myChart.setOption(option);
    }
  });
})

export default {
  name: "sentiment"
}
</script>

<style scoped>
#senti {
  padding: 20px;
  position: center;
  height: 900px;
}

p {
  margin: 10px 20px;
  text-align: left;
  right: 0px;
  font-size: 20px;
  display: block;
  color: #86868b;
  font-family: "SF Pro SC", "SF Pro Display", "SF Pro Icons", "PingFang SC",
  "Helvetica Neue", "Helvetica", "Arial", sans-serif;
}
</style>