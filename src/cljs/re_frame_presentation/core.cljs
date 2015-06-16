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

(defn mount-ex1 []
  (reagent/render [views/counting-component]
                  (.getElementById js/document "app")))

(defn ^:export init-ex1 [] 
  (re-frame/dispatch-sync [:initialize-db])
  (mount-ex1))

(defn mount-ex2 []
  (reagent/render [views/timer-component]
                  (.getElementById js/document "app")))

(defn ^:export init-ex2 [] 
  (re-frame/dispatch-sync [:initialize-db])
  (mount-ex2))

(defn mount-ex3 []
  (reagent/render [views/timer-component-re-frame]
                  (.getElementById js/document "app")))

(defn ^:export init-ex3 [] 
  (re-frame/dispatch-sync [:initialize-db])
  (mount-ex3))
