# grails402autotrimmingissue
PoC repo, to explain issue in the Grails 4.0.2 framework 

To replicate issue please start an app and go to:
http://localhost:8080/test/index
(refreshing this url should throw an exception)

however if you go to
http://localhost:8080/test/test
(refreshing this url should NOT throw an exception)

Problem is with unexpected autotriming of values when saving data, but not when using dynamic finders like: findBy... or findWhere...
