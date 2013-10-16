(ns hoardmill.events
  (:require [clj-time.core :as time]
            [dire.core :refer [with-handler! with-precondition!]]))

(defn search
  "Search events. Params available are `:from` and `:to` (at the moment)."
  [{:keys [from to]}]
  )

(with-precondition! #'search
  :from-before-to
  (fn [{:keys [from to]}]
    (time/before? from to)))

(with-handler! #'search
  {:precondition :from-before-to}
  (fn [e & args] (throw (ex-info "From date must be before to date" {:type ::validation}))))
