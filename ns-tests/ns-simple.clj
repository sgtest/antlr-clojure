 (ns ns1 "My first namespace")
 
 (defn fn1 [] 1)

 (def val1 1)

 (ns ns2 "My second namespace"
   (:use ns1))

 (def val2 (+ val1 (fn1)))

 (def val3 (+ val2 ns1/val1 (ns1/fn1) ns1/val3))

(in-ns 'ns1)

(def val4 (+ val1 5))
