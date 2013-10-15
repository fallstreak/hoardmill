(defproject hoardmill "0.1.0-SNAPSHOT"

  :description "Hoard your data in the hoardmill."

  :url "https://github.com/fallstreak/hoardmill"

  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  :dependencies [[org.clojure/clojure "1.5.1"]]

  :profiles {:dev {:dependencies [[midje "1.5.1"]]
                   :plugins [[lein-midje "3.1.1"]]}}

  :aliases {"test" "midje"}

  :uberjar-name "hoardmill.jar"

  :main hoardmill.application)
