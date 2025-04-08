
<style>
    @font-face {
    font-family: 'Arita-dotum-Medium';
    src:
    url('https://cdn.jsdelivr.net/gh/projectnoonnu/noonfonts_one@1.0/Arita-dotum-Medium.woff') format('woff');
    font-weight: normal;
    font-style: normal;
}
    .dh-footer {
    font-family: 'Arita-dotum-Medium';
    margin-top: 100px;
    width: 100%;
    height: 300px;

}

    .dh-footer>.footer-top-container {
    width: 100%;
    height: 80%;
    /* padding: 30px 20px; */
    border-top: 1px solid gray;
    border-bottom: 1px solid gray;
}

    .dh-footer>.footer-top-container>.footer-top {
    margin: 0 auto;
    width: 1200px;
    height: 100%;
    padding: 30px 20px;
}

    .dh-footer .footer-top>.footer-left {
    float: left;
    overflow: hidden;
    margin-right: 180px;
}

    .dh-footer .footer-top>.footer-right {
    float: left;
    overflow: hidden;
}

    .dh-footer .footer-top>.footer-right>ul:nth-child(3)>li>span {
    font-size: small;
}

    .dh-footer>.footer-bottom {
    height: 20%;
    text-align: center;
}

    .dh-footer ul {
    list-style: none;
    float: left;
}

    .dh-footer ul>li>span>a {
    text-decoration: none;
    color: rgb(78, 78, 78);

}

    .large-phone-number {
    display: block;
    color: #314C83;
    font-size: x-large;
    font-weight: bold;
    padding-bottom: 20px;
}

    .footer-title {
    display: block;
    font-weight: bold;
    font-size: medium;
    padding-bottom: 20px;
}

    .footer-bottom div {
    margin: 5px auto;
    font-size: small;
}

    .copyright {
    font-size: small;
    color: gray;
}
</style>

var main = {
    init : function(){
        var _this=this;

        $('#btn-save').on('click', function(){
            _this.save();
        });
        $('#btn-update').on('click', function(){
            _this.update();
        });
        $('#btn-delete').on('click', function(){
            _this.delete();
        });
    },
    save : function() {
        var data = {
            title: $('#title').val(),
            author: $('#author').val(),
            content: $('#content').val()
        };

        $.ajax({
            type : 'POST',
            url : '/api/v1/posts',
            dataType : 'json',
            contentType : 'application/json; charset=utf-8',
            data : JSON.stringify(data)
        }).done(function(){
            alert("글이 등록되었습니다.");
            window.location.href='/';
        }).fail(function(error){
            alert(JSON.stringify(error));
        });
    },
    update : function (){
        var data = {
            title: $('#title').val(),
            author: $('#author').val(),
            content: $('#content').val()
        };

        var id = $('#id').val();

        $.ajax({
            type : 'PUT',
            url : '/api/v1/posts/'+id,
            dataType : 'json',
            contentType : 'application/json; charset=utf-8',
            data : JSON.stringify(data)
        }).done(function(){
            alert("글이 수정되었습니다.");
            window.location.href='/';
        }).fail(function(error){
            alert(JSON.stringify(error));
        });
    },
    delete : function (){
        var id = $('#id').val();

        $.ajax({
            type : 'DELETE',
            url : '/api/v1/posts/'+id,
            dataType : 'json',
            contentType : 'application/json; charset=utf-8',
        }).done(function(){
            alert("글이 삭제되었습니다.");
            window.location.href='/';
        }).fail(function(error){
            alert(JSON.stringify(error));
        });
    }

};

main.init();