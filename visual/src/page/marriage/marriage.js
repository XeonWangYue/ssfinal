import Vue from 'vue'
import App from '../../components/MarMain'

Vue.config.productionTip = false
import * as echarts from 'echarts'
import 'bootstrap/dist/css/bootstrap.min.css'
import 'bootstrap/dist/js/bootstrap.min'

Vue.prototype.$echarts=echarts

new Vue({
  App,
  render: h => h(App)
}).$mount("#mar")