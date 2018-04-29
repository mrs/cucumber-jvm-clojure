(ns runner
  (:require [clojure.test :refer :all])
  (:import cucumber.api.cli.Main))

(def options ["--plugin" "pretty"
              "--glue" "test/features"
              "test/features"])

(deftest run-cukes
  (is (zero? (Main/run
               (into-array options)
               (.getContextClassLoader (Thread/currentThread))))))

;(RT/load "features/step_definitions/cuke_steps")