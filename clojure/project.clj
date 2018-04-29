(defproject io.cucumber/cucumber-clojure "2.0.2-SNAPSHOT"
  :source-paths ["src/main/clojure"]
  :test-paths ["src/test/clojure"]
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [io.cucumber/cucumber-core "2.0.1"]]

  :aot [cucumber.runtime.clj])
