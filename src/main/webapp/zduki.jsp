<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <title>Биржа Мемов</title>
    <link rel="stylesheet" href="MainStyle.css">

</head>


<body>

<header>
    <a href="index.html"><img src="shapka.png" width="480"></a>
</header>

<form method="get" action="/search" target="_blank" style="margin-left: 1000px;">
    <input name="q" id="form-query" value="" placeholder="поиск по сайту">
    <input src="eye.png" type="image" style="vertical-align: bottom; padding: 0;"/>
</form>

<div class = "side">
    <ul class = "menu">
        <li class="menu__list"><a href="#">Бояны</a>
            <ul class="menu__drop">
                <li><a href="15_1.html">пятнадцатый год</a></li>
                <li><a href="15_2.html">пятнадцатый год</a></li>
                <li><a href="15_3.html">пятнадцатый год</a></li>
                <li><a href="15_4.html">ЭТО ВАЖНО</a></li>
            </ul>
        </li>

        <li>
            <a href="#">Вложить лукасы</a>
        </li>

        <li class="menu__list"><a href="#">Котеровки</a>
            <ul class="menu__drop">
                <li><a href="kot_1.html">На сегодня</a></li>
                <li><a href="kot_2.html">За последние три дня</a></li>
                <li><a href="kot_3.html">Очень хорошие котеровки</a></li>
            </ul>
        </li>

        <li class="menu__list"><a href="#">Вывести лукасы</a>
            <ul class="menu__drop">
                <li><a href="#">1) вопервых что ты мне сделаеш</a></li>
                <li><a href="#">я в другом городе</a></li>
                <li><a href="#">за мат извени</a></li>
            </ul>
        </li>

        <li class="menu__list"><a href="#">Запостить мем</a>
            <ul class="menu__drop">
                <li><a href="zduki.jsp">Мои здюки</a></li>
                <li><a href="notb.jsp">Пока не боян</a></li>
                <li><a href="#">Я твою мамку эчпочмак</a></li>
            </ul>
        </li>
    </ul>
</div>
<div id="images-box">
    <div class="holder">
        <div id="image-1" class="image-lightbox">
            <span class="close"><a href="#">X</a></span>
			<img src="" alt="Nothing is here"><br>
            <img src="heart.png" style="width: 30px; height: 30px;"> tut text
            <a class="expand" href="#image-1"></a>
        </div>
    </div>
		
		
    <div class="holder">
        <div id="image-2" class="image-lightbox">
            <span class="close"><a href="#">X</a></span>
            <img src="" alt="Make your meme"><br>
            <img src="heart.png" style="width: 30px; height: 30px;"> tut text
            <a class="expand" href="#image-2"></a>
        </div>
    </div>
    <div class="holder">
        <div id="image-3" class="image-lightbox">
            <span class="close"><a href="#">X</a></span>
            <img src="" alt="JUST DO IT!"><br>
            <img src="heart.png" style="width: 30px; height: 30px;"> tut text
            <a class="expand" href="#image-3"></a>
        </div>
    </div>
</div>



</body>
</html>