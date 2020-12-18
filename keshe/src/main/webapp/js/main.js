$(document).ready(function () {
    $.ajax({
        type: "get",
        url: "init.do",
        contentType : "application/x-www-form-urlencoded;charset=utf-8",
        data_Type: "json",
        success: function (response) {
            let list = JSON.parse(response);
            let one = list.yiji;
            let chandi = list.chandi;
            let jiliang = list.jiliang;
            $("#one").empty();
            $("#one").append($("<option>").val("").text("--请选择--"));
            for (let index = 0; index < one.length; index++) {
                let option = $("<option>").val(one[index].id)
                    .text(one[index].one);
                $("#one").append(option);
            }

            $("#cd").empty();
            $("#cd").append($("<option>").val("").text("--请选择--"));
            for (let index = 0; index < chandi.length; index++) {
                let option = $("<option>").val(chandi[index].id)
                    .text(chandi[index].chanDi);
                $("#cd").append(option);
            }

            $("#jiliang").empty();
            $("#jiliang").append($("<option>").val("").text("--请选择--"));
            for (let index = 0; index < jiliang.length; index++) {
                let option = $("<option>").val(jiliang[index].id)
                    .text(jiliang[index].jiLiangDanWei);
                $("#jiliang").append(option);
            }

        }
    })

    $("#one").change(function () {
        if($(this).val() == ""){
            $("#provinceError").text("请选择一级目录");
            return;
        }

        $("#two").empty();
        $("#two").append($("<option>").val("").text("--请选择--"));

        let t = $("#one").val();
        $.ajax({
            type: "post",
            url: "getTwo.do",
            data: {id: t},
            contentType : "application/x-www-form-urlencoded;charset=utf-8",
            data_Type: "json",
            success:function (response) {
                let list = JSON.parse(response).erji;
                $("#two").empty();
                $("#two").append($("<option>").val("").text("--请选择--"));
                for (let index = 0; index < list.length; index++) {
                    let option = $("<option>").val(list[index].id)
                        .text(list[index].two);
                    $("#two").append(option);
                }
            }
        })

    })

})

let Init = function () {
    $.ajax({
        type: "get",
        url: "init.do",
        contentType : "application/x-www-form-urlencoded;charset=utf-8",
        data_Type: "json",
        success: function (response) {
            let list = JSON.parse(response);
            let one = list.yiji;
            let chandi = list.chandi;
            let jiliang = list.jiliang;
            $("#one").empty();
            $("#one").append($("<option>").val("").text("--请选择--"));
            for (let index = 0; index < one.length; index++) {
                let option = $("<option>").val(one[index].id)
                    .text(one[index].one);
                $("#one").append(option);
            }

            $("#cd").empty();
            $("#cd").append($("<option>").val("").text("--请选择--"));
            for (let index = 0; index < chandi.length; index++) {
                let option = $("<option>").val(chandi[index].id)
                    .text(chandi[index].chanDi);
                $("#cd").append(option);
            }

            $("#jiliang").empty();
            $("#jiliang").append($("<option>").val("").text("--请选择--"));
            for (let index = 0; index < jiliang.length; index++) {
                let option = $("<option>").val(jiliang[index].id)
                    .text(jiliang[index].jiLiangDanWei);
                $("#jiliang").append(option);
            }

            $("#two").empty();
            $("#two").append($("<option>").val("").text("--请选择--"));
            $("#id").val("")
            $("#code").val("");
            $("#name").val("");

        }
    })
}

let quit = function () {
    alert("退出!")
}

let save = function () {
    let id = $("#id").val();
    let code = $("#code").val();
    let name = $("#name").val();
    let cd=$("#cd").val();
    let jiliang=$("#jiliang").val();
    let one=$("#one").val();
    let two=$("#two").val();

    $.ajax({
        type: "get",
        url: "save.do",
        contentType : "application/x-www-form-urlencoded;charset=utf-8",
        data_Type: "json",
        data: {
            id:id,
            code,code,
            name,name,
            cd,cd,
            jiliang,jiliang,
            one,one,
            two,two
        },
        success:function (response) {
            alert(response);
            Init();
        }
    })
}
