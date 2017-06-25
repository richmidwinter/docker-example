#!/bin/sh

set -e

cd stock-web/
mvn clean package
cd -

cd shop-web/
mvn clean package
cd -
