<template>
  <div>
    <Avatar/>
    <main>
      <Cluster/>
      <div class="b-example-divider w-100"></div>
      <Cloud/>
      <div class="b-example-divider w-100"></div>
      <Senti/>
    </main>
  </div>
</template>

<script>
import Avatar from './Nav';
import Senti from './Senti';
import Cluster from './Classify';
import Cloud from './Cloud';
export default {
  name: 'MarMain',
  components: {
    Avatar,
    Cluster,
    Cloud,
    Senti
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
  box-shadow: inset 0 0.5em 1.5em rgba(0, 0, 0, 0.1), inset 0 0.125em 0.5em rgba(0, 0, 0, 0.15)
}
</style>
