<template>
  <div class="container">
    <div class="row">
      <div class="col-lg-3 col-md-4 d-flex flex-column">
        <div class="mb-auto"></div>
        <main>
          <p>
            1.除与主题直接相关的词外，首个关键词为"家暴"，其存在导致了微博用户对离婚冷静期的排斥和担忧；其后的”申请“和”登记”出现原因与离婚流程改变有关
          </p>
          <p>
            2.”自由“反映人们认为冷静期的实施影响婚姻自由的观点
          </p>
          <p>
            3.”女性“、“感情”和“孩子”几个词表明，对女性造成的影响，是人们思考的焦点，而“感情”和“孩子”则是离婚时，需要考虑的因素
          </p>
          <p>
            4.“冲动”和“出轨“出现在18和19位，意味着人们承认冲动离婚的存在，但对出轨离婚也予以关注；”幸福“出现在48位，说明其重要地位
          </p>
          <p>
            综上：家暴和出轨是微博用户的主要担忧，婚姻自由和女性离婚时的权益尚需更多的关注；夫妻离婚时应严格审视双方感情问题以及对孩子造成的伤害，避免冲动离婚。最后，离婚冷静期与人们的幸福密切相关，应予以高度重视。
          </p>
        </main>
        <div class="mt-auto"></div>
      </div>
      <div class="col-lg-9 col-md-8">
        <img src="../assets/wordcloud.png">
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: "Cloud"
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
</style>