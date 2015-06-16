(ns re-frame-presentation.views
  (:require [re-frame.core :as re-frame]
            [reagent.core :as reagent :refer [render-to-string]]))

(enable-console-print!)

(def click-count (reagent/atom 0))

(defn counting-component []
  [:div
   "The atom " [:code "click-count"] " has value: "
   @click-count ". "
   [:input {:type "button" :value "Click me!"
            :on-click #(swap! click-count inc)}]])

; (defn timer-component []
;   (let [seconds-elapsed (reagent/atom 0)]
;     (fn []
;       (js/setTimeout #(swap! seconds-elapsed inc) 1000)
;       [:div
;        "Seconds Elapsed: " @seconds-elapsed])))

; (defn timer-component-re-frame []
;   (let [seconds-elapsed (re-frame/subscribe [:seconds])]
;     (fn []
;       (js/setTimeout #(re-frame/dispatch [:inc-seconds]) 1000)
;       [:div
;        "Seconds Elapsed: " @seconds-elapsed])))

(defn main-panel []
  [:div 
   [:h2 "reagent example 1"]
   [counting-component]
   ; [:h2 "reagent example 2"]
   ; [timer-component]
   ; [:h2 "re-frame example"]
   ; [timer-component-re-frame]
   ])
