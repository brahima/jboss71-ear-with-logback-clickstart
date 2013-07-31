# Welcome to JBoss 7.1 EAR with LogBack Clickstart

<!---

This is a "ClickStart" that gets you going with a JBoss 7.1 ear nad Logback  "seed" project starting point. You can launch it here:

<a href="https://grandcentral.cloudbees.com/?CB_clickstart=https://raw.github.com/CloudBees-community/jboss71-ear-with-logback-clickstart/master/clickstart.json"><img src="https://d3ko533tu1ozfq.cloudfront.net/clickstart/deployInstantly.png"/></a>

This will setup a continuous deployment pipeline - a CloudBees Git repository, a Jenkins build compiling and running the test suite (on each commit).
Should the build succeed, this seed app is deployed on a JBoss 7.1 container.

-->

# JBoss 7.1 EAR with LogBack & JBoss Deployment Structure Exclusions

Please note **CloudBees JBoss 7.1 Stack requires the deployment of an ear to use `jboss-deployment-structure.xml`**. It will not work if you deploy a .war file.

Extract from `src/main/application/jboss-deployment-structure.xml` file to prevent JBoss from hijacking SLF4J

```xml
<jboss-deployment-structure xmlns="urn:jboss:deployment-structure:1.0">
    <sub-deployment name="ROOT.war">
        <exclusions>
            <module name="org.apache.commons.logging"/>
            <module name="org.apache.log4j"/>
            <module name="org.slf4j"/>
            <module name="org.slf4j.ext"/>
            <module name="org.slf4j.impl"/>
            <module name="org.slf4j.jcl-over-slf4j"/>
        </exclusions>
    </sub-deployment>
</jboss-deployment-structure>
```






