<template>
  <div id="app">
    <Avatar />
    <main>
      <Chart2 />
      <div class="b-example-divider"></div>
      <Chart1 />
      <div class="b-example-divider"></div>
      <Chart3 />
      <div class="b-example-divider"></div>
      <Chart4 />
      <div class="b-example-divider"></div>
      <Chart5 />
  
    </main>
  </div>
</template>

<script>
import Chart1 from './Page1';
import Chart2 from './Page2';
import Chart3 from './Page3';
import Chart4 from './Page4';
import Chart5 from './Page5';
import Avatar from './Root';

export default {
  name: 'App',
  components: {
    Chart1,
    Chart2,
    Chart3,
    Chart4,
    Chart5,
    Avatar
  },
}
</script>

<style>
  main {
    display: block;
    text-align: center;
  }

  .b-example-divider {
    height: 3rem;
    background-color: rgba(0, 0, 0, .1);
    border: solid rgba(0, 0, 0, .15);
    border-width: 1px 0;
    box-shadow: inset 0 0.5em 1.5em rgba(0,0,0 ,0.1), inset 0 0.125em 0.5em rgba(0,0,0,0.15)
  }
</style>
