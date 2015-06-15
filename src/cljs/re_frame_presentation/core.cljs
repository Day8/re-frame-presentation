(ns re-frame-presentation.core
    (:require [reagent.core :as reagent]
              [re-frame.core :as re-frame]
              [re-frame-presentation.handlers]
              [re-frame-presentation.subs]
              [re-frame-presentation.views :as views]))

(defn mount-root []
  (reagent/render [views/main-panel]
                  (.getElementById js/document "app")))

(defn ^:export init [] 
  (re-frame/dispatch-sync [:initialize-db])
  (mount-root))
