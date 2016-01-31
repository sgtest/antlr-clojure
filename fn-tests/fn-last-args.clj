(defn bar [a b & [c]]
         (if c
           (* a b c)
           (* a b 100)))
