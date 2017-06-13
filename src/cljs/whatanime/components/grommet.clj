(ns whatanime.components.grommet)

(defmacro import-components
  [& components]
  `(do
     ~@(map (fn [sym]
              `(def ~sym (~'adapt-react-class ~(symbol "js" (str "Grommet." sym)))))
            components)))
