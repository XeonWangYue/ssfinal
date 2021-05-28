import Vue from 'vue'
import App from './App'
import router from './router'

Vue.config.productionTip = false
import * as echarts from 'echarts'
import 'bootstrap/dist/css/bootstrap.min.css'
import 'bootstrap/dist/js/bootstrap.min'

Vue.prototype.$echarts=echarts
/* eslint-disable no-new */
new Vue({
  router,
  App,
  render: h => h(App)
}).$mount("#app")
