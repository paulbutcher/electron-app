(ns {{name}}.test.runner-cmdline
  (:require [figwheel.main.testing :refer-macros [run-tests-async]]
            [{{name}}.renderer.arithmetic-test]
            [{{name}}.main.arithmetic-test]))

(defn -main [& args]
  (run-tests-async 10000))
