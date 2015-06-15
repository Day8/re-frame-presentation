(ns re-frame-presentation.handlers
    (:require [re-frame.core :as re-frame]
              [re-frame-presentation.db :as db]))

(re-frame/register-handler
 :initialize-db
 (fn  [_ _]
   db/default-db))
