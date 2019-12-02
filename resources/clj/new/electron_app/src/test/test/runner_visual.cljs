(ns {{name}}.test.runner-visual
  (:require [cljs-test-display.core]
            [figwheel.main.testing :refer-macros [run-tests]]
            [{{name}}.renderer.arithmetic-test]
            [{{name}}.main.arithmetic-test]))

(run-tests (cljs-test-display.core/init!))
