(ns example.events
  (:require
   [re-frame.core :as re-frame]
   [example.db :as db]
   ))

(re-frame/reg-event-db
 ::initialize-db
 (fn [_ _]
   db/default-db))
