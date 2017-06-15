(ns whatanime.components.grommet)

(defmacro def-components
  [& components]
  `(do
     ~@(map (fn [sym]
              `(def ~sym
                 (let [~'component ~(symbol "js" (str "Grommet." sym))]
                   (if ~'component
                     (~'adapt-react-class ~'component)
                     (throw ~(str "js/Grommet." sym " is not defined."))))))
            components)))
