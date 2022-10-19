# Проект по автоматизации тестирования Advantagesolutions

## :bookmark_tabs: Содержание

* <a href="#stack">Cтек проекта</a>
* <a href="#object">Реализованные автотесты</a>
* <a href="#console">Команды запуска</a>
* <a>Визуализация результатов</a>
  + <a href="#selenoid">Selenoid</a>
  + <a href="#jenkins">Jenkins</a>
  + <a href="#allure">Allure</a>
  + <a href="#telegram">Telegram</a>
  
<a id="stack"></a>
## :hammer_and_wrench: Cтек проекта
<div align="center">
<a href="https://www.jetbrains.com/idea/"><img alt="InteliJ IDEA" height="50" src="external/logos/Intelij_IDEA.svg" width="50"/></a>
<a href="https://www.java.com/"><img alt="Java" height="50" src="external/logos/Java.svg" width="50"/></a>
<a href="https://junit.org/junit5/"><img alt="JUnit 5" height="50" src="external/logos/JUnit5.svg" width="50"/></a>
<a href="https://selenide.org/"><img alt="Selenide" height="50" src="external/logos/Selenide.svg" width="50"/></a>
<a href="https://gradle.org/"><img alt="Gradle" height="50" src="external/logos/Gradle.svg" width="50"/></a>
<a href="https://github.com/allure-framework/"><img alt="Allure" height="50" src="external/logos/Allure.svg" width="50"/></a>
<a href="https://www.jenkins.io/"><img alt="Jenkins" height="50" src="external/logos/Jenkins.svg" width="50"/></a>
<a href="https://aerokube.com/selenoid/"><img alt="Selenoid" height="50" src="external/logos/Selenoid.svg" width="50"/></a>
<a href="https://github.com/"><img alt="GitHub" height="50" src="external/logos/GitHub.svg" width="50"/></a>
<a href="https://telegram.org/"><img alt="Telegram" height="50" src="external/logos/Telegram.svg" width="50"/></a>
</div>


<a id="object"></a>
## :mag: Реализованные автотесты
- Проверка отображения логотипа на главной странице
- Проверка открытия формы поиска
- Проверка наличия блока made to order и скролл до него
- Проверка перехода на вкладку INVESTORS
- Проверка открытия формы авторизации из футера


<a id="console"></a>
## :computer: Команды запуска
```bash
clean
test
-DbrowserName=${BROWSER_NAME}
-DbrowserVersion=${BROWSER_VERSION}
-DbrowserSize=${BROWSER_SIZE}
```

<a id="selenoid"></a>
## <a href="https://selenoid.autotests.cloud/video/e1d833aa3b92f863ca66487b400c0542.mp4"><img alt="Selenoid" height="50" src="external/logos/Selenoid.svg" width="50"/>Selenoid</a>

<video src="https://user-images.githubusercontent.com/41300396/196536862-5fe019d4-c0a8-43ce-9015-0cef990109ba.mp4"
controls="controls" style="max-width: 730px;" poster="/external/logos/Selenoid.svg">
Видео не доступно для этого браузера
</video>


<a id="jenkins"></a>
##  <a href="https://jenkins.autotests.cloud/job/qa_guru_15_test_project/"><img alt="Jenkins" height="50" src="external/logos/Jenkins.svg" width="50"/>Jenkins</a>
  
<a href="https://jenkins.autotests.cloud/job/qa_guru_15_test_project/">

<img src="https://user-images.githubusercontent.com/41300396/196721255-9ccf76e7-a77f-4e66-a0bf-abea80f3bba2.png" alt="Jenkins">
</a>

