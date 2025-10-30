#!/bin/bash
(sbt test && git commit -am "wip") || git reset --hard HEAD
