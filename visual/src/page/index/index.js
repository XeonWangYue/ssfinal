import Vue from 'vue'
import Main from '../../components/Main'

Vue.config.productionTip = false
import * as echarts from 'echarts'
import 'bootstrap/dist/css/bootstrap.min.css'
import 'bootstrap/dist/js/bootstrap.min'

Vue.prototype.$echarts=echarts

new Vue({
  Main,
  render: h => h(Main)
}).$mount("#app")

