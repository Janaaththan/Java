<template id="hello-world">
    <h1>Hello World</h1>
</template>
<script>
    Vue.component("hello-world",
        {template: "#hello-world"});

</script>
<style>
    h1 {
        color: red;
    }
</style>