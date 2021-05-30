import Vue from 'vue'
import App from './components/App'
Vue.config.productionTip = false
import * as echarts from 'echarts'
import 'bootstrap/dist/css/bootstrap.min.css'
import 'bootstrap/dist/js/bootstrap.min'

Vue.prototype.$echarts=echarts

/* eslint-disable no-new */
new Vue({
  App,
  render: h => h(App)
}).$mount("#app")
