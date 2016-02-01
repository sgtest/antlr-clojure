(let [x 1] 
     x)

(let [y 1] 
     y)

(let [a 1 b 2] 
         (+ a b))

(let [c (+ 1 2)
             [d e] [5 6]] 
         (-> (+ d e) (- c)))

(let [[g h] [1 2 3]] 
         (/ g h))
