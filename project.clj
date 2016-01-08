(defproject cs1 "0.1.0-SNAPSHOT"
  :description "Minimal ClojureScript project using JavaScript libraries"
  :url "http://defn.github.io/cs1"

  :dependencies [[org.clojure/clojure "1.7.0"]
                 [org.clojure/clojurescript "1.7.170" :classifier "aot"
                  :exclusion [org.clojure/data.json]]
                 [org.clojure/data.json "0.2.6" :classifier "aot"]]

  :jvm-opts ^:replace ["-Xmx1g" "-server"]
  :plugins [[lein-npm "0.6.1"]
            [michaelblume/lein-marginalia "0.9.0"] ; forked https://github.com/MichaelBlume/lein-marginalia
            ]
  :source-paths ["src" "target/classes"]
  :clean-targets ["out" "release"]
  :target-path "target"

  ; lein-npm: lein npm install, lein deps
  :npm {:dependencies [[source-map-support "0.3.2"]]})
