$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Features/bbcHomePage.feature");
formatter.feature({
  "line": 1,
  "name": "BBCHomePage",
  "description": "",
  "id": "bbchomepage",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 5,
  "name": "",
  "description": "",
  "id": "bbchomepage;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@bbcHomePageTest"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "User is open BBC Home page",
  "keyword": "Given "
});
formatter.match({
  "location": "BbcHomePageStepDefination.user_is_open_BBC_Home_page()"
});
formatter.result({
  "duration": 8620748500,
  "status": "passed"
});
});