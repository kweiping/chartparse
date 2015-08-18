An implementation of chart parsing in Java, using the grammar from Steve Isard's LIB CHART, which was a demo program for the University of Sussex's Poplog system. It can produce output like the following:

```
[the, pigeons, punish, the, professors, in, the, cafes]
Tree: 0

(S
 (Np
  (det the)
  (Nn
   (n pigeons)))
 (Vp
  (Vp
   (v punish)
   (Np
    (det the)
    (Nn
     (n professors))))
  (Pp
   (prep in)
   (Np
    (det the)
    (Nn
     (n cafes))))))


```