(fn add ([a b] (+ a b))
        ([x y z] (+ x y z)))

(fn [c d] (+ c d))

(reduce (fn [m [k v]] (assoc m v k)) {} {:b 2 :a 1 :c 3})

((fn [a b c] (+ a b c)) 2 4 6)

((fn [& nums] (/ (apply + nums) (count nums))) 1 2 3 4)

((fn [int & nums] (+ int (/ (apply + nums) (count nums)))) 10 1 2 3 4)

((fn ([a] (inc a)) ([a b] (+ a b))) 3)
