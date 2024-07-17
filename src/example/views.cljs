(ns example.views
  (:require
   [re-frame.core :as re-frame]
   [example.subs :as subs]
   ))

(defn main-panel []
  (let [name (re-frame/subscribe [::subs/name])]
    [:div
     [:h1
      {:class "text-4xl text-center text-blue-500"}
      "Hello from " @name]
     ]))
