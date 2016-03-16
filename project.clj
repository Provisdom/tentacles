(defproject
  tentacles
  "0.6.0"
  :dependencies
  [[org.clojure/clojure "1.8.0"]
   [provisdom/boot-tasks
    "0.4.2"
    :scope
    "test"
    :exclusions
    [commons-codec]]
   [clj-http "2.1.0"]
   [cheshire "5.5.0"]
   [com.cemerick/url "0.1.1"]
   [org.clojure/data.codec "0.1.0"]
   [environ "1.0.2"]]
  :source-paths
  ["src"])