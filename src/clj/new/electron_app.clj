(ns clj.new.electron-app
  (:require [clj.new.templates :refer [renderer project-name ->files sanitize]]))

(def render (renderer "electron-app"))

(defn electron-app [name]
  (let [data {:name (project-name name)
              :sanitized (sanitize (project-name name))}]
    (println "Generating an Electron application called" (project-name name))
    (->files data
             ["deps.edn" (render "deps.edn" data)]
             ["dev.cljs.edn" (render "dev.cljs.edn" data)]
             ["main.cljs.edn" (render "main.cljs.edn" data)]
             ["package.json" (render "package.json" data)]
             ["readme.md" (render "readme.md" data)]
             ["renderer.cljs.edn" (render "renderer.cljs.edn" data)]
             ["test.cljs.edn" (render "test.cljs.edn" data)]
             ["resources/index-dev.html" (render "resources/index-dev.html" data)]
             ["resources/index.html" (render "resources/index.html" data)]
             ["resources/test.html" (render "resources/test.html" data)]
             ["src/config/dev/{{sanitized}}/config.cljs" (render "src/config/dev/config.cljs" data)]
             ["src/config/prod/{{sanitized}}/config.cljs" (render "src/config/prod/config.cljs" data)]
             ["src/main/{{sanitized}}/main/core.cljs" (render "src/main/core.cljs" data)]
             ["src/main/{{sanitized}}/main/arithmetic.cljs" (render "src/main/arithmetic.cljs" data)]
             ["src/renderer/{{sanitized}}/renderer/arithmetic.cljs" (render "src/renderer/arithmetic.cljs" data)]
             ["src/renderer/{{sanitized}}/renderer/core.cljs" (render "src/renderer/core.cljs" data)]
             ["src/test/{{sanitized}}/main/arithmetic_test.cljs" (render "src/test/main/arithmetic_test.cljs" data)]
             ["src/test/{{sanitized}}/renderer/arithmetic_test.cljs" (render "src/test/renderer/arithmetic_test.cljs" data)]
             ["src/test/{{sanitized}}/test/runner_cmdline.cljs" (render "src/test/test/runner_cmdline.cljs" data)]
             ["src/test/{{sanitized}}/test/runner_visual.cljs" (render "src/test/test/runner_visual.cljs" data)])))
