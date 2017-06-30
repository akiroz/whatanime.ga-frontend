(ns whatanime.utils
  (:require [clojure.java.io :refer [resource]]))

(defmacro slurp-resource [file]
  (slurp (resource file)))
