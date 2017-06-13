(ns whatanime.dev
  (:require [clojure.string :refer [starts-with?]]
            [clojure.pprint :refer [pprint]]
            [clj-http.client :refer [request]]
            [cemerick.url :refer [url]]))

(defn api-proxy [{:keys [request-method uri query-string body]}]
  (when (or (starts-with? uri "/api")
            (starts-with? uri "/thumbnail.php")
            (starts-with? uri "/preview.php"))
    (-> (request {:url    (str (url "https://whatanime.ga"
                                    (if query-string
                                      (str uri "?" query-string)
                                      uri)))
                  :method request-method
                  :body   body
                  :as     :stream})
        (select-keys [:status :headers :body])
        (update :headers #(select-keys % ["Content-Type"])))))

