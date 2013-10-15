(ns hoardmill.app
  (:require [hoardmill.web :as web]
            [ring.adapter.jetty :refer [run-jetty]])
  (:gen-class))

(def server (atom nil))

(defn start-server
  "Start Jetty"
  []
  (run-jetty #'web/app {:port 8080
                        :join? false
                        :stacktraces? true
                        :auto-reload? true}))

(defn start
  "Start the server and assign it to `server`."
  []
  (reset! server (start-server)))

(defn -main
  "The entry point for our application."
  [& args]
  (start))
