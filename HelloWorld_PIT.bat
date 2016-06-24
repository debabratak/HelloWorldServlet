call mvn -version
call mvn package org.pitest:pitest-maven:mutationCoverage -Dmaven.test.failure.ignore=true