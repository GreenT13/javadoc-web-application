[![Build Status](https://travis-ci.com/GreenT13/javadoc-web-application.svg?branch=master)](https://travis-ci.com/GreenT13/javadoc-web-application)
[![Coverage Status](https://coveralls.io/repos/github/GreenT13/javadoc-web-application/badge.svg?branch=master)](https://coveralls.io/github/GreenT13/javadoc-web-application?branch=master)
[![Docs](https://img.shields.io/badge/docs-Github%20Pages-blue)](https://greent13.github.io/javadoc-web-application/)
[![Deployment](https://img.shields.io/badge/deployment-Heroku-brightgreen)](https://javadoc-web-application.herokuapp.com/)

# Javadoc web application
Java web application for displaying javadoc.jar artifacts in the browser! It downloads the artifacts automatically
from repositories, based on given search criteria. Uses a lot of caching to avoid too many requests.

# TODO items

## Tests
- [ ] Integration tests with mocked Maven Central
- [ ] Thymeleaf tests?? https://dzone.com/articles/spring-test-thymeleaf-views
- [ ] Run through all tests, cleanup code and make some util functions for easily creating objects

## General code thoughts
- [ ] Error handling for incorrect URLs
- [x] Rethink exception catching strategy in ApiDocController
- [ ] Support for "latest" URLs
- [ ] Add a "share" button, where you can create a link with specific details (link to class, package, home URL without index.html)
