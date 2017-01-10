<%--
  Created by IntelliJ IDEA.
  User: zihua
  Date: 16-12-22
  Time: 下午11:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style type="text/css">
        #mydiv {
            position: absolute;
            left: 50%;
            top: 50%;
            margin-left: -200px;
            margin-top: -50px;
        }

        .mouseOver{
            background: #708090;
            color: #fffafa;
        }

        .mouseOut{
            background: #fffafa;
            color: #708090;
        }
    </style>

    <script type="text/javascript">
        var xmlHttp;

        function getMore() {
            var content = document.getElementById("keyword");
            if (content.value == ""){
                clearr();
                return;
            }
            var key = content.value;
            xmlHttp = getXmlHttp();
            var url = "http://localhost:8080/search/more?keyword=" + key;
            xmlHttp.open("GET", url, true);
            xmlHttp.onreadystatechange = callback;
            xmlHttp.send(null);
        }

        function getXmlHttp() {
            return new XMLHttpRequest();
        }

        function callback() {
            if (xmlHttp.readyState == 4) {
                if (xmlHttp.status == 200) {
                    var result = xmlHttp.responseText;
                    var json = eval("(" + result + ")");
                    setContent(json);
                }
            }
        }

        function setContent(datas) {
            clearr();
            var si = datas.length;
            for (var i = 0; i < si; i++) {
                var text = datas[i];
                var tr = document.createElement("tr");
                var td = document.createElement("td");

                td.setAttribute("border", "0");
                td.setAttribute("bgcolor", "fffafa");
                td.onmouseover = function () {
                    this.className = 'mouseOver';

                };

                td.onmouseout = function () {
                    this.className = 'mouseOut';
                };

                td.onclick = function () {

                };

                td.appendChild(document.createTextNode(text));
                tr.appendChild(td);
                document.getElementById("content_666").appendChild(tr);
            }

        }

        function clearr() {
            var tb = document.getElementById("content_666");
            var len = tb.childNodes.length;
            for (var i = len - 1; i >= 0; i--) {
                tb.removeChild(tb.childNodes[i]);
            }

        }
        
        function keyblur() {
            clearr();
        }

    </script>
</head>
<body>
<div id="mydiv">
    <input type="text" size="50" id="keyword" onkeyup="getMore()" onblur="keyblur()" onfocus="getMore()"/>
    <input type="button" value="搜索一下" width="50px"/>
    <div id="popdiv">
        <table id="content_table" bgcolor="#fffafa" border="0" cellspacing="0"
               cellpadding="0">
            <tbody id="content_666">


            </tbody>
        </table>
    </div>
</div>

</body>
</html>
