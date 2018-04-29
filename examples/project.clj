(defproject clojure_cukes "1.0.X"
  :description "A demo of Cucumber with Clojure and Leiningen"
  :dependencies [[org.clojure/clojure "1.8.0"]]

  :test-paths ["test/acceptance"
               "test/features"]

  :profiles {:dev {:monkeypatch-clojure-test false
                   :dependencies [[io.cucumber/cucumber-clojure "2.0.2-SNAPSHOT"]]}}

  )
