<template>
  <div id="map"></div>
</template>

<script>
  let echarts = require('echarts');
  let $ = require('jquery');
  let odata = [];
  let range = [];
  let pdata = new Array();
  let myChart;
  let option;
  let nowdata;

  $.ajax({
    method: "get",
    url: "/api/disct",
    async: false,
    contentType: "application/json",
    success: function (data){
      odata = data;
    }
  })
  let obj = JSON.parse(odata);
  console.log(obj.length);
  for(let i = 0 ; i < obj.length ; i++){
    let day = obj[i];
    let num = day.length;
    let oneday = new Array();
    for(let j = 0 ; j < day.length ; j++){
      oneday.push({"name":day[j].disctName, "value":day[j].currentCount});
      if(day[j].currentCount>0){
        console.log(i);
      }
    }
    pdata.push(oneday);
  }
  console.log(obj[5]);

  $(document).ready(()=>{
    myChart = echarts.init(document.getElementById('map'));
    let geojson = require("../assets/shanghai.json");
    echarts.registerMap('shanghai', geojson);
    option = {
      baseOption:{
        timeline: {
          axisType: 'category',
          inverse: false,
          playInterval: 500,
          left: 'center',
          //right: null,
          top: '90%',
          width: '80%',
          label: {
            normal: {
              textStyle: {
                color: '#999'
              }
            },
            emphasis: {
              textStyle: {
                color: '#fff'
              }
            }
          },
          symbol: 'none',
          lineStyle: {
            color: '#555'
          },
          checkpointStyle: {
            color: '#bbb',
            borderColor: '#777',
            borderWidth: 2
          },
          controlStyle: {
            showNextBtn: false,
            showPrevBtn: false,
            normal: {
              color: '#666',
              borderColor: '#666'
            },
            emphasis: {
              color: '#aaa',
              borderColor: '#aaa'
            }
          },
          data: []
        },
        title: {
          text : '上海地图',
          subtext : '-。-'
        },
        tooltip : {
          trigger: 'item',
          formatter: function (obj) {
            return "区县： "+obj.name +"<br>"+"人数："+obj.value+'<br>';
          }
        },
        dataRange: {
          min: 0,
          max: 50,
          color:['red','white'],
          text:['高','低'],           // 文本，默认为数值文本
          calculable : true
        },
        series : [{
          name: '上海市疫情地图',
          type: 'map',
          mapType: 'shanghai',
          itemStyle:{
            normal:{
              label:{
                show:true,
                textStyle : {
                  color: '#000000'
                }}},
            emphasis:{
              label:{
                show:true,
                textStyle : {
                  color: '#000000'
                }}}
          },
          data: [],
          label: {
            show: true,
          },
        }],
      },
      options: [],
    };

    for(let i = 0; i<pdata.length;i++){
      option.baseOption.timeline.data.push(i);
      option.options.push({
        title: {
          show: true,
          'text': i + ''
        },
        series: {
          name: "map",
          type: 'map',
          roam: false,
          map: 'shanghai',
          data: pdata[i],
        }
      })
    }
    myChart.setOption(option);
  })
  export default {
    name: 'Map',
  }
</script>
<style>
#map{
  width: 800px;
  height: 1000px;
}
</style>