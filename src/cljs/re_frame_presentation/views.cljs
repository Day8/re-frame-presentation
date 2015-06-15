(ns re-frame-presentation.views
  (:require [re-frame.core :as re-frame]
            [reagent.core :refer [render-to-string]]))

(enable-console-print!)
(defn reveal-slide
  [content]
  [:section content])

(defn reveal-section
  [content]
  [:div {:class "reveal"}
   [:div {:class "slides"}
    content]])

(defn main-panel []
  (let [name (re-frame/subscribe [:name])]
    (fn []
       [:div "Hello " @name])))
