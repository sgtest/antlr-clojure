(def my-val 5)

(def my-val1 my-val)

(def my-val2 "hello docstring" (+ my-val my-val1))

(def #^{:macro true} sys-loop #'loop)
