;; ## Figuring out how to customize ClojureScript
(ns cs1.core
  (:require [clojure.browser.repl :as repl]))

;; Does the browser repl only affect `scripts/brepl`?
(defonce conn
  (repl/connect "http://localhost:9000/repl"))

;; Directs println to the web console instead of stdout
(enable-console-print!)

;; Check web console for a "Hello world!" if the app ran successfully
(println "Hello world!")
