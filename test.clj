;;(def var1 5)
;;(defn round
;;  [d precision]
;;  (let [factor (Math/pow 10 precision)]
;;   (/ (Math/floor (* d factor)) factor)))

;;(let [x 1] (def var (+ x x)))

;;(let [a 1 b 2] (+ a b))

(let [c (+ 1 2)
             [d e] [5 6]] 
         (-> (+ d e) (- c)))

