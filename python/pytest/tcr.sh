#!/bin/bash
(pytest && git commit -am "wip") || git reset --hard HEAD
