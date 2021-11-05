# Cucumber Test Reporting

This project is to demonstrate popular cucumber test reporting tools
#### Environment Setup

- Install [JDK 8](https://www3.ntu.edu.sg/home/ehchua/programming/howto/JDK_Howto.html) 
- Install [Maven](https://maven.apache.org/install.html) 
- Install [Chrome](https://www.google.com/intl/es-419/chrome/) / [firefox](https://www.mozilla.org/es-CL/firefox/new/)


#### Test Reporting Tools
* Default Cucumber Reporting
* MasterThought Cucumber Reporting


#### Running the tests for reporting

##### Generate default test reports

```
$ mvn clean test -Dtest=RunDefaultCucumberReportTest
```

##### Generate masterthought test reports

```
$ mvn clean test -Dtest=RunMasterThoughtReportingTest
```

###### Sample Report
![image-1]<img src="docs/images/mt-reporting.png?raw=true" width="300" height="250">

![image-1]<img src="docs/images/mt-reporting-1.png?raw=true" width="500" height="250">


#### Default Browser

By default the browser is Chrome, also you can add arguments `-Dbrowser=firefox` to run test on firefox

 ```
 $ mvn test -Dbrowser=firefox
 ```




#### Resources
* [Cucumber Docs](https://cucumber.io/docs)
* [MasterThought Blog](https://damienfremont.github.io/blog/20160509-test-cucumber_plugin_reporting_2/)


https://bonigarcia.dev/webdrivermanager/#advanced-configuration

https://bonigarcia.dev/webdrivermanager/#recordings

https://medium.com/@boni.gg/webdrivermanager-5-automated-driver-management-and-docker-builder-for-selenium-webdriver-a0a0f747a35d

https://dev.to/automationbro/selenium-docker-tutorial-4dkg

https://www.blazemeter.com/blog/how-to-run-selenium-tests-in-docker

https://www.freecodecamp.org/news/end-to-end-tests-with-selenium-and-docker-the-ultimate-guide/

https://javascript.plainenglish.io/selenium-docker-tutorial-how-to-run-selenium-tests-in-do-8f86b999d318

