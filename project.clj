(defproject hoardmill "0.1.0-SNAPSHOT"

  :description "Hoard your data until that alert goes off again."

  :url "https://github.com/fallstreak/hoardmill"

  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  :dependencies [[compojure "1.1.5"]
                 [org.clojure/clojure "1.5.1"]
                 [ring/ring-jetty-adapter "1.2.0"]]

  :profiles {:dev {:dependencies [[midje "1.5.1"]]
                   :plugins [[lein-midje "3.1.1"]]}}

  :plugins [[lein-ring "0.8.7"]]

  :ring {:handler hoardmill.web/app
         :main hoardmill.app
         :port 8080
         :browser-uri "/ping"}

  :aliases {"test" "midje"}

  :uberjar-name "hoardmill.jar"

  :main hoardmill.app)
