(ns opentrack.test.runner-visual
  (:require [cljs-test-display.core]
            [figwheel.main.testing :refer-macros [run-tests]]
            [opentrack.renderer.arithmetic-test]
            [opentrack.main.arithmetic-test]))

(run-tests (cljs-test-display.core/init!))
