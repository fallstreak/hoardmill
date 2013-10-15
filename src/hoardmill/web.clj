(ns hoardmill.web
  (:require [compojure.core :refer [defroutes context GET]]))

(defroutes routes
  (GET "/ping"
       [] {:status 200
           :headers {"Content-Type" "text/plain"}
           :body "pong"}))

(def app
  routes)
