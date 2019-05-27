// const axios = require('axios')
var vm = new Vue({
    el: '#app',
    data: {
        message:'测试数据',
        tables:[],
    },
    created(){
        axios.get('/testStList').then(rs=>{
            this.tables=rs.data;
            console.log(this.tables);
        }).catch(err =>{
            console.log(err);
        })
    }
});
