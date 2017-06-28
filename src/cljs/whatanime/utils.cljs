(ns whatanime.utils
  (:require [re-frame.core :as re-frame]
            [akiroz.re-frame.storage :as storage]))


(defn reg-event-db
  "local-storage & trim-v injected reg-event-db, same calling semantics.
  an arity 3 variant is added to allow interceptors just like the fx version.
  The :storage key inside app-db is automitically persisted."
  ([event-id interceptor-vec handler]
   (re-frame/reg-event-fx
     event-id
     (->> interceptor-vec
          (into [re-frame/trim-v
                 (storage/persist-db :whatanime :storage)]))
     (fn [{:keys [db]} event-vec]
       {:db (handler db event-vec)})))
  ([event-id handler]
   (reg-event-db event-id [] handler)))


(defn reg-event-fx
  "local-storage & trim-v injected reg-event-fx, same calling semantics."
  ([event-id interceptor-vec handler]
   (re-frame/reg-event-fx
     event-id
     (->> interceptor-vec
          (into [re-frame/trim-v
                 (storage/persist-db :whatanime :storage)]))
     handler))
  ([event-id handler]
   (reg-event-fx event-id [] handler)))
