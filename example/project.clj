(defproject cucumber-clojure-example "2.4.0-SNAPSHOT"
  :description "A demo of Cucumber with Clojure and Leiningen"
  :dependencies [[org.clojure/clojure "1.9.0"]]

  :test-paths ["test/acceptance"
               "test/features"]

  :profiles {:dev {:monkeypatch-clojure-test false
                   :dependencies [[io.cucumber/cucumber-clojure "2.4.0-SNAPSHOT"]]}}
  )
