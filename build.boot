(set-env!
  :resource-paths #{"src"}
  :repositories [["clojars" "http://clojars.org/repo/"]
                 ["maven-central" "http://repo1.maven.org/maven2/"]]
  :dependencies '[[org.clojure/clojure "1.8.0"]
                  [provisdom/boot-tasks "0.4.2" :scope "test" :exclusions [commons-codec]]
                  ;; project deps
                  [clj-http "2.1.0"]
                  [cheshire "5.5.0"]
                  [com.cemerick/url "0.1.1"]
                  [org.clojure/data.codec "0.1.0"]
                  [environ "1.0.2"]])

(require
  '[provisdom.boot-tasks :refer :all])

(def +version+ "0.6.0")

(task-options!
  pom {:project 'tentacles
       :version +version+})