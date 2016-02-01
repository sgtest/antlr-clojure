 (loop [match (re-find matcher) ;loop starts with 2 set arguments
                  result []]
             (if-not match
               result
               (recur (re-find matcher)    ;loop with 2 new arguments
                      (conj result match))))

(loop [x 10]
  (when (> x 1)
    (println x)
    (recur (- x 2))))

(loop [iter 1
       acc  0]
  (if (> iter 10)
    (println acc)
    (recur (inc iter) (+ acc iter))))
