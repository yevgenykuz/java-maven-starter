Java Maven Starter
##################

Java, maven based playground starter project.

|travis_ci| |codecov|

-----

.. contents::

.. section-numbering::

Features
========

This starter includes:

* **Logback**  - Console and rotating file logging - see logback.xml_
* **Junit 5 + hamcrest**  - Testing frameworks
* **Executable jar creation** - See maven-shade-plugin plugin section in pom.xml_
* **Travis CI with codecov template** - Basic travis CI configuration with codecov - see travis.yml_
* **Basic maven profiles with parameter injection** - See temp.properties_ and pom.xml_
* **GitHub templates** - See `.github folder`_ and *.md files in root folder

Usage
=====

* Clone or download

Meta
====

Authors
-------

`yevgenykuz <https://github.com/yevgenykuz>`_

License
-------

`MIT License <https://github.com/yevgenykuz/java-maven-starter/blob/master/LICENSE>`_


-----

.. _logback.xml: https://github.com/yevgenykuz/java-maven-starter/blob/master/src/main/resources/logback.xml
.. _pom.xml: https://github.com/yevgenykuz/java-maven-starter/blob/master/pom.xml
.. _travis.yml: https://github.com/yevgenykuz/java-maven-starter/blob/master/.travis.yml
.. _temp.properties: https://github.com/yevgenykuz/java-maven-starter/blob/master/src/main/resources/temp.properties
.. _`.github folder`: https://github.com/yevgenykuz/java-maven-starter/tree/master/.github

.. |travis_ci| image:: https://travis-ci.org/yevgenykuz/java-maven-starter.svg?branch=master
    :target: https://travis-ci.org/yevgenykuz/java-maven-starter
    :alt: Travis CI

.. |codecov| image:: https://codecov.io/gh/yevgenykuz/java-maven-starter/branch/master/graph/badge.svg
    :target: https://codecov.io/gh/yevgenykuz/java-maven-starter/branch/master
    :alt: Test coverage
