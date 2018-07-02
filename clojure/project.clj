(defproject cucumber-clojure "2.4.0-SNAPSHOT"
  :source-paths ["src/main/clojure"]
  :test-paths ["src/test/clojure"]
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [io.cucumber/cucumber-core "2.4.0"]]

  :aot [cucumber.runtime.clj])
