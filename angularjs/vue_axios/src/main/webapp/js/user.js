new Vue({
    el: "#app",
    data: {
        user: {},
        userList: []
    },
    methods: {
        findAll: function () {
            var _this=this;
            axios.post('/vue_axios/user/findAll.do')
                .then(function (response) {
                    _this.userList=response.data;

            })
                .catch(function (err) {
                console.log(err)
            })
        },
        findById:function (userId) {
            var _this=this;
            axios.get('/vue_axios/user/findById.do',{params:{id:userId}})
                .then(function (response) {
                    _this.user=response.data;
                    $("#myModal").modal("show");
                })
                .catch(function (err) {
                    console.log(err)
                })
        },
        update:function (user) {
            var _this=this;
            axios.post('/vue_axios/user/updateUser.do',_this.user)
                .then(function (response) {
                    _this.findAll();

                })
                .catch(function (err) {
                    console.log(err)
                })
        }

    },
    created: function () {
        this.findAll();
    }
})