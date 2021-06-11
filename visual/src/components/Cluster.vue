<template>
  <div class="container">
    <div class="row">
      <div class="col-lg-3 col-md-4 flex-column d-flex">
        <div class="mb-auto"></div>
        <main>
          <p>
            从图中可以看出，三个类别之间的边界很明显，每个类别的数据比较集中，说明k-means算法的k值选取比较精准。
          </p>
        </main>
        <div class="mt-auto"></div>
      </div>
      <div class="col-lg-9 col-md-8">
        <img src="../assets/cluster1.png">
      </div>
    </div>
    <hr>
    <div class="row">
      <div class="col-lg-3 col-md-4 flex-column d-flex">
        <div class="mb-auto"></div>
        <main>
          <p>
            在类别一中，“降低”，“下降”词频比较高，结合周围的词，可能是由于恐婚、出轨等原因，导致近年来我国的生育出生率下降。
          </p>
        </main>
        <div class="mt-auto"></div>
      </div>
      <div class="col-lg-9 col-md-8">
        <img src="../assets/cluster2.png">
      </div>
    </div>
    <hr>
    <div class="row">
      <div class="col-lg-3 col-md-4 flex-column d-flex">
        <div class="mb-auto"></div>
        <main>
          <p>
            在类别二中，“感情”，“申请”，“撤回”，“夫妻”，“自由”，“冲动”的出现频率很高，说明离婚冷静期的实施确实在一定程度上降低了离婚率，同时说明一部分人对离婚冷静期持有积极的看法，认为离婚冷静期可以减少个人的冲动行为，降低离婚率。
          </p>
        </main>
        <div class="mt-auto"></div>
      </div>
      <div class="col-lg-9 col-md-8">
        <img src="../assets/cluster3.png">
      </div>
    </div>
    <hr>
    <div class="row">
      <div class="col-lg-3 col-md-4 flex-column d-flex">
        <div class="mb-auto"></div>
        <main>
          <p>
            在类别三中，“女性”，“孩子”，“出轨”，“法律”占了很大比重，说明女性的自我保护意识逐渐增强，已经会使用法律武器保护自己的合法权益，但孩子还是很大的羁绊。
          </p>
        </main>
        <div class="mt-auto"></div>
      </div>
      <div class="col-lg-9 col-md-8">
        <img src="../assets/cluster4.png">
      </div>
    </div>
    <hr>
    <div class="row">
      <div class="col-12 flex-column d-flex alone">
        <div class="mb-auto"></div>
        <main>
          <p>
            在词云图中，部分词同时出现，例如“冲动”，这可能是因为微博评论之间的差异比较小，或者是文档中的高频率词没有完全剔除。
          </p>
        </main>
        <div class="mt-auto"></div>
      </div>
    </div>
    <hr>
  </div>
</template>

<script>
export default {
  name: "Cluster"
}
</script>

<style scoped>
img {
  height: 900px;
  padding: 20px;
}

p {
  margin: 10px 20px;
  text-align: left;
  right: 0px;
  font-size: 20px;
  display: block;
  color: #86868b;
  font-family: "SF Pro SC", "SF Pro Display", "SF Pro Icons", "PingFang SC",
  "Helvetica Neue", "Helvetica", "Arial", sans-serif;
}
.alone{
  height: 200px;
}
</style>