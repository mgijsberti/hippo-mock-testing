#!/bin/bash
VERSION='1.09.00'
#VERSION='1.07.07'
#VERSION='1.05.09'
mvn archetype:generate -DarchetypeRepository=http://maven.onehippo.com/maven2 -DarchetypeGroupId=org.onehippo.cms7 -DarchetypeArtifactId=hippo-archetype-website -DarchetypeVersion=${VERSION}

