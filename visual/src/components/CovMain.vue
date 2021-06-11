<template>
  <div>
    <Avatar/>
    <main>
      <Change/>
      <div class="b-example-divider w-100"></div>
      <Confirm/>
      <div class="b-example-divider w-100"></div>
      <Cured/>
      <div class="b-example-divider w-100"></div>
      <Death/>
      <div class="b-example-divider w-100"></div>
      <Classify/>
      <div class="b-example-divider w-100"></div>
      <Map/>
    </main>
  </div>
</template>

<script>
import Confirm from './Confirm';
import Change from './Change';
import Death from './Death';
import Cured from './Cured';
import Map from './Map';
import Classify from './Classify'
import Avatar from './Nav';

export default {
  name: 'MarMain',
  components: {
    Confirm,
    Change,
    Death,
    Cured,
    Map,
    Classify,
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
  box-shadow: inset 0 0.5em 1.5em rgba(0, 0, 0, 0.1), inset 0 0.125em 0.5em rgba(0, 0, 0, 0.15)
}
</style>
