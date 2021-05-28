<template>
  <div display:block>
    <div>
      <Root />
    </div>
    <div class="mydiv">
      <div class="sub"> <echart1 class="component" /></div>
       <div class="sub"><echart2 class="component" /></div>
       <div class="sub"><echart3 class="component" /></div>
       <div class="sub"><echart4 class="component" /></div>
    </div>
  </div>
</template>

<script>
import echart1 from "@/components/Page.vue";
import echart2 from "@/components/Page2.vue";
import echart3 from "@/components/Page3.vue";
import echart4 from "@/components/Page4.vue";
import Root from "../components/Root.vue";

export default {
  components: {
    echart1,
    echart2,
    echart3,
    echart4,
    Root
  },
  data() {
    return {};
  },
  methods: {}
};
</script>
<style scoped>
.sub{
  margin-top:200px;
  
}
.mydiv {
  width: 100%;
  height: 100%;
  position: absolute;
  left: 50%;
  top: 100%;
  transform: translate(-50%, -50%);
  margin-left: auto;
  margin-right: auto;
}
.component {
  position: relative;
  left: 50%;
  top: 50%;
  transform: translate(-50%, -50%);
}

.resize {
  position: absolute;
  right: 20px;
  top: 20px;
  cursor: pointer;
}
</style>
