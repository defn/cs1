(require '[cljs.build.api :as b])

(b/watch "src"
  {:main 'cs1.core
   :output-to "out/cs1.js"
   :output-dir "out"})
