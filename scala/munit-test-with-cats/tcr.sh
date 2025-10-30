#!/bin/bash
(sbt test && git commit -a -m "wip") || git reset  --hard
