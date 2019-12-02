(ns {{name}}.main.arithmetic-test
  (:require [cljs.test :refer-macros [deftest is testing]]
            [{{name}}.main.arithmetic :refer [add]]))

(deftest add-test
  (is (= (+ 1 2) (add 1 2))))

(deftest add-test-2
  (is (= (+ 75 10) (add 10 75))))
