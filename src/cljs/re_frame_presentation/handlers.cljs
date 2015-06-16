(ns re-frame-presentation.handlers
    (:require [re-frame.core :as re-frame]
              [re-frame-presentation.db :as db]))

(re-frame/register-handler
 :initialize-db
 (fn  [_ _]
   db/default-db))

(re-frame/register-handler
 :inc-seconds
 (fn  [db _]
   (assoc db :seconds (inc (:seconds db)))))

(re-frame/register-handler
 :inc-seconds-path
 (re-frame/path [:seconds])
 (fn  [seconds _]
   (inc seconds)))

