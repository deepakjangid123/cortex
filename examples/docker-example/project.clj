(defproject docker "0.9.4"
  :description "A simple example of how to run a cortex application in a docker container."
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [thinktopic/cortex "0.9.4"]
                 [org.bytedeco.javacpp-presets/cuda "8.0-1.2"]]

  :main docker-example.core
  :aot [docker-example.core]
  :uberjar-name "docker-example.jar")
