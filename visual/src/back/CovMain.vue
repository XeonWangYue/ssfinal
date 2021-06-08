<template>
  <div>
    <Avatar/>
    <main>
            <Change />
            <div class="b-example-divider"></div>
            <Confirm />
            <div class="b-example-divider"></div>
            <Cured />
            <div class="b-example-divider"></div>
            <Death />
            <div class="b-example-divider"></div>
            <Map />
            <div class="b-example-divider"></div>
<!--      <Senti/>-->
    </main>
  </div>
</template>

<script>
import Confirm from './Confirm';
import Change from './Change';
import Death from './Death';
import Cured from './Cured';
import Map from './Map';
import Avatar from './Nav';
// import Senti from './sentiment';

export default {
  name: 'MarMain',
  components: {
    Confirm,
    Change,
    Death,
    Cured,
    Map,
    Avatar,
    // Senti
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
