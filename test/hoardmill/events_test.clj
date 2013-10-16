(ns hoardmill.events_test
  (:require [clj-time.core :as time])
  (:use [hoardmill.events]
        [midje.sweet])
  (:import clojure.lang.ExceptionInfo))

(facts "about events"

       (fact ":from must be before :to"
             (search {:from (time/date-time 2013) :to (time/date-time 2012)}) => (throws ExceptionInfo)))
