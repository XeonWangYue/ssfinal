<template>
  <div id="app">
    <Avatar />
    <Chart1 />
    <Chart2 />
    <Chart3 />
    <Chart4 />
    <Chart5 />

  </div>
</template>

<script>
import Chart1 from './components/Page1';
import Chart2 from './components/Page2'
import Chart3 from './components/Page3'
import Chart4 from './components/Page4'
import Chart5 from './components/Page5'
import Avatar from './components/Root'
export default {
  name: 'App',
  components: {
    Chart1,
    Chart2,
    Chart3,
    Chart4,
    Chart5,
    Avatar
  }
}
</script>