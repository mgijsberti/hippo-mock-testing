#!/bin/bash
VERSION='1.09.01'
mvn archetype:generate -DarchetypeRepository=http://maven.onehippo.com/maven2 -DarchetypeGroupId=org.onehippo.cms7 -DarchetypeArtifactId=hippo-archetype-website -DarchetypeVersion=${VERSION}

